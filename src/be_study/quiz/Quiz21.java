package be_study.quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		//TODO Auto-generated method stub

		
		/*
		 * 
		1.
		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
		모든 경우의 수를 출력하는 프로그램을 작성하시오.
		
		주사위1 : 1~6
		주사위2 : 1~6
		*/
		
//		int count = 0;
//		for(int i=1; i<=6; i++) { //주사위1 : 1~6
//			for(int j=1; j<=6; j++) { //주사위2 : 1~6
//				if(i+j == 6) {
//					System.out.printf("[%d, %d]\n", i, j);
//					count++;
//				}
//			}
//		}
//		System.out.println("총 경우의 수는 : " + count);
		
		
		
		
		
		/*
		2.
		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
		1) Math.random() 활용
		2) int[] lotto = new int[6]; 활용


		6개모으기
		-> 일단 6개 전부 랜덤으로 다 뽑기 -> 중복이있다? -> 다시 다 뽑아
		
		6개를 1개씩 중복 체크하면서 순서대로 뽑기
		-> 하나 뽑기
			-> 지금 하나 뽑은게 기존에 중복되는 수가 있나? -> 다시 뽑기
			-> 중복되는게 없다? -> 저장하고 다음 숫자 뽑기
		-> 언제까지? 6개 다 뽑을때까지
		-> 지금 몇개까지 뽑은 상태지? -> 관리 (별도의 변수로..기록/저장)
		
		
		0	0	0	0	0	0
		20  30	21	35	11	6
		*/
		
		int[] lotto = new int[6];  //6개의 서로 다른 수   index: 0 1 2 3 4 5
		int index = 0;  // 0
		boolean isDuplicated = false; //중복여부
		
		//while문 활용
		//흐름 그대로 코드화
		while(true) {
			
			//랜덤값 뽑기 1~45
			int value = (int)(Math.random()*45) + 1;
			
			//기존에 뽑힌거 중복있는지 체크
			isDuplicated = false; //중복체크여부값 초기화
			
			for(int i=0; i<index; i++) {
				if(lotto[i] == value) {  //기존 뽑힌 칸에 지금 뽑은 value 와 같은 값이 있나?
					isDuplicated = true;
					break;
				}
			}
			
			//중복여부
			//중복이 있으면?
			//중복이 없으면?
			
//			if(isDuplicated) { //중복있음
//				continue;
//			} else {  //중복없음
//				lotto[index] = value;  //지금뽑은거 index칸에 저장
//				index++;
//			}
			
			
//			if(isDuplicated) { //중복있음
//				continue;
//			}
//			
//			lotto[index] = value;  //지금뽑은거 index칸에 저장
//			index++;
			
			if(isDuplicated == false) {
				lotto[index] = value;  
				index++;
			}
			//index: 0 1 2 3 4 5 | 6
			
			//6개 다 채우면 종료
			if(index == 6) { //6개 숫자 다채움!
				break; 
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		
		
		//for문 활용
		
		//단순 랜덤값 순서대로 1회 저장 -> 중복 발생
//		for(int i=0; i<lotto.length; i++) {
//			lotto[i] = (int)(Math.random()*45) + 1;
//		}
		
		lotto = new int[6]; // 0 0 0 0 0 0
		
		
		for(int i=0; i<lotto.length; i++) {  // 0 1 2 3 4 5   ~6번 
			
			//값 뽑기
			lotto[i] = (int)(Math.random()*45) + 1;
			
			//중복체크
			for(int j=0; j<i; j++) {  //앞에서부터 j가 현재 뽑는 인덱스(i) 위치전까지 비교
				if(lotto[i] == lotto[j]) { //중복이 있다?
					i--; //동일 위치에 다시 뽑아서 저장되도록 -1 처리 -> 반복문 올라가면서 +1 되는거 상쇄
					break;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		
		/*
		
		3.
		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
		(*가능한 효율적인 구조를 생각해보세요)
		
		ex)
		1반 : 10 10 10 10 10
		2반 : 20 20 20 20 20
		3반 : 30 30 30 30 30
		
		1반 평균 : 10
		2반 평균 : 20
		3반 평균 : 30
		전체 평균 : 20


		개별 15개?
		//int score11, score12, score13
		
		각반별 점수
		1반[5]
		2반[5]
		3반[5]
		
		
		전체 반 + 점수 통합 
		전체반점수[3][5]
		
		i:0		1반	ㅁㅁㅁㅁㅁ
		i:1		2반	ㅁㅁㅁㅁㅁ
		i:2		3반	ㅁㅁㅁㅁㅁ
		
		 */
		/*
		Scanner scanner = new Scanner(System.in);
		
		int[][] scoreArr = new int[3][5];
		
		for(int i=0; i<scoreArr.length; i++) {
			System.out.print( (i+1) + "반 : " );
			for(int j=0; j<scoreArr[i].length; j++) {
				scoreArr[i][j] = scanner.nextInt();
			}
		}
		
		//각반별 총합점수  classSum[3]
		//각반별 평균점수  classAvg[3]
		
		int total = 0;
		int classTotal = 0;
		
		for(int i=0; i<scoreArr.length; i++) {  //반 단위로 반복 1반 2반 3반
 			
			classTotal = 0; 
			for(int j=0; j<scoreArr[i].length; j++) {  //반 내부 반복  5명 반복 
				classTotal = classTotal + scoreArr[i][j];
			}
			
			//classTotal 해당 반의 총합 점수
			total += classTotal;
			System.out.println((i+1) + "반 평균 : " + (classTotal/5.0));
		}
		
		//total 전체반 점수 총합
		
		System.out.println("전체 평균 : " + (total/15.0));
		
		
		*/
		
		/*
		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
		
		ex)
		int[][] arr =
		{
		{10, 20, 30},
		{20, 30, 40},
		{30, 40, 50}
		};
		이 주어지는 경우 최종 결과는
		10 20 30 60
		20 30 40 90
		30 40 50 120
		60 90 120 270
		
		0 0 0 0
		0 0 0 0
		0 0 0 0
		0 0 0 0
		
		각행의 마지막 열 인덱스 3  -> 누적 합
		각열의 마지막 행 인덱스 3 -> 누적 합
		전체 마지막 행/열 인덱스 3 3 -> 누적 합
		*/
		System.out.println();
		
		int[][] arr =	{
							{10, 20, 30},
							{20, 30, 40},
							{30, 40, 50}
						};  //33
		
		
		int[][] newArr = new int[4][4];  // [arr.length + 1][arr[0].length + 1]  
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				newArr[i][j] = arr[i][j]; //원래 위치 복사
				
				newArr[i][3] += arr[i][j]; //본인 행의 마지막 열 덧셈
				newArr[3][j] += arr[i][j]; //본인 열의 마지막 행 덧셈
				newArr[3][3] += arr[i][j]; //전체 제일 마지막 행/열 덧셈
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%4d", newArr[i][j]);
			}
			System.out.println();
		}
	}

}



















