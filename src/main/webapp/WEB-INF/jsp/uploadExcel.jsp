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
    <title>表格数据上传</title>
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
    <blockquote class="layui-elem-quote font16">待上传表格数据</blockquote>
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
            ,url: '/jsp/dataExcel' //数据接口*/
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
                    templet: function () {
                        return '<span style="color:orangered;">' + "未上传Excel" + '</span>'
                    }
                }
                ,{field: 'govLr', title: '录入人',align:'center' }
                ,{field:'upload', title:'上传',toolbar:"#bar"}
                /*{
                    field: 'upload', title: '选择数据', templet: function () {
                        return '<button class="layui-btn  upload_btn" style="margin-left: 32%"><i class="layui-icon"></i></button>'
                    }
                }*/
            ]],

            done: function (res, curr, count) {
                var tableId = this.id;
                var tableElem = this.elem;
                // table render出来实际显示的table组件
                var tableViewElem = tableElem.next();
                // 渲染当前页面的所有的upload组件
                upload.render({
                    elem: tableViewElem.find('.upload_btn')
                    ,url: '/import'
                    ,accept: 'file' //普通文件
                    ,exts: 'xls|xlsx' //允许上传的文件后缀
                    /*,choose:function (obj) {
                        var files = obj.pushFile();
                        obj.preview(function (index,file,result) {
                            filename = file.name;
                        })
                    }*/
                    ,before: function(obj){
                        obj.preview(function (index,file,result) {
                            filename = file.name;
                        })
                        this.data={'accId1':data.accId};//关键代码
                    }
                    ,done: function(res){//返回值接收
                        if(res.flag=="1"){
                            /*layer.msg('成功导入'+ data.accId+'的表格数据！' , {
                            }, function(){
                                location.reload();
                            });*/
                            layer.msg(filename+'的数据上传到'+ data.accId+'事故中！', {
                                icon: 6,
                                time:100000,
                                btn:['刷新'],
                                success: function(layero){
                                    var btn = layero.find('.layui-layer-btn');
                                    btn.find('.layui-layer-btn0').attr({
                                        href: '/jsp/uploadExcel'
                                    });
                                }

                            });
                        }else if(res.flag == "3"){
                            layer.msg('事故ID不一致，请确认是否有误！',{time:7*1000})
                        }else{
                            layer.msg('导入失败！', {
                            }, function(){
                                location.reload();
                            });
                        }
                    }
                });
            }
            /* data:[{"timeInvest":"Wed Nov 20 10:58:37 CST 2019","govLr":"李明","locSheng":"重庆","accId":20194731,"status":3}]*/
        });


        table.on('tool(demo)' , function (obj) {
                data = obj.data;
            }
        )

    });

</script>

<script type="text/html" id="bar"  lay-filter="test">
    <a class="layui-btn  upload_btn" lay-event="add" style="margin-left: 32%" ><i class="layui-icon"></i></a>
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
