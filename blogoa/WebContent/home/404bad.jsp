<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style type="text/css">
* {margin:0px;padding:0px;list-style:none;text-decoration:none;}
body {background:url(../img/b1.jpg)}
.mian {width:1000px;height:600px;background:url(../img/back.jpg);margin:3% auto}
.error_div {width:210px;float:right;margin-right:28%;margin-top:38%;font-family:"微软雅黑"}
.error_div a {float:left;color:#FFFBF0;width:80px;background:#8A532A;text-align:center;line-height:20px;font-size:15px;border-bottom:3px solid #683F20}
.error_div a:hover {background:#7B4A26;}
.info {float:right;line-height:20px;color:#000}
</style>
<script type="text/javascript">
	    var InterValObj; //timer变量，控制时间
	    var count=5;
	    var curCount;
    
	    function SetRemainTime() {
           if (curCount == 0) {
               window.clearInterval(InterValObj);//停止计时器
           }
           else {
               curCount--;
               document.getElementById("redirect_info").innerHTML=(curCount+"秒后返回首页");
           }
	    }
    </script>
</head>
<body>
<div class="mian">
	<div class="error_div">
		<h1>没有找到您要查询的对象</h1>
        <a href="../home/tohome">返回首页</a>
        <p id="redirect_info" class="info">5秒倒计时</p>
        <script type="text/javascript">
            curCount=count;
            InterValObj = window.setInterval(SetRemainTime, 1000);
        </script>
    </div>
</div>
</body>
</html>
