package objects;

public class Member {

	private int number;
	private String code;
	private int grade;
	
	public Member(int number, String code, int grade) {
		super();
		this.number = number;
		this.code = code;
		this.grade = grade;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return  getCode() + " "+ getGrade();
	}
}
