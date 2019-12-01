<%--
  Created by IntelliJ IDEA.
  User: AintccOut
  Date: 2019/11/10
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="layui/css/layui.css"/>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="layui/layui.all.js"></script>
<script type="text/javascript" src="layui/lay/modules/form.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.3.1.min.js"> </script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
        <td>类型ID</td>
        <td>类型名称</td>
        <td>加入时间</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${type}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.typeName}</td>
            <td><fmt:formatDate value="${list.typeDate}" pattern="yyyy-MM-dd"/></td>
            <td>
                <a href="<%=request.getContextPath()%>/Delect_Type?id=${list.id}">删除</a>
                <a href="<%=request.getContextPath()%>/Up_Date_Type?id=${list.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<jsp:include page="/pager.jsp"></jsp:include>

</body>
</html>
