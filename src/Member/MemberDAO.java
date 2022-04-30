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

	
	
	//ȸ���α��� 
	public int login(String mem_id, String mem_pw) {
		conn = DBConnect.getConnection();
		
		try {
			pst = conn.prepareStatement(SQL_LOGIN);
			pst.setString(1, mem_id);
			rs = pst.executeQuery();
			
			if(rs.next()) {
				if(rs.getString(1).equals(mem_pw)) {
					return 1; //�α��μ���
				}else {
					return 0; //��й�ȣ�� ����ġ
				}
			}
			return -1;	//���̵� ���ٰ� �˷��ش�.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBConnect.dbClose(rs, pst, conn);
		}
		return -2;	//������ ���̽� ����
	}
	
	
	//ȸ�����(������)
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

	//��¸޼���
	public void memdisplay(List<MemberVO> list) {
		if(list.size() == 0) {
			System.out.println("�˻��� ȸ���� �����ϴ�."); 
		} else { 
			System.out.println("��ȣ\tȸ�����̵�\tȸ���̸�\t�ڵ�����ȣ\t");
			for (MemberVO vo : list) {
				System.out.print(vo.getMem_no() + "\t");
				System.out.print(vo.getMem_id() + "\t\t"); 
				System.out.print(vo.getMem_name() + "\t\t");
				System.out.print(vo.getMem_phone() + "\n"); 
			} 
		} 
	}


	//ȸ������(�Է�)
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


	//ȸ������
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

	//ȸ�� ���̵� üũ ��ȸ
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



	//ȸ��Ż��
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
