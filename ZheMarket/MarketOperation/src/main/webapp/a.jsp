<%--
  Created by IntelliJ IDEA.
  User: AintccOut
  Date: 2019/11/20
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
</head>
<body>
   电话： <input type="text"  id="c">
   <input type="button" onclick="a()">
</body>
<script>

    function a() {
    var  c = $("#c").val();
    alert(c)
       $.ajax({
           url:"/n",
           type:"post",
           dataType:"text",
           data:{"cellphone":c },
           success: function () {
                alert(c)
           }
        })
    }
</script>
</html>
