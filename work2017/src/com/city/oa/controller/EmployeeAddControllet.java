package com.city.oa.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.oa.model.EmployeeModel;
import com.city.oa.service.EmployeeService;

/**
 * Servlet implementation class EmployeeAddControllet
 */
@WebServlet("/employee/add.do")
public class EmployeeAddControllet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EmployeeAddControllet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeModel em=new EmployeeModel();
		EmployeeService es=new EmployeeService();
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Date birthday=null;
		Date joindate=null;
		try {
			birthday = df.parse(request.getParameter("birthday"));
			joindate=df.parse(request.getParameter("joindate"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		em.setId(request.getParameter("id").toString());
		em.setName(request.getParameter("name").toString());
		em.setSex(request.getParameter("sex"));
		em.setSalary(Double.parseDouble(request.getParameter("salary")));
		em.setBirthday(birthday);
		em.setJoindate(joindate);
		try {
			es.add(em);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
