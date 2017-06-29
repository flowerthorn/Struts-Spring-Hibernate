<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
ul {
	list-style:none;
	margin:0;
	padding:0;		/*以上三条为无序列表的通用设置*/
}
#accordion {
	width:280px; 		/*设置折叠式菜单内容的宽度为200px*/
}
#accordion li {
border-bottom:1px solid #E6F3FF;
}
#accordion a {
	font-size: 16px;
	color:#000000;
	text-decoration: none;
	display:block;						/* 区块显示 */
	padding:5px 5px 5px 0.5em;
	border-left:12px solid #3399cc;		/* 左边的粗暗红色边框 */
	border-right:1px solid #E6F3FF;
	background-color:#3399cc;
	height:1em; 				/* 此条为解决IE 6的bug*/
}
#accordion a:hover {
	background-color:#ADD8E6;			/* 改变背景色 */
	color:#ffff00; 				/* 改变文字颜色为黄色 */
}
#accordion li ul li {			/* 子菜单项的样式设置 */
	border-top:1px solid #E6F3FF;
}
#accordion li ul li a{			/* 子菜单项的样式设置 */
	padding:3px 3px 3px 0.5em;
	border-left:28px solid #E6F3FF;
	border-right:1px solid #E6F3FF;
	background-color:#E6F3FF;
}
#accordion li ul li a:hover{		/* 改变子菜单项的背景色和前景色 */
	background-color:#3399cc;
	color:#ffff00;}
</style>
<script language="JavaScript" src="../js/jquery-1.2.6.js"></script>
<script type="text/JavaScript">
	$(document).ready(function(){
		//页面载入时隐蔽除第一个元素外所有元素
		$("#accordion > li > a + *:not(:first)").hide();
		//对所有元素的标题绑定点击动作
		$("#accordion > li > a").click(function(){
			$(this).parent().parent().each(function(){
				$("> li > a + *",this).slideUp();  //隐蔽所有元素
			});
			$("+ *",this).slideDown();  //展开当前点击的元素
		});
	});
</script>

</head>

<body width="30%" height="70%">
<ul id="accordion">	
		<li>
			<a><s:text name="welcome"/>:  <s:property value="#session.pm.myname"/></a>
		</li>
		<li>
			<a href="../home/tohome"><s:text name="tohome"/></a>
		</li>
		<li>
			<a><s:text name="daohang.data"/></a>
			<ul>
				<li><a href="../person/toviewdata?pno=${pm.pno}"><s:text name="viewdata"/></a></li>
				<li><a href="../person/toupdatedata?pno=${pm.pno}"><s:text name="updatedata"/></a></li>
				<li><a href="../person/toupdateps?pno=${pm.pno}"><s:text name="updateps"/></a></li>
				<li><a href="../person/toupdatephoto?pno=${pm.pno}"><s:text name="updateimg"/></a></li>
			</ul>
		</li>
		<li>
			<a><s:text name="daohang.data2"/></a>
			<ul>
				<li><a href="../article/toview"><s:text name="viewarticle"/></a></li>
				<li><a href="../article/toadd"><s:text name="addarticle"/></a></li>
			   <%--  <li><a href="article/toaddarticle"><s:text name="recommendedarticle"/></a></li>	 --%>
			</ul>
		</li>
		<li>
			<a><s:text name="daohang.data3"/></a>
			<ul>
				<li><a href="../category/toadd"><s:text name="addcategory"/></a></li>
			    <li><a href="../category/toview"><s:text name="viewcategory"/></a></li>
			    <li><a href="../category/toselect"><s:text name="selectcategory"/></a></li>
			</ul>
		</li>
		<li>
			<a><s:text name="daohang.data4"/></a>
			<ul>
				<li><a href="../tag/toadd"><s:text name="addtags"/></a></li>
				<li><a href="../tag/toview"><s:text name="viewtags"/></a></li>
<%-- 			    <li><a href="tagsarticle"><s:text name="tagsarticle"/></a></li> --%>
			</ul>
		</li>
		<li>
			<a href="../towelcome"  onclick="return(confirm('确定退出?'))"><s:text name="logout"/></a>
		</li>
	</ul>

</head>
<body>
