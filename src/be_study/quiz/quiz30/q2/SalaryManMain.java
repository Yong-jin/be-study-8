package be_study.quiz.quiz30.q2;

public class SalaryManMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SalaryMan sm1 = new SalaryMan();
		SalaryMan sm2 = new SalaryMan(2000000);
		
		sm1.getAnnualGross();
		sm2.getAnnualGross();
		
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}

}
