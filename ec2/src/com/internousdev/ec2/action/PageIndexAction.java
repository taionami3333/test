package com.internousdev.ec2.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ec2.dao.PageIndexDAO;
import com.internousdev.ec2.dto.PageDTO;
import com.opensymphony.xwork2.ActionSupport;


public class PageIndexAction extends ActionSupport implements SessionAware{
	private String itemName;
	private String itemBrand;
	private int itemPrice;
	private int itemStock;
	List<PageDTO> pageDTOList = new ArrayList<PageDTO>();
	private Map<String, Object> session;

	public String execute(){
		String ret = "ERROR";
		PageIndexDAO dao = new PageIndexDAO();
		pageDTOList=dao.select();
		session.put("pageDTOList", pageDTOList);
		ret=SUCCESS;

		return ret;
	}
	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	public String getItemBrand(){
		return itemBrand;
	}
	public void setItemBrand(String itemBrand){
		this.itemBrand = itemBrand;
	}
	public int getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(int itemPrice){
		this.itemPrice = itemPrice;
	}
	public int getItemStock(){
		return itemStock;
	}
	public void setItemStock(int itemStock){
		this.itemStock = itemStock;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}


}
