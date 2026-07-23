package be_study.quiz.quiz45;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Quiz45Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*

			자바에서 DB 연결
			
			단순 select 해서 데이터 읽어오기
			대상 테이블 : product
			
			1. 단일 행을 읽어서 리턴해서 출력하기
			
			2. 객체 리스트 단위로 리턴해서 출력하기
			
		 */
		
		// product 단일로 조회
		
		Product p1 = findProductByPCode(102);
		if( p1 != null ) {
			System.out.println(p1.toString());
		}
		
		System.out.println("--------------------------");
		
		// product 리스트로 조회
		List<Product> list = findProductList();
		
		if( list != null && list.size() > 0 ) {
			for(Product p : list) {
				System.out.println(p.toString());
			}
		}
		
	}
	
	
	public static Product findProductByPCode(int pCode) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//DB 연결 정보
		//String db_url = "jdbc:oracle:thin:@150.25.33.191:12364:orcl";
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
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
		}
		
		//DB 연결 정료
		try {
			
			if(rs != null)
				rs.close();		//null 객체 메소드 호출 -> NullPointerException
			
			if(psmt != null)
				psmt.close();
			
			if(conn != null)
				conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return product;
		
	}
	
	public static List<Product> findProductList() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//DB 연결 정보
		//String db_url = "jdbc:oracle:thin:@150.25.33.191:12364:orcl";
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
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
		}
		
		//DB 연결 정료
		try {
			
			if(rs != null)
				rs.close();		//null 객체 메소드 호출 -> NullPointerException
			
			if(psmt != null)
				psmt.close();
			
			if(conn != null)
				conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return productList;
		
	}
	
	

}
