<%--
  Created by IntelliJ IDEA.
  User: AintccOut
  Date: 2019/10/27
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>店铺申请</title>
    <link rel="stylesheet" href="layui/css/layui.css"/>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="layui/layui.all.js"></script>
    <script type="text/javascript" src="layui/lay/modules/form.js"></script>
</head>
<body>
<br>
<div style="width: 500px;height: 500px">
<form action="<%=request.getContextPath()%>/Add_shop">
    <div class="layui-form-item">
        <label class="layui-form-label">身份证</label>
        <div class="layui-input-block">
            <input type="text" name="id" required  lay-verify="required" placeholder="13位有效身份证" autocomplete="off" class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">   </label>
        <div class="layui-input-block">
            <button type="button" class="layui-btn" id="test1">
                <i class="layui-icon">&#xe67c;</i>身份证上传
            </button>
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">用户账号</label>
        <div class="layui-input-block">
            <input type="text" name="userName" required  lay-verify="required" placeholder="6-13位字母数字" autocomplete="off" class="layui-input">
        </div>
    </div>



    <div class="layui-form-item">
        <label class="layui-form-label">用户密码</label>
        <div class="layui-input-inline">
            <input type="password" name="userPassword" required lay-verify="required" placeholder="6-13位密码" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-form-mid layui-word-aux">密码为个人所知</div>
    </div>



    <div class="layui-form-item">
        <label class="layui-form-label">店铺名称</label>
        <div class="layui-input-block">
            <input type="text" name="usershop" required  lay-verify="required" placeholder="有效字符汉字" autocomplete="off" class="layui-input">
        </div>
    </div>


    <div class="layui-form-item">
        <label class="layui-form-label">店铺所在位置</label>
        <div class="layui-input-block">
            <input type="text" name="userRegion" required  lay-verify="required" placeholder="150米范围内" autocomplete="off" class="layui-input">
        </div>
    </div>



    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">店铺描述</label>
        <div class="layui-input-block">
            <textarea name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
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
