<%--
  Created by IntelliJ IDEA.
  User: Bgg
  Date: 2018/3/8
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查看页面</title>
</head>
<body>
<h2>图书借阅系统-后台管理-查看页面</h2>
<script src="/resources/js/jquery-1.12.4.js"></script>
<%=session.getId()%>

<c:out value=""/>
<sf:form action="/update" method="post" modelAttribute="book">
    <table>
        <tr>
            <td>图书编号：<sf:input path="bookCode" readonly="true"></sf:input></td>
            <td>图书名称：<sf:input path="bookName" readonly="true"></sf:input></td>
        </tr>
        <tr><td>
            <c:forEach items="${sessionScope.bookTypeList}" var="booktype">
            <c:if test="${book.bookType==booktype.id}">图书类型：<input value="${booktype.typeName}" readonly/>

            </c:if>
        </c:forEach>
        </td>
            <td>作者：&nbsp;&nbsp;<sf:input path="bookAuthor" readonly="true"></sf:input></td>
        </tr>
        <tr>
            <td>出版社：&nbsp;<sf:input path="publishPress" readonly="true"></sf:input></td>
            <td>出版时间：&nbsp;<sf:input type="date" path="publishDate" readonly="true"></sf:input></td>
            <td>是否借阅：
                <c:choose >
                    <c:when test="${book.borrowed==0}"><input value="否" readonly/></c:when>
                    <c:when test="${book.borrowed==1}"><input value="是" readonly/></c:when>
                </c:choose>
            </td>
        </tr>
        <tr>
            <td>入库人：&nbsp;<sf:input path="createdBy" readonly="true"></sf:input></td>
            <td>入库时间：<sf:input type="date" path="creationTime" readonly="true"></sf:input></td>
        </tr>
    </table>


    <input type="button" onclick="javascript:history.back(-1);" value="返回">
</sf:form>
</body>
</html>
