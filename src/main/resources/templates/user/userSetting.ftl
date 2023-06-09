<style>
    .layui-form-item .layui-input-company {width: auto;padding-right: 10px;line-height: 38px;}
</style>
<div class="layuimini-container layui-anim layui-anim-upbit">
    <div class="layuimini-main">

        <div class="layui-form layuimini-form">
            <div class="layui-form-item">
                <label class="layui-form-label required">管理账号</label>
                <div class="layui-input-block">
                    <input type="text" name="username" lay-verify="required" lay-reqtext="管理账号不能为空" placeholder="请输入管理账号"  value="${users.username}" class="layui-input">
                    <tip>填写自己管理账号的名称。</tip>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label required">手机</label>
                <div class="layui-input-block">
                    <#if users.mobile??>
                        <input type="number" name="phone" lay-verify="required" lay-reqtext="手机不能为空" placeholder="请输入手机"  value="${users.mobile}" class="layui-input">
                        <#else>
                            <input type="number" name="phone" lay-verify="required" lay-reqtext="手机不能为空" placeholder="请输入手机"  value="" class="layui-input">
                    </#if>

                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">身份证</label>
                <div class="layui-input-block">
                    <input type="email" name="email"  placeholder="请输入身份证"  value="${users.uidcard}" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">职业</label>
                <div class="layui-input-block">
                    <input type="job" name="job"  placeholder="请输入职业"  value="${users.job}" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">备注信息</label>
                <div class="layui-input-block">
                    <textarea id = "msg" name="remark" class="layui-textarea" placeholder="请输入备注信息"></textarea>
                </div>
            </div>

            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit lay-filter="saveBtn">确认保存</button>
                </div>
            </div>
            <input id = "hidMsg" hidden="hidden" value="${users.msg}" type="text">
        </div>
    </div>
</div>
<script src="../layui//lib/jquery-3.4.1/jquery-3.4.1.min.js" charset="utf-8"></script>
<script>
    layui.use(['form','layuimini'], function () {
        var form = layui.form,
            layer = layui.layer,
            layuimini = layui.layuimini;

        var hidMsg = $("#hidMsg").val();
        console.log(hidMsg);
        $("#msg").val(hidMsg);
        /**
         * 初始化表单，要加上，不然刷新部分组件可能会不加载
         */
        form.render();


        //监听提交
        form.on('submit(saveBtn)', function (data) {
            var index = layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            }, function () {
                layer.close(index);
                layuimini.hash('/page/welcome1');
            });
            return false;
        });

    });
</script>