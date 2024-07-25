<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ab" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List" %>
<%@ page import="com.web.model.EmpModel" %>
<%@ page import="com.web.repo.EmpRepo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Employee List of Data</h1>
<table>
	<tr>
		<th>EMPNO</th>
		<th>ENAME</th>
		<th>SAL</th>
		<th>DEPTNO</th>
		<th>JOB</th>
	</tr>
	<ab:forEach var="emp" items="${emps}">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.sal}</td>
				<td>${emp.deptno}</td>
				<td>${emp.job}</td>
			</tr>
	</ab:forEach>
</table>

<a href="addemp">Add Employee</a>
</body>
</html>