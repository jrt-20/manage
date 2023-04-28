<style>
    .layui-form-item .layui-input-company {width: auto;padding-right: 10px;line-height: 38px;}
</style>
<div class="layuimini-container layui-anim layui-anim-upbit">
    <div class="layuimini-main">

        <div class="layui-form layuimini-form">
            <div class="layui-form-item">
                <label class="layui-form-label required">旧的密码</label>
                <div class="layui-input-block">
                    <input type="password" name="old_password" lay-verify="required" lay-reqtext="旧的密码不能为空" placeholder="请输入旧的密码"  value="" class="layui-input">
                    <tip>填写自己账号的旧的密码。</tip>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label required">新的密码</label>
                <div class="layui-input-block">
                    <input type="password" id ="psw1" name="new_password" lay-verify="required" lay-reqtext="新的密码不能为空" placeholder="请输入新的密码"  value="" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label required">新的密码</label>
                <div class="layui-input-block">
                    <input type="password" id ="psw2" name="again_password" lay-verify="required" lay-reqtext="新的密码不能为空" placeholder="请输入新的密码"  value="" class="layui-input">
                </div>
            </div>

            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit lay-filter="saveBtn">确认保存</button>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="/layui//lib/jquery-3.4.1/jquery-3.4.1.min.js" charset="utf-8"></script>

<script>
    layui.use(['form','layuimini'], function () {
        var form = layui.form,
            layer = layui.layer,
            layuimini = layui.layuimini;

        /**
         * 初始化表单，要加上，不然刷新部分组件可能会不加载
         */
        form.render();

        //监听提交
        form.on('submit(saveBtn)', function (data) {
            var index = layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            }, function () {
                var psw1 = $("#psw1").val();
                var psw2 = $("#psw2").val();
                // alert(psw1);
                if (psw1 == '') {
                    layer.msg('新密码不能为空');
                    return false;
                }
                if (psw2 == '') {
                    layer.msg('重复密码不能为空');
                    return false;
                }
                if(psw1!=psw2){
                    layer.msg("两次密码不一致");
                    return false;
                }
                $.ajax({
                    url:"/psw/"+psw1,//所要提交数据的服务器地址
                    type:"POST",
                    dataType:"json",
                    contentType:'application/x-www-form-urlencoded;charset=UTF-8',
                    async:false,
                    cache:false,
                    success:function (json) {
                        // console.log(json.url);
                    }, //submit提交事件返回true则表单提交,false则阻止表单提交
                });

                layer.close(index);
                layuimini.refresh();
            });
            return false;
        });

    });
</script>