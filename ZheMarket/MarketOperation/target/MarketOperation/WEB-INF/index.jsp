<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>查看用户</title>
    <link rel="stylesheet" href="../layui/css/layui.css"/>
    <script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="../layui/layui.all.js"></script>
    <script type="text/javascript" src="../layui/lay/modules/form.js"></script>
    <%--   <link rel="stylesheet" href="ztree/css/bootstrapStyle/bootstrapStyle.css"/>
       <link rel="stylesheet" href="selectTree/plugin/css/index.css"/>
       <script type="text/javascript" src="jq/jquery-3.2.1.js"></script>
       <script type="text/javascript" src="/commons/commons.js"></script>
       <script type="text/javascript" src="/commons/ztree/js/jquery.ztree.all.js"></script>
       <script type="text/javascript" src="/commons/dateFormat.js"></script>
       <script type="text/javascript" src="/commons/selectTree/plugin/js/selectTree.js"></script>--%>
</head>
<body>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">柘集市 后台管理</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href=""></a></li>
            <li class="layui-nav-item"><a href="">商品管理</a></li>
            <li class="layui-nav-item"><a href="">后台用户</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">统计</a>
                <dl class="layui-nav-child">
                    <dd><a>交易额统计</a></dd>
                    <dd><a>店铺统计</a></dd>
                    <dd><a>用户统计</a></dd>
                    <dd><a>喜好统计</a></dd>
                </dl>
            </li>


            <li class="layui-nav-item">
                <a href="javascript:;">其它</a>
                <dl class="layui-nav-child">

                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>


        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="/img/aaaa.jpg" class="layui-nav-img">
                    芳心纵火犯
                </a>
                <dl class="layui-nav-child">
                    <dd><a href=""><i class="layui-icon-cellphone"></i>基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退出登陆</a></li>
        </ul>
    </div>


    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test" id="menuNav">
                <!-- 侧边导航: <ul class="layui-nav layui-nav-tree layui-nav-side"> -->
                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:;">店铺管理</a>
                    <dl class="layui-nav-child">
                        <dd><a onclick="Query_shop()">查看店铺</a></dd>
                        <dd><a onclick="to()">注册店铺</a></dd>
                        <dd><a href="">跳转</a></dd>
                    </dl>
                </li>

                
                <li class="layui-nav-item">
                    <a href="javascript:;">商品管理</a>
                    <dl class="layui-nav-child">
                        <dd><a onclick="Query_Type()">类型维护</a></dd>
                        <dd><a onclick="to_Typeadd()">添加类型</a></dd>
                    </dl>
                </li>

                <li class="layui-nav-item">
                    <a href="javascript:;">用户管理</a>
                    <dl class="layui-nav-child">
                        <dd><a onclick="">用户注册</a></dd>
                        <dd><a onclick="Query_Userss()">查看用户</a></dd>
                        <dd><a onclick="">用户权限</a></dd>
                    </dl>
                </li>


                <li class="layui-nav-item">
                    <a href="javascript:;">系统维护</a>
                    <dl class="layui-nav-child">
                        <dd><a href="">用户赋值</a></dd>
                        <dd><a href="">角色管理</a></dd>
                        <dd><a href="">组织结构</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a onclick="feihu()" target="mainBody">流程审批</a></li>
                <li class="layui-nav-item"><a onclick="to()" target="mainBody">店铺注册</a></li>
                <li class="layui-nav-item"><a href="">用户注册</a></li>
            </ul>
        </div>
    </div>
    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;" id="mainBody">
            内容主体区域
        </div>
    </div>
    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © www./@zjs.com - 柘城人自己的商业购物平台
    </div>
</div>

</body>
<script type="text/javascript">
    $(function () {
        //设置全局的AJAX
        //全局的AJAX访问，处理AJAX清求时SESSION超时
        $.ajaxSetup({
            contentType: "application/x-www-form-urlencoded;charset=utf-8",
            complete: function (XMLHttpRequest, textStatus) {
//通过XMLHttpRequest取得响应头，sessionstatus
                var sessionstatus = XMLHttpRequest.getResponseHeader("sessionstatus");
                if (sessionstatus == "6001") {
//这里怎么处理在你，这里跳转的登录页面
                    window.location.replace("sessionTimeout.jsp");
                }
                if (sessionstatus == "6000") {
//这里怎么处理在你，这里跳转的登录页面
                    window.location.replace("noRight.jsp");
                }
            }
        });
        $.post('/queryMenu', function (result) {
            var menuData = result[0].children;
            var menuHtml = "";
            $.each(menuData, function (index, data) {
                if (index == 0) {
                    menuHtml += " <li class=\"layui-nav-item layui-nav-itemed\">";
                } else {
                    menuHtml += " <li class=\"layui-nav-item\">";
                }

                menuHtml += " <a class='' href=\"javascript:;\">" + '<i class="layui-icon ' + data.icon + '"></i>' + data.name + "</a>"
                menuHtml += "<dl class=\"layui-nav-child\">";

                //拼接二级菜单
                var menuTwoData = data.children;
                $.each(menuTwoData, function (index, data) {
                    menuHtml += ' <dd><a href="javascript:;" onclick="toViewJsp(\'' + data.url + '\')"><i class="layui-icon ' + data.icon + '"></i>' + data.name + '</a></dd>';
                })
                menuHtml += "</dl>"
                menuHtml += "</li>";
            })
            $("#menuNav").html(menuHtml);
            layui.element.render();
        })

    })

    layui.use("element", function () {
        var element = layui.element;
        element.render();
    })

    function toViewJsp(url) {
        $("#mainBody").load("/toViewJsp?url=" + url);
    }
</script>


<%--页面跳转主文本域--%>
<script>
    function to() {
        $.ajax({
            url: "/to",
            type: "post",
            dataType: "html",
            success: function (data) {
                $("#mainBody").html(data);
            }
        })
    }
</script>


<script>
    function Query_Userss() {
        $.ajax({
            url: "/Query_Userss",
            type: "post",
            dataType: "html",
            success: function (data) {
                $("#mainBody").html(data);
            }
        })
    }
</script>
<script>
    function Query_shop() {
        $.ajax({
            url: "/Query_shop",
            type: "post",
            dataType: "html",
            success: function (data) {
                $("#mainBody").html(data);
            }
        })
    }
</script>


<script>

    function Query_Type() {
        $.ajax({
            url: "/Query_Type",
            type: "post",
            dataType: "html",
            success: function (data) {
                $("#mainBody").html(data);
            }
        })
    }

</script>


<script>
    function to_Typeadd() {
        $.ajax({
            url: "/to_Typeadd",
            type: "post",
            dataType: "html",
            success: function (data) {
                $("#mainBody").html(data);
            }
        })
    }

</script>

<script>
    function To_leave() {
        $.ajax({
            url: "/To_leave",
            type: "post",
            dataType: "html",
            success: function (data) {
                $("#mainBody").html(data);
            }
        })
    }

</script>

<script>
    function Query_leave() {
        $.ajax({
            url: "/Query_leave",
            type: "post",
            dataType: "html",
            success: function (data) {
                $("#mainBody").html(data);
            }
        })
    }
</script>

<script>
    function feihu() {
        layer.open({
            type: 1,
            skin: 'layui-layer-rim', //加上边框
            area: ['500px', '500px'], //宽高
            title: '审批',
            content: '\n' +
            '<div style="width: 500px;height: 500px">\n' +
            '<center>\n' +
            '    <br>\n' +
            '    <br>  <br>  <br>\n' +
            '    <br>\n' +
            '\n' +
            '\n' +
            '<button class="layui-btn" lay-submit lay-filter="formDemo" onclick="To_leave()">请假审批</button>\n' +
            '    <button class="layui-btn" lay-submit lay-filter="formDemo" onclick="a()">出差审批</button><br><br><br><br><br>\n' +
            '    <button class="layui-btn" lay-submit lay-filter="formDemo" onclick="a()">财务审批</button>\n' +
            '    <button class="layui-btn" lay-submit lay-filter="formDemo" onclick="a()">报销审批</button><br><br><br><br><br>\n' +
            '    <button class="layui-btn" lay-submit lay-filter="formDemo" onclick="a()">人员调动</button>\n' +
            '    <button class="layui-btn" lay-submit lay-filter="formDemo" onclick="Query_leave()">待我审批</button>\n' +
            '</center>\n' +
            '</div>'
        });
    }
</SCRIPT>
</html>
