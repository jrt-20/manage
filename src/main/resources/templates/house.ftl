<div class=" layui-anim layui-anim-upbit">
    <div class="layuimini-main">

        <script type="text/html" id="toolbarDemo">
            <div class="layui-btn-container">
                <button class="layui-btn layui-btn-sm data-add-btn"> 申报房产 </button>
            </div>
        </script>

        <table class="layui-hide" id="currentTableId" style="line-height: 100px"></table>
    </div>
</div>

<script>
    layui.use(['form', 'table','layuimini','element'], function () {
        var $ = layui.jquery,
            form = layui.form,
            table = layui.table,
            layuimini = layui.layuimini;

        table.render({
            elem: '#currentTableId',
            url: '/page/HouseJSON',
            toolbar: '#toolbarDemo',
            defaultToolbar: ['filter', 'exports', 'print', {
                title: '提示',
                layEvent: 'LAYTABLE_TIPS',
                icon: 'layui-icon-tips'
            }],
            cols: [[
                {field: 'hid', width: 85, title: '房产id', sort: true},
                {field: 'htype', width: 120, title: '房屋类型'},
                {field: 'city', width: 90, title: '城市'},
                {field: 'area', title: '区域', width: 110},
                {field: 'xiaoqu', title: '小区', width: 120},
                {field: 'hlou', title: '楼栋', width: 110},
                {field: 'hfloor', title: '房间号', width:100},
                {field: 'hsize', title: '房产面积', width:110,height:50},
                {field: 'publicsize', title: '公共面积', width:110,height: 50},
                {field: 'bugtime',title:'购房时间',width:170,templet:"<div>{{layui.util.toDateString(d.bugtime)}}</div>"},
                {field: 'hetong', title: '购房合同', width:150,templet: '<div><img src={{d.hetong}} lay-event="imgPrew" style="max-height: 30px;' +
                        'max-width:80px"></div>'},
                // {field: 'zhengming', title: '房产证', width:160,templet: '<div><img src="{{d.zhengming}}" lay-event="imgPrew"></div>'},
                // {title: '操作', minWidth: 50, templet: '#currentTableBar', fixed: "right", align: "center"}
            ]],
            limits: [10, 15, 20, 25, 50, 100],
            limit: 15,
            // page: true
        });

        table.on('tool(currentTableId)', function (obj) {
            var data = obj.data;
            if (obj.event === 'imgPrew') {
                layImg.show({
                    src: data.hetong
                });
            }
        });

        // 监听添加操作
        $(".data-add-btn").on("click", function () {

            var content = layuimini.getHrefContent('/page/house/add');
            var openWH = layuimini.getOpenWidthHeight();

            var index = layer.open({
                title: '添加用户',
                type: 1,
                shade: 0.2,
                maxmin:true,
                shadeClose: true,
                area: [openWH[0] + 'px', openWH[1] + 'px'],
                offset: [openWH[2] + 'px', openWH[3] + 'px'],
                content: content,
            });
            $(window).on("resize", function () {
                layer.full(index);
            });

            return false;
        });

        // // 监听删除操作
        // $(".data-delete-btn").on("click", function () {
        //     var checkStatus = table.checkStatus('currentTableId')
        //         , data = checkStatus.data;
        //     layer.alert(JSON.stringify(data));
        // });

        // //监听表格复选框选择
        // table.on('checkbox(currentTableFilter)', function (obj) {
        //     console.log(obj)
        // });

        // table.on('tool(currentTableFilter)', function (obj) {
        //     var data = obj.data;
        //     if (obj.event === 'edit') {
        //
        //         var content = layuimini.getHrefContent('/page/table/add');
        //         var openWH = layuimini.getOpenWidthHeight();
        //         var index = layer.open({
        //             title: '编辑用户',
        //             type: 1,
        //             shade: 0.2,
        //             maxmin:true,
        //             shadeClose: true,
        //             area: [openWH[0] + 'px', openWH[1] + 'px'],
        //             offset: [openWH[2] + 'px', openWH[3] + 'px'],
        //             content: content,
        //         });
        //         $(window).on("resize", function () {
        //             layer.full(index);
        //         });
        //         return false;
        //     } else if (obj.event === 'delete') {
        //         var uid = data.id;
        //         layer.confirm('真的删除行么', function (index) {
        //             $.ajax({
        //                 url:"/table/delete/"+uid,//所要提交数据的服务器地址
        //                 type:"POST",
        //                 dataType:"json",
        //                 contentType:'application/x-www-form-urlencoded;charset=UTF-8',
        //                 async:false,
        //                 cache:false,
        //                 success:function (json) {
        //                     console.log(json.flag);
        //                 }, //submit提交事件返回true则表单提交,false则阻止表单提交
        //             });
        //             obj.del();
        //             layer.close(index);
        //         });
        //     }
        // });

    });
</script>