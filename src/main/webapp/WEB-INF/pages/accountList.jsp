<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>人员列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>人员列表 —— 显示所有人员</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="/account/jumpPage?pageName=accountAdd">添加</a>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>姓名</th>
                    <th>部门</th>
                    <th>金额</th>
                    <th>时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="account" items="${accountList}">
                    <tr>
                        <td>${account.id}</td>
                        <td>${account.name}</td>
                        <td>${account.dept}</td>
                        <td>${account.money}</td>
                        <td>
                            <fmt:formatDate value="${account.createDate}" pattern="yyyy-MM-dd HH:mm:ss" />
                        </td>
                        <td>
                            <a href="/account/showUpdateAccount?id=${account.id}">编辑</a> |
                            <a href="/account/deleteAccount?id=${account.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>