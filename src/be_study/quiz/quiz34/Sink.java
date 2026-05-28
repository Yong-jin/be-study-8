package be_study.quiz.quiz34;

public class Sink {

//	싱크대
//	- 가로, 세로, 깊이 사이즈
//	- 색상
//	- 재질
	
	int width;  //double 12.5cm  1250  125mm
	int height; //가로 세로 깊이
	int depth; 
	String color; //컬러
	String material; //재질
	
	int getWidth() {  //mm 기준
		return width;
	}
	
	double getWidthAsCm() {  //cm 변환 반환
		return width/10.0;   // 205mm -> 20.5cm
	}
	
	double getWidthAsMeter() {  //M단위로 변환 반환
		return width / 100.0; //205mm -> 0.205m   1200mm -> 1.2m
	}  
}

