<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Hello World</h1>
 <h1>Declaration Tag (will not display)</h1>
 <%! int a= 10;  String name="Declaration Tag example"; %>
 <h1>Expression Tag:  <%=a %> <%=name %></h1>
 
 <h1>Scriptlet Tag</h1>
 <% 
 int b=5; int c=6;
 int  sum = b+c;
 out.println("sum: "+sum);
 %>
</body>
</html>