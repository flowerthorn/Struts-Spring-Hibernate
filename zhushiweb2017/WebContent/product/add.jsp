<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加产品</title>
</head>
<body>
<form action="add.do" method="post">
产品编号:<input type="text" name="no" /><br/>
产品名称:<input type="text" name="name" /><br/>
产品编码:<input type="text" name="code" /><br/>
生产日期:<input type="text" name="pdate" /><br/>
过期日期:<input type="text" name="edate" /><br/>
单价:<input type="text" name="price" /><br/>
库存数量:<input type="text" name="stock" /><br/>
<input type="submit" value="增加" /><br/>
</form>
</body>
</html>