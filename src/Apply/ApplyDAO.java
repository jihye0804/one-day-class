package Apply;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Member.MemberVO;
import db.DBConnect;

public class ApplyDAO {

	static final String SQL_APPLY_ALL = "select * from apply order by app_no asc";
	static final String SQL_APPLY_INSERT = "insert into apply values( MEMBER_SEQ.nextval, ?, ?)";


	Connection conn;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	int result;

	//프로그램 신청 전체목록
	public List<ApplyVO> applyAll(){

		List<ApplyVO> app_list = new ArrayList<ApplyVO>();

		conn = DBConnect.getConnection();

		try {
			st = conn.createStatement();
			rs = st.executeQuery(SQL_APPLY_ALL);
			while(rs.next()) {
				app_list.add(makeApp(rs));	//list에 담아서 넣을거다.
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnect.dbClose(rs, st, conn);
		}

		return app_list;
	}

	private ApplyVO makeApp(ResultSet rs) throws SQLException {

		ApplyVO app = new ApplyVO();

		app.setApp_no(rs.getInt("app_no"));
		app.setMem_no(rs.getInt("mem_no"));
		app.setPro_no(rs.getInt("pro_no"));

		return app;
	}

	//출력메서드
	public void display(List<ApplyVO> list) {
		if(list.size() == 0) {
			System.out.println("검색된 결과가 없습니다."); 
		} else { 
			System.out.println("신청번호\t회원번호\t프로그램번호\t");
			for (ApplyVO vo : list) {
				System.out.print(vo.getApp_no() + "\t\t"); 
				System.out.print(vo.getMem_no() + "\t\t");
				System.out.print(vo.getPro_no() + "\n"); 
			} 
		} 

	}


	//신청하기- 회원
	public int applyInsert(ApplyVO apply) {

		conn = DBConnect.getConnection();

		try {
			pst = conn.prepareStatement(SQL_APPLY_INSERT);
			pst.setInt(1, apply.getMem_no());
			pst.setInt(2, apply.getPro_no());
			result = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnect.dbClose(rs, pst, conn);
		}		

		return result;
	}



}
