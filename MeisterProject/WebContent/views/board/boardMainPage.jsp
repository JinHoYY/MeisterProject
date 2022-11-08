<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
          .body{
            box-sizing: border-box;
            height: 100%;
            margin: auto;
            width: 800px;
        }
        #body-1{
            box-sizing: border-box;
            height: 55px;
        }
        #body2-1{
            box-sizing: border-box; 
            margin: auto; 
            height: 1400px;
            width: 800px;
            
        }
        #body2-2{
            box-sizing: border-box;
            margin: auto; 
            height: 10%;
            padding: 5%;
           
        }
        #body2-3{
            box-sizing: border-box;
            margin: auto;
            height: 19%;
           
        }
        #body2-3-1{
            box-sizing: border-box;
            height: 100%;
            width: 33%;
            float: left;
        }

        #body2-3-2{
        box-sizing: border-box;
        height: 100%;
        width: 33%;
        margin:auto;
        float: left;
        }
        #body2-3-3{
        box-sizing: border-box; 
        height: 100%;
        width: 34%;
        
        float: left;
        }
        #hot1{
            box-sizing: border-box;
            background-color: lightgray;
            height: 75%;
            width: 80%;
            margin: auto;
            padding-top : 110px;
            padding-left : 140px;
            border-style: groove;
            border-radius: 25px;
        }
        #body2-4{
            box-sizing: border-box;
            height: 19%;
            width: 100%;
            padding: 20px;
        }
        #body2-4-1{
          position: relative;
          float:right;
          top:-35%;
          right: 5%;
        }
     
        #date{
            border: 1px solid black;
            color: grey;
            font-size: 14px;
            position: relative;
            top:52%;
            left: 73%;
        }
        #body2-5{
            box-sizing: border-box;
            height: 19%;
            padding: 20px
        }
        #body2-6{
            box-sizing: border-box;
            height: 19%;
            padding: 20px
        }
        .spantext{
            box-sizing: border-box;
        }
        #mainid{
            text-align: center;
            font-weight:bold;
            font-size: 50px;
            padding:120px
        }
        #ge{
            box-sizing: border-box;
            border: 1px solid black;
            font-size: 27px;
            background-color: orange;
            padding:8px 16px;
            float: left;
        }
        #ge:hover{
            background-color: orange;
        }
        #gung{
            border: 1px solid black;
            box-sizing: border-box;
            font-size:27px;
            padding:8px 12px;
            float: left;
        }
        #gung:hover{
            background-color: orange;
        }
        #textmade{
            float: right;
            margin: auto;
            padding: 15px;
        }
     
        #img1{
          width: 10rem;
          height: 10rem;
            vertical-align: middle;
        }
        #icon1,#ask{
            
            float: left;
        }
        #hottitle{
            margin: auto;
            text-align: center;
            padding-top: 30px;
        }
        #text{
            margin-top: 35px;
        }
        #titlefooter{
            position: relative;
            top:55%;

        }
    
</head>
<body>
<%@ include file="../common/header.jsp" %>

<body>
    <header>
        <div class="inner">
    
            <a href="#" class="logo">
                <img src="resources//image/KakaoTalk_20221101_005911025.png" alt="soomgo" />
            </a>
        
            <div class="sub-menu">
                <ul class="menu">
                    <li>
                        <a href="#">전문가 등록</a>
                    </li>
                    <li>
                        <a href="#">로그인</a>
                    </li>
                    <li>
                        <a href="#">회원가입</a>
                    </li>
                    <li>
                        <a href="#">Find a Store</a>
                    </li>
                </ul>
                <div class="search">
                    <input type="text" placeholder="원하는 영상을 검색해 보세요.">
                </div>
            </div>
            
            
            <ul class="main-menu">
                    <li class="item">
                        <a href="#">
                            <span>고수매칭</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">고수찾기</a>
                    </li>
                    <li>
                        <a href="#">마켓</a>
                    </li>
                    <li>
                        <a href="#">커뮤니티</a>
                    </li>
                </ul>
            </div>
        </div>
    </header>
    <div class="body" >
        <h1 id="mainid">커뮤니티</h1>
        <div id="body-1" >
            <span id="ge">게시판</span>
            <span id="gung">궁금해요</span>
        </div>
    </div>
            <div class="body-2">
                
            </div>
        <div class="body2">
            <div id="body2-1"> 

                <div id="body2-2" align="right"><a href="<%=contextPath %>/insert.bo" class="btn btn-secondary">글작성</a></div><hr>
                <div id="body2-3">
                    <div id="body2-3-1"><br>
                        <span class="hotfont">어제 핫한글</span><br>
                            <div id="hot1">
                                <a id="hottitle"></a>
                            </div>
                    </div>
                    <div id="body2-3-2"><br><br>
                        <div id="hot1">
                          
                        </div>
                    </div>
                    
                    <div id="body2-3-3" ><br><br>
                        <div id="hot1"></div>
                    </div>
                </div>
                <div id="body2-4"><hr>
                  
                    <a class="font">글제목</a>
                    </li><p id="text">글내용글내용글내용</p>
                   <span id="titlefooter">댓글 6 조회수6</span>
                   <span id="date">2시간전</span>
                </ul>
                <div id="body2-4-1">
                        <img src="resources/image/peng.jpg" id="img1">
                        
                    </div>
                </div>
                <div id="body2-5"><hr>
                    <a class="font">글제목</a>
                </div>
                <div id="body2-6"><hr>
                    <a class="font">글제목</a>
                </div>
                <hr>
            </div>
           
            
        </div>
        
  
        
   
  
   














	<%@ include file="../common/footer.jsp" %>
</body>
</html>