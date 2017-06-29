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
<div id="main" style="align:center; " >
		<br/><br/>
		<span style="color:black;font-weight:bold"><s:text name="person.name"/>:</span>
		<span style="color:green"><s:property value="pm.myname"/></span><br/>
		<span style="color:black;font-weight:bold"><s:text name="person.nickname"/>:</span>
		<span style="color:green"><s:property value="pm.nickname"/></span><br/>
		<span style="color:black;font-weight:bold"><s:text name="person.age"/>:</span>
		<span style="color:green"><s:property value="pm.age"/></span><br/>
		<span style="color:black;font-weight:bold"><s:text name="person.sex"/>:</span>
		<span style="color:green"><s:property value="pm.sex"/></span><br/>
		<span style="color:black;font-weight:bold"><s:text name="person.mail"/>:</span>
		<span style="color:green"><s:property value="pm.mail"/></span><br/>
		<span style="color:black;font-weight:bold"><s:text name="person.address"/>:</span>
		<span style="color:green"><s:property value="pm.address"/></span><br/>
		<span style="color:black;font-weight:bold"><s:text name="person.signature"/>:</span>
		<span style="color:green"><s:property value="pm.signature"/></span><br/>
		<span style="color:black;font-weight:bold"><s:text name="person.joindate"/>:</span>
		<span style="color:green"><s:property value="pm.joindate"/></span><br/>
		
</div>
</body>
</html>