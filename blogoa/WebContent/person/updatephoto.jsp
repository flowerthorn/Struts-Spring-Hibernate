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
<s:form action="updatephoto?pno=201411110" enctype="multipart/form-data">
<%-- <s:textfield name="pno" key="person.pno" value="%{pm.pno}"  readonly="true" cssStyle="background:#B5B5B5"/>  --%>
<s:text name="person.photo"/>:<img src="showphoto?pno=${pm.pno}" width="100" height="100" /><br/>
<s:file name="photo" label="照片"></s:file>
<s:submit key='upload'/>
</s:form>
</div>
</body>
</html>