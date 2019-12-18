<%--
  Created by IntelliJ IDEA.
  User: ziyang
  Date: 2019/12/1
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>PDF</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="shortcut icon" href="/static/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="/WeAdmin-master/static/css/font.css">
    <link rel="stylesheet" href="/WeAdmin-master/static/css/weadmin.css">
    <script src="/WeAdmin-master/lib/layui/layui.js" charset="utf-8"></script>
    <script src="/WeAdmin-master/static/js/admin.js"></script>
</head>
<body>
<div class="weadmin-body">
    <blockquote class="layui-elem-quote font16">生成PDF处理</blockquote>
    <div style="height: 600px;overflow-y: auto;width: 96%;margin-left: 1%;padding: 5px;">
        <table id="demo" style="text-align: center;" lay-filter = "demo"></table>
    </div>
</div>
</body>

<script type="text/javascript" src="../lib/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use(['table','upload'], function(){
        var table = layui.table;
        var upload = layui.upload, $ = layui.jquery;

        var  data ;

        var filename = "hahaha.excel";
        /*var filename;*/

        //第一个实例
        table.render({
            elem: '#demo'
            ,url: '/jsp/dataPDF' //数据接口*/
            /*,skin: 'line' //行边框风格*/
            ,even: false //开启隔行背景
            ,page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
                layout: ['limit', 'count', 'prev', 'page', 'next'] //自定义分页布局
                //,curr: 5 //设定初始在第 5 页
                ,groups: 5 //只显示 1 个连续页码
                ,first: false //不显示首页
                ,last: false //不显示尾页

            }
            ,cols: [[ //表头
                {field: 'accId', title: '事故编码',  sort: true, align:'center'}
                ,{field: 'timeInvest', title: '调查时间',sort: true ,align:'center' }
                ,{field: 'loc', title: '事故地点',align:'center' }
                ,{field: 'Status', title: '处理状态',align:'center' ,
                    templet: function (d) {
                        if (d.Status == "处理完毕") {
                            return '<span style="color:#008000;">' + d.Status + '</span>'
                        }else{
                            return '<span style="color:orangered;">' + d.Status + '</span>'
                        }

                    }
                }
                ,{field: 'govLr', title: '录入人',align:'center' }
                ,{field:'upload', title:'操作',toolbar:"#bar",width:330}
                /*{
                    field: 'upload', title: '选择数据', templet: function () {
                        return '<button class="layui-btn  upload_btn" style="margin-left: 32%"><i class="layui-icon"></i></button>'
                    }
                }*/
            ]]
        });

        table.on('tool(demo)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            data = obj.data //获得当前行数据
                ,layEvent = obj.event; //获得 lay-event 对应的值
            if(layEvent === 'PDF'){
                $.ajax({
                    type: "post",
                    url: "/generatePdf",
                    data: {
                        "accId": data.accId, /* testcontroller里面的generatePdf*/
                    },
                    dataType: 'json',
                    success: function (data1) {
                        if(data1.code == "0"){
                            alert("成功生成"+data.accId+"的PDF!");
                            location.reload();
                        }else{
                            alert("错误！")
                        }

                    },
                    error: function () {
                    }
                })
            } else if(layEvent === 'view'){
                $.ajax({
                    type: "post",
                    url: "/viewPdf",
                    data: {
                        "accId": data.accId, /* testcontroller里面的viewPdf*/
                    }
                })
            } else if(layEvent === 'report'){

                layer.confirm('真的删除行么', function(index){
                    obj.del(); //删除对应行（tr）的DOM结构
                    layer.close(index);
                    //向服务端发送删除指令
                });
                var row_data = data  // 整行的数据
                    ,accId = row_data.accId  // 获取行数据的 id 值 对数据进行检索 操作
                // do sothing 如发送请求 重新 reload 表格
                layer.msg('编辑操作'+accId);
            }
        });

    });

</script>

<script type="text/html" id="bar"  lay-filter="test">
    <a class="layui-btn layui-btn-normal " lay-event="view" >预览修改</a>
    <a class="layui-btn  layui-btn-danger" lay-event="report" >预览提交</a>
    <a class="layui-btn  PDF_btn" lay-event="PDF">生成PDF</a>
</script>

<style type="text/css">
    .layui-table-cell {
        height: 36px;
        line-height: 36px;
    }
    /* 偶数行背景色 */
    .layui-table[lay-even] tr:nth-child(even) {
        /* background-color: #aaffaa; */
        background-color: #71ff49;
    }

    /* 鼠标指向表格时,奇数行背景颜色 */
    .layui-table tbody tr:hover,.layui-table-hover {
        background-color: rgba(72, 215, 192, 0.27);
    }

    /* 表格头部工具栏背景色 */
    .layui-table-tool {
        background-color: #eeffee;
    }

    /* 表格头部背景色 */
    th {
        background-color: #359f6a; /* MediumSeaGreen */
        color: #fff;
        font-weight: bold
    }
</style>
</html>
