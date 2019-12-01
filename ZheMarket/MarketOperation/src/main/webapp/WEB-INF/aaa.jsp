<%--
  Created by IntelliJ IDEA.
  User: AintccOut
  Date: 2019/11/19
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
<body>
<table  id="TableData" border="1" cellspacing="0" cellpadding="0">
    </table >
<div id="div">
</div>
</body>


<script>
    $(function () {
        alert("aa")
    })

</script>


<script>
    var aaa = ${info};
    alert("aaa");
    $("#div").attr(c);
    $("#TableData").append(str);
    }



</script>




<%--<script>
    var t = ${info};
    for (var i = 0; i < t.length; i++)
    {var str = " <tr>\n" +
        "       <td>账号</td>\n" +
        "       <td>密码</td>\n" +
        "       <td>性别</td>\n" +
        "       <td>年龄</td>\n" +
        "   </tr>\n" +
        "    <tr>\n" +
        "        <td>"+t[i].userName+"</td>\n" +
        "        <td>"+t[i].userPasswrod+"</td>\n" +
        "        <td>"+t[i].sex+"</td>\n" +
        "        <td>"+t[i].age+"</td>\n" +
        "    </tr>"
        $("#TableData").append(str);
    }

</script>--%>

</html>
