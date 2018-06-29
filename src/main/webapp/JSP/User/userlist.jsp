<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/19
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>图书借阅系统-后台管理-用户</h2>
<div>
    <%@include file="/JSP/banner.jsp"%>
</div>

<div>
    <button onclick="window.location.href='/userreg'"/>
</div>
<input name="userno" value="" id="log"/><input type="submit" value="登录" id="login_button"/><input type="submit" value="登出" id="logout_button"/>


</body>
</html>
