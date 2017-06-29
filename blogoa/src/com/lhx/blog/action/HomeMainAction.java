package com.lhx.blog.action;

//系统主页控制器
public class HomeMainAction {
	//到系统主页前分发
	public String tohome() throws Exception
	{   
	/*	int num1=0;
		int num2=0; 
		int num3=num1/num2;*/
		/*数组越界*/
/*		 int i = 0;  
	     String greetings[] = { " Hello world !", " Hello World !! ",  
	               " HELLO WORLD !!!" };  
	       while (i < 4) {  
	    	   System.out.println(greetings[i++]);  
	        }*/
		/*nullpoint*/
	String username=null;
System.out.println(username.length()+"");
//空指针测试 不注入添加文章
		return "tohome";
	}
}
