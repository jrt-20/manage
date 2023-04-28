<div class="layuimini-main">

    <div class="layui-form layuimini-form">
        <div class="layui-form-item">
            <label class="layui-form-label required">卡号id</label>
            <div class="layui-input-block">
                <input type="number" name="bid" lay-verify="required" lay-reqtext="用户名不能为空" placeholder="请输入卡号id" value="" class="layui-input">
                <tip>填写银行卡号的名称。</tip>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label required">开户银行名</label>
            <div class="layui-input-block">
                <input type="text" name="bname" lay-verify="required" lay-reqtext="密码不能为空" placeholder="请输入账户银行名" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label required">银行余额</label>
            <div class="layui-input-block">
                <input type="number" name="money" lay-verify="required" lay-reqtext="密码不能为空" placeholder="请输入余额" value="" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label required">手机</label>
            <div class="layui-input-block">
                <input type="number" name="umobile" lay-verify="required" lay-reqtext="手机不能为空" placeholder="请输入手机" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">账户类型</label>
            <div class="layui-input-block">
                <input type="text" name="btype" placeholder="请输入账户类型" value="" class="layui-input">
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
                    url:"/bank/insert",//所要提交数据的服务器地址
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