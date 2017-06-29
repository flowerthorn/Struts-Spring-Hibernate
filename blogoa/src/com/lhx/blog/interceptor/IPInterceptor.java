package com.lhx.blog.interceptor;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class IPInterceptor extends AbstractInterceptor{
	private ServletContext application;
	private HttpServletRequest request;
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ip检查拦截器拦截方法。。。");	
		application=ServletActionContext.getServletContext();
		request=ServletActionContext.getRequest();
		String realPath=application.getRealPath("/WEB-INF/ip.txt");
		BufferedReader in=new BufferedReader(new FileReader(realPath));
		String ips=in.readLine();
		String myip=request.getRemoteAddr();
		System.out.print("ip"+request.getRemoteAddr());
		if(ips.contains(myip)){
			return "ip";
		}
		System.out.print("ip"+request.getRemoteAddr());
		return arg0.invoke();
	}


}
