package Apply;

public class ApplyVO {

	private int app_no;     
	private int mem_no;    
	private int pro_no;
	
	public ApplyVO() {
		super();
	}

	public ApplyVO(int app_no, int mem_no, int pro_no) {
		super();
		this.app_no = app_no;
		this.mem_no = mem_no;
		this.pro_no = pro_no;
	}

	public int getApp_no() {
		return app_no;
	}

	public void setApp_no(int app_no) {
		this.app_no = app_no;
	}

	public int getMem_no() {
		return mem_no;
	}

	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	public int getPro_no() {
		return pro_no;
	}

	public void setPro_no(int pro_no) {
		this.pro_no = pro_no;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ApplyVO [app_no=").append(app_no).append(", mem_no=").append(mem_no).append(", pro_no=")
				.append(pro_no).append("]");
		return builder.toString();
	}
	
	
	
}
