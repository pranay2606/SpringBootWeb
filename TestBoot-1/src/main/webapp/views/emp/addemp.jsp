<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Fill the Details Below...</h1>
<form action="handleForm" method="post">
	<table>
		<tr>
			<th>Enter Empno</th>
			<th>Enter Name</th>
			<th>Enter Salary</th>
			<th>Enter Deptno</th>
			<th>Enter Job</th>
		</tr>
		<tr>
			<td><input type="text" name="empno"></td>
			<td><input type="text" name="ename"></td>
			<td><input type="text" name="sal"></td>
			<td><input type="text" name="deptno"></td>
			<td><input type="text" name="job"></td>
		</tr>
	</table>
	<input type="submit" value="Submit">
</form>
<br><br><br>
<a href="emp/Home">Home</a>
<a href="emp/viewemp" >Click Here to View the Employee Data</a>
</body>
</html>