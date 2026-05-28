package be_study.quiz.quiz34;

public class GasRange {
	
//	가스렌지
//	- 화구가 몇인지
//	- 어디 브랜드인지
//	- 가격이 얼마인지
//	- 불을 켠다
//	- 불을 끈다
//	- 불세기르 조절한다.
	
	int fireCount; //화구
	String brand;  //브랜드
	int price; //가격
	
	//powerOn
	
	int fireLevel; //불세기 상태
	// 불 세기 단계 0 ~ 10
	
	//인덕션 -> 전원켜기
	
	//불 켠다
	void fireOn() {
		fireLevel = 5;
	}
	
	void fireOff() {
		fireLevel = 0;
	}
	
	void setFireLevel(int fireLevel) {
		this.fireLevel = fireLevel;
	}
	
}
