<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="welcome.title"></s:text></title>
<link rel="stylesheet" type="text/css" href="css/welcome.css"/>
<script src="js/jquery-1.7.1.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript" language="javascript">
function showBox(){
	var show=document.getElementById("login_box");
	var bg_filter=document.getElementById("bg_filter");
	show.style.display="block";
	bg_filter.style.display="block";	
}
function deleteLogin(){
	var del=document.getElementById("login_box");
	bg_filter.style.display="none";
	del.style.display="none";
	del2.style.display="none";
}
</script>
</head>
<body>
	<!-- <audio autoplay="autoplay" src="video/111.mp3"></audio> -->
	<div class="nav">
		<ul>
		
		<li><a href="javascript:void(0)" onClick="showBox()"><s:text name="welcome.login"></s:text></a></li>
		</ul>
	</div>
	<div class="event" id="login_box">
		<div class="login">
			<div class="title">
				<span class="t_txt"><s:text name="welcome.login2"></s:text></span>			
			</div>
		<s:actionerror cssStyle="color:red"/>
		<form action="tologin" method="post">
		<s:textfield name="pno" class="form-control"  required="true"/>
		<s:password name="ps" class="form-control" required="true"/> 
		<!-- <input type="text" name="pno" class="form-control" placeholder="用户名" required autofocus />
		<input type="password" name="ps" class="form-control" placeholder="密码" required /> -->
		<s:submit key="welcome.btn"/> 

		</form>	
		</div>
	</div>
	<div class="bg_color" onClick="deleteLogin()" id="bg_filter" style="display: none;"></div>
</body>
</html>