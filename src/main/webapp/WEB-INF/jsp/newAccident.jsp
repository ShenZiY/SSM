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
    <script type="text/javascript" src="${APP_PATH }/ok-admin/js/okLoading.js"></script>
    <script src="${APP_PATH }/WeAdmin-master/lib/layui/layui.js" charset="utf-8"></script>


</head>

<body style="background-color: rgba(171,176,215,0.36); ">
<div class="weadmin-body">
    <div style="margin-top: 20px">
        <blockquote class="layui-elem-quote"><div id="nowTime"></div></blockquote>
    </div>
    <div class="layui-carousel" id="stepForm" lay-filter="stepForm" style="margin: 0 auto; padding-top: 50px;">
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
                            <%-- <button class="layui-btn" lay-submit lay-filter="keepAccId" type="submit">
                                 &emsp;保存&emsp;
                             </button>--%>
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
                        <%--<div class="layui-inline">
                            <label class="layui-form-label">详细地址</label>
                            <div class="layui-input-inline">
                                <input type="text" name="locDetail" id="locDetail" lay-verify="required"  autocomplete="off" class="layui-input">
                            </div>
                        </div>--%>
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
                            <div class="layui-input-inline">
                                <select name="state">
                                    <option value=""></option>
                                    <option value="原始">原始</option>
                                    <option value="变动" >变动</option>
                                    <option value="无现场">无现场</option>
                                    <option value="其他">其他</option>
                                    <option value="未知">未知</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">消防车到场</label>
                            <div class="layui-input-inline">
                                <select name="fireTru">
                                    <option value=""></option>
                                    <option value="是">是</option>
                                    <option value="否" >否</option>
                                    <option value="未知" >未知</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">时间</label>
                            <div class="layui-input-inline">
                                <input type="text" name="timeFireTru" id ="timeFireTru" lay-verify=""  placeholder="消防车到场时间" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">救护车到场</label>
                            <div class="layui-input-inline">
                                <select name="ambulance">
                                    <option value=""></option>
                                    <option value="是">是</option>
                                    <option value="否" >否</option>
                                    <option value="未知" >未知</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">时间</label>
                            <div class="layui-input-inline">
                                <input type="text" name="timeAmbu" id ="timeAmbu" lay-verify=""  placeholder="救护车到场时间" autocomplete="off" class="layui-input">
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
                            <div class="layui-input-inline">
                                <select name="xcbh">
                                    <option value=""></option>
                                    <option value="采取措施">采取措施</option>
                                    <option value="没有采取措施" >没有采取措施</option>
                                    <option value="其他">其他</option>
                                    <option value="未知">未知</option>
                                </select>
                            </div>
                        </div>

                        <div class="layui-inline">
                            <label class="layui-form-label">车辆保护</label>
                            <div class="layui-input-inline">
                                <select name="clbh">
                                    <option value=""></option>
                                    <option value="采取措施">采取措施</option>
                                    <option value="没有采取措施" >没有采取措施</option>
                                    <option value="其他">其他</option>
                                    <option value="未知">未知</option>
                                </select>
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
                            <div class="layui-input-inline">
                                <select name="location">
                                    <option value=""></option>
                                    <option value="城区">城区</option>
                                    <option value="村庄" >村庄</option>
                                    <option value="高速公路">高速公路</option>
                                    <option value="野外">野外</option>
                                    <option value="车库">车库</option>
                                    <option value="其他">其他</option>
                                    <option value="未知">未知</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">道路趋势</label>
                            <div class="layui-input-inline">
                                <select name="ctqs">
                                    <option value=""></option>
                                    <option value="平坦的">平坦的</option>
                                    <option value="上升" >上升</option>
                                    <option value="下降">下降</option>
                                    <option value="未知">未知</option>
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
                            <div class="layui-input-inline">
                                <select name="bmcz">
                                    <option value=""></option>
                                    <option value="沥青">沥青</option>
                                    <option value="水泥" >水泥</option>
                                    <option value="砂石">砂石</option>
                                    <option value="土路">土路</option>
                                    <option value="草地">草地</option>
                                    <option value="其他">其他</option>
                                    <option value="未知">未知</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">道路状况</label>
                            <div class="layui-input-inline">
                                <select name="bmzk">
                                    <option value=""></option>
                                    <option value="干">干</option>
                                    <option value="湿" >湿</option>
                                    <option value="冰冻">冰冻</option>
                                    <option value="积雪">积雪</option>
                                    <option value="其他">其他</option>
                                    <option value="未知">未知</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">周围监控</label>
                            <div class="layui-input-inline">
                                <select name="zwjk">
                                    <option value=""></option>
                                    <option value="没有">没有</option>
                                    <option value="有" >有</option>
                                    <option value="未知">未知</option>
                                </select>
                            </div>
                        </div>

                    </div>

                    <div class="layui-form-item">
                        <div class="layui-inline">
                            <label class="layui-form-label">风向</label>
                            <div class="layui-input-inline">
                                <select name="fx">
                                    <option value=""></option>
                                    <option value="无风">无风</option>
                                    <option value="北" >北</option>
                                    <option value="东北">东北</option>
                                    <option value="东">东</option>
                                    <option value="东南">东南</option>
                                    <option value="南">南</option>
                                    <option value="西南">西南</option>
                                    <option value="西">西</option>
                                    <option value="西北">西北</option>
                                    <option value="未知">未知</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">风力</label>
                            <div class="layui-input-inline">
                                <select name="fl">
                                    <option value=""></option>
                                    <option value="无风">没有</option>
                                    <option value="稳定弱" >稳定、弱</option>
                                    <option value="稳定强" >稳定、强</option>
                                    <option value="未知" >未知</option>
                                </select>
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">风速</label>
                            <div class="layui-input-inline">
                                <input type="number" name="fs" id ="fs"    autocomplete="off" class="layui-input">
                            </div>
                        </div>


                        <div class="layui-form-item">
                            <div class="layui-inline">
                                <label class="layui-form-label">天气</label>
                                <div class="layui-input-inline">
                                    <select name="tq">
                                        <option value=""></option>
                                        <option value="晴">晴</option>
                                        <option value="阴" >阴</option>
                                        <option value="雨">雨</option>
                                        <option value="雪">雪</option>
                                        <option value="雾">雾</option>
                                        <option value="大风">大风</option>
                                        <option value="冰雹">冰雹</option>
                                        <option value="其他">其他</option>
                                        <option value="未知">未知</option>
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
    </div>
</div>
</body>
<script src="${APP_PATH }/layuimini/lib/layui-v2.5.4/layui.js" charset="utf-8"></script>
<script src="${APP_PATH }/layuimini/js/lay-config.js?v=1.0.4" charset="utf-8"></script>
<script src="${APP_PATH }/static/js/area.js" type="text/javascript"></script>
<script src="${APP_PATH }/static/js/select.js" type="text/javascript"></script>
<script src="${APP_PATH }/static/js/jquery.min.js" type="text/javascript"></script>

<script>
    okLoading.close();
</script>
<script>
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
        newDate = dateFilter(year)+"年"+dateFilter(month)+"月"+dateFilter(date)+"日 ";
        document.getElementById("nowTime").innerHTML = "尊敬的"+curUserName+"！  今天是  "+newDate+"&nbsp&nbsp"+week+
            "&nbsp&nbsp第"+zhous+"周"+"&nbsp&nbsp&nbsp"
            +"数据库今日已录入案件"+todayAccNum+"起"+"&nbsp&nbsp&nbsp"+"建议事故编号: "+year+zhous+weekNumber+num;
        setTimeout("getLangDate()",1000);
    }
</script>

<script>
    layui.use([ 'form', 'step','laydate'], function () {
        var $ = layui.$,
            form = layui.form,
            step = layui.step,
            laydate = layui.laydate;

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

</script>

<script type="text/javascript">
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
</script>





</html>

