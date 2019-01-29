package com.internousdev.ec2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ec2.dto.PageDTO;
import com.internousdev.ec2.util.DBConnector;

public class PageDAO {


	public PageDTO getItemInfo(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		PageDTO pageDTO = new PageDTO();

		String sql = "SELECT * FROM item_info_transaction";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				pageDTO.setId(rs.getInt("id"));
				pageDTO.setItemName(rs.getString("item_name"));
				pageDTO.setItemBrand(rs.getString("item_brand"));
				pageDTO.setItemAbout(rs.getString("item_about"));
				pageDTO.setItemCountry(rs.getString("item_country"));
				pageDTO.setItemMaterial(rs.getString("item_material"));
				pageDTO.setItemOption(rs.getString("item_option"));
				pageDTO.setItemMessage(rs.getString("item_message"));
				pageDTO.setMainCategory(rs.getString("item_main_category"));
				pageDTO.setSubCategory(rs.getString("item_sub_category"));
				pageDTO.setMiniCategory(rs.getString("item_mini_category"));
				pageDTO.setItemPrice(rs.getInt("item_price"));
				pageDTO.setItemStock(rs.getInt("item_stock"));
				pageDTO.setItemCouponCode(rs.getBoolean("item_coupon_code"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return pageDTO;
	}

	/*public PageDTO select(String itemname){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		PageDTO pageDTO = new PageDTO();
		String sql ="SELECT * FROM item_info_transaction WHERE item_name=?";
		System.out.println(itemname);
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, itemname);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				pageDTO.setId(rs.getInt("id"));
				pageDTO.setItemName(rs.getString("item_name"));
				pageDTO.setItemBrand(rs.getString("item_brand"));
				pageDTO.setItemAbout(rs.getString("item_about"));
				pageDTO.setItemCountry(rs.getString("item_country"));
				pageDTO.setItemMaterial(rs.getString("item_material"));
				pageDTO.setItemOption(rs.getString("item_option"));
				pageDTO.setItemMessage(rs.getString("item_message"));
				pageDTO.setMainCategory(rs.getString("item_main_category"));
				pageDTO.setSubCategory(rs.getString("item_sub_category"));
				pageDTO.setMiniCategory(rs.getString("item_mini_category"));
				pageDTO.setItemPrice(rs.getInt("item_price"));
				pageDTO.setItemStock(rs.getInt("item_stock"));
				pageDTO.setItemCouponCode(rs.getBoolean("item_coupon_code"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		return pageDTO;
	}

	public String getItemName(){
		return itemname;
	}
	public void setItamName(String itemname){
		this.itemname = itemname;
	}
*/
}
