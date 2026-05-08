package be_study.quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//1번. num 값을 확인하여 "양수" "음수" "0" 이라고 출력하도록 코드를 작성하세요.
		int num = 10;
		System.out.println( _______);
		*/
		int num = 10;
		System.out.println( num < 0 ? "음수" : (num == 0 ? "0" : "양수") );
		
		
		/*
		//2번. 아래와 같이 프로그램이 진행되면서 숫자 2개를 입력받고 각각의 결과를 출력하세요.
		// ㅇ 모양은 사용자가 입력한 숫자와 계산된 결과입니다.
		// 나누기 결과는 소수점을 포함하여 나타나도록 해주세요.
		첫번째 숫자를 입력하세요 : ㅇ
		입력한 숫자=ㅇ
		두번째 숫자를 입력하세요 : ㅇ
		입력한 숫자=ㅇ

		더하기 : ㅇ+ㅇ=ㅇ
		뺴기 : ㅇ-ㅇ=ㅇ
		곱하기 : ㅇ*ㅇ=ㅇ
		나누기 : ㅇ/ㅇ=ㅇ
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = scanner.nextInt();
		System.out.println("입력한 숫자=" + num1);
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = scanner.nextInt();
		System.out.println("입력한 숫자=" + num2);
		
		int sum = num1 + num2;
		System.out.println("더하기 : " + num1 + "+" + num2 + "=" + (num1+num2) );
		System.out.printf("빼기: %3d-%3d=%3d\n", num1, num2, (num1-num2));
		System.out.printf("곱하기: %3d*%3d=%3d\n", num1, num2, (num1*num2));
		System.out.printf("나누기: %d/%d=%.2f\n", num1, num2, ((double)num1/num2));

		System.out.println("나누기 : " + num1 + "/" + num2 + "=" + ((double)num1/num2) );
		
	}

}
