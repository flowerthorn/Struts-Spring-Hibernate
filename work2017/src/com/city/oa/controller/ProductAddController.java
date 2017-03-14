package com.city.oa.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.oa.model.ProductModel;
import com.city.oa.service.ProductServiceImpl;


/**
 * Servlet implementation class ProductAddController
 */
@WebServlet({ "/ProductAddController", "/product/add.do" })
public class ProductAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductAddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pno=request.getParameter("pno");
		String pname=request.getParameter("pname");
		String pricee=request.getParameter("price");
		ProductModel pm=new ProductModel();
		ProductServiceImpl pml=new ProductServiceImpl();
		Double price=Double.valueOf(pricee);
		pm.setPcode(pno);
		pm.setPname(pname);
		pm.setPrice(price);
		try {
			pml.add(pm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
