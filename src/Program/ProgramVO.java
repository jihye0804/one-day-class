package Program;

import java.sql.Date;

public class ProgramVO {

	private int pro_no;      
    private String pro_title;
    private String pro_teacher;
    private int pro_price;  
    private Date pro_startday;
    private Date pro_endday;
    private char pro_scsn;
	
    public ProgramVO() {
		super();
	}

	public ProgramVO(int pro_no, String pro_title, String pro_teacher, int pro_price, Date pro_startday,
			Date pro_endday) {
		super();
		this.pro_no = pro_no;
		this.pro_title = pro_title;
		this.pro_teacher = pro_teacher;
		this.pro_price = pro_price;
		this.pro_startday = pro_startday;
		this.pro_endday = pro_endday;
	}



	public ProgramVO(int pro_no, String pro_title, String pro_teacher, int pro_price, Date pro_startday,
			Date pro_endday, char pro_scsn) {
		super();
		this.pro_no = pro_no;
		this.pro_title = pro_title;
		this.pro_teacher = pro_teacher;
		this.pro_price = pro_price;
		this.pro_startday = pro_startday;
		this.pro_endday = pro_endday;
		this.pro_scsn = pro_scsn;
	}


	public char getPro_scsn() {
		return pro_scsn;
	}

	public void setPro_scsn(char pro_scsn) {
		this.pro_scsn = pro_scsn;
	}

	public int getPro_no() {
		return pro_no;
	}

	public void setPro_no(int pro_no) {
		this.pro_no = pro_no;
	}

	public String getPro_title() {
		return pro_title;
	}

	public void setPro_title(String pro_title) {
		this.pro_title = pro_title;
	}

	public String getPro_teacher() {
		return pro_teacher;
	}

	public void setPro_teacher(String pro_teacher) {
		this.pro_teacher = pro_teacher;
	}

	public int getPro_price() {
		return pro_price;
	}

	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}

	public Date getPro_startday() {
		return pro_startday;
	}

	public void setPro_startday(Date pro_startday) {
		this.pro_startday = pro_startday;
	}

	public Date getPro_endday() {
		return pro_endday;
	}

	public void setPro_endday(Date pro_endday) {
		this.pro_endday = pro_endday;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProgramVO [pro_no=").append(pro_no).append(", pro_title=").append(pro_title)
				.append(", pro_teacher=").append(pro_teacher).append(", pro_price=").append(pro_price)
				.append(", pro_startday=").append(pro_startday).append(", pro_endday=").append(pro_endday)
				.append(", pro_scsn=").append(pro_scsn).append("]");
		return builder.toString();
	}
	
}
