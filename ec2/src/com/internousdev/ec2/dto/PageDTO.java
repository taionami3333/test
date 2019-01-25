package com.internousdev.ec2.dto;

public class PageDTO {

	private String itemName;
	private String itemBrand;
	private String itemAbout;
	private String itemCountry;
	private String itemMaterial;
	private String itemOption;
	private String itemMessage;
	private String mainCategory;
	private String subCategory;
	private String miniCategory;
	private boolean itemCouponCode;
	private int itemPrice;
	private int itemStock;
	private int id;

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

	public String getItemAbout(){
		return itemAbout;
	}
	public void setItemAbout(String itemAbout){
		this.itemAbout = itemAbout;
	}

	public String getItemCountry(){
		return itemCountry;
	}
	public void setItemCountry(String itemCountry){
		this.itemCountry = itemCountry;
	}

	public String getItemMaterial(){
		return itemMaterial;
	}
	public void setItemMaterial(String itemMaterial){
		this.itemMaterial = itemMaterial;
	}

	public String getItemOption(){
		return itemOption;
	}
	public void setItemOption(String itemOption){
		this.itemOption = itemOption;
	}

	public String getItemMessage(){
		return itemMessage;
	}
	public void setItemMessage(String itemMessage){
		this.itemMessage = itemMessage;
	}

	public String getMainCategory(){
		return mainCategory;
	}
	public void setMainCategory(String mainCategory){
		this.mainCategory = mainCategory;
	}

	public String getSubCategory(){
		return subCategory;
	}
	public void setSubCategory(String subCategory){
		this.subCategory = subCategory;
	}

	public String getMiniCategory(){
		return miniCategory;
	}
	public void setMiniCategory(String miniCategory){
		this.miniCategory = miniCategory;
	}

	public boolean isItemCouponCode(){
		return itemCouponCode;
	}
	public void setItemCouponCode(boolean itemCouponCode){
		this.itemCouponCode = itemCouponCode;
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

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
}
