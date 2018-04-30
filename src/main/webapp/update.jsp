<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Bgg
  Date: 2018/3/8
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script src="/resources/js/jquery-1.12.4.js"></script>
<sf:form action="/doupdate" method="post" modelAttribute="book">
    <sf:hidden path="bookId"/>
    <table>
        <tr>
            <td>图书编号：<sf:input path="bookCode"></sf:input></td>
            <td>图书名称：<sf:input path="bookName"></sf:input></td>
        </tr>
        <tr>
            <td>图书类型：<sf:select path="bookType" >
                <c:forEach items="${sessionScope.bookTypeList}" var="bookType">
                    <c:if test="${book.bookType==bookType.id}">
                        <sf:option value="${bookType.id}" label="${bookType.typeName}" selected="true"/></c:if>
                    <c:if test="${book.bookType!=bookType.id}">
                        <sf:option value="${bookType.id}" label="${bookType.typeName}" /></c:if>
                </c:forEach>
            </sf:select></td>
            <td>作者：&nbsp;&nbsp;<sf:input path="bookAuthor"></sf:input></td>
        </tr>
        <tr>
            <td>出版社：&nbsp;<sf:input path="publishPress"></sf:input></td>
            <td>出版时间：&nbsp;<sf:input type="date" path="publishDate"></sf:input></td>
            <td>是否借阅：<sf:select path="borrowed">
                <sf:option value="0" label="否"/>
                <sf:option value="1" label="是"/>
            </sf:select></td>
        </tr>
        <tr>
            <td>入库人：&nbsp;<sf:input path="createdBy"></sf:input></td>
            <td>入库时间：<sf:input path="creationTime"></sf:input></td>
        </tr>
    </table>
    <input type="submit" value="提交"/>
    <input type="button" id="break" onclick="javascript:history.back(-1);" value="返回"/>
</sf:form>
</body>
</html>
