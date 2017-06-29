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
<h1><s:text name="updatedata"></s:text></h1>
<s:form action="updatedata">
<%-- 		<s:text name="person.pno"/>:<s:property value="pm.pno"/> --%>
		<s:textfield name="pm.pno" key="person.pno" value="%{pm.pno}"  readonly="true" cssStyle="background:#B5B5B5"/>
		<s:textfield name="pm.myname" key="person.name" value="%{pm.myname}" />
		<s:textfield name="pm.nickname" key="person.nickname" value="%{pm.nickname}" />
		<s:textfield name="pm.age" key="person.age" value="%{pm.age}"/>
	 	<s:radio name="pm.sex" key="person.sex" list="{'boy','girl'}"></s:radio>
		<s:textfield name="pm.mail" key="person.mail" value="%{pm.mail}"/>
		<s:textfield name="pm.address" key="person.address" value="%{pm.address}"/>
	     <s:textfield name="pm.joindate" key="person.joindate" value="%{pm.joindate}"/> 
		<s:textarea name="pm.signature" key="person.signature" value="%{pm.signature}" cols="28" rows="2"></s:textarea>
		<s:submit  key='confirmupdatedata'/>
</s:form>		
</div>
</body>
</html>