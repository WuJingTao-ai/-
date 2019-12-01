<%--
  Created by IntelliJ IDEA.
  User: shangfeng
  Date: 2019/7/4
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录session失效</title>
    <link href="errorcss/css/pintuer.css" rel="stylesheet"/>
</head>
<body>
<div class="container" style=" margin-top:8%;width: 80%">
    <div class="panel margin-big-top">
        <div class="text-center">
            <br>
            <h2 class="padding-top"> <stong>404！你的登录session失效了请重新登录!</stong> </h2>
            <div class="">
                <div class="float-left">
                    <img src="errorcss/img/ds-1.gif">
                    <div class="alert"> 卧槽！你的session失效了！ </div>
                </div>
                <div class="float-right">
                    <img src="errorcss/img/ds-2.png" width="260">
                </div>
            </div>
            <div class="padding-big">
                <a href="<%=request.getContextPath() %>/login.jsp" class="button bg-yellow">请重新登录</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
