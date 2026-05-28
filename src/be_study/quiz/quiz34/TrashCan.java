package be_study.quiz.quiz34;

public class TrashCan {

//	쓰레기통
//	(*주방에 여러개가 있다)
//	- 몇리터
//	- 색상
//	- 용량이 몇퍼센트나 찼는지
//	- 쓰레기를 채운다
//	- 쓰레기통을 연다
//	- 쓰레기통을 닫는다
//	- 쓰레기통을 비운다
	
	int liter; // 최대용량 20L   50L 
	String color; 
	int trashPercentage; //몇퍼센트 찼는가?

	boolean isCoverOpened;
	
//	- 쓰레기통을 연다
	void openCover() {
		isCoverOpened = true;
	}
//	- 쓰레기통을 닫는다
	void closeCover() {
		isCoverOpened = false;		
	}
	
//	- 쓰레기를 채운다
	
	// 몇 퍼센트만큼 채운다?
	// 얼만큼 쓰레기 양으로 채운다?
	// set
	// add insert
	void setTrashPercentage(int trashPercentage) {  // 30%  40%
		this.trashPercentage = trashPercentage; 
	}
	
	void insertTrash(int addPercentage) {  // +10%
		trashPercentage += addPercentage;
	}
	
	// 리터단위 추가   5L  3L
	void insertTrashLiter(int trashLiter) {  
		
		// (현재 리터 + trashLiter ) / liter  -> 0.3 0.5 0.05
		// 계산결과 -> %단위로 변환   
		// 0.3 * 100 = 30% 
		// (10L + 5L) / 50L = 0.3  * 100 -> 30  % 
	}
	
	//	- 쓰레기통을 비운다
	void cleanTrash() {
		this.trashPercentage = 0; //쓰레기 비워서 채워진 용량이 0
	}
	
	
	
	
	
	
	
	
}





















