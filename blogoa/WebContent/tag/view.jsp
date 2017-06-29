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
<h1>查看标签</h1>
<div class="col-md-9">
				<table class="table table-border ">
				   <thead>
				      <tr>
				        <th>标签编号</th>
				        <th>标签名称</th>
				        <th>操作</th>
				      </tr>
				   </thead>
				   <tbody>
				   <c:forEach var="tm" items="${tagList}">
				   	<tr>
				   	  <td>${tm.tno }</td>
				   	  <td>${tm.tname }</td>
				   	  <td>
				   	  <a class="btn btn-default" href="tomodify?tno=${tm.tno}">修改</a> 
				   	  <a class="btn btn-default" href="delete?tno=${tm.tno}" 
				   	  onclick="return(confirm('确定刪除?'))">删除</a> 
				   	  <a class="btn btn-default" href="toviewArticleByTno?tno=${tm.tno}">查看该标签下的文章</a></td>
				   	</tr>
				   	</c:forEach>
				   
				   </tbody>
				</table> 
				<a class="btn btn-default" href="toadd.action">增加</a>              
            </div>	
</div>
</body>
</html>