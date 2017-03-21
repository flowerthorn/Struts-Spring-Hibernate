package com.sap.erp.model;


import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//注释类映射
@Entity
@Table(name="sap_product")
public class ProductModel {
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getStock() {
		return stock;
	}
	public void setStock(double stock) {
		this.stock = stock;
	}
	
	@Id
	@Column(name="PNO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no=0;
	@Basic
	@Column(name="PCODE")
	private String code=null;
	@Column(name="PNAME")
	private String name=null;
	@Column(name="PDATE")
	private Date pdate=null;
	@Column(name="EDATE")
	private Date edate=null;
	@Column(name="UNITPRICE")
	private double price=0.0;
	@Column(name="QTYInStock")
	private double stock=0.0;
	
}
