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
<h1>根据类别编号查询</h1>
<s:form action="selectbycno">
	<s:textfield name="cm.cno" label="请输入类别编号" required="true"></s:textfield>
	<table border="2" >
 		<tr>
 		<td><h3>类 别 编 号</h3></td>
 		<td><h3>类 别 名 称</h3></td>
 		<td><h3>进 行 操 作</h3></td>
 		</tr>
		<tr>
		<td><h3><s:property value="cm.cno"/></h3></td>
		<td><h3><s:property value="cm.cname"/></h3></td>
		<td>
	   	  <a  href="tomodify?cno=${cm.cno}">修改</a> 
	   	  <a  href="delete?cno=${cm.cno}" 
	   	  onclick="return(confirm('确定刪除?'))">删除</a> 
	   	  <a  href="toviewArticleByCno?cno=${cm.cno}">查看该类别下的文章</a>
	   	 </td>
		</tr>
		<s:submit value="查找"/>
 </table>
</s:form>	

</div>
</body>
</html>