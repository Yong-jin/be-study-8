package be_study.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		1. 아래 1), 2) 에 맞게 풀이.
		int x = 10;
		int y = 4;
		___result = ___x/y;
		System.out.println(result);
		
		1) 결과가 2가 나오도록 작성하세요
		2) 결과가 2.5가 나오도록 작성하세요
		
		*/
		
		//1) 결과가 2가 나오도록 작성하세요 
		
		int x = 10;    //10/4 = 2.5    2
		int y = 4;
		int result11 = x/y;
		System.out.println(result11);
		
		double result12 = (double)x/y;  // 2.5
		System.out.println(result12);
		
		
		
		/*
		2. 결과가 7.5가 나오도록 작성하세요
		double a = 3.5;
		double b = 4.7;
		double result = _______________;
		System.out.println(result);
		*/
		
		double a = 3.5;   		// 3.5 + 4.7 = 8.2
		double b = 4.7;			// 3.5 + 4 = 7.5
		double result = a + (int)b;  //4.7 -> .7 날리고 4				
		System.out.println(result);
		
		
		/*
		
		3. 계산결과가 12가 나오도록 작성하세요
		String a = "3.4";
		String b = "4";
		______ result = ________;
		System.out.println(result);
		
		----------------------------------------------------
		*/
		
		String a3 = "3.4";  // 3.4 * 4 = 13.6  ->  13
		String b3 = "4";    // 3 * 4 = 12
		
		// 문자열 -> 숫자형
		// 정수형 문자열
		// 실수형 문자열
		
		// 3 + 3 + 3+ 3
		// 4 + 4 + 4 
		double c3 = Double.parseDouble(a3);
		int d3 = (int)c3;
		
		int result3 = (int)Double.parseDouble(a3)  * Integer.parseInt(b3);
		//										3	 * 4
		System.out.println(result3);
		
		
		/*
		
		4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
		String a = "10";
		int b = 3;
		double c = 4.5;
		_____ result = _______;
		System.out.println(result);
		
		*/
		String a4 = "10";		// 10 * 10 *  10 => 1000 + 13 = 1013
		int b4 = 3;				// 3 * 4.5 = 13.5 -> 13
		double c4 = 4.5;		// 3 * 4 = 12  + 1 
					//	"10" +  13  -> "1013"
		String result4 =  a4 + (int)(b4 * c4);  // "1013"
		System.out.println(result4);
		
		
		/*
		
		5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
		int a = 4;
		double b = 3.4;
		String c = "6.8";
		_____ result = _______;
		System.out.println(result);
		
		*/
		
		int a5 = 4;			// 4 * 6 = 24  + "3" -> "243" 
		double b5 = 3.4;
		String c5 = "6.8";
		String result5 = (a5 * (int)Double.parseDouble(c5) )  +  String.valueOf( (int)b5 );
		//						"6.8" -> 6.8 -> 6						3 -> "3"
		//                4*6 -> 24
		
		result5 = "" + (a5 * (int)Double.parseDouble(c5) )  +  (int)b5;
		
		System.out.println(result5);
		
		/*
		
		6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
		int x = 111;
		int y = 13;
		int result = _____;
		System.out.println(result);
		
		1) 출력결과 : 7
		2) 출력결과 : 8
		*/
		
		int x6 = 111;      
		int y6 = 13;
		int result61 = x6 % y6;
		result61 = x6 - (y6 * (x6/y6));
		
		System.out.println(result61);
		
		int result62 = x6 / y6 ;
		System.out.println(result62);
	}

}
