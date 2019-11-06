package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer count;
	private double baseCost;
	private double gst;
	private double discount;
	private double finelCost;
	public Product() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public double getBaseCost() {
		return baseCost;
	}
	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getFinelCost() {
		return finelCost;
	}
	public void setFinelCost(double finelCost) {
		this.finelCost = finelCost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", count=" + count + ", baseCost=" + baseCost + ", gst=" + gst
				+ ", discount=" + discount + ", finelCost=" + finelCost + "]";
	}
	
	

}
