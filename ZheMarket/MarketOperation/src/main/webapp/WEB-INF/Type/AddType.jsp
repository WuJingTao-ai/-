<%--
  Created by IntelliJ IDEA.
  User: AintccOut
  Date: 2019/11/10
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加类型</title>
    <link rel="stylesheet" href="layui/css/layui.css"/>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="layui/layui.all.js"></script>
    <script type="text/javascript" src="layui/lay/modules/form.js"></script>
</head>
<body style="height: 500px;width: 400px" >
<form action="<%=request.getContextPath()%>/Add_Type">
    <div class="layui-form-item">
        <label class="layui-form-label">类型名称</label>
        <div class="layui-input-block">
            <input type="text" name="typeName" required  lay-verify="required" placeholder="类型名称不能超过13位数字字符" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
</div>
</body>
</html>
