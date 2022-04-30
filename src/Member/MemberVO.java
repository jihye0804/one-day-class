package Member;

public class MemberVO {

	
	private	int mem_no;       
	private	String mem_id;  
	private	String mem_pw;    
	private	String mem_name; 
	private	String mem_phone;
	private char scsn;
	
	public MemberVO() {
		super();
	}

	
	public MemberVO(int mem_no, String mem_id, String mem_pw, String mem_name, String mem_phone, char scsn) {
		super();
		this.mem_no = mem_no;
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_name = mem_name;
		this.mem_phone = mem_phone;
		this.scsn = scsn;
	}

	public MemberVO(int mem_no, String mem_id, String mem_pw, String mem_name, String mem_phone) {
		super();
		this.mem_no = mem_no;
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_name = mem_name;
		this.mem_phone = mem_phone;
	}


	public MemberVO(String mem_id, String mem_pw, String mem_name, String mem_phone) {
		super();
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_name = mem_name;
		this.mem_phone = mem_phone;
	}

	
	public char getScsn() {
		return scsn;
	}

	public void setScsn(char scsn) {
		this.scsn = scsn;
	}

	public int getMem_no() {
		return mem_no;
	}

	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_pw() {
		return mem_pw;
	}

	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getMem_phone() {
		return mem_phone;
	}

	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberVO [mem_no=").append(mem_no).append(", mem_id=").append(mem_id).append(", mem_pw=")
				.append(mem_pw).append(", mem_name=").append(mem_name).append(", mem_phone=").append(mem_phone)
				.append(", scsn=").append(scsn).append("]");
		return builder.toString();
	}

	
	
}
