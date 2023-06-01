<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Implicit Objects Demo</title>
</head>
<body>
<h3>Implicit Objects Demo</h3>
<%
	String responseCheck = request.getParameter("value");
	String errorCheck = request.getParameter("error");
	if (responseCheck != null) {
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", "response-redirect.jsp?value=" + responseCheck);
	}

	//simulate throw error
	else if (errorCheck != null) 
	{	
			throw new RuntimeException("Exception has been raised");
	}
	
	
%>



<%
	int serverPort = request.getServerPort();
	out.println("The Server is running on port " + String.valueOf(serverPort) + "<br>");
	out.println("Servlet Name is " + config.getServletName() + "<br>");
	out.println("Server Info:" + application.getServerInfo() + "<br>");
	String pageName = page.toString();
	out.println("The name of the page is " + pageName + "<br>");
	pageContext.setAttribute("userid", "Theertha T");
	out.println("userId attribute from pageContext: " + pageContext.getAttribute("userid") + "<br>");
%>
</body>
</html>