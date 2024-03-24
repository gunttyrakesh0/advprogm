package com.sathya.tech;

public class Product {
	int prodid;
	String prodname;
	double prodprice;
	public Product(int prodid, String prodname, double prodprice) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.prodprice = prodprice;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", prodname=" + prodname + ", prodprice=" + prodprice + "]";
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public double getProdprice() {
		return prodprice;
	}
	public void setProdprice(double prodprice) {
		this.prodprice = prodprice;
	}
	 

}
