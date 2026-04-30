<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="Testing.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile JSP</title>
</head>
<body>
<% User user = (User) session.getAttribute("session_user");


if (user == null) {
    response.sendRedirect("login.html");
    return;
}
%>
<h2>Welcome</h2>

<h3>Name:<%= user.getName() %></h3>
<h3>Email<%= user.getEmail() %></h3>
<h3>City:<%= user.getCity() %></h3>
<br>
<a href="login.html">Logout</a>


</body>
</html>