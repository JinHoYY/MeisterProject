<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String errorMsg = (String) request.getAttribute("errorMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- <h1 style="color:red; text-align:center;"><%= errorMsg %></h1> -->
	
	<script>
		alert("에러 났어유 ^_^ ㅋ");
		location.href = 'loginForm.me';
	</script>


</body>
</html>