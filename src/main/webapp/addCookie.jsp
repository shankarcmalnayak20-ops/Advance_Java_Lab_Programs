 <%@ page language="java" import="javax.servlet.http.*,java.net.URLEncoder" %>
<%
    String name = request.getParameter("name");
    String domain = request.getParameter("domain");
    int maxAge = Integer.parseInt(request.getParameter("maxAge"));

    // Encode values to avoid invalid characters
    String safeName = URLEncoder.encode(name, "UTF-8");
    String safeDomain = URLEncoder.encode(domain, "UTF-8");

    Cookie nameCookie = new Cookie("Name", safeName);
    Cookie domainCookie = new Cookie("Domain", safeDomain);

    nameCookie.setMaxAge(maxAge);
    domainCookie.setMaxAge(maxAge);

    response.addCookie(nameCookie);
    response.addCookie(domainCookie);
%>
<!DOCTYPE html>
<html>
<head>
    <title>Cookie Added</title>
</head>
<body>
    <h2>Cookie Information</h2>
    <p>Cookie Name: <%= name %></p>
    <p>Cookie Domain: <%= domain %></p>
    <p>Max Age: <%= maxAge %> seconds</p>

    <p><a href="showCookies.jsp">Go to the active cookie list</a></p>
</body>
</html>
 