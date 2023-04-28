<link rel="stylesheet" href="/layui/js/lay-module/step-lay/step.css" media="all">
<div class="layuimini-container layui-anim layui-anim-upbit">
    <div class="layuimini-main">

        <div class="layui-fluid">
            <div class="layui-card">
                <div class="layui-card-body" style="padding-top: 40px;">
                    <div class="layui-carousel" id="stepForm" lay-filter="stepForm" style="margin: 0 auto;">
                        <div carousel-item>
                            <div>
                                <form class="layui-form" style="margin: 0 auto;max-width: 460px;padding-top: 40px;">
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">入款金额:</label>
                                        <div class="layui-input-block">
                                            <input type="number" placeholder="请填写入款金额" value="" id="moneyIn" class="layui-input" lay-verify="number" required>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">入款账户:</label>
                                        <div class="layui-input-block">
                                            <select lay-verify="required" id="account1">
<#--                                                <option value="1" selected>保险箱</option>-->
<#--                                                <option value="2">现金</option>-->
                                                <#list banks as bank>
                                                    <option value=${bank.bid}>账户:${bank.bid}</option>
                                                </#list>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">备注说明:</label>
                                        <div class="layui-input-block">
                                            <textarea placeholder="入款备注" value="" class="layui-textarea" id="beizhu1"></textarea>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <div class="layui-input-block">
                                            <button class="layui-btn" lay-submit lay-filter="formStep">
                                                &emsp;下一步&emsp;
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div>
                                <form class="layui-form"  style="margin: 0 auto;max-width: 460px;padding-top: 40px;">
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">账户ID:</label>
                                        <div class="layui-input-block">
                                            <div class="layui-form-mid layui-word-aux" name="bid" id = "bidConfirm">639537</div>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">用户名</label>
                                        <div class="layui-input-block">
                                            <div class="layui-form-mid layui-word-aux">${user.username}</div>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">入款金额:</label>
                                        <div class="layui-input-block">
                                            <div class="layui-form-mid layui-word-aux">
                                                <span style="font-size: 18px;color: #333;" id = "moneyConfirm">1800 元</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">备注说明:</label>
                                        <div class="layui-input-block">
                                            <div class="layui-form-mid layui-word-aux" name="msg" id="beizhuConfirm">备注说明</div>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <div class="layui-input-block">
                                            <button type="button" class="layui-btn layui-btn-primary pre">上一步</button>
                                            <button class="layui-btn" lay-submit lay-filter="formStep2">
                                                &emsp;确认入款&emsp;
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div>
                                <div style="text-align: center;margin-top: 90px;">
                                    <i class="layui-icon layui-circle"
                                       style="color: white;font-size:30px;font-weight:bold;background: #52C41A;padding: 20px;line-height: 80px;">&#xe605;</i>
                                    <div style="font-size: 24px;color: #333;font-weight: 500;margin-top: 30px;">
                                        入款成功
                                    </div>
                                    <div style="font-size: 14px;color: #666;margin-top: 20px;">预计两小时到账</div>
                                </div>
                                <div style="text-align: center;margin-top: 50px;">
                                    <button class="layui-btn next">再入一笔</button>
                                    <button class="layui-btn layui-btn-primary" onclick="yue()">查看余额</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr>
                    <div style="color: #666;margin-top: 30px;margin-bottom: 40px;padding-left: 30px;">
                        <h3>说明</h3><br>
                        <h4>入款到指定账户</h4>
                        <p>如果需要，这里可以放一些关于产品的常见问题说明。</p>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>
<script>
    function yue(){
        window.location="#//page/bank";
    }

    layui.use(['form', 'step'], function () {
        var $ = layui.$,
            form = layui.form,
            step = layui.step;

        /**
         * 初始化表单，要加上，不然刷新部分组件可能会不加载
         */
        form.render();

        step.render({
            elem: '#stepForm',
            filter: 'stepForm',
            width: '100%', //设置容器宽度
            stepWidth: '750px',
            height: '500px',
            stepItems: [{
                title: '填写入款信息'
            }, {
                title: '确认入款信息'
            }, {
                title: '完成'
            }]
        });
        // 设置一些临时参数
        var account1 = 1;
        var moneyIn = 0;
        var beizhu = "";

        form.on('submit(formStep)', function (data) {
            account1 = $("#account1").val();
            moneyIn = $("#moneyIn").val();
            beizhu = $("#beizhu1").val();
            $("#moneyConfirm").text(moneyIn);
            $("#bidConfirm").text(account1);
            $("#beizhuConfirm").text(beizhu);
            step.next('#stepForm');
            return false;
        });

        form.on('submit(formStep2)', function (data) {
            var money = $("#moneyConfirm").val();
            $.ajax({
                url:"/page/add/"+account1+"/"+moneyIn,//所要提交数据的服务器地址
                type:"POST",
                dataType:"json",
                contentType:'application/x-www-form-urlencoded;charset=UTF-8',
                async:false,
                cache:false,
                success:function (json) {
                    console.log(json.msg);
                }, //submit提交事件返回true则表单提交,false则阻止表单提交
            });
            step.next('#stepForm');
            return false;
        });

        $('.pre').click(function () {
            step.pre('#stepForm');
        });

        $('.next').click(function () {
            step.next('#stepForm');
        });
    })
</script>
