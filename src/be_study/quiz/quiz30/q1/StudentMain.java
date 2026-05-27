package be_study.quiz.quiz30.q1;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.department = "컴퓨터공학과";
//		s1.stduentNum = 211;
		s1.setDepartment("컴퓨터공학과");
		s1.setStduentNum(211);

//		System.out.println(s1.department);
//		System.out.println(s1.stduentNum);
		
		System.out.println(s1.getDepartment());
		System.out.println(s1.getStduentNum());
	}

}
