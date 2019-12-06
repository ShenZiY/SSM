<%--
  Created by IntelliJ IDEA.
  User: ziyang
  Date: 2019/11/24
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <meta charset="UTF-8">
        <title>个人信息页</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
        <link rel="stylesheet" href="/WeAdmin-master/static/css/font.css">
        <link rel="stylesheet" href="/WeAdmin-master/static/css/weadmin.css">
    </head>
</head>
<body style="background: url(/WeAdmin-master/static/images/bg3.jpg) no-repeat center;background-size: auto;
   overflow: hidden;">
<div class="weadmin-body">
    <%--<h2 align="center" >我的信息</h2>--%>
        <table class="layui-table" lay-even style="text-align: center;width: 74%;margin-left: 13%;background: rgba(0,2,4,0.12);margin-top: 7%">
            <colgroup>
                <col width="200px">
                <col width="200px">
            </colgroup>
            <tbody>
            <tr>
                <td>员工编号</td>
                <td>${user.id}</td>
            </tr>
            <tr>
                <td>我的姓名</td>
                <td>${user.username}</td>
            </tr>
            <tr>
                <td>工作单位</td>
                <td>天津市消防研究所</td>
            </tr>
            <tr>
                <td>注册时间</td>
                <td>${registerTime}</td>
            </tr>
            <tr>
                <td>处理案件</td>
                <td>${statusTotal[0]}</td>
            </tr>
            <tr>
                <td>处理完成</td>
                <td>${statusTotal[4]}</td>
            </tr>
            <tr>
                <td>个人邮箱</td>
                <td>${user.mail}</td>
            </tr>
            <tr>
                <td>手机号码</td>
                <td>${user.phone}</td>
            </tr>
            </tbody>
        </table>
    </div>
</body>
</html>
