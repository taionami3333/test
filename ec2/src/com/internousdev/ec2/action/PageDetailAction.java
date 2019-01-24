package com.internousdev.ec2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ec2.dao.PageDAO;
import com.internousdev.ec2.dto.PageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PageDetailAction extends ActionSupport implements SessionAware{

/*	private String itemName;
	private String itemBrand;
	private String itemMessage;
	private String mainCategory;
	private String subCategory;
	private String miniCategory;
	private int itemPrice;
	private int itemStock;
	private int id;
	private Map<String, Object> session;
	*/

	private String result;
	private Map<String, Object> session;

	public String execute(){
		result = SUCCESS;
		PageDAO pageDAO = new PageDAO();
		PageDTO pageDTO = pageDAO.getItemInfo();

		session.put("id", pageDTO.getId());
		session.put("item_name", pageDTO.getItemName());
		session.put("item_brand", pageDTO.getItemBrand());
		session.put("item_message", pageDTO.getItemMessage());
		session.put("item_main_category", pageDTO.getMainCategory());
		session.put("item_sub_category", pageDTO.getSubCategory());
		session.put("item_mini_category", pageDTO.getMiniCategory());
		session.put("item_price", pageDTO.getItemPrice());
		session.put("item_stock", pageDTO.getItemStock());

		return result;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
