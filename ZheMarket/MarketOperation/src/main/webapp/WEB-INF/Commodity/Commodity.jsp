<%--
  Created by IntelliJ IDEA.
  User: AintccOut
  Date: 2019/11/14
  Time: 19:52
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
<body><table class="layui-table" lay-even lay-skin="nob">


    <colgroup>
        <col width="150">
        <col width="200">
        <col>
    </colgroup>
    <thead>
    <tr  class="layui-bg-black">
        <td>商品ID</td>
        <td>商品名称</td>
        <td>类型ID</td>
        <td>宣传标题</td>
        <td>图片</td>
        <td>副图片</td>
        <td>商品描述</td>
        <td>价格</td>
        <td>库存</td>
        <td>状态</td>
        <td>创建时间</td>
        <td>修改时间</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${pager.list}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.commodityName}</td>
            <td>${list.typeName}</td>
            <td>${list.subtitle}</td>
            <td><img src=""></td>
            <td><img src=""></td>
            <td>${list.detail}</td>
            <td>${list.price}</td>
            <td>${list.stock}</td>
            <td>${list.status}</td>
            <td><fmt:formatDate value="${list.createtime}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${list.updatetime}" pattern="yyyy-MM-dd"/></td>
            <td>
                <a href="<%=request.getContextPath()%>/Delect_Commodity?id=${list.id}">删除</a>
                <a href="<%=request.getContextPath()%>/UpDate_Commodity?id=${list.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<jsp:include page="/pager.jsp"></jsp:include>
</body>
</html>