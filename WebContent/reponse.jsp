<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int op1 = Integer.parseInt(request.getParameter("op1"));
int op2 = Integer.parseInt(request.getParameter("op2"));
String operation = request.getParameter("operation");
%>
<%!
float resultat;
%>
<h2>yes</h2>
<%
if(operation.equals("addition")){
	resultat=op1+op2;
}if(operation.equals("soustraction")){
	resultat=op1-op2;
}if(operation.equals("multiplication")){
	resultat=op1*op2;
}if(operation.equals("division")){
	if(op2==0){
	%>
	<jsp:forward page="error.jsp"></jsp:forward>
	<%
	}else{resultat=op1/op2;}
	}
	%>
<%= resultat  %>
</body>
</html>