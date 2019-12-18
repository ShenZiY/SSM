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
    <title>新建事故</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="shortcut icon" href="${APP_PATH }/static/logo.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${APP_PATH }/layuimini/lib/layui-v2.5.4/css/layui.css">
    <link rel="stylesheet" href="${APP_PATH }/ok-admin/css/oksub.css" media="all"/>
    <%--<script type="text/javascript" src="${APP_PATH }/ok-admin/js/okLoading.js"></script>--%>
    <script src="${APP_PATH }/WeAdmin-master/lib/layui/layui.js" charset="utf-8"></script>


</head>

<body style="background-color: rgba(171,176,215,0.36); ">
<div class="weadmin-body">
    <div style="margin-top: 20px;margin-left: 5px">
        <blockquote class="layui-elem-quote" ><div id="nowTime" style="margin-left: 17%"></div></blockquote>
    </div>


    <button type="button" id = "uploadExcel" class="layui-btn" style="margin-left: 45% ;margin-top: 7%"><i class="layui-icon"></i>上传EXCEL数据</button>
   <%-- <div class="layui-carousel" id="stepForm" lay-filter="stepForm" style="margin: 0 auto; padding-top: 50px;">
        <div carousel-item>
            <div>
                <form  action="/keepAccId" class="layui-form" style="margin: 0 auto;max-width: 460px;text-align:center;padding-top: 40px;">
                    <div class="layui-form-item">
                        <label class="layui-form-label">事故编码</label>
                        <div class="layui-input-block">
                            <input type="text" name="accId" id="accId" class="layui-input" lay-verify="required|number" required />
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <button class="layui-btn" lay-submit lay-filter="formStep" type="submit">
                                保存
                            </button>
                            &lt;%&ndash; <button class="layui-btn" lay-submit lay-filter="keepAccId" type="submit">
                                 &emsp;保存&emsp;
                             </button>&ndash;%&gt;
                            <button class="layui-btn" lay-submit lay-filter="formStep2" type="submit">
                                继续
                            </button>
                        </div>
                    </div>
                </form>
            </div>
            <div>
                <form class="layui-form" style="margin: 0 auto;text-align:center; padding-top: 40px;">
                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">事故地点</label>
                            <div class="layui-inline">
                                <select name="province" id="province" lay-verify="required" lay-search lay-filter="province">
                                    <option value="">省份</option>
                                </select>
                            </div>
                            <div class="layui-inline">
                                <select name="city" id="city" lay-verify="required" lay-search lay-filter="city">
                                    <option value="">地级市</option>
                                </select>
                            </div>
                            <div class="layui-inline">
                                <select name="district" id="district" lay-verify="required" lay-search>
                                    <option value="">县/区</option>
                                </select>
                            </div>
                        </div>
                        &lt;%&ndash;<div class="layui-inline">
                            <label class="layui-form-label">详细地址</label>
                            <div class="layui-input-inline">
                                <input type="text" name="locDetail" id="locDetail" lay-verify="required"  autocomplete="off" class="layui-input">
                            </div>
                        </div>&ndash;%&gt;
                        <div class="layui-inline">
                            <label class="layui-form-label ">详细地址</label>
                            <div class="layui-input-inline">
                                <input type="text" name="locDetail" id ="locDetail" lay-verify="required"  autocomplete="off" class="layui-input">
                            </div>
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">报警时间</label>
                            <div class="layui-input-inline">
                                <input type="text" name="timeFind" id ="timeFind" lay-verify="required"  autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">涉及车辆数</label>
                            <div class="layui-input-inline">
                                <input type="number" name="carNum" id="carNum" lay-verify="number"  autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">伤亡人数</label>
                            <div class="layui-input-inline">
                                <input type="number" name="hurtNum" id = "hurtNum" lay-verify="number" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                    </div>



                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">涉及人员数</label>
                            <div class="layui-input-inline">
                                <input type="number" name="peopleNum" id ="peopleNum" lay-verify="required|number"  autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">采集人</label>
                            <div class="layui-input-inline">
                                <input type="text" name="govCJ" id="govCJ" lay-verify="required"  autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">信息录入人</label>
                            <div class="layui-input-inline">
                                <input type="text" name="govLR" id = "govLR" lay-verify="required" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">警方到时间</label>
                            <div class="layui-input-inline">
                                <input type="text" name="timePolice" id ="timePolice" lay-verify="required"  autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">调查时间</label>
                            <div class="layui-input-inline">
                                <input type="text" name="timeInvest" id="timeInvest" lay-verify="required"  autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">现场形态</label>
                            <div class="layui-input-block">
                                <div class="layui-input-inline">
                                <input type="text" name="state" id="stateInput" class="layui-input" style="position:absolute;z-index:2;width:80%;" placeholder="请选择" autocomplete="off">
                                <select type="text"  id="stateSelect" lay-filter="hc_select" autocomplete="off"   class="layui-select" >
                                    <option value=""></option>
                                    <option value="①原始">1原始</option>
                                    <option value="②变动" >2变动</option>
                                    <option value="③无现场">3无现场</option>
                                    <option value="⑧其他">8其他</option>
                                    <option value="⑨未知">9未知</option>
                                </select>
                            </div>
                            </div>
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">消防车到场</label>
                            <div class="layui-input-inline">
                                <select name="fireTru">
                                    <option value=""></option>
                                    <option value="①是">1是</option>
                                    <option value="②否" >2否</option>
                                    <option value="⑨未知" >9未知</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">时间</label>
                            <div class="layui-input-inline">
                                <input type="text" name="timeFireTru" id ="timeFireTru" lay-verify="" value="一" placeholder="消防车到场时间" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">救护车到场</label>
                            <div class="layui-input-inline">
                                <select name="ambulance">
                                    <option value=""></option>
                                    <option value="1是">1是</option>
                                    <option value="2否" >2否</option>
                                    <option value="9未知" >9未知</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">时间</label>
                            <div class="layui-input-inline">
                                <input type="text" name="timeAmbu" id ="timeAmbu" lay-verify="" value="一" placeholder="救护车到场时间" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <button type="button" class="layui-btn layui-btn-primary pre ">上一步</button>
                            <button class="layui-btn" lay-submit lay-filter="newAcc">
                                保存
                            </button>
                            <button class="layui-btn" lay-submit lay-filter="formStep2">
                                继续
                            </button>
                        </div>
                    </div>
                </form>
            </div>

            <div>
                <form class="layui-form" style="margin: 0 auto;text-align:center;padding-top: 40px;">
                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">现场保护</label>
                            <div class="layui-input-block">
                                <div class="layui-input-inline">
                                    <input type="text" name="xcbh" id="xcbhInput" class="layui-input" style="position:absolute;z-index:2;width:80%;" placeholder="请选择" autocomplete="off">
                                    <select id ="xcbhSelect" lay-filter="xcbh_select" autocomplete="off"   class="layui-select" >
                                        <option value=""></option>
                                        <option value="1采取措施">1采取措施</option>
                                        <option value="2没有采取措施" >2没有采取措施</option>
                                        <option value="8其他">8其他</option>
                                        <option value="9未知">9未知</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="layui-inline">
                            <label class="layui-form-label">车辆保护</label>
                            <div class="layui-input-block">
                                <div class="layui-input-inline">
                                    <input type="text" name="clbh" id="clbhInput" class="layui-input" style="position:absolute;z-index:2;width:80%;" placeholder="请选择" autocomplete="off">
                                    <select id="clbhSelect" lay-filter="clbh_select" autocomplete="off"   class="layui-select" >
                                        <option value=""></option>
                                        <option value="1采取措施">1采取措施</option>
                                        <option value="2没有采取措施" >2没有采取措施</option>
                                        <option value="8其他">8其他</option>
                                        <option value="9未知">9未知</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <button type="button" class="layui-btn layui-btn-primary pre ">上一步</button>
                            <button class="layui-btn" lay-submit lay-filter="saveEnvInfo">
                                保存
                            </button>
                            <button class="layui-btn" lay-submit lay-filter="formStep2" >
                                继续
                            </button>
                        </div>
                    </div>
                </form>
            </div>


            <div>
                <form class="layui-form" style="margin: 0 auto;text-align:center;padding-top: 40px;">
                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">事故地点</label>
                            <div class="layui-input-block">
                                <div class="layui-input-inline">
                                    <input type="text" name="location" id="locationInput" class="layui-input" style="position:absolute;z-index:2;width:80%;" placeholder="请选择" autocomplete="off">
                                    <select  id="locationSelect" lay-filter="location_select" autocomplete="off"   class="layui-select" >
                                        <option value=""></option>
                                        <option value="1城区">1城区</option>
                                        <option value="2村庄" >2村庄</option>
                                        <option value="3高速公路">3高速公路</option>
                                        <option value="4野外">4野外</option>
                                        <option value="5车库">5车库</option>
                                        <option value="8其他">8其他</option>
                                        <option value="9未知">9未知</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">道路趋势</label>
                            <div class="layui-input-inline">
                                <select name="ctqs">
                                    <option value=""></option>
                                    <option value="1平坦的">1平坦的</option>
                                    <option value="2上升" >2上升</option>
                                    <option value="3下降">3下降</option>
                                    <option value="9未知">9未知</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">坡度</label>
                            <div class="layui-input-inline">
                                <input type="number" name="pd" id ="pd"   autocomplete="off" class="layui-input">
                            </div>
                        </div>
                    </div>


                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">道路材质</label>
                                <div class="layui-input-block">
                                    <div class="layui-input-inline">
                                        <input type="text" name="bmcz" id="bmczInput" class="layui-input" style="position:absolute;z-index:2;width:80%;" placeholder="请选择" autocomplete="off">
                                        <select type="text"  id="bmczSelect" lay-filter="bmcz_select" autocomplete="off"   class="layui-select" >
                                            <option value=""></option>
                                            <option value="1沥青">1沥青</option>
                                            <option value="2水泥" >2水泥</option>
                                            <option value="3砂石">3砂石</option>
                                            <option value="4土路">4土路</option>
                                            <option value="5草地">草地</option>
                                            <option value="8其他">8其他</option>
                                            <option value="9未知">9未知</option>
                                        </select>
                                    </div>
                                </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">道路状况</label>
                                <div class="layui-input-block">
                                    <div class="layui-input-inline">
                                        <input type="text" name="bmzk" id="bmzkInput" class="layui-input" style="position:absolute;z-index:2;width:80%;" placeholder="请选择" autocomplete="off">
                                        <select type="text"  id="bmzkSelect" lay-filter="bmzk_select" autocomplete="off"   class="layui-select" >
                                            <option value=""></option>
                                            <option value="1干">1干</option>
                                            <option value="2湿" >2湿</option>
                                            <option value="3冰冻">3冰冻</option>
                                            <option value="4积雪">4积雪</option>
                                            <option value="8其他">8其他</option>
                                            <option value="9未知">9未知</option>
                                        </select>
                                    </div>
                                </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">天气</label>
                            <div class="layui-input-block">
                                <div class="layui-input-inline">
                                    <input type="text" name="tq" id="tqInput" class="layui-input" style="position:absolute;z-index:2;width:80%;" placeholder="请选择" autocomplete="off">
                                    <select type="text"  id="tqSelect" lay-filter="tq_select" autocomplete="off"   class="layui-select" >
                                        <option value=""></option>
                                        <option value="1晴">1晴</option>
                                        <option value="2阴" >2阴</option>
                                        <option value="3雨">3雨</option>
                                        <option value="4雪">4雪</option>
                                        <option value="5雾">5雾</option>
                                        <option value="6大风">6大风</option>
                                        <option value="7冰雹">7冰雹</option>
                                        <option value="8其他">8其他</option>
                                        <option value="9未知">9未知</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">风向</label>
                            <div class="layui-input-inline">
                                <select name="fx">
                                    <option value=""></option>
                                    <option value="1无风">1无风</option>
                                    <option value="2北" >2北</option>
                                    <option value="3东北">3东北</option>
                                    <option value="4东">4东</option>
                                    <option value="5东南">5东南</option>
                                    <option value="6南">6南</option>
                                    <option value="7西南">7西南</option>
                                    <option value="8西">8西</option>
                                    <option value="10西北">10西北</option>
                                    <option value="9未知">9未知</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">风力</label>
                            <div class="layui-input-inline">
                                <select name="fl">
                                    <option value=""></option>
                                    <option value="1无风">1没有</option>
                                    <option value="2稳定弱" >2稳定、弱</option>
                                    <option value="3稳定强" >3稳定、强</option>
                                    <option value="9未知" >9未知</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">风速</label>
                            <div class="layui-input-inline">
                                <input type="number" name="fs" id ="fs"    autocomplete="off" class="layui-input">
                            </div>
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">周围监控</label>
                            <div class="layui-input-inline">
                                <select name="zwjk">
                                    <option value=""></option>
                                    <option value="1没有">1没有</option>
                                    <option value="2有" >2有</option>
                                    <option value="9未知">9未知</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">温度</label>
                            <div class="layui-input-inline">
                                <input type="number" name="wd" id ="wd"    autocomplete="off" class="layui-input">
                            </div>
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <div class="layui-input-block">
                            <button type="button" class="layui-btn layui-btn-primary pre ">上一步</button>
                            <button class="layui-btn" lay-submit lay-filter="addEnvInfo">
                                保存
                            </button>
                            <button class="layui-btn" lay-submit lay-filter="formStep2" >
                                继续
                            </button>
                        </div>
                    </div>
                </form>
            </div>



            <div>
                <div style="text-align: center;margin-top: 90px;">
                    <i class="layui-icon layui-circle"
                       style="color: white;font-size:30px;font-weight:bold;background: #52C41A;padding: 20px;line-height: 80px;">&#xe605;</i>
                    <div style="font-size: 24px;color: #333;font-weight: 500;margin-top: 30px;">
                        填写完成
                    </div>
                </div>
                <div style="text-align: center;margin-top: 50px;">
                    <button class="layui-btn  layui-btn-primary pre"  >上一步</button>
                    <button class="layui-btn  layui-btn-danger" id = "refresh" >再次填报</button>
                </div>
            </div>

        </div>
    </div>--%>
</div>
</body>
<script src="${APP_PATH }/layuimini/lib/layui-v2.5.4/layui.js" charset="utf-8"></script>
<script src="${APP_PATH }/layuimini/js/lay-config.js?v=1.0.4" charset="utf-8"></script>
<script src="${APP_PATH }/static/js/area.js" type="text/javascript"></script>
<script src="${APP_PATH }/static/js/select.js" type="text/javascript"></script>
<script src="${APP_PATH }/static/js/jquery.min.js" type="text/javascript"></script>

<%--<script>
    okLoading.close();
</script>--%>

<script>
    var accId = '';
    var newDate = '';
    var curUserName= '<%=session.getAttribute("curUserName")%>';
    var todayAccNum =  '<%=request.getAttribute("todayAccNum")%>';
    var num =  '<%=request.getAttribute("num")%>';
    <%--var num =  '<%=session.getAttribute("num")%>';--%>
    <%--var num = '<%=(Integer)session.getAttribute("todayAccNum")+1%>';--%>
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
    }
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
        accId = ''+year+zhous+weekNumber+num;
        newDate = dateFilter(year)+"年"+dateFilter(month)+"月"+dateFilter(date)+"日 ";
        document.getElementById("nowTime").innerHTML = "尊敬的"+curUserName+"！  今天是  "+newDate+"&nbsp&nbsp"+week+
            "&nbsp&nbsp第"+zhous+"周"+"&nbsp&nbsp&nbsp"
            +"数据库今日已录入案件"+todayAccNum+"起"+"&nbsp&nbsp&nbsp"+"新建事故编号: "+year+zhous+weekNumber+num;

        setTimeout("getLangDate()",1000);
    }


    layui.use('upload', function(){
        var $ = layui.jquery, upload = layui.upload;


        upload.render({
            elem: '#uploadExcel'
            ,url: '/importA'
            ,accept: 'file' //普通文件
            ,exts: 'xls|xlsx' //允许上传的文件后缀
            ,before: function(obj){
                this.data={'accIdNew':accId};//关键代码
            }
            ,done: function(res){//返回值接收
                if(res.flag=="1"){
                    layer.msg('导入成功！', {
                    }, function(){
                        location.reload();
                    });
                }else{
                    layer.msg('导入失败！', {
                    }, function(){
                        location.reload();
                    });
                }
            }
        });

    });
</script>


<%--<script>
    layui.use([ 'form', 'step','laydate'], function () {
        var $ = layui.$,
            form = layui.form,
            step = layui.step,
            laydate = layui.laydate;

        form.on('select(hc_select)', function (data) {   //选择移交单位 赋值给input框
            $("#stateInput").val(data.value);
            $("#stateSelect").next().find("dl").css({ "display": "none" });
            form.render();
        });
        form.on('select(xcbh_select)', function (data) {   //选择移交单位 赋值给input框
            $("#xcbhInput").val(data.value);
            $("#xcbhSelect").next().find("dl").css({ "display": "none" });
            form.render();
        });
        form.on('select(clbh_select)', function (data) {   //选择移交单位 赋值给input框
            $("#clbhInput").val(data.value);
            $("#clbhSelect").next().find("dl").css({ "display": "none" });
            form.render();
        });
        form.on('select(location_select)', function (data) {   //选择移交单位 赋值给input框
            $("#locationInput").val(data.value);
            $("#locationSelect").next().find("dl").css({ "display": "none" });
            form.render();
        });
        form.on('select(bmcz_select)', function (data) {   //选择移交单位 赋值给input框
            $("#bmczInput").val(data.value);
            $("#bmczSelect").next().find("dl").css({ "display": "none" });
            form.render();
        });
        form.on('select(bmzk_select)', function (data) {   //选择移交单位 赋值给input框
            $("#bmzkInput").val(data.value);
            $("#bmzkSelect").next().find("dl").css({ "display": "none" });
            form.render();
        });
        form.on('select(tq_select)', function (data) {   //选择移交单位 赋值给input框
            $("#tqInput").val(data.value);
            $("#tqSelect").next().find("dl").css({ "display": "none" });
            form.render();
        });

        laydate.render({
            elem: '#timeFind' //指定元素
            ,type:'datetime'
            ,format:'yyyy-MM-dd HH:mm:ss'
            ,isInitValue:false
        });
        laydate.render({
            elem: '#timePolice' //指定元素
            ,type:'datetime'
            ,format:'yyyy-MM-dd HH:mm:ss'
            ,isInitValue:false
            ,trigger: 'click'
        });
        laydate.render({
            elem: '#timeInvest' //指定元素
            ,format:'yyyy-MM-dd HH:mm:ss'
            ,type:'datetime'
            ,isInitValue:false
            ,trigger: 'click'
        });
        laydate.render({
            elem: '#timeAmbu' //指定元素
            ,format:'yyyy-MM-dd HH:mm:ss'
            ,type:'datetime'
            ,isInitValue:false
            ,trigger: 'click'
        });
        laydate.render({
            elem: '#timeFireTru' //指定元素
            ,format:'yyyy-MM-dd HH:mm:ss'
            ,type:'datetime'
            ,isInitValue:false
            ,trigger: 'click'
        });

        step.render({
            elem: '#stepForm',
            filter: 'stepForm',
            width: '100%', //设置容器宽度
            stepWidth: '750px',
            height: '500px',
            stepItems: [{
                title: '事故编号'
            }, {
                title: '时间地点人员'
            }, {
                title: '现场保护措施'
            }, {
                title: '事故地点环境条件'
            }, {
                title: '完成'
            }]
        });

        /* form.on('submit(formStep)', function (data) {
             step.next('#stepForm');
             return false;
         });*/

        form.on('submit(formStep2)', function (data) {
            step.next('#stepForm');
            return false;
        });
        $('.pre').click(function () {
            step.pre('#stepForm');
        });

        $('.next').click(function () {
            step.next('#stepForm');
        });
    })

</script>--%>

<%--<script type="text/javascript">
    layui.use(['form', 'jquery', 'layer'], function () {
        var form = layui.form;
        var $ = layui.jquery;

        // $.ajax({
        //     url: "/accNum",        //获取当天已经新建的事故
        //     type: "POST",
        //     dataType: 'json'
        // });

        $("#refresh").click(function () {
            setTimeout('window.location.reload()',0);
        });

        //添加表单监听事件,提交注册信息
        form.on('submit(formStep)', function (form) {
            $.post('/insertBaseInfoId', form.field, function (result) {
                handlerResult(result,Done);
            });
            //防止页面跳转
            return false;
        });

        form.on('submit(saveEnvInfo)', function (form) {
            $.post('/saveEnvInfo', form.field, function (result) {
                handlerResult(result,Done);
            });
            //防止页面跳转
            return false;
        });

        form.on('submit(addEnvInfo)', function (form) {
            $.post('/addEnvInfo', form.field, function (result) {
                handlerResult(result,Done);
            });
            //防止页面跳转
            return false;
        });

        form.on('submit(newAcc)', function (form) {
            $.post('/addBaseInfo', form.field, function (result) {
                handlerResult(result,Done);
            });
            //防止页面跳转
            return false;
        });
    });

    function Done(data) {
        layer.msg("保存成功!", {
            icon: 1,
            time: 1000
        });
    }


    function showError(msg) {
        layer.msg(msg, {icon: 2});
    }

    /**
     * 处理 ajax 请求结果
     * @param result： ajax 返回的结果
     * @param fn： 成功的处理函数 ( 传入data: fn(result.data) )
     */
    function handlerResult(result,fn) {
        // 成功执行操作，失败提示原因
        if (result.code === 0) {
            fn(result.data);
        } else {
            showError(result.msg);
        }
    }
</script>--%>

<%--<script>
    $(document).ready(function () {
        var time = new Date();
        var day = ("0" + time.getDate()).slice(-2);
        var month = ("0" + (time.getMonth() + 1)).slice(-2);
        var today = time.getFullYear() + "-" + (month) + "-" + (day);
        $('#timeFireTru').val(today);
        $('#timeAmbu').val(today);
    })
</script>--%>





</html>

