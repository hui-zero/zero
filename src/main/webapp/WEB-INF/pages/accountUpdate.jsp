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
    <title>修改</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript">
        function updateAccount() {
            var form = document.getElementById("formAction");
            form.action = "/account/updateAccount";
            form.method = "post";
            form.submit();
        }
    </script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改人员</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="" id="formAction">
        <input type="hidden" name="id" value="${account.id}"/>
        姓名：<input type="text" name="name" value="${account.name}"/><br><br>
        部门：<input type="text" name="dept" value="${account.dept}"/><br><br>
        金额：<input type="text" name="money" value="${account.money }"/><br><br>
        <input type="button" value="提交" onclick="updateAccount()"/>
    </form>
</div>