<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>New Student Form</h1>
	<form method="POST" action=".">
		<table>
			<thead>
				<tr>
					<th colspan="2">New Student Form</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Student Name</td>
					<td>
						<input type = "text" name = "studentName" />
					</td>
				</tr>
				<tr>
					<td>Fee Paid</td>
					<td>
						<input type = "text" name = "feePaid" />
					</td>
				</tr>
				<tr>
					<td colspan="2">Courses</td>
				</tr>
				<tr>
					<td>Course Id<td>
					<td>
						<input type = "text" name = "courseId" />
					</td>
				</tr>
				<tr>
					<td colspan="2">Student Profile</td>
				</tr>
				<tr>
					<td>Phone Number</td>
					<td>
						<input type = "text" name="phoneNumber" /> 
					</td>
				</tr>
				<tr>
					<td>Gender</td>
					<td>
						<input type = "radio" name = "gender" value="Male"  /> Male
						<input type = "radio" name = "gender" value="Female"  /> Female
					</td>
				</tr>
				<tr>
					<td>Date Of Birth</td>
					<td>
						<input type = "text" name = "dateOfBirth" placeholder="MM/DD/YYYY"/>
					</td>
				</tr>
				<tr>
					<td>Address1</td>
					<td>
						<input type = "text" name="address1"/> 
					</td>
				</tr>
				<tr>
					<td>Address2</td>
					<td>
						<input type = "text" name="address2"/> 
					</td>
				</tr>
				<tr>
					<td>City</td>
					<td>
						<input type = "text" name = "city" />
					</td>
				</tr>
				<tr>
					<td>State</td>
					<td>
						<input type = "text" name = "state" />
					</td>
				</tr>
				<tr>
					<td>Zip Code</td>
					<td>
						<input type = "text" name = "zipCode" />
					</td>
				</tr>
				<tr>
					<td>
						<input type = "submit" value = "Save" />
					</td>
					<td>
						<input type = "reset" value = "Clear" />
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>

