package be_study.quiz.quiz30.q4;

public class ComputerMain {

	public static void main(String[] args) {
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		
		pc.print();
		apple.print();
		galaxy.print();
		
//		운영체제: 윈도우10, 메인메모리: 16
//		운영체제: 애플 OS X, 메인메모리: 32
//		운영체제: 안드로이드, 메인메모리: 16

	}

}
