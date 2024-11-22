<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>${pageTitle}</title>
    <style>
        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #ddd;
        }
        .container {
            width: 80%;
            margin: 0 auto;
        }
        h2 {
            color: #333;
            text-align: center;
        }
    </style>
</head>

<body>

<h1><center>University Management App</center></h1>

<a href="/" > Home </a>    |     
<a href="/students-list" > Students List </a>    |     
<a href="/add-student" > Add a New Student </a> 


    <div class="container">
        <h2>${pageTitle}</h2>
        
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Course</th>
                    <th>Age</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${studentList}" var="student">
                    <tr>
                        <td>${student.studentId}</td>
                        <td>${student.firstName}</td>
                        <td>${student.lastName}</td>
                        <td>${student.age}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
        <c:if test="${empty studentList}">
            <p style="text-align: center;">No students found.</p>
        </c:if>
    </div>
</body>
</html>