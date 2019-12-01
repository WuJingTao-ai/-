<%--
  Created by IntelliJ IDEA.
  User: AintccOut
  Date: 2019/11/7
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<link rel="stylesheet" href="Longin/css/login.css">
<html>
<head>
    <title>登陆页面</title>

</head>
<script>
    function Login() {
        var userName = $("#userName").val();
        var userPasswrod = $("#userPasswrod").val();
        var code = $("#code").val();
        $.post(
            "/LoginUser",
          {   "userPasswrod":userPasswrod,
              "userName":userName,
              "code":code
            },
            function(data) {
                if(data.login==1){
                    alert("成功")
                    location.href="/To_index";
                }else {
                    alert("失败")
                }
            }
        );
    }
</script>
<body>
 <%--   请输入验证码：<input type="text" name="code" style="width: 80px;" id="code" />
    <input  type="button" value="登陆"  onclick="Login()" />--%>
    <div class="login">
        <div class="login_title">
            <p><img src="/Longin/images/jinghui.png" style="width:80px;height:80px;margin-right:30px;"/>郑州市公安局民航路分局警备系统平台</p>
        </div>
        <div class="login_main">
            <div class="main_left"></div>
            <div class="main_right">
                <div class="right_title">用户登录</div>
                <form action="">
                    <div class="username">
                        <img src="/Longin/images/username.png" alt="">
                        <input type="text"  name="userName"  id="userName"  placeholder="请输入用户名">
                    </div>
                    <div class="password">
                        <img src="/Longin/images/password.png" alt="">
                        <input type="text"  name="userPasswrod" id="userPasswrod" placeholder="请输入密码">
                    </div>



                    <div class="username">
                        <input type="text" name="code"  id="code" placeholder="请输入验证码"/>
                    </div>
                    <div class="yes_login">
                        <img id="imgObj" alt="验证码"  src="${pageContext.request.contextPath}/getCode">
                        <a href="#" onclick="changeImg()">换一张</a><br/>
                    </div>
                    <div class="yes_login"><a onclick="Login()">登&nbsp;&nbsp;&nbsp;&nbsp;录</a></div>
                </form>
            </div>
        </div>
        <div class="login_footer">
            <p class="name">版权所有：河南省商丘市柘城县二里岗大队所有</p>
            <p>建议浏览器：IE8及以上、360、谷歌、Firefox v22、搜狗、百度、QQ浏览器、UU</p>
            <p>技术支持：柘城县非常厉害科技有限公司 &nbsp;&nbsp;联系电话：022-8989775332  </p>

        </div>
    </div>



</body>
<script type="text/javascript">
    $(function() {

    });

    function changeImg() {
        var imgSrc = $("#imgObj");
        var src = imgSrc.attr("src");
        imgSrc.attr("src", chgUrl(src));
    }

    // 时间戳
    // 为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
    function chgUrl(url) {
        var timestamp = (new Date()).valueOf();
        url = url.substring(0, 20);
        if ((url.indexOf("&") >= 0)) {
            url = url + "×tamp=" + timestamp;
        } else {
            url = url + "?timestamp=" + timestamp;
        }
        return url;
    }

</script>
</html>
