package be_study.quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		
		/*
		System.out.print("삼각형의 밑변 입력 : ");
		int width1 = scanner.nextInt();
		
		System.out.print("삼각형의 높이 입력 : ");
		int height1 = scanner.nextInt();
		
		//넓이 계산 -> 출력
		System.out.println("삼각형의 넓이는 : " + ((double)width1*height1/2));
		System.out.println("삼각형의 넓이는 : " + (width1*height1/2.0));
		*/

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		
		/*
		System.out.print("사다리꼴의 윗변 입력 : ");
		int top = scanner.nextInt();
		
		System.out.print("사다리꼴의 밑변 입력 : ");
		int width2 = scanner.nextInt();
		
		System.out.print("사다리꼴의 높이 입력 : ");
		int height2 = scanner.nextInt();

		
		System.out.println("사다리꼴의 넓이는 : " + ((double)(top+width2)*height2/2));
		*/
		
		
		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.

		//  나누기 / 나머지 % 
//		int student = 24;
//		int snack = 100;
//		System.out.println("한명당 받는 과자 수 : " + (snack / student));
//		System.out.println("남는 과자 수 : " + (snack % student));

		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		
		/*
		System.out.print("세자리의 정수를 입력하세요 : ");
		int num = scanner.nextInt();
		
		//   /  %
		
		// 158
		// 158 / 100 = 1.58 -> 1
		// 158 / 10  = 15.8 -> 15    --> 15 % 10 = 5
		// 158 % 100 = 58			 --> 58 / 10 = 5.8 -> 5
		// 158 % 10  = 8 
		System.out.println("백의자리 : " + (num/100));
		System.out.println("십의자리 : " + (num/10%10));
		System.out.println("십의자리 : " + (num%100/10));
		System.out.println("일의자리 : " + (num%10));
		
		// 914  / 100 = 9.14 -> 9
		// 914  % 10  = 4 
		*/
		

		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		//x와 y를 바꾼 작업
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println("x="+x+ " y="+y);
	}

}
