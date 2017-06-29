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
<h1>查看类别</h1>
<div class="col-md-9">
				<table class="table table-border ">
				   <thead>
				      <tr>
				        <th>类别编号</th>
				        <th>类别名称</th>
				        <th>操作</th>
				      </tr>
				   </thead>
				   <tbody>
				   <c:forEach var="cm" items="${categoryList}">
				   	<tr>
				   	  <td>${cm.cno }</td>
				   	  <td>${cm.cname }</td>
				   	  <td>
				   	  <a class="btn btn-default" href="tomodify?cno=${cm.cno}">修改</a> 
				   	  <a class="btn btn-default" href="delete?cno=${cm.cno}" 
				   	  onclick="return(confirm('确定刪除?'))">删除</a> 
				   	  <a class="btn btn-default" href="toviewArticleByCno?cno=${cm.cno}">查看该类别下的文章</a></td>
				   	</tr>
				   	</c:forEach>
				   
				   </tbody>
				   
				
				</table> 
				<a class="btn btn-default" href="toadd.action">增加</a>              
            </div>	
</div>
</body>
</html>