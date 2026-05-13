package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
//		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		
		// 입력받기
		// 홀수 or 짝수 구분!   1 2 3 4 5 6   
		// 2의 배수 -> 2로 나누어떨어진다 -> 숫자%2==0 -> 짝수
		// 숫자%2!=0 -> 홀수  숫자%2==1
		
		/*
		System.out.print("숫자 정수 입력하세요 : ");
		int num1 = scanner.nextInt();
		
		// num1%2 == 0   짝
		// num1%2 == 1   홀
		// num1%2 != 0   홀
		// num1%2 != 1   짝
		
		if( num1%2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		*/
//		
//		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		/*
		System.out.print("숫자 정수 입력하세요 : ");
		int num2 = scanner.nextInt();
		
		if( num2%7 == 0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("아닙니다");
		}
		*/
		
//		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		
		/*
		int sum = 0;
		for(int i=1; i<=1000; i++) {  // i:1~1000
			if(i%5 == 0) {  // 5 10 15 20 .... 995 1000
				sum = sum + i;
			}
		}
		System.out.println("1~1000 까지의 수 중에서 5의 배수의 합 : " + sum);
		
		sum = 0;
		for(int i=1; i<=1000; i++) {  // i:1~1000
			if(i%5 != 0) {  
				continue;
			}
			
			sum = sum + i;
		}
		System.out.println("1~1000 까지의 수 중에서 5의 배수의 합 : " + sum);
		
		sum = 0;
		for(int i=5; i<=1000; i=i+5) { //i: 5 10 15 20 ...
			sum += i;
		}
		System.out.println("1~1000 까지의 수 중에서 5의 배수의 합 : " + sum);
		*/
		
//		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//		ex) 입력 : 10
//		결과 : **********
		
		/* 
		 10   "*"
		 
		 5 *****
		 3 ***
		 
		 10 "*" + "*" + "*" + "*" ....
		 
		 */
		
		/*
		System.out.print("1~50 까지의 수를 입력 : ");
		int num4 = scanner.nextInt();
		
		String s = "";
		
		//if( num4 >= 1 && num4 <= 50) 
		
		for(int i=1; i<=num4; i++) {
			//s = s + "*";
			System.out.print("*");
		}
		System.out.println();
		
		*/
		//while
		
//		if(num4==1) { System.out.println("*"); }
//		if(num4==2) { System.out.println("**"); }
//		if(num4==3) { System.out.println("***"); }
//		//.....
//		if(num4==50) { System.out.println("*********************************************"); }
		

//		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
//		ex) 1 - 2 + 3 - 4 .....

		/*
		int sum = 0;
		for(int i=1; i<=10; i++) {  // i: 1~10
			//짝수 홀수 분별
			
			if(i%2 == 0) { //짝수
				sum = sum - i;	
			} else { //홀수
				sum = sum + i;
			}
			
			//sum = sum + (i%2==0 ? -i : i);
		}
		
		System.out.println("최종 결과 :  " + sum);
		*/
		
//		6. 정수를 1부터(1+2+3+4.....) 계속 누적으로 더한다. 
//		이런 패턴으로 누적으로 더해진 누적 값이 1000 보다 작으면 계속 더하고
//		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		
		// 1+2+3+4+5+7+...
		//   3 6 10 15 22 30 ....
		
		/*
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			
			//sum:990  + 45  -> 1035
			//i:45 46
			if(sum < 1000) {
				sum = sum + i;  //990+45 = 1035
			} else {
				break;
			}
			
//			sum = sum + i;
//			if(sum > 1000) {
//				break;
//			}
		}
		// 1+2+3....+44+45 
		System.out.println("1000이 넘어간 시점에 누적 합 : " + sum);
		
		sum = 0;
		int i = 1;
		
		while(sum < 1000) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println("1000이 넘어간 시점에 누적 합 : " + sum);
		
		sum = 0;
		i = 1;
		while(true) {
			sum = sum + i;
			i = i + 1;
			
			if(sum >= 1000) {  
				break;
			}
		}
		System.out.println("1000이 넘어간 시점에 누적 합 : " + sum);
		
		
		
		sum = 0;
		for(i=1; true; i++) {  //i=1 i....    j=1. j.. k=1 k..
			if(sum < 1000) {
				sum = sum + i; 
			} else {
				break;
			}
		}
		System.out.println("1000이 넘어간 시점에 누적 합 : " + sum);
		
		
		sum = 0;
		for(i=1; sum < 1000; i++) {  
			sum = sum + i; 
		}
		System.out.println("1000이 넘어간 시점에 누적 합 : " + sum);
		
		*/
		
//		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
//		ex) 입력 3
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		...
//		3 * 9 = 27
		
		// 입력한 숫자 * 1
		// 입력한 숫자 * 2
		// 입력한 숫자 * 3
		// ...
		// 입력한 숫자 * 9
		
		System.out.print("1~9까지 중 보고싶은 구구단은? : ");
		int num = scanner.nextInt();
		
		for(int j=1; j<=9; j++) {
			//j : 1 2 3 4 5 6 7 8 9
			System.out.printf("%3d * %3d = %3d\n", num, j, (num*j) );
			//입력한숫자 * j = 곱한결과
		}
	}

}

