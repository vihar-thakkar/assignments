package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.product;


public class productDao {
	public static void uploadProduct(product p) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into product(sid,image,pname,pprice,pcategory,pdesc) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, p.getSid());
			pst.setString(2, p.getImage());
			pst.setString(3, p.getPname());
			pst.setInt(4, p.getPprice());
			pst.setString(5, p.getPcategory());
			pst.setString(6, p.getPdescription());
			pst.executeUpdate();
			System.out.println("product uploaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<product> getProductListBySellerId(int id){
		List<product> list  =new ArrayList<product>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from product where sid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs  =pst.executeQuery();
			while(rs.next()) {
				product p = new product();
				p.setPid(rs.getInt("pid"));
				p.setPid(rs.getInt("sid"));
				p.setImage(rs.getString("image"));
				p.setPname(rs.getString("pname"));
				p.setPprice(rs.getInt("pprice"));
				p.setPcategory(rs.getString("pcategory"));
				p.setPdescription(rs.getString("pdesc"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	private void setPdescription(String string) {
		// TODO Auto-generated method stub
		
	}
	private void setPcategory(String string) {
		// TODO Auto-generated method stub
		
	}
	private void setPprice(int int1) {
		// TODO Auto-generated method stub
		
	}
	private void setPname(String string) {
		// TODO Auto-generated method stub
		
	}
	private void setImage(String string) {
		// TODO Auto-generated method stub
		
	}
	private void setPid(int int1) {
		// TODO Auto-generated method stub
		
	}
	public static void deleteProduct(int id) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "delete from product where pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("product deletd");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static product getProductById(int id) {
		product p = null;
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from product where pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs  =pst.executeQuery();
			if(rs.next()) {
				p = new product();
				p.setPid(rs.getInt("pid"));
				p.setSid(rs.getInt("sid"));
				p.setImage(rs.getString("image"));
				p.setPname(rs.getString("pname"));
				p.setPprice(rs.getInt("pprice"));
				p.setPcategory(rs.getString("pcategory"));
				p.setPdescription(rs.getString("pdesc"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	public static void updatePorduct(product p) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "update product set sid=?,image=?,pname=?,pprice=?,pcategory=?,pdesc=? where pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, p.getSid());
			pst.setString(2, p.getImage());
			pst.setString(3, p.getPname());
			pst.setInt(4, p.getPprice());
			pst.setString(5, p.getPcategory());
			pst.setString(6, p.getPdescription());
			pst.setInt(7, p.getPid());
			pst.executeUpdate();
			System.out.println("product updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}