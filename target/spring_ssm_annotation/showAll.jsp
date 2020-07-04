<%--
  Created by IntelliJ IDEA.
  User: tz_wl
  Date: 2020/7/3
  Time: 0:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"  isELIgnored="false" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${requestScope.users}" var="user">
        id: ${user.id}
        name:${user.name}
        <br>
    </c:forEach>

</body>
</html>
