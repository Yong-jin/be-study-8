package be_study.quiz.quiz34;

public class Refrigerator {
//	냉장고
//	- 어느 브랜드인지
//	- 몇리터 짜리인지

//	- 전원을 켤수 있다
//	- 온도조절을할수있다(온도 up 또는 온도 down)
//	- 문이 몇개인지
	
	String brandName;   //속성
	int liter;  //320L   274L
	int doorCount; // 문 2개    4개  1개

	boolean isPowerOn;	//상태변수
	
	int temperature; // 현재 온도   (상태변수)
	
	//온도조절   +200도  -500도
	//온도 조절이 가능한 범위 -20 ~ 10
	// 			-15 ~ 8
	int maxTemperature; //최대 온도  8
	int minTemperature; //최저 온도  -15
	
	
	//	냉동실안에 얼음 트레이
	IceTray iceTray; 
	
	
	
	
	
	
	
	
	
	void powerOn() {  //켜졌다고해~
		isPowerOn = true;
	}
	
	void powerOff() {   //전원끄기 
		isPowerOn = false;
	}
	
	//온도조절하기
	
	// 온도up   온도down 
	// 온도세팅()
	// 온도조절(매개변수)
	
	
	void upTemperature() {  //온도 1 올리기  return 없음
		if(temperature < maxTemperature)
			temperature++;
	}
	
	void downTemperature() {
		if(temperature > minTemperature)
			temperature--;
	}
	
	int upTemperature2() {	//온도 1도 올리고 올린값 return
		temperature++;
		return temperature;
	}
	
	int downTemperature2() {
		temperature--;
		return temperature;
	}
	
	boolean upTemperature3() {	//온도 1도 올리고 온도조절 성공 여부 return
		if(temperature<maxTemperature) {
			temperature++;
			return true;
		} else {  //더이상 온도를 올릴수 없다
			return false;
		}
	}
	
	boolean downTemperature3() {
		temperature--;
		return true;
	}
	
	// rfg.setTemprature(20)  -15~8
	void setTemperature(int temperature) {   // (-15)   (5)
		
		if(temperature > maxTemperature)
			temperature = maxTemperature;
		
		if(temperature < minTemperature)
			temperature = minTemperature;
		
		this.temperature = temperature;
	}
	
	//한개로 매개변수를 잘 넘겨
	// controlTemperature(1)  controlTemperature(2)
	// controlTemperature(3) -> 최대온도  controlTemperature(4) -> 최저온도
	void controlTemperature(int flag) {   
		if(flag == 1)
			temperature++;
		else
			temperature--;
	}
	
	// controlTemperature(true)  controlTemperature(false)
	void controlTemperature(boolean isUp) {   
		if(isUp)
			temperature++;
		else
			temperature--;
	}
	
	//  controlTemperature2(-3)  controlTemperature2(2)
	void controlTemperature2(int change) {
		//최대 최저 온도 필터
		temperature += change;
	}
	
}


















