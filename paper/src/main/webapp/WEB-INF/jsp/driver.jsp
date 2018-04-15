<html>
<head>
<title>Driver Registration Form</title>
</head>
<body>
	<form method="post">

		<table cellpadding="2" width="20%" bgcolor="99FFFF" align="center" cellspacing="2">

			<tr>
				<td colspan=2>
					<center>
						<font size=4><b>Driver Registration Form</b></font>
					</center>
				</td>
			</tr>

			<tr>
				<td>Name</td>
				<td><input type="text" name="drivername" id="drivername"
					size="30"></td>
			</tr>

			<tr>
				<td>Vehicle No</td>
				<td><input type="text" name="vehicle_no" id="vehicleno"
					size="30"></td>
			</tr>

			<tr>
				<td>Destination City</td>
				<td><select name="dcity">
						<option value="-1" selected>select..</option>
						<option value="New Delhi">NEW DELHI</option>
						<option value="Mumbai">MUMBAI</option>
						<option value="Goa">GOA</option>
						<option value="Patna">PATNA</option>
				</select></td>
			</tr>

			<tr>
				<td>Present City</td>
				<td><select name="pcity">
						<option value="-1" selected>select..</option>
						<option value="Nalanda">NALANDA</option>
						<option value="UP">UP</option>
						<option value="Goa">GOA</option>
						<option value="Patna">PATNA</option>
				</select></td>

			</tr>

			<tr>
				<td>MobileNo</td>
				<td><input type="text" name="mobileno" id="mobileno" size="30"></td>
			</tr>
			<tr>
				<td><input type="reset"></td>
				<td colspan="2"><input type="submit" value="Add" /></td>
			</tr>

		</table>

	</form>
</body>
</html>