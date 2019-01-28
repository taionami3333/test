package com.internousdev.ec2.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ec2.dto.PageDTO;
import com.internousdev.ec2.util.DBConnector;


public class PageIndexDAO {

	List<PageDTO> pageDTOList = new ArrayList<PageDTO>();
	public List<PageDTO> select(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "SELECT * FROM item_info_transaction";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				PageDTO dto=new PageDTO();
				dto.setItemName(rs.getString("item_name"));
				dto.setItemBrand(rs.getString("item_brand"));
				dto.setItemPrice(rs.getInt("item_price"));
				dto.setItemStock(rs.getInt("item_stock"));
				pageDTOList.add(dto);
			}
		}catch (SQLException exception){
			exception.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return pageDTOList;
	}
}