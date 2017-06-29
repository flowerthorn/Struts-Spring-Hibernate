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
<h1>查看文章列表</h1>
            <div class="col-md-9">
                <%-- 类别<s:select name="am.category" label="选择类别 " list="categoryList" listKey="cno" listValue="cname">
		</s:select> --%>
				<table class="table table-border ">
				   <thead>
				      <tr>
				        <th>文章编号</th>
				        <th>标题</th>
				         <th>时间</th>
				        <th>类别</th>			       
				    <!--     <th>标签</th>		 -->		       
				       
				        <th>操作</th>
				      </tr>
				   </thead>
				   <tbody>
				   
				   <s:iterator var="amm" value="articleList" status="st">
				   	<tr>
				   <%-- 	  <td><s:property value="#st.index"/> </td> --%>
				  	 <td><s:property value="#amm.ano"/> </td>
				   	  <td><s:property value="#amm.title"/> </td>
				   	  <td><s:property value="#amm.date"/></td>
				   	  <td><s:property value="#amm.category.cname"/></td>
				   	 
<%-- 					 <td>
					<s:iterator var="tm" value ="#am.tags">
					<a><s:property value="tm.tname"></s:property></a>
					</s:iterator>
					</td>  --%>
					
				   	  <td><a class="btn btn-default" 
				   	  href="tomodify?ano=${amm.ano}" >修改</a> 
				   	  <a class="btn btn-default" href="delete?ano=${amm.ano}" onclick="return(confirm('确定刪除?'))">删除</a> 
				   	  <%-- <a class="btn btn-default" href="toview.action?id=${em.id }">查看</a> --%>
				   	  </td>
				   	</tr>
				   </s:iterator>		   
				   </tbody>
				</table> 
				
        <div class="row text-center">
            <div class="col-lg-12">
                <ul class="pagination">
                    <li class="active">
                        <a href="viewbypages?pages=1">首页</a>
                    </li>
                    <li >
                        <a href="viewbypages?pages=2">2</a>
                    </li>
                    <li>
                        <a href="viewbypages?pages=3">3</a>
                    </li>
                    <li>
                        <a href="viewbypages?pages=4">4</a>
                    </li>
                    <li>
                        <a href="viewbypages?pages=5">5</a>
                    </li>
                    <li>
                        <a href="viewbypages?pages=6">6</a>
                    </li>
                    <li>
                        <a href="viewbypages?pages=7">尾页</a>
                    </li>
                </ul>
                
            </div>
            <div class="col-lg-3">
            	<a class="btn btn-default" href="toadd.action">增加文章</a> 
            </div>
            
       </div>		             
            </div>
        </div>
</body>
</html>