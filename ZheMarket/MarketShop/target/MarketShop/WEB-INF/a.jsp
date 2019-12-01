<%--
  Created by IntelliJ IDEA.
  User: AintccOut
  Date: 2019/11/21
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" href="/JINDONG/css/style.css" rel="stylesheet" />
    <script type="text/javascript" src="/js/jquery.min.js"></script>
</head>
<body>
<!--左侧菜单-->
<div class="sec-mainL left">
    <div class="mainL-hd-box">
        <h2 class="mainL-hd"><a  onclick="aa()">购物返彩贝商家</a></h2>
    </div>
    <!--菜单列表-->
    <ul class="sec-mainNav">

        <div  id="divlist">



        </div>
    </ul>
</div>
</body>
<script>
    var t = ${info};
    for (var i = 0; i < t.length; i++)
    {var str = "";
        $("#divlist").append(str);
    }


</script>
</html>
