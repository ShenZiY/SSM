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
	<title>登录页</title>
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
    <div class="message">NAIS—TJ 1.0-管理系统</div>
    <div id="darkbannerwrap"></div>



    <%--<form action="${APP_PATH}/user/checkLogin" method="post" class="layui-form" >--%>
    <form  method="post" class="layui-form" >
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-username" ></label>
            <input type="text" name="id" lay-verify="required|number" placeholder="工号" autocomplete="off" class="layui-input" style = "padding-left:25px">
        </div>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-password" ></label>
            <input type="password" name="password" lay-verify="required" placeholder="密码" autocomplete="off" class="layui-input" style = "padding-left:25px">
        </div>
        <!-- <input name="username" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" > -->
        <!-- <hr class="hr15"> -->
        <!-- <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input"> -->
        <!-- <hr class="hr15"> -->

        <input class="loginin" value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
        <%--<div class="layui-input-inline login-btn">
            <button lay-submit lay-filter="login" class="layui-btn layui-btn-blue layui-btn-lg" >登录</button>
        </div>--%>
        <hr class="hr15" >
        <p><a href="/user/register" class="fl">立即注册</a><a href="javascript:" class="fr">忘记密码？</a></p>
        <%--<input class="loginin" value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">--%>
        <hr class="hr20" >
        <div>
            Copyright © 2019 应急管理部天津市消防研究所
        </div>
    </form>

    <%--<form  action="/user/register" method="post" class="layui-form" >
        <input class="loginin" value="注册"  lay-submit style="width:100%;" type="submit">
        <hr class="hr20" >
        &lt;%&ndash;<input class="loginin" value="注册" lay-submit lay-filter="login" style="width:100%;" type="submit">&ndash;%&gt;
        &lt;%&ndash;<hr class="hr20" >&ndash;%&gt;
        <div>
            Copyright © 2019 应急管理部天津市消防研究所
        </div>
    </form>--%>

</div>

<script src="${APP_PATH }/static/js/YYX/common.js"></script>

<script type="text/javascript">
    if (self !== top) {
        top.location.href = location.href;
    }

    layui.use(['form', 'jquery', 'layer'], function () {
        var form = layui.form;
        var $ = layui.jquery;

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
        form.on('submit(login)', function (form) {
            $.post('/user/checkLogin', form.field, function (result) {
                handlerResult(result, loginDone);
            });
            //防止页面跳转
            return false;
        });
    });

    function loginDone(data) {
        layer.msg("登陆成功, 即将跳转到首页!", {
            icon: 1,
            time: 1000
        }, function () {
            location.href = '/user/main';
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