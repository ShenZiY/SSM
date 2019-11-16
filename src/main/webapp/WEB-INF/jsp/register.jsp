<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>注册页</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="shortcut icon" href="${APP_PATH }/static/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${APP_PATH }/WeAdmin-master/static/css/font.css">
	<link rel="stylesheet" href="${APP_PATH }/WeAdmin-master/static/css/weadmin.css">
    <script src="${APP_PATH }/WeAdmin-master/lib/layui/layui.js" charset="utf-8"></script>

</head>
<body class="login-bg">



<div class="login">
    <div class="message">WELCOME</div>
    <div id="darkbannerwrap"></div>



    <%--<form action="${APP_PATH}/user/register" method="post" class="layui-form" >--%>
    <form  method="post" class="layui-form" >
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-survey" ></label>
            <input type="text" name="id" lay-verify="required|number|username" placeholder="工号 " autocomplete="off" class="layui-input" style = "padding-left:25px">
        </div>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-username" ></label>
            <input type="text" name="username" lay-verify="required" placeholder="姓名" autocomplete="off" class="layui-input" style = "padding-left:25px">
        </div>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-password" ></label>
            <input type="password" name="password" id = "password" lay-verify="required|password" placeholder="密码" autocomplete="off" class="layui-input" style = "padding-left:25px">
        </div>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-auz" ></label>
            <input type="password" name="passwordRe" id = "passwordRe" lay-verify="required|repassword" placeholder="确认密码" autocomplete="off" class="layui-input" style = "padding-left:25px">
        </div>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-website" ></label>
            <input type="text" name="mail" lay-verify="required|email" placeholder="邮箱" autocomplete="off" class="layui-input" style = "padding-left:25px">
        </div>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-cellphone" ></label>
            <input type="text" name="phone" lay-verify="required|phone" placeholder="手机号" autocomplete="off" class="layui-input" style = "padding-left:25px">
        </div>
        <p><a  class="fr" onclick="WeAdminShow('用户注册协议','${APP_PATH }/protocal.html')">网站使用注册协议</a></p>
        <hr class="hr10" >
        <input class="loginin" value="同意协议并注册" lay-submit lay-filter="sub" style="width:100%;" type="submit">
    </form>
</div>
<script src="${APP_PATH }/static/js/YYX/common.js"></script>
<script src="${APP_PATH }/static/js/admin.js"></script>

<script type="text/javascript">
    layui.use(['form', 'jquery', 'layer'], function () {
        var form = layui.form;
        var $ = layui.jquery;
        var layer = layui.layer;

        form.verify({
            password: [
                /^[\S]{6,15}$/,
                '密码必须6到15位，且不能出现空格'
            ],
            repassword: function (value) {
                var password = $('#password').val();
                if (value !== password) {
                    return '两次密码不一致';
                }
            }
        });

        //添加表单监听事件,提交注册信息
        form.on('submit(sub)', function (form) {
            $.post('/user/signup', form.field, function (result) {
                handlerResult(result, registerDone);
            });
            //防止页面跳转
            return false;
        });
    });

    function registerDone(data) {
        layer.msg("注册成功!", {
            icon: 6,
            time:100000,
            btn:['返回登录'],
            success: function(layero){
                var btn = layero.find('.layui-layer-btn');
                btn.find('.layui-layer-btn0').attr({
                    href: '/user/login'
                    ,target: '_blank'
                });
            }

        });
    }
</script>
<!-- 底部结束 -->

</body>
</html>