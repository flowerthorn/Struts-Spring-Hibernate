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
<h1>~新增博客文章~</h1>
<s:form action="add">
		<s:textfield name="am.title" label="文章标题" cssStyle="background:#99ffcc;width:300px;height:30px;font: 20px Verdana, Arial, Helvetica, sans-serif;"/>
		<s:textfield name="am.date" label="日期" cssStyle="background:#99ff99;width:200px;height:30px;font: 20px Verdana, Arial, Helvetica, sans-serif;" />
		<s:select name="am.category.cno" label="选择类别 " list="categoryList" listKey="cno" listValue="cname">
		</s:select>
		<s:checkboxlist name="tags" list="tagList" listKey="tno" listValue="tname"></s:checkboxlist>
		<s:textarea name="am.content" rows="100" cols="100" wrap="true" label="内容"
		cssStyle="background:#669999;width:800px;height:500px;font: 30px Verdana, Arial, Helvetica, sans-serif;"
		 ></s:textarea>
		<s:submit value="添加"/>
</s:form>		
</div>
</body>
</html>