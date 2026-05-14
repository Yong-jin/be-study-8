package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
//		1.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		몇번째 수인가요? : 그에 해당하는 수를 출력
//		ex) 10 20 30 50 90
//		몇번째 수인가요? 5
//		결과 : 90

		
		/*
		//int[] arr = {10, 20, 30, 50, 90};
		
		int[] arr = new int[5];  //5개 정수형 int 배열 선언
		
//		int n;
//		n = scanner.nextInt();
//		System.out.print("첫번째 숫자를 입력하세요 : ");
//		arr[0] = scanner.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 : ");
//		arr[1] = scanner.nextInt();
//		System.out.print("3번째 숫자를 입력하세요 : ");
//		arr[2] = scanner.nextInt();
//		System.out.print("4번째 숫자를 입력하세요 : ");
//		arr[3] = scanner.nextInt();
//		System.out.print("5번째 숫자를 입력하세요 : ");
//		arr[4] = scanner.nextInt();
		
		System.out.print("5개 정수 입력하세요~ : ");
//		arr[0] = scanner.nextInt();
//		arr[1] = scanner.nextInt();
//		arr[2] = scanner.nextInt();
//		arr[3] = scanner.nextInt();
//		arr[4] = scanner.nextInt();
		
		//index 0 ~ 4
		for(int i=0; i<5; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.print("몇번째 수인가요? : ");
		int num = scanner.nextInt();
		
		//순서 	: 1 2 3 4 5 
		//index : 0 1 2 3 4 
		
		//index = 입력을 받은 순서 - 1
		System.out.println("결과 : " + arr[num-1]);
		
		*/
		
		/*
		//배열 없이
		System.out.println("숫자 정수 5개 입력하세요~");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int n4 = scanner.nextInt();
		int n5 = scanner.nextInt();
		
		System.out.print("몇번째 수인가요? : ");
		int num = scanner.nextInt();
		
		if(num == 1) {
			System.out.println("결과 : " + n1);
		} else if (num==2) {
			System.out.println("결과 : " + n2);
		} else if (num==3) {
			System.out.println("결과 : " + n3);
		} else if (num==4) {
			System.out.println("결과 : " + n4);
		} else if (num==5) {
			System.out.println("결과 : " + n5);
		} else {
			System.out.println("몇번째 잘못입력함.");
		}
//		} else {
//			System.out.println("결과 : " + n5);
//		}
		*/
		
		
		
		
//		2.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		받은후에 순서를 거꾸로 출력하세요.
//		ex) 1 2 3 4 5
//		결과 : 5 4 3 2 1
		
		/*
		
		// 입력 1 2 3 4 5 				입력 5 4 3 2 1 
		// 출력 5					앞에서부터 출력 5 4 3 2 1
		// 출력   4
		// 출력     3
		// 출력       2
		// 출력         1
		
		int[] arr = new int[5];
		System.out.print("5개 정수 입력하세요~ : ");
		
		for(int i=0; i<5; i++) {   // i: 0 1 2 3 4 
			arr[i] = scanner.nextInt();  
		}
		// ㅁ ㅁ ㅁ ㅁ ㅁ 
		
		//반대로 출력  i: 4 3 2 1 0
		for(int i=4; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.print("5개 정수 입력하세요~ : ");
		//반대로 뒤에서 부터 입력 저장
		for(int i=4; i>=0; i--) {
			arr[i] = scanner.nextInt();  
		}
		
		//출력할때 그대로
		for(int i=0; i<5; i++) {   // i: 0 1 2 3 4 
			System.out.print(arr[i] + " ");
		}
		*/
		
//		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
//		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
//		1   2  3  4
//		5   6  7  8
//		9  10 11 12
//		13 14 15 16
		
		int[][] arr = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
		
		//값 저장
		int n = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				// i  : 0       1       2       3
				// j  : 0 1 2 3 0 1 2 3 0 1 2 3 0 1 2 3
				// 값 : 1 2 3 4 5 6 7 8 .....     14 15 16
				 
				//별도의 저장용 값을 사용 +1 증가시키면서...
				arr[i][j] = n;
				//n++;
				n = n + 1;
//				arr[i][j] = (i*4) + (j+1);  //i j 를 활용하여 수식 형태
			}
		}
		
		//값 출력
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			
			System.out.println();
		}
		
		
	}

}
