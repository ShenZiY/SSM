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
		<title>主页面</title>
		<meta name="renderer" content="webkit|ie-comp|ie-stand">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link rel="shortcut icon" href="${APP_PATH }/static/logo.ico" type="image/x-icon" />
		<link rel="stylesheet" href="${APP_PATH}/WeAdmin-master/static/css/font.css">
		<link rel="stylesheet" href="${APP_PATH}/WeAdmin-master/static/css/weadmin.css">
		<script type="text/javascript" src="${APP_PATH}/WeAdmin-master/lib/layui/layui.js" charset="utf-8"></script>
        <%--<script type="text/javascript" src="${APP_PATH}/ok-admin/js/okadmin.js" charset="utf-8"></script>--%>
	</head>


	<body >
		<!-- 顶部开始 -->
		<div class="container">
			<div class="logo">
				<a >天津市消防研究所</a>
			</div>
			<div class="left_open">
				<i title="展开左侧栏" class="iconfont" style="color: black;">&#xe699;</i>
			</div>
			<div class="left1_open"  id="tp-weather-widget">
				<%--<i title="展开左侧栏" class="iconfont" style="color: rgba(0,5,3,0.98);">&#xe699;</i>--%>
			</div>
			<%--<div id="tp-weather-widget" ></div>--%>
			<ul class="layui-nav right" lay-filter="">
				<%--<li>
					<div id="tp-weather-widget"></div>
				</li>--%>
				<li class="layui-nav-item">
					<% String name = (String)session.getAttribute("curUserName"); %>
					<a href="javascript:;"><i class="layui-icon layui-icon-friends" style="font-size: 15px; color: #009688;"></i><cite>&nbsp&nbsp<%=name %></cite></a>
					<dl class="layui-nav-child">
						<!-- 二级菜单 -->
						<dd>
							<a onclick="WeAdminShow('我的资料','/user/userInfo',600,450)">我的资料</a>
						</dd>
						<dd>
							<a onclick="WeAdminShow('修改密码','/jsp/updatePassword',600,600)">修改密码</a>
						</dd>
						<dd>
							<a onclick="WeAdminShow('百度一下','http://www.baidu.com')">百度一下</a>
						</dd>
					</dl>
				</li>
				<li class="layui-nav-item to-index">
					<a href="/user/outLogin" ><cite> &nbsp退出&nbsp</cite><i class="layui-icon layui-icon-snowflake" style="font-size: 15px; color: #961221;"></i></a>
				</li>
			</ul>

			<%--<ul class="layui-nav " lay-filter="">
				<li class="layui-nav-item ">
				<% String name = (String)session.getAttribute("curUserName"); %>
					<a href="javascript:;"><%=name %></a>
					<dl class="layui-nav-child">
						<!-- 二级菜单 -->
						<dd>
							<a onclick="WeAdminShow('百度','http://www.baidu.com')">个人信息</a>
						</dd>
                        <dd>
                            <a onclick="WeAdminShow('百度','http://www.baidu.com')">修改密码</a>
                        </dd>
						<dd>
							<a class="loginout" href="/user/outLogin">退出1</a>
						</dd>
					</dl>
				</li>

				<li class="layui-nav-item to-index">
					<a href="https://www.jiuwei.com/" target="_blank">退出</a>
				</li>
			</ul>--%>
		</div>
		<!-- 顶部结束 -->
		<!-- 中部开始 -->
		<!-- 左侧菜单开始 -->
		<div class="left-nav">
			<div id="side-nav">
				<ul id="nav">
					<li>
						<a href="javascript:;">
							<i class="iconfont">&#xe705;</i>
							<cite>事故管理</cite>
							<i class="iconfont nav_right">&#xe697;</i>
						</a>
						<ul class="sub-menu">
							<li>
								<a _href="/jsp/newAccident">
									<i class="iconfont">&#xe6a7;</i>
									<cite>新建事故</cite>
								</a>
							</li>
							<li>
								<a _href="/downTemplate">
									<i class="iconfont">&#xe6a7;</i>
									<cite>导出模板</cite>
								</a>
							</li>
							<li>
								<a _href="/user/">
									<i class="iconfont">&#xe6a7;</i>
									<cite>导入数据</cite>
								</a>
							</li>
						</ul>
					</li>
					
					<li>
						<a href="javascript:;">
							<i class="iconfont">&#xe6b8;</i>
							<cite>图片管理</cite>
							<i class="iconfont nav_right">&#xe697;</i>
						</a>
						<ul class="sub-menu">
							<li>
								<a _href="/picLoad">
									<i class="iconfont">&#xe6a7;</i>
									<cite>图片上传</cite>

								</a>
							</li>
							<li>
								<a _href="./pages/member/del.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>图片处理</cite>

								</a>
							</li>
							<%--<li>
								<a href="javascript:;">
									<i class="iconfont">&#xe70b;</i>
									<cite>会员管理</cite>
									<i class="iconfont nav_right">&#xe697;</i>
								</a>
								<ul class="sub-menu">
									<li>
										<a _href="./pages/member/addInput.html">
											<i class="iconfont">&#xe6a7;</i>
											<cite>输入框操作</cite>
										</a>
									</li>
									<li>
										<a _href="./pages/404.html">
											<i class="iconfont">&#xe6a7;</i>
											<cite>三级菜单演示</cite>
										</a>
									</li>
									<li>
										<a _href="./pages/404.html">
											<i class="iconfont">&#xe6a7;</i>
											<cite>导航菜单演示</cite>
										</a>
									</li>
								</ul>
							</li>--%>
						</ul>
					</li>
					<li>
						<a href="javascript:;">
							<i class="iconfont">&#xe705;</i>
							<cite>采集数据管理</cite>
							<i class="iconfont nav_right">&#xe697;</i>
						</a>
						<ul class="sub-menu">
							<li>
								<a _href="./pages/article/list.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>数据导入</cite>
								</a>
							</li>
							<li>
								<a _href="./pages/article/category.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>数据导出</cite>
								</a>
							</li>
						</ul>
					</li>
					<%--<li>
						<a href="javascript:;">
							<i class="iconfont">&#xe723;</i>
							<cite>订单管理</cite>
							<i class="iconfont nav_right">&#xe697;</i>
						</a>
						<ul class="sub-menu">
							<li>
								<a _href="./pages/order/list.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>订单列表</cite>
								</a>
							</li>
						</ul>
					</li>
					<li>
						<a href="javascript:;">
							<i class="iconfont">&#xe726;</i>
							<cite>管理员管理</cite>
							<i class="iconfont nav_right">&#xe697;</i>
						</a>
						<ul class="sub-menu">
							<li>
								<a _href="./pages/admin/list.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>管理员列表</cite>
								</a>
							</li>
							<li>
								<a _href="./pages/admin/role.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>角色管理</cite>
								</a>
							</li>
							<li>
								<a _href="./pages/admin/cate.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>权限分类</cite>
								</a>
							</li>
							<li>
								<a _href="./pages/admin/rule.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>权限管理</cite>
								</a>
							</li>
						</ul>
					</li>
					<li>
						<a href="javascript:;">
							<i class="iconfont">&#xe6ce;</i>
							<cite>系统统计</cite>
							<i class="iconfont nav_right">&#xe697;</i>
						</a>
						<ul class="sub-menu">
							<li>
								<a _href="./pages/echarts/echarts1.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>拆线图</cite>
								</a>
							</li>
							<li>
								<a _href="./pages/echarts/echarts2.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>柱状图</cite>
								</a>
							</li>
							<li>
								<a _href="./pages/echarts/echarts3.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>地图</cite>
								</a>
							</li>
							<li>
								<a _href="./pages/echarts/echarts4.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>饼图</cite>
								</a>
							</li>
							<li>
								<a _href="./pages/echarts/echarts5.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>雷达图</cite>
								</a>
							</li>
							<li>
								<a _href="./pages/echarts/echarts6.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>k线图</cite>
								</a>
							</li>
							<li>
								<a _href="./pages/echarts/echarts7.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>热力图</cite>
								</a>
							</li>
							<li>
								<a _href="./pages/echarts/echarts8.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>仪表图</cite>
								</a>
							</li>
							<li>
								<a _href="./pages/echarts/echarts9.html">
									<i class="iconfont">&#xe6a7;</i>
									<cite>地图DIY实例</cite>
								</a>
							</li>
						</ul>
					</li>--%>
				</ul>
			</div>
		</div>
		<!-- <div class="x-slide_left"></div> -->
		<!-- 左侧菜单结束 -->
		<!-- 右侧主体开始 -->
		<div class="page-content">
			<div class="layui-tab tab" lay-filter="wenav_tab" id="WeTabTip" lay-allowclose="true">
				<ul class="layui-tab-title" id="tabName">
					<li>我的桌面</li>
				</ul>
				<div class="layui-tab-content">
					<div class="layui-tab-item layui-show">
						<iframe src='/user/welcome' frameborder="0" scrolling="yes" class="weIframe"></iframe>
					</div>
				</div>
			</div>
		</div>
		<!-- 右侧主体结束 -->
		<!-- 中部结束 -->
		<!-- 底部开始 -->
		<div class="footer">
			<div class="copyright" >Copyright © 天津市消防研究所 All Rights Reserved</div>
		</div>
		<!-- 底部结束 -->
		<script type="text/javascript">
//			layui扩展模块的两种加载方式-示例
//		    layui.extend({
//			  admin: '{/}../../static/js/admin' // {/}的意思即代表采用自有路径，即不跟随 base 路径
//			});
//			//使用拓展模块
//			layui.use('admin', function(){
//			  var admin = layui.admin;
//			});
			layui.config({
			  base: '${APP_PATH}/WeAdmin-master/static/js/'
			  ,version: '101100'
			}).use('admin');
			layui.use(['jquery','admin'], function(){
				var $ = layui.jquery;
				/* $(function(){
					var login = JSON.parse(localStorage.getItem("login"));
					if(login){
						if(login=0){
							window.location.href='./login.html';
							return false;
						}else{
							return false;
						}
					}else{
						window.location.href='./login.html';
						return false;
					}
				}); */
			});
			
		</script>

		<script>
            (function(a,h,g,f,e,d,c,b){b=function(){d=h.createElement(g);c=h.getElementsByTagName(g)[0];d.src=e;d.charset="utf-8";d.async=1;c.parentNode.insertBefore(d,c)};a["SeniverseWeatherWidgetObject"]=f;a[f]||(a[f]=function(){(a[f].q=a[f].q||[]).push(arguments)});a[f].l=+new Date();if(a.attachEvent){a.attachEvent("onload",b)}else{a.addEventListener("load",b,false)}}(window,document,"script","SeniverseWeatherWidget","//cdn.sencdn.com/widget2/static/js/bundle.js?t="+parseInt((new Date().getTime() / 100000000).toString(),10)));
            window.SeniverseWeatherWidget('show', {
                flavor: "slim",
                location: "WWGQDCW6TBW1",
                geolocation: false,
                language: "zh-Hans",
                unit: "c",
                theme: "auto",
                token: "eed09165-75ff-4200-a394-6e69a741b7aa",
                hover: "enabled",
                container: "tp-weather-widget"
            })
		</script>
	</body>

	<!--Tab菜单右键弹出菜单-->
	<ul class="rightMenu" id="rightMenu">
        <li data-type="fresh">刷新</li>
        <li data-type="current">关闭当前</li>
        <li data-type="other">关闭其它</li>
        <li data-type="all">关闭所有</li>
    </ul>

</html>