package com.lhx.blog.interceptor;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginCheckInteceptor  extends ActionSupport implements Interceptor{


	@Override
	public void destroy() {
		System.out.println("登录检查拦截器销毁方法。。。");

	}

	@Override
	public void init() {
		System.out.println("登录检查拦截器初始化方法。。。");

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("登录检查拦截器拦截方法。。。");	
		ActionContext ac=ActionContext.getContext();
		Map<String,Object> session=ac.getSession();
		if(session.get("pm")==null){
			String error=this.getText("welcome.loginerror");
			this.addActionError(error);
			return "towelcome";
		}
		else{
			String result=ai.invoke();
			return result;
		}	
	}

}
