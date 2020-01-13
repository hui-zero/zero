<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>新增</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- 引入 js -->
    <script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        // function addAccount() {
        //     var form = document.getElementById("formAction");
        //     form.action = "/account/saveAccount";
        //     form.method = "post";
        //     form.submit();
        // }
        $(document).ready(function(){
            $("#sub").click(function () {
                $("#formAction").attr("action", "/account/saveAccount");
                $("#formAction").method = "post";
                $("#formAction").submit();
            });
        });
    </script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增人员</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="" id="formAction">
        姓名：<input type="text" name="name"><br><br>
        部门：<input type="text" name="dept"><br><br>
        金额：<input type="text" name="money"><br><br>
        <%--<input type="button" value="添加" onclick="addAccount()">--%>
        <input type="button" value="添加" id="sub">
    </form>
</div>