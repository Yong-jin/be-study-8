package be_study.quiz.quiz27;

public class JavaCafe {
	public static void main(String[] args) {
		printPay(10.00, 40);	//  400
		printPay(10.00, 50);	//  550
		printPay(7.50, 38);		//  시급에러
		printPay(8.50, 66);		//  근무시간에러
		
		printPay(17, 59);
		printPay(3, 40);
		printPay(50, 80);
	}
	
	// 시급과 일한 시간을 입력받아, 주급을 출력
	public static void printPay(double basePay, int hours) {
		
		// basePay 기본시급 8미만 -> 오류
		// hours  근무시간 60 초과 -> 오류
		
		
		// if 정상
		// else 정상아니면
		
		// 잘못된 경우를 먼저 필터링 하는 구조
		
		if(basePay < 8) {
			System.out.println("최저 시급 에러!");
			return;
		} 
		
		if(hours > 60) {
			System.out.println("초과 근무시간 에러!");
			return;
		}
		
		
		// 앞에서 잘못된 경우 필터링을 통과해서 도착
		// 입력 정상 범위
		
		double pay = 0.0;
		
		/* 해당 메소드를 완성하세요. */
		
		//40시간 까지  시급 * 시간
		//40시간 초과?  ~60     초과한시간(최대20시간) * 기본시급1.5배
		
		if(hours <= 40) {
			pay = basePay * hours;
		} else {  // 1~60    ->  50시간   40*기본 + 10*1.5배
			pay = (basePay * 40) + ( (hours-40) * basePay * 1.5  );
		}
		
		System.out.printf("$ %.2f\n", pay);
	}

}
