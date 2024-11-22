<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>

<br>
<h2>Student Details</h2>
<br>
<br>

<c:if test="${student}">
	<li>ID: ${student.studentId}
	<li>FNAME ${student.firstName}
	<li>LNAME : ${student.lastName}
	<li>AGE : ${student.age}
</c:if>


<br>
<br>


</html>