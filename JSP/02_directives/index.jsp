<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!-- Page directive  -->
<%@page import="java.util.*" %>
<!-- Java utilities imported using directive  -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String currTime = new Date().toString(); %>
<h1>Current time is: </h1>
<%= currTime %>

<h1>Here is an another page using include directive</h1>
 <%@include file="image.jsp" %>
</body>
</html>