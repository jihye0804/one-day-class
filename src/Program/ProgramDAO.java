package Program;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import db.DBConnect;

public class ProgramDAO {

	//SQL문장
	static final String SQL_SELECT_ALL = "select * from program order by pro_no asc";
	static final String SQL_CHECK_NUM = "select * from program WHERE pro_no = ?";
	static final String SQL_SERCH = "SELECT * FROM program WHERE UPPER(pro_title) LIKE UPPER(?)";
	
	static final String SQL_INSERT = "INSERT INTO PROGRAM values(?, ?, ?, ?, ?, ?, 'N')";
	static final String SQL_UPDATE = "UPDATE PROGRAM set "
			+ "PRO_TITLE=?,"
			+ "PRO_TEACHER=?,"
			+ "PRO_PRICE=?,"
			+ "PRO_STARTDAY=?,"
			+ "PRO_ENDDAY=?"
			+ "WHERE PRO_NO=?";

//	static final String SQL_DELETE = "DELETE FROM PROGRAM"
//			+ " WHERE PRO_NO =?";

	static final String SQL_DELETE = "update PROGRAM set pro_scsn = 'Y' where PRO_NO = ? ";
	
	Connection conn;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	int result;

	//프로그램 전체목록
	public List<ProgramVO> selectAll(){
		List<ProgramVO> pro_list = new ArrayList<ProgramVO>();

		conn = DBConnect.getConnection();

		try {
			st = conn.createStatement();
			rs = st.executeQuery(SQL_SELECT_ALL);
			while(rs.next()) {
				pro_list.add(makePro(rs));	//list에 담아서 넣을거다.
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnect.dbClose(rs, st, conn);
		}

		return pro_list;
	}


	private ProgramVO makePro(ResultSet rs) throws SQLException {

		ProgramVO pro = new ProgramVO();
		pro.setPro_endday(rs.getDate("pro_endday"));
		pro.setPro_no(rs.getInt("pro_no"));
		pro.setPro_price(rs.getInt("pro_price"));
		pro.setPro_startday(rs.getDate("pro_startday"));
		pro.setPro_teacher(rs.getString("pro_teacher"));
		pro.setPro_title(rs.getString("pro_title"));
		return pro;

	}

	//출력메서드
	public void display(List<ProgramVO> list) {
		if(list.size() == 0) {
			System.out.println("검색된 결과가 없습니다."); 
		} else { 
			System.out.println("번호\t프로그램이름\t\t작가\t금액\t시작날짜\t종료날짜\t");
			for (ProgramVO vo : list) {
				System.out.print(vo.getPro_no() + "\t");
				System.out.print(vo.getPro_title() + "\t"); 
				System.out.print(vo.getPro_teacher() + "\t");
				System.out.print(vo.getPro_price() + "\t"); 
				System.out.print(vo.getPro_startday() + "\t"); 
				System.out.print(vo.getPro_endday() + "\n"); 
			} 
		} 

	}

	//프로그램 번호 조회
	public ResultSet checkNum(int prono) {

		conn = DBConnect.getConnection();

		try {
			pst = conn.prepareStatement(SQL_CHECK_NUM);
			pst.setInt(1, prono);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;

	}


	//프로그램 제목 검색 조회 
	public void selectProTitle(ArrayList<ProgramVO> list, String searchTitle) {
		
		conn = DBConnect.getConnection();
		
		try { 
			pst = conn.prepareStatement(SQL_SERCH);
			pst.setString(1, "%" + searchTitle + "%");
			rs = pst.executeQuery(); 
			while(rs.next()) { 
				int no = rs.getInt("PRO_NO"); 
				String title = rs.getString("PRO_TITLE"); 
				String teacher = rs.getString("PRO_TEACHER"); 
				int price = rs.getInt("PRO_PRICE"); 
				Date sday = rs.getDate("PRO_STARTDAY");
				Date eday = rs.getDate("PRO_ENDDAY");
				
				ProgramVO vo = new ProgramVO(no, title, teacher, price, sday, eday);
				list.add(vo); 
			} 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
	} 


	//프로그램입력
	public int proInsert(ProgramVO pro) {
		int succ = 0;

		conn = DBConnect.getConnection();

		try {
			pst = conn.prepareStatement(SQL_INSERT);
			pst.setInt(1, pro.getPro_no());
			pst.setString(2, pro.getPro_title());
			pst.setString(3, pro.getPro_teacher());
			pst.setInt(4, pro.getPro_price());
			pst.setDate(5, pro.getPro_startday());
			pst.setDate(6, pro.getPro_endday());
			succ = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnect.dbClose(rs, pst, conn);
		}

		return succ;
	}

	//프로그램수정
	public int proUpdate(ProgramVO pro) {
		int succ = 0;

		conn = DBConnect.getConnection();

		try {
			pst = conn.prepareStatement(SQL_UPDATE);
			pst.setString(1, pro.getPro_title());
			pst.setString(2, pro.getPro_teacher());
			pst.setInt(3, pro.getPro_price());
			pst.setDate(4, pro.getPro_startday());
			pst.setDate(5, pro.getPro_endday());
			pst.setInt(6, pro.getPro_no());
			succ = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnect.dbClose(rs, pst, conn);
		}

		return succ;
	}

	//프로그램삭제
	public int proDelete(int prono) {
		int succ = 0;

		conn = DBConnect.getConnection();

		try {
			pst = conn.prepareStatement(SQL_DELETE);
			pst.setInt(1, prono);
			succ = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnect.dbClose(rs, pst, conn);
		}

		return succ;
	}
}
