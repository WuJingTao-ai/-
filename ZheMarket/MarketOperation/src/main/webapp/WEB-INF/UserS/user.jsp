<%--
  Created by IntelliJ IDEA.
  User: AintccOut
  Date: 2019/11/14
  Time: 11:54
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
        <td>用户ID</td>
        <td>账号</td>
        <td>登陆密码</td>
        <td>年龄</td>
        <td>性别</td>
        <td>联系电话</td>
        <td>图片名称</td>
        <td>图片路径</td>
        <td>用户登陆时间</td>
        <td>用户注册时间</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${pager.list}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.userName}</td>
            <td>${list.userPasswrod}</td>
            <td>${list.age}</td>
            <td>${list.sex==1?"男":"女"}</td>
            <td>${list.cellphone}</td>
            <td>${list.fliename}</td>
            <td>${list.fliepath}</td>
            <td><fmt:formatDate value="${list.longdate}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${list.register}" pattern="yyyy-MM-dd"/></td>
            <td>
                <a href="<%=request.getContextPath()%>/Delect_shop?id=${list.id}">删除</a>
                <a href="<%=request.getContextPath()%>/Car/Delect_Car?id=${list.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<jsp:include page="/pager.jsp"></jsp:include>
</body>
</html>
