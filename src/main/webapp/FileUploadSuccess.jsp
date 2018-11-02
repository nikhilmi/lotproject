
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.teamsankya.lotproject.dto.LotBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<LotBean> beans=(List<LotBean>)request.getAttribute("lotbean");%>
<table>
<tr>
<th>LotId:</th>
<th>CustomerId:</th>
<th>Completion class:</th>
<th>Sales Order No:</th>
<th>Active Flag:</th>
</tr>
<%for(LotBean bean : beans){ %>
<tr>
<td><%=bean.getLotId() %></td>
<td><%=bean.getCustomerId() %></td>
<td><%=bean.getCompletionClass() %></td>
<td><%=bean.getSalesOrderNumber() %></td>
<td><%=bean.getActiveFlag()%></td>
</tr>
<%} %>
</table>
</body>
</html>