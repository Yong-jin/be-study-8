package be_study.quiz.quiz38.v2;

// class Unit
// abstract class Unit
// interface Unit  ??? -> 필드변수X, 재정의하는 메소드 선언

public abstract class Unit { 
	//추상클래스화 
	// Unit 이라는 객체를 생성하면 어색.
	
	int x, y; // 현재 위치
	
	//아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit 이라는 클래스를 만들고 이 ,
	//클래스를 상속받도록 코드를 변경하시오.
		
	//*조건
	//1) 멈추는 동작은 모두 동일하게 제자리에 정지한다.
	//2) 움직이는 동작은 걷는거, 날기, 바퀴구르기 다르기 때문에 각각 다르게 정의한다.
	
	abstract void move(int x, int y);
	//직접 정의 X
	//재정의 강제
	//다형성을 위해서 부모클래스 쪽에 사용법을 인지를 위해 선언
	
	void stop() { 
		/* 현재 위치에 정지*/
		System.out.println("현재 위치에 정지");
	}
	
	// 인터페이스 버전의 경우 - 기본작동 메소드 정의
//	default void stop(int x, int y) {
//		System.out.println("제자리에멈춰라");
//	}
	
}
