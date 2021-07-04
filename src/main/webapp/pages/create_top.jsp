<%--
  Created by IntelliJ IDEA.
  User: ilyat
  Date: 26.04.2021
  Time: 00:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="${locale}" scope="session"/>
<fmt:setBundle basename="pagecontent"/>
<html>
<jsp:include page="header.jsp"/>
<head>
    <title><fmt:message key="label.create_top"/></title>
</head>
<body>
<br/>
<form name="createTopForm" action="upload" method="post" enctype="multipart/form-data">
    <input type="hidden" name="command" value="create_top"/>
    <input type="text" name="title" value="" placeholder="<fmt:message key="label.title"/>" maxlength="45" required
           pattern="^[a-zA-Zа-яА-Я-\s\d]{1,45}$">
    <input type="text" name="description" value="" placeholder="<fmt:message key="label.description"/>" maxlength="200"
           pattern="^[a-zA-Zа-яА-Я-\s\d]{1,200}$">
    <label for="file"><fmt:message key="label.choose_file_to_upload"/></label>
    <input type="file" value="<fmt:message key="label.upload"/>" id="file" name="imageName">
    <br/>
    <input type="submit" name="submit" value="<fmt:message key="label.create"/>">
</form>
</body>
</html>
