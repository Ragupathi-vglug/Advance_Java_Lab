<%@ page import="student.Student" %>

<html>
<head>
    <title>Student Details</title>
    <style>
        h1{
            color: blue;
        }
    </style>
</head>
<body>

<h1>Student Details</h1>

<%

    Student student = new Student();

    student.setName("Ragupathi");
    student.setId(21);

    request.setAttribute("student", student);
%>
<p>Name : ${student.name}</p>
<p>ID : ${student.id}</p>
</body>
</html>