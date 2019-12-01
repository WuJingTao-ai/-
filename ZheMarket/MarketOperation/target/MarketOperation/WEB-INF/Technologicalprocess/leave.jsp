<%--
  Created by IntelliJ IDEA.
  User: AintccOut
  Date: 2019/11/13
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<link rel="stylesheet" href="layui/css/layui.css"/>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="layui/layui.all.js"></script>
<script type="text/javascript" src="layui/lay/modules/form.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.3.1.min.js"> </script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="layui-table" lay-even lay-skin="nob">
    <colgroup>
        <col width="150">
        <col width="200">
        <col>
    </colgroup>
    <thead>
    <tr  class="layui-bg-black">
        <td>ID</td>
        <td>请假天数</td>
        <td>申请简介</td>
        <td>请假原因</td>
        <td>开始时间</td>
        <td>结束时间</td>
        <td>状态码</td>
        <td>请假人</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${leaveist}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.days}</td>
            <td>${list.content}</td>
            <td>${list.reason==1?"因私":"因公"}</td>
            <td><fmt:formatDate value="${list.datetime}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${list.endtime}" pattern="yyyy-MM-dd"/></td>
            <td>${list.state==0?"上一级审核":list.state==2?"上二级审核":"最上级审核"}</td>
            <td>${list.username}</td>
            <td>
                        <button class="layui-btn"  onclick="nn(${list.id})">审批同意</button>
                        <button type="reset" class="layui-btn layui-btn-primary">不于审批</button>
                        <button type="button" class="layui-btn layui-btn-primary" onclick="a()">回撤</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<jsp:include page="/pager.jsp"></jsp:include>
<SCRIPT>
function  nn(id){
        alert(id);



    layer.open({
        type: 1,
        skin: 'layui-layer-rim', //加上边框
        area: ['620px', '640px'], //宽高
        title: '审批',
        content: '\n' +
        '<div  style="width: 500px;height: 500px">\n' +
        '<center>\n' +
        '\n' +
        '    <form  action="/to">\n' +
        '<h1>审批</h1>\n' +
        '<div class="layui-form-item">\n' +
        '    <label class="layui-form-label">请假原因</label>\n' +
        '    <br>\n' +
        '    <br>\n' +
        '    <br>\n' +
        '    <div class="layui-input-block">\n' +
        '        批准：<input type="radio" name="reason" value="1">\n' +
        '               回执 ：<input type="radio" name="reason" value="2" >\n' +
        '    </div>\n' +
        '</div>\n' +
        '    <div class="layui-form-item layui-form-text">\n' +
        '        <label class="layui-form-label">回复</label>\n' +
        '        <div class="layui-input-block">\n' +
        '            <textarea   id="content" placeholder="请输入内容" class="layui-textarea"></textarea>\n' +
        '        </div>\n' +
        '    </div>\n' +
        '        <div class="layui-form-item">\n' +
        '            <label class="layui-form-label" >准批人姓名</label>\n' +
        '            <div class="layui-input-block">\n' +
        '                <input type="text"   required  value="${user.userName}" disabled="disabled" lay-verify="required" placeholder="有效字符汉字" autocomplete="off" class="layui-input">\n' +
        '            </div>\n' +
        '        </div>\n' +
        '\n' +
        '        <div class="layui-form-item">\n' +
        '            <div class="layui-input-block">\n' +
        '                <button class="layui-btn" lay-submit lay-filter="formDemo" onclick="a()">立即提交</button>\n' +
        '                <button type="reset" class="layui-btn layui-btn-primary">重置</button>\n' +
        '            </div>\n' +
        '        </div>\n' +
        '\n' +
        '    </form>\n' +
        '</center>\n' +
        '</div>'
    });
}
</SCRIPT>
</body>
</html>
