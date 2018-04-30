<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Bgg
  Date: 2018/3/8
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>图书借阅系统-后台管理-新增页面</h2>
<script src="/resources/js/jquery-1.12.4.js"></script>
<script>
    $(function () {
        var now = new Date();
//格式化日，如果小于9，前面补0
        var day = ("0" + now.getDate()).slice(-2);
//格式化月，如果小于9，前面补0
        var month = ("0" + (now.getMonth() + 1)).slice(-2);
//拼装完整日期格式
        var today = now.getFullYear()+"-"+(month)+"-"+(day) ;
//完成赋值
        $("#time").val(today)
    })
    
</script>
<%=session.getId()%>
<sf:form action="/add" method="post" modelAttribute="bookInfo">
    <table>
        <tr>
            <td>图书编号：<sf:input path="bookCode"></sf:input><sf:errors path="bookCode"/></td>
            <td>图书名称：<sf:input path="bookName"></sf:input><sf:errors path="bookName"/></td>
        </tr>
        <tr>
            <td>图书类型：
                <sf:select path="bookType" >
                    <c:forEach items="${sessionScope.bookTypeList}" var="bookType">
                        <sf:option value="${bookType.id}" label="${bookType.typeName}"/>
                    </c:forEach>
                </sf:select></td>
            <td>作者：&nbsp;&nbsp;<sf:input path="bookAuthor"></sf:input><sf:errors path="bookAuthor"/></td>
        </tr>
        <tr>
            <td>出版社：&nbsp;<sf:input path="publishPress"></sf:input><sf:errors path="publishPress"/></td>
            <td>出版时间：&nbsp;<sf:input type="date" path="publishDate"></sf:input></td>
            <td>是否借阅：<sf:select path="borrowed">
                <sf:option value="0" label="否"/>
                <sf:option value="1" label="是"/>
            </sf:select></td>
        </tr>
        <tr>
            <td>入库人：&nbsp;<sf:input path="createdBy"></sf:input><sf:errors path="createdBy"/></td>
            <td>入库时间：<sf:input type="date" path="creationTime" id="time"></sf:input><sf:errors path="creationTime"/></td>
        </tr>
    </table>
    <input type="submit" value="提交"/>
    <input type="reset" value="重置"/>
    <input type="button" onclick="javascript:history.back(-1);" value="返回"/>
</sf:form>
</body>
</html>
