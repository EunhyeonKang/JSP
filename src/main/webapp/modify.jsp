<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정</title>
<style>
	.group71{
		    width: 100%;
		    height: auto;
		    text-align: center;
		    margin: auto;
		    text-align: center;
		    padding: 80px 0 80px 0;
		}
		
		
		#rec6{
		    float: right;
		    padding: 15px;
		    width: 100%;
		    box-sizing: border-box;
		    height: 50px;
		    text-align: left;
		    background: #FFFFFF;
		    border: 1px solid #CDC9C9;
		    border-radius: 10px;
		}
		.rec6::placeholder{
		    position: absolute;
		    width: 147px;
		    height: 18px;
		
		    font-family: 'Inter';
		    font-style: normal;
		    font-weight: 400;
		    font-size: 15px;
		    line-height: 18px;
		    text-align: center;
		    color: #CDC9C9;
		}
		.rec7{
		    box-sizing: border-box;
		
		    position: absolute;
		    width: 141px;
		    height: 50px;
		    
		    background: #FFFFFF;
		    border: 1px solid #008485;
		    border-radius: 10px;
		
		}
		
		#login{
		    width: 69px;
		    height: 30px;
		
		    font-family: 'Inter';
		    font-style: normal;
		    font-weight: 400;
		    font-size: 25px;
		    line-height: 30px;
		    text-align: center;
		
		    color: #000000;
		}
		.idbox{
		    padding: 10px;
		    box-sizing: border-box;
		    text-align: left;
		    display: flex;
		
		    font-family: 'Inter';
		    font-style: normal;
		    font-weight: 400;
		    font-size: 15px;
		    line-height: 18px;
		    text-align: center;
		
		    color: #000000;
		
		
		}
		
		#modify2{
		    box-sizing: border-box;
		    width: 510px;
		    height: 50px;
		    background: #FFFFFF;
		    border: 1px solid #008485;
		    border-radius: 10px;
		    margin-top: 30px;
		}
		.box2 > button > span{
		    width: 300.21px;
		    height: 18px;
		    font-family: 'Inter';
		    font-style: normal;
		    font-weight: 700;
		    font-size: 15px;
		    line-height: 18px;
		    text-align: center;
		    color: #008485;
		}
		
		.flexModify{
		    display: inline-block;
		    width: 510px;
		}	   		
		.gradio{
		    padding: 15px;
		    width: 10%;
		}	   
</style>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
	%>
	<div class="group71">
        <div class="group31">
			<form action="/ModifyOk" method="post">
				<span id="login">회원정보수정</span>
                <br/>
                <div class="flexModify"> 
                    <span class="idbox">아이디</span>
                    <input type="text" name="id" class="rec6" id="rec6" value="<%=id %>" readonly="readonly"/>                     
                </div>
                 <br/>
                <div class="flexModify"> 
                    <span class="idbox">패스워드</span>
                    <input type="password" name="pw" class="rec6" id="rec6" placeholder="패스워드를 입력해주세요"/>                     
                </div>
                 <br/>
                <div class="flexModify"> 
                    <span class="idbox">이름</span>
                    <input type="text" name="name" class="rec6" id="rec6" value="<%=name%>" readonly="readonly"/>                     
                </div>
                 <br/>
                <div class="flexModify"> 
                    <span class="idbox">핸드폰1</span>
                    <input type="text" name="phone1" class="rec6" id="rec6" placeholder="핸드폰을 입력해주세요"/>                     
                </div>
                 <br/>
                <div class="flexModify">
	                 <span class="idbox">성별</span>
	                남 : <input type="radio" name="gender" value="M" class="gradio" id="gradio">
					여 : <input type="radio" name="gender" value="F" class="gradio" id="gradio"><br/>
	             </div>
	             <br/>
				<button id="modify2">
	                    <span>수정하기</span>
	            </button>
			</form>
		</div>
    </div>
</body>
</html>