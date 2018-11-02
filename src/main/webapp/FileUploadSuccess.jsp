
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.teamsankya.lotproject.dto.LotBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <% List list=(List)session.getAttribute("lotbean");%> --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
List list= (List)request.getAttribute("lotbean");

%>
<table>

<tr><td><%=list.get(0)%></td></tr>

</table>

</body>
</html>