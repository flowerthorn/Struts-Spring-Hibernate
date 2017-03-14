<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加员工</title>
</head>
<body>
<form action="add.do">
员工编号<input type="text" name="id" ><br>
员工名字<input type="text" name="name"><br>
员工性别<input type="text" name="sex"><br>
员工工资<input type="text" name="salary"><br>
加入日期<input type="text" name="joindate"><br>
生日日期<input type="text" name="birthday"><br>
<button type='submit'>确定</button>
</form>
</body>
</html>