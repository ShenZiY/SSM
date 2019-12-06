<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>修改密码</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no" name="viewport">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="shortcut icon" href="/static/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="/WeAdmin-master/static/css/font.css">
    <link rel="stylesheet" href="/WeAdmin-master/static/css/weadmin.css">
    <script src="/WeAdmin-master/lib/layui/layui.js" charset="utf-8"></script>

</head>
<body  style="background: url(/WeAdmin-master/static/images/bg2.jpg) no-repeat center;background-size: auto;
   overflow: hidden;" >



<div class="login" style="background: rgba(0,2,4,0.12)">

    <%--<div id="darkbannerwrap"></div>--%>



    <%--<form action="${APP_PATH}/user/checkLogin" method="post" class="layui-form" >--%>
    <form  method="post" class="layui-form" >
        <div class="layui-form-item" >
            <label class="layui-icon layui-icon-password" ></label>
            <input type="password" name="oldPassword" lay-verify="required|password" placeholder="原始密码" autocomplete="off" class="layui-input" style = "padding-left:25px;background: rgba(0,0,0,0)">
        </div>
        <div class="layui-form-item" >
            <label class="layui-icon layui-icon-password" ></label>
            <input type="password" name="newPassword" id="newPassword" lay-verify="required|password" placeholder="新密码" autocomplete="off" class="layui-input" style = "padding-left:25px;background: rgba(0,0,0,0)">
        </div>
        <div class="layui-form-item" >
            <label class="layui-icon layui-icon-auz" ></label>
            <input type="password" name="renewPassword" lay-verify="required|repassword" placeholder="新密码确认" autocomplete="off" class="layui-input" style = "padding-left:25px;background: rgba(0,0,0,0.1)">
        </div>
        <input class="loginin" value="确认修改" lay-submit lay-filter="updatePwd" style="width:100%; ;background: rgba(62,87,0,0.9)" type="submit">
    </form>

</div>

<script src="${APP_PATH }/static/js/YYX/common.js"></script>

<script type="text/javascript">

    layui.use(['form', 'jquery', 'layer'], function () {
        var form = layui.form;
        var $ = layui.jquery;

        form.verify({
            password: [
                /^[\S]{6,15}$/,
                '密码必须6到15位，且不能出现空格'
            ],
            repassword: function (value) {
                var password = $('#newPassword').val();
                if (value !== password) {
                    return '两次密码不一致';
                }
            }
        });

        //添加表单监听事件,提交注册信息
        form.on('submit(updatePwd)', function (form) {
            $.post('/user/updatePwd', form.field, function (result) {
                handlerResult(result, loginDone);
            });
            //防止页面跳转
            return false;
        });
    });

    function loginDone(data) {
        layer.msg("修改密码成功！", {
            icon: 1,
            time: 1000
        });
    }
</script>
<%--<script type="text/javascript">

    layui.extend({
        admin: '{/}./static/js/admin'
    });
    layui.use(['form','admin'], function(){
        var form = layui.form
            ,admin = layui.admin;
        // layer.msg('玩命卖萌中', function(){
        //   //关闭后的操作
        //   });
        //监听提交
        // form.on('submit(login)', function(data){
        //     // alert(888)
        //     layer.msg(JSON.stringify(data.field),function(){
        //         location.href='./index.html'
        //     });
        //     return false;
        // });
    });
</script>--%>
<!-- 底部结束 -->
</body>
</html>