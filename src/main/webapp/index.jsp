<html>
<head>

<title>lot project</title>
</head>
<body>
	<form name="myForm" action="getid" onsubmit="validateID()" method="get">
		<label>Enter Lot Id*:</label> <input type="text" value="" name="id"
			style="text-transform: uppercase" maxlength="30"><br> <br>
		<input type="submit" value="Submit"> <input type="button"
			value="Close" onclick="closeMe()" />
	</form>

	<script>
		function validateID() {

			var x = document.forms["myForm"]["id"].value;
			if (x == null || x == "") {
				alert("Pls enter lot id");
				return false;
			} else if (x.indexOf(' ') > -1) {
				alert("pls give proper lot id....")
				return false;
			}
			return true;
		}
		function closeMe() {
			window.open('/', '_self', '');
			window.close();
		}
	</script>
</body>
</html>