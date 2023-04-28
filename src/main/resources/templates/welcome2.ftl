<style>
    .top-panel {border:1px solid #eceff9;border-radius:5px;text-align:center;}
    .top-panel > .layui-card-body {height:60px;}
    .top-panel-number {line-height:60px;font-size:30px;border-right:1px solid #eceff9;}
    .top-panel-tips {line-height:30px;font-size:12px}
</style>
<div class="layuimini-container layui-anim layui-anim-upbit">
    <div class="layuimini-main welcome">
        <div class="layui-row layui-col-space15">
            <div class="layui-col-xs12 layui-col-md3">

                <div class="layui-card top-panel">
                    <div class="layui-card-header">本人银行余额</div>
                    <div class="layui-card-body">
                        <div class="layui-row layui-col-space5">
                            <div class="layui-col-xs9 layui-col-md9 top-panel-number">
                                ${userBanks} 元
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <div class="layui-col-xs12 layui-col-md3">

                <div class="layui-card top-panel">
                    <div class="layui-card-header">本人股票份额</div>
                    <div class="layui-card-body">
                        <div class="layui-row layui-col-space5">
                            <div class="layui-col-xs9 layui-col-md9 top-panel-number">
                                ${userGupiaos} 元
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <div class="layui-col-xs12 layui-col-md3">

                <div class="layui-card top-panel">
                    <div class="layui-card-header">家庭银行余额</div>
                    <div class="layui-card-body">
                        <div class="layui-row layui-col-space5">
                            <div class="layui-col-xs9 layui-col-md9 top-panel-number">
                                ${familyBanks} 元
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <div class="layui-col-xs12 layui-col-md3">

                <div class="layui-card top-panel">
                    <div class="layui-card-header">家庭股票份额</div>
                    <div class="layui-card-body">
                        <div class="layui-row layui-col-space5">
                            <div class="layui-col-xs9 layui-col-md9 top-panel-number">
                                ${familyGupiaos} 元
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>

        <div class="layui-row layui-col-space15">
            <div class="layui-col-xs12 layui-col-md9">
                <div id="echarts-records" style="background-color:#ffffff;min-height:400px;padding: 10px"></div>
            </div>
            <div class="layui-col-xs12 layui-col-md3">
                <div id="echarts-pies" style="background-color:#ffffff;min-height:400px;padding: 10px"></div>
            </div>
        </div>

    </div>
</div>
<script>
    layui.use(['layer','echarts'], function () {
        var $ = layui.jquery,
            layer = layui.layer,
            echarts = layui.echarts;

        /**
         * 报表功能
         */
        var echartsRecords;

        var names;
        var data1;
        var data2;

        $.ajax({
            url: "/api/chartData2",
            type: "POST",
            dataType:"json",
            contentType:'application/x-www-form-urlencoded;charset=UTF-8',
            async:false,
            cache:false,
            success: function(JSON) {
                echartsRecords= echarts.init(document.getElementById('echarts-records'), 'walden');
                names = JSON.names;
                data1 = JSON.banks;
                data2 = JSON.gupiaos;
                var option = {
                    title: {
                        text: '家庭财务汇总'
                    },
                    tooltip: {
                        trigger: 'axis',
                        axisPointer: {
                            type: 'shadow'
                        }
                    },
                    legend: {},
                    grid: {
                        left: '3%',
                        right: '4%',
                        bottom: '3%',
                        containLabel: true
                    },
                    xAxis: {
                        type: 'value',
                        boundaryGap: [0, 0.01]
                    },
                    yAxis: {
                        type: 'category',
                        data: names
                    },
                    series: [
                        {
                            name: '股票份额',
                            type: 'bar',
                            data: data1
                        },
                        {
                            name: '银行余额',
                            type: 'bar',
                            data: data2
                        }
                    ]
                };
                echartsRecords.setOption(option);
            }
        });

        var result = data1.map((value, index) => {
            return { value: value, name:names[index] };
        });

        /**
         * 玫瑰图表
         */
        var echartsPies = echarts.init(document.getElementById('echarts-pies'), 'walden');
        var optionPies = {
            title: {
                text: '银行份额',
                left: 'center'
            },
            tooltip: {
                trigger: 'item',
                formatter: '{a} <br/>{b} : {c} ({d}%)'
            },
            legend: {
                orient: 'vertical',
                left: 'left',
                data: names
            },
            series: [
                {
                    name: '访问来源',
                    type: 'pie',
                    radius: '55%',
                    center: ['50%', '60%'],
                    roseType: 'radius',
                    data: result,
                    emphasis: {
                        itemStyle: {
                            shadowBlur: 10,
                            shadowOffsetX: 0,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    }
                }
            ]
        };
        echartsPies.setOption(optionPies);





        // echarts 窗口缩放自适应
        window.onresize = function () {
            echartsRecords.resize();
        }

    });
</script>
