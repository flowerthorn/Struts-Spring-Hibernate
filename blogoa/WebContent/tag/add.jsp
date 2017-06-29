<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="home.houtai"/></title>
<link href="../css/admin.css" rel="stylesheet" type="text/css">
<script language="javascript">
var d=new Date();
var monthname=new Array("January","February","March","April","May","June","July","August","September","October","November","December");
var TODAY = monthname[d.getMonth()] + " " + d.getDate() + ", " + d.getFullYear();
</script>
</head>
<body bgcolor="#C0DFFD">
<div id="top"><%@ include file="../include/top.jsp" %></div>
<div id="left"><%@ include file="../include/left.jsp" %></div>
<div id="main"  >
<h1>增加标签</h1>
<s:form action="add">
	<s:textfield name="tm.tname" label="请输入新增标签名称" required="true"></s:textfield>
	<s:submit value="增加"/>
</s:form>		
</div>
</body>
</html>