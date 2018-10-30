<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Lot Id:${bean}</h1>
<p><h1>lot status:</h1>${msg1}</p>
    <div align="right">
    <input type="button" value="Close" onclick="closeMe()"/>  <button onclick="goBack()">Back</button>
</div>



    <table>

    <tr>
        <td>
            <p>. A valid lot id should have the following three attributes:should be a PO lot
                with sale order tagged in parmis/siview/insite and is available in WIP
               . If the lot id above 3 attributes and still not available,please contact IT HelpDesk team.
               . Any change made to the lot attributes would take ~6 to 8 hrs to refresh into PRF System 
            </p>


        </td>
    </tr>
</table>



<script>
    function closeMe()
{
    window.open('/', '_self', '');
    window.close();
}
function goBack(){
    window.history.back();
}

</script>
</body>
</html>