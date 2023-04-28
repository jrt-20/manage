<div class="layuimini-main">

    <div class="layui-form layuimini-form">
        <div class="layui-form-item">
            <label class="layui-form-label required">股票代码</label>
            <div class="layui-input-block">
                <input type="number" name="gid" lay-verify="required" lay-reqtext="股票代码不能为空" placeholder="请输入股票代码" value="" class="layui-input">
                <tip>填写股票代码</tip>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label required">股票类型</label>
            <div class="layui-input-block">
                <input type="text" name="gtype" lay-verify="required" lay-reqtext="股票类型不能为空" placeholder="请输入股票类型" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label required">股票份额</label>
            <div class="layui-input-block">
                <input type="number" name="gvalue" lay-verify="required" lay-reqtext="份额不能为空" placeholder="请输入股票份额" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">近7日涨幅</label>
            <div class="layui-input-block">
                <input type="number" name="gup" placeholder="请输入近7日涨幅" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">近1年涨幅</label>
            <div class="layui-input-block">
                <input type="number" name="gupyear" placeholder="请输入近1年涨幅" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">股票净值</label>
            <div class="layui-input-block">
                <input type="number" name="pvalue" placeholder="请输入股票净值" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">风险程度</label>
            <div class="layui-input-block">
                <input type="text" name="risk" placeholder="请输入股票风险程度" value="" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="saveBtn">确认保存</button>
            </div>
        </div>
    </div>
</div>
<script>
    layui.use(['form', 'table'], function () {
        var form = layui.form,
            layer = layui.layer,
            table = layui.table,
            $ = layui.$;

        /**
         * 初始化表单，要加上，不然刷新部分组件可能会不加载
         */
        form.render();

        // 当前弹出层，防止ID被覆盖
        var parentIndex = layer.index;

        //监听提交
        form.on('submit(saveBtn)', function (data) {
            var index = layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            }, function () {
                $.ajax({
                    url:"/gupiao/insert",//所要提交数据的服务器地址
                    data:data.field,
                    type:"POST",
                    dataType:"json",
                    contentType:'application/x-www-form-urlencoded;charset=UTF-8',
                    async:false,
                    cache:false,
                    success:function (json) {
                        console.log(json.url);
                    }, //submit提交事件返回true则表单提交,false则阻止表单提交
                });

                // 关闭弹出层
                layer.close(index);
                layer.close(parentIndex);

            });
            return false;
        });

    });
</script>