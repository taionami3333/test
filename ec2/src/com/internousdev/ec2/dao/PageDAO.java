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

		String sql = "SELECT "
				+ "id, item_name, item_brand, item_message,"
				+ "item_main_category, item_sub_category, item_mini_category,"
				+ "item_price, item_stock FROM item_info_transaction";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				pageDTO.setId(rs.getInt("id"));
				pageDTO.setItemName(rs.getString("item_name"));
				pageDTO.setItemBrand(rs.getString("item_brand"));
				pageDTO.setItemMessage(rs.getString("item_message"));
				pageDTO.setMainCategory(rs.getString("item_main_category"));
				pageDTO.setSubCategory(rs.getString("item_sub_category"));
				pageDTO.setMiniCategory(rs.getString("item_mini_category"));
				pageDTO.setItemPrice(rs.getInt("item_price"));
				pageDTO.setItemStock(rs.getInt("item_stock"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return pageDTO;
	}

}
