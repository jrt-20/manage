<div class="layuimini-container layui-anim layui-anim-upbit">
    <div class="layuimini-main">

        <script type="text/html" id="toolbarDemo">
            <div class="layui-btn-container">
                <button class="layui-btn layui-btn-sm data-add-btn"> 申请账户 </button>
            </div>
        </script>

        <table class="layui-hide" id="currentTableId" lay-filter="currentTableFilter"></table>

<#--        <script type="text/html" id="currentTableBar">-->
<#--            <a class="layui-btn layui-btn-xs data-count-edit" lay-event="edit">编辑</a>-->
<#--            <a class="layui-btn layui-btn-xs layui-btn-danger data-count-delete" lay-event="delete">删除</a>-->
<#--        </script>-->

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
            url: '/page/BankJSON',
            toolbar: '#toolbarDemo',
            defaultToolbar: ['filter', 'exports', 'print', {
                title: '提示',
                layEvent: 'LAYTABLE_TIPS',
                icon: 'layui-icon-tips'
            }],
            cols: [[
                {type: "checkbox", width: 50, fixed: "left"},
                {field: 'bid', width: 120, title: '卡号id', sort: true},
                {field: 'bname', width: 210, title: '开户银行名'},
                {field: 'money', width: 170, title: '账户余额',templet:function (d){
                    return d.money+" 元";
                    } },
                {field: 'umobile', title: '用户手机号', width: 170},
                {field: 'btype', title: '账户类型', width: 170},
                {field: 'createtime',title:'建户时间',minwidth:170,templet:"<div>{{layui.util.toDateString(d.createtime)}}</div>"}
                // {field: 'pvalue', title: '净值', width: 170},
                // {field: 'risk', title: '风险指数', minWidth:170},
                // {title: '操作', minWidth: 50, templet: '#currentTableBar', fixed: "right", align: "center"}
            ]],
            limits: [10, 15, 20, 25, 50, 100],
            limit: 15,
            // page: true
        });

        // 监听搜索操作
        form.on('submit(data-search-btn)', function (data) {
            var result = JSON.stringify(data.field);
            layer.alert(result, {
                title: '最终的搜索信息'
            });

            //执行搜索重载
            table.reload('currentTableId', {
                page: {
                    curr: 1
                }
                , where: {
                    searchParams: result
                }
            }, 'data');

            return false;
        });

        // 监听添加操作
        $(".data-add-btn").on("click", function () {

            var content = layuimini.getHrefContent('/page/bank/add');
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

        //监听表格复选框选择
        table.on('checkbox(currentTableFilter)', function (obj) {
            console.log(obj)
        });

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