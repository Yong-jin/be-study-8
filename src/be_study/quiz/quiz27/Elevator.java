package be_study.quiz.quiz27;

public class Elevator {

	public static void main(String[] args) {
		// 변수 생성
		int a = 13;
		int b = 7;
		int c = 10;
		// 결과 출력
		System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
	}

	public static String guide(int floor) {
		/* 메소드를 완성하시오. 
		 * 
		 * 1~10 : 저층
		 * 11~20 : 고층
		 * */
		
		//1~20 층 입력 필터링....

		//  1 <=   ... <=10
		if(floor >= 11) {
			return "고층";
		} else {
			return "저층";
		}

//		if(floor >= 11) {
//			return "고층";
//		}
//
//		return "저층";
		
		
		
		
		// return 이 보장되지 않아서 잘못되 케이스
//		if(floor >= 11) {
//			return "고층";
//		}
//		
//		if(floor < 11) {
//			return "저층";
//		}
		
		
		
		
		
		
		
	}
}
















