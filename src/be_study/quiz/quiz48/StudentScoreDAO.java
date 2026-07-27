package be_study.quiz.quiz48;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//public class StudentDAO {
public class StudentScoreDAO {
	
	
	public List<StudentScoreDTO> findStudentScoreListByDeptno(int deptno) {

		// db 연결, 실행 객체
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		// 실행할 쿼리 준비
		String sqlQuery = " select A.studno, A.name, B.total, C.grade "
				+ " from student A, score B, hakjum C "
				+ " where A.studno = B.studno "
				+ " AND B.total BETWEEN C.MIN_POINT AND C.MAX_POINT " 
				+ " AND A.deptno1 = ? ";

		List<StudentScoreDTO> studentScoreList = new ArrayList<StudentScoreDTO>();

		// 쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다

				StudentScoreDTO studentScoreDTO = new StudentScoreDTO();
				
				studentScoreDTO.setStudno( rs.getInt("studno") );
				studentScoreDTO.setName(rs.getString("name"));
				studentScoreDTO.setTotal(rs.getInt("total"));
				studentScoreDTO.setGrade(rs.getString("grade"));
				
				studentScoreList.add(studentScoreDTO);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studentScoreList;

	}

}
