<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 찜 목록</title>
<!--  google font -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700&display=swap" rel="stylesheet">
</head>
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
   
   <style>
.header{
  box-sizing: border-box;
  height: 130px;
}
#main{
box-sizing: border-box;
height:1550px;
margin: auto;
width: 60%;
}
#main2{
    box-sizing: border-box;
    width: 100%;
    height:100%;
}
#titleName{
font-size: 30px;
position: relative;
top: 10px;
left: 36px;
font-family: 'Nanum Gothic', sans-serif;
}
#body1{
    box-sizing: border-box;
    border-bottom: 3px solid black;
    height: 70px;
    margin: auto;
}
#contenthead{
    box-sizing: border-box;
    height: 50px;
}
#sellboard1{
box-sizing: border-box;
    height:250px;
    width: 33%;
    float: left;
    padding: 30px;

}
#sellboard2{
box-sizing: border-box;
       height: 230px;
    width: 33%;
    float: left;
    padding: 30px;

}
#sellboard3{
box-sizing: border-box;
    height:250px;
   width: 33%;
    float: left;
padding: 30px;

}
#page{
box-sizing: border-box;
border-bottom: 2px solid black;
border-top: 2px solid black;
margin: auto;
height: 50px;
text-align: center;
}
#img{  
      width: 230px;
    height: 160px;
}
#title{
    float: right;
    font-family: 'Nanum Gothic', sans-serif;
    font-weight: bold;
}
#price{
    float: right;
    font-family: 'Nanum Gothic', sans-serif;
}
.fa-heart {
	top: 20px;
	right: 45px;
	z-index: 2;
	color: red;
	position: absolute;
	font-size: 25px;
}
</style>
</head>
<body>

<%@include file="../common/header.jsp" %>
  <div class="header"></div>
    <div id=main>
        <div id="body1">
          <span id="titleName">나의 찜 목록</span>
        </div>    
        <div id="contenthead"></div>                                                   
    <div id="main2">
    
    <!-- 테스트용 반복문 -->
    <%for(int i = 0; i<= 5; i++) { %>
        <div id="sellboard1" style="position: relative;">
        	<div href="#" class="like-button" title="Like Button">
    			<i class="fa fa-heart fa-1x">♥</i>
  			</div>
            <img src="resources/image/peng.jpg" id="img">
            
            <br><br>
            <div id="title">재능판매글 제목</div>
            <br>
            <div id="price">300.000원</div>
		</div>                                             
        <div id="sellboard2" style="position: relative;">
        	<div href="#" class="like-button" title="Like Button">
    			<i class="fa fa-heart fa-1x">♥</i>
  			</div>
            <img src="resources/image/peng.jpg" id="img">
            <br><br>
            <div id="title">재능판매글 제목</div>
            <br>
            <div id="price">300.000원</div>
		</div>
		<div id="main2">                                                  
        <div id="sellboard3" style="position: relative;">
        	<div href="#" class="like-button" title="Like Button">
    			<i class="fa fa-heart fa-1x">♥</i>
  			</div>
            <img src="resources/image/peng.jpg" id="img">
            <br><br>
            <div id="title">재능판매글 제목</div>
            <br>
            <div id="price">300.000원</div>
		</div>
<%} %>
       </div> 
			


        </div>
        
   
	   <div id="page">페이징 처리 공간</div>
	   <br><br><br>
	  
	  


</div>

<%@ include file="../common/footer.jsp"%>


</body>
</html>