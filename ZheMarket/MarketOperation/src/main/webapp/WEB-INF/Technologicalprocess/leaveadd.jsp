<%--
  Created by IntelliJ IDEA.
  User: AintccOut
  Date: 2019/11/12
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="layui/css/layui.css"/>
<script type="text/javascript" src="/layui/lay/modules/form.js"></script>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="layui/layui.all.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<SCRIPT>
    function c(){
        var date1 = document.getElementById("date1").value;
        var date2 = document.getElementById("date2").value;
        var result = (new Date(date1).getTime() - new Date(date2))/(24*3600*1000);
        document.getElementById("day").value = Math.abs(result);
    }

    function  a() {
        //请假时长
        var day = document.getElementById("day").value;
        //申请人
        var userName = document.getElementById("userName").value;
        //审批内容
        var content = document.getElementById("content").value;
        //开始时间
        var date1 = document.getElementById("date1").value;
        //结束时间
        var date2= document.getElementById("date2").value;
//选择的原因

        alert("请假时长：" + day);
        alert("请假内容：" + content);
        alert("申请人：" + userName);
        alert("开始时间：" + date2);
        alert("结束时间：" + date1);
        alert("选择的原因：" + radio1);
    }
</SCRIPT>
<div style="width: 500px;height: 400px">
<form >

    <div class="layui-form-item">
        <label class="layui-form-label">请假人</label>
        <div class="layui-input-block">
            <input type="text" name="userName"  value="${user.userName}"   id="userName"    lay-verify="required"  required  disabled="disabled" placeholder="6-13位字母数字" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">请假原因</label>
        <div class="layui-input-block">
            <input type="radio" name="reason" value="1"  >因公
            <input type="radio" name="reason" value="2" >因私
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">请假时间（开始）</label>
        <div class="layui-input-block">
            <input type="date" name="userName" id="date1"  required  lay-verify="required" placeholder="6-13位字母数字" autocomplete="off" class="layui-input">
        </div>
    </div>







    <div class="layui-form-item">
        <label class="layui-form-label" >请假时间（结束）</label>
        <div class="layui-input-block">
            <input type="date"  id="date2" required onchange="c()"  lay-verify="required" placeholder="有效字符汉字" autocomplete="off" class="layui-input">
        </div>
    </div>





    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">请假描述</label>
        <div class="layui-input-block">
            <textarea   id="content" placeholder="请输入内容" class="layui-textarea"></textarea>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn"  onclick="leaveadd()">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>


    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">请假天数</label>
        <div class="layui-input-block">
            <input type="text" name="usershop" id="day" disabled="disabled"required onchange="c()"  lay-verify="required" placeholder="有效字符汉字" autocomplete="off" class="layui-input">
        </div>
    </div>
</form>
</div>
<script>
   function leaveadd() {
    //请假时长
    var day = document.getElementById("day").value;
    //申请人
    var userName = document.getElementById("userName").value;
    //审批内容
    var content = document.getElementById("content").value;
    //开始时间
    var date1 = document.getElementById("date1").value;
    //结束时间
    var date2= document.getElementById("date2").value;
    //选择的原因
    var radio1 = $("input[type='radio']:checked").val();
    $.ajax({
        url: "/Add_leave",
        type: "post",
        dataType: "text",
        data: {
            "days": day,
            "content": content,
            "username": userName,
            "reason": radio1,
            "datetime": date2,
            "endtime": date1
        },
        success: function () {
            alert("提交成功请注意查看状态");
            window.location.href = "";
        }
    });
}
</script>
</body>
</html>