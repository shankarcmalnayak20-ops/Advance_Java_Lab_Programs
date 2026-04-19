 <%@ page language="java" import="javax.servlet.http.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Active Cookies</title>
</head>
<body>
    <h2>Active Cookie List</h2>
    <%
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<p>Name: " + c.getName() + " | Value: " + c.getValue() + "</p>");
            }
        } else {
            out.println("<p>No active cookies found.</p>");
        }
    %>
</body>
</html>
 