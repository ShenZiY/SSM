<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
    <link rel="shortcut icon" href="/static/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="/WeAdmin-master/static/css/font.css">
    <link rel="stylesheet" href="/WeAdmin-master/static/css/weadmin.css">
    <link rel="stylesheet" href="/ok-admin/css/oksub.css" media="all"/>
    <script type="text/javascript" src="/ok-admin/js/okLoading.js"></script>
    <script src="/WeAdmin-master/lib/layui/layui.js" charset="utf-8"></script>
    <script src="/WeAdmin-master/static/js/echarts.min.js"></script>
    <script src="/WeAdmin-master/static/js/list.js"></script>


</head>

<body class="weadmin-body" >
<div >
    <blockquote class="layui-elem-quote"><div id="nowTime"></div></blockquote>

    <div class="layui-col-lg12 layui-collapse" style="border: none;">
        <div class="layui-col-lg6 layui-col-md12">


            <!--统计信息展示-->
            <fieldset class="layui-elem-field" style="padding: 5px;">
                <!--WeAdmin公告-->
                <div class="layui-card">
                    <div class="layui-card-header layui-elem-quote">公告</div>
                    <div class="layui-card-body">
                        <div class="layui-carousel weadmin-notice" lay-filter="notice" lay-indicator="inside" lay-arrow="none" style="width: 100%; height: 280px;">
                            <div carousel-item="">
                                <div class="">
                                    <a href="http://www.tfri.com.cn/manage/html/2019/16172.html" target="_blank" class="layui-bg-red">《消防科学与技术》杂志2019年第10期目录</a>
                                </div>
                                <div class="">
                                    <a href="http://www.tfri.com.cn/manage/html/2018/16052.html" class="layui-bg-blue">2018第五届青年消防学者论坛征文通知</a>
                                </div>
                                <div class="">
                                    <a href="http://www.tfri.com.cn/manage/html/2019/16138.html" target="_blank" class="layui-bg-green">应急管理部天津消防研究所关于2019年拟录用应届毕业生的公示</a>
                                </div>

                            </div>
                            <div class="layui-carousel-ind">
                                <ul>
                                    <li class="layui-this"></li>
                                    <li></li>
                                </ul>
                            </div>
                            <!--<button class="layui-icon layui-carousel-arrow" lay-type="sub"></button>
                            <button class="layui-icon layui-carousel-arrow" lay-type="add"></button>-->
                        </div>

                    </div>
                </div>
                <!--<legend>信息统计</legend>-->
                <blockquote class="layui-elem-quote font16">工作进展</blockquote>
                <div >
                    <table class="layui-table" lay-even style="text-align: center">
                        <tbody>
                        <tr>
                            <td>统计</td>
                            <td>创建案件</td>
                            <td>上传EXCEL</td>
                            <td>上传图片</td>
                            <td>处理图片</td>
                            <td>处理完毕</td>
                        </tr>
                        <tr>
                            <td >总数</td>
                            <td >${statusTotal[0]}</td>
                            <td>${statusTotal[1]}</td>
                            <td>${statusTotal[2]}</td>
                            <td>${statusTotal[3]}</td>
                            <td>${statusTotal[4]}</td>
                        </tr>
                        <tr>
                            <td>今日</td>
                            <td>${statusToday[0]}</td>
                            <td>${statusToday[1]}</td>
                            <td>${statusToday[2]}</td>
                            <td>${statusToday[3]}</td>
                            <td>${statusToday[4]}</td>
                        </tr>
                        <tr>
                            <td>本周</td>
                            <td>${statusWeek[0]}</td>
                            <td>${statusWeek[1]}</td>
                            <td>${statusWeek[2]}</td>
                            <td>${statusWeek[3]}</td>
                            <td>${statusWeek[4]}</td>
                        </tr>
                        <tr>
                            <td>本月</td>
                            <td>${statusMonth[0]}</td>
                            <td>${statusMonth[1]}</td>
                            <td>${statusMonth[2]}</td>
                            <td>${statusMonth[3]}</td>
                            <td>${statusMonth[4]}</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </fieldset>
        </div>
        <div class="layui-col-lg6 layui-col-md12">
            <fieldset class="layui-elem-field " style="padding: 5px;">
                <!--更新日志-->
                <blockquote class="layui-elem-quote font16">本周案件信息</blockquote>
                <div style="height: 380px;overflow-y: auto;width: 96%;margin-left: 1%;padding: 5px;">
                    <table id="demo" style="text-align: center;"></table>


                </div>

                <%--<ul class="layui-timeline" style="height: 400px; overflow-y: auto;">
                    <!--<li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <div class="layui-timeline-title">
                                <h3>日志初始化模板</h3>
                                <span class="layui-badge-rim">2018-01-01</span>
                            </div>
                            <p></p>
                        </div>
                    </li>-->
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <div class="layui-timeline-title">
                                <h3>WeAdmin更新layui基础版本为V2.5.4</h3>
                                <span class="layui-badge-rim">2019-06-18</span>
                            </div>
                            <ul>
                                <li>更新layui基础版本为V2.5.4</li>
                                <li>左侧菜单更新为动态获取方式(本地JSON模拟)</li>
                            </ul>
                        </div>
                    </li>
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <div class="layui-timeline-title">
                                <h3>WeAdmin更新layui基础版本为V2.4.5</h3>
                                <span class="layui-badge-rim">2019-01-15</span>
                            </div>
                            <ul>
                                <li>更新layui基础版本为V2.4.5</li>
                                <li>更新字体图标的引入方式为iconfont(未修改完全，按照示例即可)</li>
                            </ul>
                        </div>
                    </li>
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <div class="layui-timeline-title">
                                <h3>WeAdmin更新layui基础版本为V2.2.6</h3>
                                <span class="layui-badge-rim">2018-04-03</span>
                            </div>
                            <ul>
                                <li>更新layui基础版本为V2.2.6</li>
                            </ul>
                        </div>
                    </li>
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <div class="layui-timeline-title">
                                <h3>WeAdmin小版本修复</h3>
                                <span class="layui-badge-rim">2018-03-28</span>
                            </div>
                            <ul>
                                <li>增加了文章分类添加、编辑页面</li>
                                <li>增加公用eleDel.js,个别通用页面独立加载</li>
                                <li>修复右键加载刷新后个别图表、表格页面样式错乱问题（判断加载后首次点击刷新frame子页面）</li>
                                <li>优化数据表格中表单元素点击问题</li>
                                <li>优化修复部分示例js报错</li>
                            </ul>
                        </div>
                    </li>
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis" style="color: #FF5722;">&#xe756;</i>
                        <div class="layui-timeline-content layui-text">
                            <div class="layui-timeline-title">
                                <h3>WeAdmin重新整理js调用方法</h3>
                                <span class="layui-badge-rim">2018-02-05</span>
                            </div>
                            <blockquote class="layui-elem-quote">使用
                                <a href="http://www.layui.com/doc/base/modules.html#extend" target="_blank">layui扩展模块</a>的方法重写了admin.js,里面包含了整个We-admin后台框架中常用的方法。</blockquote>
                            <ul>
                                <li>增加了Tab菜单栏鼠标右键刷新、关闭方法</li>
                                <li>增加了Tab菜单栏已打开菜单本地存储记录，刷新前已打开菜单不消失</li>
                                <li>增加了Tab切换监听和删除监听事件</li>
                                <li>admin.js修改为layui扩展组件加载模式 &nbsp;<i class="layui-icon" style="font-size: 16px; color: #FF5722;">&#xe60c;</i></li>
                            </ul>
                        </div>
                    </li>
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <div class="layui-timeline-title">
                                <h3>增加echarts定制使用实例</h3>
                                <span class="layui-badge-rim">2018-02-01</span>
                            </div>
                            <ul>
                                <li>基于echarts 4.0版本实现中国地图指定省份使用不同颜色标识，指定省份显示气泡图标，
                                    <a href="javascript:;">#详见左侧导航-【系统统计】-【地图DIY实例】</li>
                            </ul>
                        </div>
                    </li>
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <div class="layui-timeline-title">
                                <h3>WeAdmin初步规划</h3>
                                <span class="layui-badge-rim">2018-01-01</span>
                            </div>
                            <p>
                                layui发版以来，很多朋友贡献了layui案例,其中后台相关案例占了比较大的比例。
                                <br>恰逢最近接触使用后台开发较多，就查阅了大量后台开源框架，layui的案例layuicms/vip-admin/x-admin/jqadmin等等，甚至还有AdminLte/H-ui admin的demo.
                                <br>自己在做项目的时候，有一些特定需求，需要拓展的内容。
                                <br>项目工作告一段落的缝隙，就缝缝补补地研究layui写一下东西。
                                <br>第一次尝试，代码有些粗糙，也结合自己的理解希望能尽可能简单明了，模块完善中分享出来，希望能给需要的朋友一些参考。
                            </p>
                        </div>
                    </li>
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <div class="layui-timeline-title">
                                <h3>WeAdmin立项</h3>
                                <span class="layui-badge-rim">2018-01-01</span>
                            </div>

                        </div>
                    </li>
                </ul>--%>
            </fieldset>
        </div>
    </div>

    <div style="clear: both;overflow: hidden; margin-top: 10px;">
        <%--<blockquote class="layui-elem-quote">Copyright © 2019
            <a href="http://www.tfri.com.cn/manage/html/index.html" target="_blank">应急管理部天津市消防研究所</a>
        </blockquote>--%>
    </div>
    <blockquote class="layui-elem-quote">近期工作统计</blockquote>
    <div id="main" style="width: 90%;height:500px;position: absolute;left:5%;margin-bottom: 2%"></div>
</div>


</body>

<script type="text/javascript" src="../lib/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use('table', function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'
            ,url: '/jsp/data' //数据接口*/
            /*,skin: 'line' //行边框风格*/
            ,even: true //开启隔行背景
            ,page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
                layout: ['limit', 'count', 'prev', 'page', 'next'] //自定义分页布局
                //,curr: 5 //设定初始在第 5 页
                ,groups: 5 //只显示 1 个连续页码
                ,first: false //不显示首页
                ,last: false //不显示尾页

            }
            ,cols: [[ //表头
                {field: 'accId', title: '事故编码',  sort: true, fixed: 'left',align:'center'}
                ,{field: 'timeInvest', title: '调查时间',sort: true ,align:'center' }
                ,{field: 'loc', title: '事故地点',align:'center' }
                ,{field: 'Status', title: '处理状态',align:'center' }
                ,{field: 'govLr', title: '录入人',align:'center' }
            ]]
           /* data:[{"timeInvest":"Wed Nov 20 10:58:37 CST 2019","govLr":"李明","locSheng":"重庆","accId":20194731,"status":3}]*/
        });

    });
</script>

<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));

    // 指定图表的配置项和数据
    var option = {
        title: {
            text: ''
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data:['案件','处理完毕','处理中']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        toolbox: {
            feature: {
                saveAsImage: {}
            },

        },
        xAxis: {
            type: 'category',
            boundaryGap: false,

            data:["${date[6]}","${date[5]}","${date[4]}","${date[3]}","${date[2]}","${date[1]}","${date[0]}"]
        },
        yAxis: {
            type: 'value'
        },
        series: [
           {
                name:'案件',
                type:'line',
                /*stack: '总量',*/
                data:["${newAcc[6]}","${newAcc[5]}","${newAcc[4]}","${newAcc[3]}","${newAcc[2]}","${newAcc[1]}","${newAcc[0]}"]
            },
            {
                name:'处理中',
                type:'line',
                /*stack: '总量',*/
                data:["${doing[6]}","${doing[5]}","${doing[4]}","${doing[3]}","${doing[2]}","${doing[1]}","${doing[0]}"]
            },
            {
                name:'处理完毕',
                type:'line',
                /*stack: '总量',*/

                data:["${done[0]}","${done[1]}","${done[2]}","${done[3]}","${done[4]}","${done[4]}","${done[4]}"]
            }
        ]
    };


    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);

</script>


<script type="text/javascript">
    layui.extend({
        admin: '{/}../static/js/admin',
    });
    layui.use(['jquery', 'element','util', 'admin', 'carousel'], function() {
        var element = layui.element,
            $ = layui.jquery,
            carousel = layui.carousel,
            util = layui.util,
            admin = layui.admin;
        //建造实例
        carousel.render({
            elem: '.weadmin-shortcut'
            ,width: '100%' //设置容器宽度
            ,arrow: 'none' //始终显示箭头
            ,trigger: 'hover'
            ,autoplay:false
        });

        carousel.render({
            elem: '.weadmin-notice'
            ,width: '100%' //设置容器宽度
            ,arrow: 'none' //始终显示箭头
            ,trigger: 'hover'
            ,autoplay:true
        });

        $(function(){
            setTimeAgo(2018,0,1,13,14,0,'#firstTime');
            setTimeAgo(2019,5,20,16,0,0,'#lastTime');
        });
        function setTimeAgo(y, M, d, H, m, s,id){
            var str = util.timeAgo(new Date(y, M||0, d||1, H||0, m||0, s||0));
            $(id).html(str);
            console.log(str);
        };
    });
</script>
<script>
    var newDate = '';
    var curUserName= '<%=session.getAttribute("curUserName")%>';
    getLangDate();
    function dateFilter(date){
        if(date < 10){return "0"+date;}
        return date;
    }
    function getLangDate(){
        var dateObj = new Date(); //表示当前系统时间的Date对象
        var year = dateObj.getFullYear(); //当前系统时间的完整年份值
        var month = dateObj.getMonth()+1; //当前系统时间的月份值
        var date = dateObj.getDate(); //当前系统时间的月份中的日
        var day = dateObj.getDay(); //当前系统时间中的星期值
        var weeks = ["星期日","星期一","星期二","星期三","星期四","星期五","星期六"];
        var week = weeks[day]; //根据星期值，从数组中获取对应的星期字符串
        var hour = dateObj.getHours(); //当前系统时间的小时值
        var minute = dateObj.getMinutes(); //当前系统时间的分钟值
        var second = dateObj.getSeconds(); //当前系统时间的秒钟值
        var timeValue = "" +((hour >= 12) ? (hour >= 18) ? ", 晚上" : ", 下午" : ", 上午" ); //当前时间属于上午、晚上还是下午
        okLoading.close();
        newDate = dateFilter(year)+"年"+dateFilter(month)+"月"+dateFilter(date)+"日 "+" "+dateFilter(hour)+":"+dateFilter(minute)+":"+dateFilter(second);
        document.getElementById("nowTime").innerHTML = "尊敬的"+curUserName+timeValue+"好！";
        setTimeout("getLangDate()",1000);
    }
</script>
</html>

