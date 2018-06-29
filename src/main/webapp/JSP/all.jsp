<%--
  Created by IntelliJ IDEA.
  User: Bgg
  Date: 2018/3/8
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
 table,tr,td,th{
     border: 1px black solid;
 }
</style>
<body>
<script src="../resources/js/jquery-1.12.4.js">
    var BookTypeList="${sessionScope.bookTypeList}";
</script>
<script src="../resources/js/search.js"></script>

<h2>图书借阅系统-后台管理</h2>
<%=session.getId()%><br>
<div>
    <%@include file="banner.jsp"%>
</div>

图书名称:<input name="name" value="" id="search_name"><input type="submit" value="查询" id="search_button"><br>

<a href="/add"><input type="button" value="新增"></a>

<form action="all" method="post">
    <table id="table_list">
        <tr>
            <th>图书编号</th>
            <th>图书分类</th>
            <th>图书名称</th>
            <th>作者</th>
            <th>出版社</th>
            <th>入库时间</th>
            <th>是否借出</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${bookinfo}" var="book">
            <tr>
                <td>${book.bookCode}</td>
                <td><c:forEach items="${sessionScope.bookTypeList}" var="booktype">
                    <c:if test="${book.bookType==booktype.id}">${booktype.typeName}
                    </c:if>
                </c:forEach></td>
                <td>${book.bookName}</td>
                <td>${book.bookAuthor}</td>
                <td>${book.publishPress}</td>
                <td>${book.creationTime}</td>
                <td><c:choose >
                    <c:when test="${book.borrowed==0}">否</c:when>
                    <c:when test="${book.borrowed==1}">是</c:when>
                    </c:choose></td>
                <td><a href="check/${book.bookId}">查看</a>&nbsp;&nbsp;
                    <a href="update/${book.bookId}">修改</a>&nbsp;&nbsp;
                    <a href="javascript:" onclick="if(confirm('确实要删除吗?'))location.href='/del/${book.bookId}'">删除</a>

                </td>
            </tr>
        </c:forEach>
    </table>

</form>

</body>
</html>
