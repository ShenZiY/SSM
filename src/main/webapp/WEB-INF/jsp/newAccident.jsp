<%--
  Created by IntelliJ IDEA.
  User: ziyang
  Date: 2019/11/16
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
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
<html>
<head>
    <meta charset="UTF-8">
    <title>我的桌面</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="shortcut icon" href="${APP_PATH }/static/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${APP_PATH }/WeAdmin-master/static/css/font.css">
    <link rel="stylesheet" href="${APP_PATH }/WeAdmin-master/static/css/weadmin.css">
    <link rel="stylesheet" href="${APP_PATH }/ok-admin/css/oksub.css" media="all"/>
    <script type="text/javascript" src="${APP_PATH }/ok-admin/js/okLoading.js"></script>
    <script src="${APP_PATH }/WeAdmin-master/lib/layui/layui.js" charset="utf-8"></script>


</head>

<body>
<div class="weadmin-body">
    <blockquote class="layui-elem-quote"><div id="nowTime"></div></blockquote>



</div>
</body>
<script type="text/javascript" src="../lib/layui/layui.js" charset="utf-8"></script>

<script>
    var newDate = '';
    var curUserName= '<%=session.getAttribute("curUserName")%>';
    getLangDate();
    function dateFilter(date){
        if(date < 10){return "0"+date;}
        return date;
    }
    function getWeekOfYear(){
        var today = new Date();
        var firstDay = new Date(today.getFullYear(),0, 1);
        var dayOfWeek = firstDay.getDay();
        var spendDay= 1;
        if (dayOfWeek !=0) {
            spendDay=7-dayOfWeek+1;
        }
        firstDay = new Date(today.getFullYear(),0, 1+spendDay);
        var d =Math.ceil((today.valueOf()- firstDay.valueOf())/ 86400000);
        var result =Math.ceil(d/7);
        return result+1;
    };
    function getLangDate(){
        var dateObj = new Date(); //表示当前系统时间的Date对象
        var year = dateObj.getFullYear(); //当前系统时间的完整年份值
        var month = dateObj.getMonth()+1; //当前系统时间的月份值
        var date = dateObj.getDate(); //当前系统时间的月份中的日
        var day = dateObj.getDay(); //当前系统时间中的星期值
        var weeks = ["星期日","星期一","星期二","星期三","星期四","星期五","星期六"];
        var weeksNumber = [7,1,2,3,4,5,6];
        var weekNumber = weeksNumber[day];

        var week = weeks[day]; //根据星期值，从数组中获取对应的星期字符串
        var zhous = getWeekOfYear();
        okLoading.close();
        newDate = dateFilter(year)+"年"+dateFilter(month)+"月"+dateFilter(date)+"日 ";
        document.getElementById("nowTime").innerHTML = "亲爱的"+curUserName+"！  今天是  "+newDate+"&nbsp&nbsp"+week+
            "&nbsp&nbsp第"+zhous+"周"+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"+"建议事故编号开头 : "+year+zhous+weekNumber;
        setTimeout("getLangDate()",1000);
    }



</script>

</html>

