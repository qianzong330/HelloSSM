<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页面</title>
<script src="http://malsup.github.io/jquery.form.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery-1.8.3.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/style_grey.css" />
<style>
input[type=text] {
	width: 80%;
	height: 25px;
	font-size: 12pt;
	font-weight: bold;
	margin-left: 45px;
	padding: 3px;
	border-width: 0;
}

input[type=password] {
	width: 80%;
	height: 25px;
	font-size: 12pt;
	font-weight: bold;
	margin-left: 45px;
	padding: 3px;
	border-width: 0;
}

#loginform\:codeInput {
	margin-left: 1px;
	margin-top: 1px;
}

#loginform\:vCode {
	margin: 0px 0 0 60px;
	height: 34px;
}
</style>
<script type="text/javascript">
	if(window.self != window.top){
		window.top.location = window.location;
	}
</script>
<script type="text/javascript">
	function check(){
		//获取用户名文本值
		var username = $("#username").val();
		var password = $("#password").val();
		//如果为空返回false
		if(username == ""){
			 //假如name后面有lable标签，则清空后面的内容，即清除图中红色字体提示的“用户名不能为空”  
                $("#msg_value").empty();  
            //接着在类选择器.name后面添加一个lable标签  
                $("#msg_div").html("<label id='msg_value'><font color='red'>用户名不能为空</font></label>"); 
                return false 
		}else {
			$("#msg_value").empty(); 
			if(password == ""){
			 //假如name后面有lable标签，则清空后面的内容，即清除图中红色字体提示的“用户名不能为空”  
                $("#msg_value").empty();  
            //接着在类选择器.name后面添加一个lable标签  
                $("#msg_div").html("<label id='msg_value'><font color='red'>密码不能为空</font></label>");  
                return false
		}else{
			return true
		}
		}
		
	}

	

</script>
</head>
<body>
	<div
		style="width: 900px; height: 50px; position: absolute; text-align: left; left: 50%; top: 50%; margin-left: -450px;; margin-top: -280px;">
		<!-- 注释掉了logo -->
		<%-- <img src="${pageContext.request.contextPath }/images/logo.png" style="border-width: 0; margin-left: 0;" /> --%>
		<!-- 省略 -->
		 <span style="float: right; margin-top: 35px; color: #488ED5;">努力致力于便捷、安全、稳定等一切的客户体验，我们在努力。。。</span> 
	</div>
	<div class="main-inner" id="mainCnt"
		style="width: 900px; height: 440px; overflow: hidden; position: absolute; left: 50%; top: 50%; margin-left: -450px; margin-top: -220px; background-image: url('${pageContext.request.contextPath }/images/bg_login.jpg')">
		<div id="loginBlock" class="login"
			style="margin-top: 80px; height: 255px;">
			<div class="loginFunc">
				<div id="lbNormal" class="loginFuncMobile">用户登录</div>
			</div>
			<div class="loginForm">
				<form id="loginform" name="loginform" method="post" class="niceform"
					action="checkLogin.action" onsubmit="return check()">
					<!-- 账号输入 -->
					<div id="idInputLine" class="loginFormIpt showPlaceholder"
						style="margin-top: 5px;">
						<!-- <input id="loginform:idInput" type="text" name="username" -->
						<input id="username" type="text" name="username"
							class="loginFormTdIpt" maxlength="50" />
						<label for="idInput"  class="placeholder" id="idPlaceholder">帐号：</label>
						
					</div>
					<!-- 密码输入 -->
					<div class="forgetPwdLine"></div>
					<div id="pwdInputLine" class="loginFormIpt showPlaceholder">
						<input id="password" class="loginFormTdIpt" type="password"
							name="password" value="" />
						<label for="pwdInput" class="placeholder" id="pwdPlaceholder">密码：</label>
					</div>
					<div class="loginFormIpt loginFormIptWiotTh"
						style="margin-top:58px;">
						<div id="codeInputLine" class="loginFormIpt showPlaceholder"
							style="margin-left:0px;margin-top:-40px;width:50px;">
							<input id="loginform:codeInput" class="loginFormTdIpt" type="text"
								name="checkcode" title="请输入验证码" />
							<img id="loginform:vCode" src="${pageContext.request.contextPath }/validatecode.jsp"
								onclick="javascript:document.getElementById('loginform:vCode').src='${pageContext.request.contextPath }/validatecode.jsp?'+Math.random();" />
						</div>
						<!-- <a href="#" onclick="$('#loginform').submit()" id="loginform:j_id19" name="loginform:j_id19"> -->
						<a href="#" onclick="$('#loginform').submit()" type="submit"  id="loginform:j_id19" name="loginform:j_id19">
						
						<span type="submit"
							id="loginform:loginBtn" class="btn btn-login"
							style="margin-top:-36px;">登录</span>
							
						</a>
					</div>
					<div id="msg_div">
						<!-- <font  color="red">
							
						</font> -->
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- 清理了底部 -->
	<!-- <div
		style="width: 900px; height: 50px; position: absolute; text-align: left; left: 50%; top: 50%; margin-left: -450px;; margin-top: 220px;">
		<span style="color: #488ED5;">Powered By www.itcast.cn</span><span
			style="color: #488ED5;margin-left:10px;">推荐浏览器（右键链接-目标另存为）：<a
			href="http://download.firefox.com.cn/releases/full/23.0/zh-CN/Firefox-full-latest.exe">Firefox</a>
		</span><span style="float: right; color: #488ED5;">中科宇图后台管理系统</span>
	</div>113 -->
</body>
</html>