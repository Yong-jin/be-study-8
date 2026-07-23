package be_study.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be_study.quiz.quiz45.Product;

public class ProductDAO {

	public Product findProductByPCode(int pCode) {
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		conn = DBConnectionManager.connectDB();
		
		//실행할 쿼리 준비
		String sqlQuery = " select * from product " +
						  " where p_code = ? ";
		 
		//쿼리 실행, 실행 후 후속 데이터 처리
		Product product = null;
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, pCode);
			rs = psmt.executeQuery();

			if(rs.next()) {   
				product = new Product();
				product.setpCode(rs.getInt("p_code"));
				product.setpName(rs.getString("p_name"));
				product.setpPrice(rs.getInt("p_price"));
			}
		} catch (SQLException e) { 
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return product;
		
	}
	
	public List<Product> findProductList() {
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();
		
		//실행할 쿼리 준비
		String sqlQuery = " select * from product ";
		 
		//쿼리 실행, 실행 후 후속 데이터 처리
		
		List<Product> productList = null;
		
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {   
				
				Product product = new Product();
				
				product.setpCode(rs.getInt("p_code"));
				product.setpName(rs.getString("p_name"));
				product.setpPrice(rs.getInt("p_price"));
				
				if(productList == null)
					productList = new ArrayList<Product>();
				
				productList.add(product);
			}
		} catch (SQLException e) { 
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return productList;
		
	}
	
	
}
