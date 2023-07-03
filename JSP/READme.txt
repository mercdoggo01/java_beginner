JSP

Java Server Pages (JSP) is a server-side programming technology that enables the 
creation of dynamic, platform-independent method for building Web-based applications. 
JSP have access to the entire family of Java APIs, including the JDBC API to 
access enterprise databases.

JavaServer Pages are built on top of the Java Servlets API, so like Servlets, 
JSP also has access to all the powerful Enterprise Java APIs, including JDBC, 
JNDI, EJB, JAXP, etc.


JSP Scripting elements

The Scripting elements provides the ability to insert java code inside the jsp. There are
three types of scripting elements

1) Decalaration Tag  

<%! int a=20, String name="xyz" public void show(){} %>

2) Expression Tag       

<%= a%> <%= name%>

3) Scriptlet Tag      

<% req.getParameter(); %>  