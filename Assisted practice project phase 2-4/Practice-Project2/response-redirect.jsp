<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%
	String office = request.getParameter("value");

	if (office != null)
		out.println("value of Office obtained :" + office + " <br>");
	else
		out.println("No value of Office found <br>");
%>