<%@ page language="java" contentType="text/html; charset=UTF-8"  isErrorPage="true"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>500</title>
<link href="${APP_PATH}/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${APP_PATH}/h-ui/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="page-404 text-c">
		<p class="error-title"><i class="Hui-iconfont">&#xe688;</i>500</p>
		<p class="error-description">不好意思，服务端错误啦~</p>
	</div>
</body>
</html>