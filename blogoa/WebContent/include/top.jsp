<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="javascript">
var d=new Date();
var monthname=new Array("January","February","March","April","May","June","July","August","September","October","November","December");
var TODAY = monthname[d.getMonth()] + " " + d.getDate() + ", " + d.getFullYear();
</script>
</head>
<body>
<table width=100%  height=30% border="0" cellpadding="0" cellspacing="0">
  <tr bgcolor="#3366CC" width=100%>
    <td colspan="3" rowspan="2"><img src="../img/admintop.jpg" alt="Header image" width="382" height="127" border="0"></td>
    <td height="63" colspan="3" id="logo" valign="bottom" align="center" nowrap><strong><s:text name="home.title"/></strong></td>
    <td width="382">&nbsp;</td>
  </tr>

  <tr bgcolor="#3366CC">
    <td height="64" colspan="3" id="tagline" valign="top" align="center"> </td>
	<td width="553">&nbsp;</td>
  </tr>

  <tr bgcolor="#CCFF99">
  	<td colspan="7" id="dateformat" height="25">&nbsp;&nbsp;<script language="javascript">
      document.write(TODAY);</script></td>
  </tr>
  </table>
</body>
</html>