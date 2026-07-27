package be_study.quiz.quiz48;

public class StudentScoreDTO {

	int studno; //학번
	String name; //이름
	int total; //점수
	String grade; //학점
	
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentScoreDTO [studno=" + studno + ", name=" + name + ", total=" + total + ", grade=" + grade + "]";
	}
	
	
}
