package com.sap.erp.action;

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

import com.sap.erp.model.ProductModel;
import com.sap.erp.service.IProductService;
import com.sap.erp.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class ProductAddAction
 */
@WebServlet({ "/ProductAddAction", "/product/add.do" })
public class ProductAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductAddAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductServiceImpl ps=new ProductServiceImpl();
		ProductModel pm=new ProductModel();
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Date pdate=null;
		Date edate=null;
		try {
			edate=df.parse(request.getParameter("edate"));
			pdate=df.parse(request.getParameter("pdate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pm.setNo(Integer.parseInt(request.getParameter("no")));
		pm.setCode(request.getParameter("code"));
		pm.setName(request.getParameter("name"));
		pm.setPrice(Double.parseDouble(request.getParameter("price")));
		pm.setStock(Double.parseDouble(request.getParameter("stock")));
		pm.setEdate(edate);
		pm.setPdate(pdate);
		try {
			ps.add(pm);
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
