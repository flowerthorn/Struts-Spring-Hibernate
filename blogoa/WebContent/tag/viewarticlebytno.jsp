<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib uri="/struts-tags" prefix="s" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="home.houtai"/></title>
<link href="../css/admin.css" rel="stylesheet" type="text/css">
 <link href="../css/bootstrap.min.css" rel="stylesheet">
<!--  <link href="../css/bootstrap.css" rel="stylesheet">  -->
<script language="javascript">
var d=new Date();
var monthname=new Array("January","February","March","April","May","June","July","August","September","October","November","December");
var TODAY = monthname[d.getMonth()] + " " + d.getDate() + ", " + d.getFullYear();
</script>
</head>
<body bgcolor="#C0DFFD">
<div id="top"><%@ include file="../include/top.jsp" %></div>
<div id="left"><%@ include file="../include/left2.jsp" %></div>
<div id="main"  >
<h1>标签:</h1><h2><s:property value="cm.cname"/></h2>
<h1>属于该标签的文章列表</h1>
 		<table border="2" >
 		<tr>
 		<td><h3>文 章 编 号</h3></td>
 		<td><h3>文 章 标 题</h3></td>
 			</tr>
			<s:iterator value="articleList">
			<tr>
			<td><h3><s:property value="ano"/></h3></td>
			<td><h3><s:property value="title"/></h3></td>
			</tr>
			</s:iterator> 
 </table>
  <h3><s:a href="toview">返回</s:a></h3>

</div>
</body>
</html>