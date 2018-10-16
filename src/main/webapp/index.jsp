<%@ page import="java.util.ResourceBundle"%>

<%
	ResourceBundle resource = ResourceBundle.getBundle("lot_fact");
%>

<html>
<head>
<title><%=resource.getString("lot_index")%></title>
</head>
<body>
	<script>
	function validateForm() {
		
		var letterNumber = /^[0-9a-zA-Z.-]+$/;
		var x = document.forms["myForm"]["lotId"].value;
		x = x.trim();
		
		//Comments 
		if (x == "") {
			alert('<%=resource.getString("lotId_empty_Validation")%>');
			return false;
		}else if(!(x.match(letterNumber))){
			alert('<%=resource.getString("lotId_hasSpecialChars")%>');
			return false;
		}
			document.forms["myForm"]["lotId"].value = x.toUpperCase()
			return true;
	}
		function closeMe() {
			window.open('/', '_self', '');
			window.close();
		}
		function onLoadLotIdfocus() {
			document.forms["myForm"]["lotId"].focus();
		}
	</script>
</head>

<body onload="onLoadLotIdfocus()">

	<form name="myForm" action="getid" method="get">
		<label><%=resource.getString("lotId_label_searchField")%></label> <input type="text" value="" name="lotId"
			id="lotId" style="text-transform: uppercase" maxlength="30"
			tabindex="1" /> <br> <br> <input type="submit"
			value='<%=resource.getString("lotId_label_submitButton")%>' onclick="return validateForm()" tabindex="2" /> <input
			type="button" value='<%=resource.getString("lotId_label_closeButton")%>'  onclick="closeMe()" tabindex="3" />
	</form>

</body>
</html>