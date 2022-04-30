package Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DBConnect;

public class MemberDAO {

	static final String SQL_MEMBER_LIST = "select * from member order by mem_no asc";
	static final String SQL_CHECK_ID = "select * from member WHERE mem_id = ?";
	static final String SQL_LOGIN = "select mem_pw from member where mem_id = ?";
	
	static final String SQL_MEM_INSERT = "insert into member values( MEMBER_SEQ.nextval, ?, ?, ?, ?, 'N')";
	static final String SQL_MEM_UPDATE = "UPDATE member set " 
			+ "MEM_PW=?,"
			+ "MEM_NAME=?,"
			+ "MEM_PHONE=?"
			+ "WHERE MEM_ID =?";

//	static final String SQL_MEM_DELETE = "delete from member where MEM_ID = ? ";
	static final String SQL_MEM_DELETE = "update member set scsn = 'Y' where MEM_ID = ? ";	//
	Connection conn;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	int result;

	
	
	//회원로그인 
	public int login(String mem_id, String mem_pw) {
		conn = DBConnect.getConnection();
		
		try {
			pst = conn.prepareStatement(SQL_LOGIN);
			pst.setString(1, mem_id);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				if(rs.getString(1).equals(mem_pw)) {
					return 1; //로그인성공
				}else {
					return 0; //비밀번호가 불일치
				}
			}
			return -1;	//아이디가 없다고 알려준다.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnect.dbClose(rs, pst, conn);
		}
		return -2;	//데이터 베이스 에러
	}
	
	
	//회원목록(관리자)
	public List<MemberVO> memList(){
		List<MemberVO> mem_list = new ArrayList<MemberVO>();

		conn = DBConnect.getConnection();

		try {
			st = conn.createStatement();
			rs = st.executeQuery(SQL_MEMBER_LIST);
			while(rs.next()) {
				mem_list.add(makeMem(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnect.dbClose(rs, st, conn);
		}

		return mem_list;
	}

	private MemberVO makeMem(ResultSet rs) throws SQLException {

		MemberVO mem = new MemberVO();
		mem.setMem_id(rs.getString("mem_id"));
		mem.setMem_name(rs.getString("mem_name"));
		mem.setMem_no(rs.getInt("mem_no"));
		mem.setMem_phone(rs.getString("mem_phone"));
		mem.setMem_pw(rs.getString("mem_pw"));
		return mem;

	}

	//출력메서드
	public void memdisplay(List<MemberVO> list) {
		if(list.size() == 0) {
			System.out.println("검색된 회원이 없습니다."); 
		} else { 
			System.out.println("번호\t회원아이디\t회원이름\t핸드폰번호\t");
			for (MemberVO vo : list) {
				System.out.print(vo.getMem_no() + "\t");
				System.out.print(vo.getMem_id() + "\t\t"); 
				System.out.print(vo.getMem_name() + "\t\t");
				System.out.print(vo.getMem_phone() + "\n"); 
			} 
		} 
	}


	//회원가입(입력)
	public int memJoin(MemberVO member) {

		conn = DBConnect.getConnection();

		try {
			pst = conn.prepareStatement(SQL_MEM_INSERT);
			pst.setString(1, member.getMem_id());
			pst.setString(2, member.getMem_pw());
			pst.setString(3, member.getMem_name());
			pst.setString(4, member.getMem_phone());
			result = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnect.dbClose(rs, pst, conn);
		}		

		return result;
	}


	//회원수정
	public int memUpdate(MemberVO member) {

		conn = DBConnect.getConnection();

		try {
			pst = conn.prepareStatement(SQL_MEM_UPDATE);
			pst.setString(1, member.getMem_pw());
			pst.setString(2, member.getMem_name());
			pst.setString(3, member.getMem_phone());
			pst.setString(4, member.getMem_id());
			result = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnect.dbClose(rs, pst, conn);
		}		

		return result;
	}

	//회원 아이디 체크 조회
	public ResultSet checkId(String id) {

		conn = DBConnect.getConnection();

		try {
			pst = conn.prepareStatement(SQL_CHECK_ID);
			pst.setString(1, id);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;

	}



	//회원탈퇴
	public int memDelete(MemberVO member) {

		conn = DBConnect.getConnection();

		try {
			pst = conn.prepareStatement(SQL_MEM_DELETE);
			pst.setString(1, member.getMem_id());
//			pst.setString(2, member.getMem_pw());
			result = pst.executeUpdate();
		} catch (SQLException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			DBConnect.dbClose(rs, pst, conn);
		}		

		return result;
	}
	
}
