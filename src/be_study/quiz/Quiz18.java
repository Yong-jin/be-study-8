package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*

		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*****
		****
		***
		**
		*

		
		첫i반복문  라인(행)수 1 2 3 4 5   5회 반복
		j반복문  별출력 갯수  5 4 3 2 1   5회 4회 3회 ... 1회 

		*/
		
		/*
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {  //6-i : 5 4 3 2 1 
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {  
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) { //5행 반복  0 1 2 3 4
			for(int j=1; j<=5-i; j++) {  
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) { 
			for(int j=i+1; j<=5; j++) {  
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5; i>=1; i--) { 
			for(int j=1; j<=i; j++) {  
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5; i>=1; i--) { 
			for(int j=5; j>5-i; j--) {  
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*
		**
		***
		****
		
		*/
		
		/*
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		/*
		3. 입력된 수의 약수를 출력하시오.
		ex) 입력 : 6
		1 2 3 6
		
		6의약수
		1 2 3 6
		
		8의 약수
		1 2 4 8 
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			if( n%i == 0 ) {  //입력받은수, 약수를 구하려는 대상 수 -> n
				// i로 나누어떨어지면   i: 1 2 3 4.... n
				// 나머지 연산 후 나누어 떨어지면 약수
				System.out.print(i + " ");
			}
		}
		*/
		
		/*
		
		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		숫자를 입력받고 아래 문양으로 * 출력하기
		ex) 입력 : 5
		*
		**
		***
		****
		*****
		****
		***
		**
		*
		
		입력 : 3
		
		*
		**
		***
		**
		*
		
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = scanner.nextInt();
		
		
		System.out.println("-----------------");
		for(int i=1; i<=(n-1); i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<n; i++) { 
			for(int j=i+1; j<=n; j++) {  
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		
		5. 1+ (1+2)+ (1+2+3) + (1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		
		
		1 +
		(1+2)+ 
		(1+2+3) + 
		(1+2+3+4)+
		(1+2+3+4+5)+
		...+
		...+
		(1+2+3+4+5+6+7+8+9)
		(1+2+3+4+5+6+7+8+9+10)
		
		*/
		
		/*
		int sum = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) { 
				// j: 1     1 2    1 2 3     1 2 3 4  .... 
				sum = sum + j;
			}
		}
		System.out.println("누적된 총합 : " + sum);
		
		sum = 0;
		int currentSum = 0;
		for(int i=1; i<=10; i++) {	
			// i: 1 -> 2 -> 3
			//currentSum : 0 -> 1 -> 3 -> 6
			//sum : 0 -> 1 -> 4 -> 10
			currentSum = currentSum + i;  // 0+1	1+2		3+3
			sum = sum + currentSum; // 0+1	1+3		4+6
		}
		System.out.println("누적된 총합 : " + sum);
		*/
		
		
		/*
	 	1 * 10
	 	2 * 9
	 	3 * 8
	 	...
	 	10 * 1
	 */
		
		/*
		sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum = sum + (i * (10 - (i-1)));
			//			 1 *  10    (1-1)
			//			 2 *  9
			//			 3 *  (10 - (3-1)) -> 8
		}
		System.out.println("누적된 총합 : " + sum);
		*/
		
		/*
		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		 
		 1-2+3-4+... >= 100  이 시점에 멈추기! 마지막 더한값
		 
		 */
		
		int i=1; 
		int total = 0;
		
		while(true) {
			
			if(i%2 == 0) {  //짝수
				total = total - i;   //    + (   ) ? -i : i 
			} else { //홀수
				total = total + i;
			}
			
			if(total >= 100) {
				break;
			}
			
			i++;
		}
		
		System.out.println("100이 넘은 시점에 누적합 : " + total);
		System.out.println("얼마까지 계산했는가? : " + i);
		
		// 2개 셋트     1-2
		// 1-2 -> -1
		// 3-4 -> -1
		// 5-6 -> -1 
		
		// 198 -> 99개세트 -> -99 + 199 -> 100
		// 200 -> -100
		
		
		
		
		i=0;  //시작을 0
		total = 0;
		while(true) {
			i++; // 0 -> 1 로 바뀌면서 1부터 연산에 참여
			
			if(i%2 == 0) {  //짝수
				total = total - i;   //    + (   ) ? -i : i 
			} else { //홀수
				total = total + i;
			}
			
			if(total >= 100) {
				break;
			}
			
		}
		
		System.out.println("100이 넘은 시점에 누적합 : " + total);
		System.out.println("얼마까지 계산했는가? : " + i);
		
		
		
		total = 0;
		for(i=1; total<100; i++) {
			if(i%2 == 0) {  //짝수
				total = total - i;   //    + (   ) ? -i : i 
			} else { //홀수
				total = total + i;
			}
		}
		//i--;
		
		
		System.out.println("100이 넘은 시점에 누적합 : " + total);
		System.out.println("얼마까지 계산했는가? : " + (i-1));
	}

}









