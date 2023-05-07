<div class="layuimini-main">

    <div class="layui-form layuimini-form">
        <div class="layui-form-item">
            <label class="layui-form-label required">房产类型</label>
            <div class="layui-input-block">
                <input type="text" name="htype" lay-verify="required" lay-reqtext="房产类型不能为空" placeholder="请输入房产类型" value="" class="layui-input">
                <tip>填写房产类型。</tip>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label required">城市</label>
            <div class="layui-input-block">
                <input type="text" name="city" lay-verify="required" lay-reqtext="城市不能为空" placeholder="请输入城市" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label required">地区</label>
            <div class="layui-input-block">
                <input type="text" name="area" lay-verify="required" lay-reqtext="区域不能为空" placeholder="请输入地区" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">小区</label>
            <div class="layui-input-block">
                <input type="text" name="xiaoqu" placeholder="请输入小区" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">楼栋</label>
            <div class="layui-input-block">
                <input type="text" name="hlou" placeholder="请输入楼栋" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">房间号</label>
            <div class="layui-input-block">
                <input type="text" name="hfloor" placeholder="请输入房间号" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">房间面积</label>
            <div class="layui-input-block">
                <input type="number" name="hsize" placeholder="请输入房间面积" value="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">公共面积</label>
            <div class="layui-input-block">
                <input type="number" name="publicsize" placeholder="请输入公共面积" value="" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">房产价值</label>
            <div class="layui-input-block">
                <input type="number" name="value" placeholder="请输入房产价值" value="" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">购房日期</label>
            <div class="layui-input-block">
                <input type="text" name="bugtime" lay-verify='date' placeholder="yyyy-MM-dd" value="" class="layui-input">
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
                    url:"/house/insert",//所要提交数据的服务器地址
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