package be_study.quiz;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		
		로직/흐름/순서
		
		조건 -> 처리
		언제까지
		
		- 메뉴 뭐 시켰는가? -> 어떻게 관리 -> 어디에 저장
		- 메뉴 뭐를 몇개 시켰나?  (단일 갯수만 관리 -> 각 메뉴별 갯수 관리
		- 메뉴 금액은 얼마인가? 4000 4500 ... 
		- 메뉴 여러개 뭐가있나? (메뉴명 / 메뉴가격 / 메뉴주문갯수 )
		
		
		
		시작.
		
		메뉴 보여주기.
			-> 메뉴관리 
			-> 어떻게 보여줄까? 
			
		메뉴 선택 입력 받기 (주문받기)
			-> 단순 입력
			-> 잘못 입력된 경우 대처
	
		주문 수량 입력 받기 (몇개 시킬거냐)
			-> 단순 입력
			-> 잘못 입력된 경우 대처
		
		추가 주문 여부 체크 (y/n)
			-> 추가주문 y -> 다시 메뉴 보여주기부터 반복
			-> 추가주문 n -> (메뉴, 수량, 금액) 보여주고 -> 끝내러가기
		
		주문 메뉴별 수량 + 가격
		주문 총금액 보여주기
		
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		//메뉴1 메뉴2 메뉴3
		//수량1 수량2 수량3
		//가격1 가격2 가격3
		
		//배열 활용 버전
		
		String[] menuArr = {"아메리카노", "카페라떼", "바닐라라떼", "카푸치노"}; //메뉴이름
		int[] priceArr = {3500, 4100, 4300, 4600}; //메뉴가격
		int[] countArr = new int[menuArr.length]; //메뉴주문수량
		
		int menu;  //메뉴선택입력
		int count; //수량입력
		String addOrder; //추가주문여부 입력받는 용도
		
		
		while(true) {
			
			
			while(true) {
				//메뉴보여주기
				System.out.println("======메뉴======");
				for(int i=0; i<menuArr.length; i++) {
					System.out.printf("%d. %-8s %7d원\n", (i+1), menuArr[i], priceArr[i]);
				}
				System.out.println("===============");
				
				//메뉴선택
				System.out.print("메뉴 선택 : ");
				menu = scanner.nextInt();
				
				if(menu>=1 && menu<=menuArr.length) {	//정상범위선택
					break;
				} else {
					System.out.println("잘못입력했습니다. 메뉴를 다시 선택해주세요!!");
				}
			}
			//메뉴 선택은 정상적으로 완료했다 ---------보장
			
			//수량선택
			System.out.print("수량 선택 : ");
			count = scanner.nextInt();
			
			countArr[menu-1] += count;  //선택한 메뉴번호-1 위치 인덱스에 수량 추가  
			//1 > 0   4 > 3   10 > 9
				
			//추가주문여부
			scanner.nextLine(); //기존 입력값 엔터 청소용
				
			//끝나면? 주문금액 내역 출력 끝
			
			while(true) {  //y/n 제대로 입력할때까지 계속 시킴
				System.out.print("추가주문 하시겠습니까?(y/n)");
				addOrder = scanner.nextLine();

				// y 나 n 으로 입력했는가?
				if(addOrder.equals("y") || addOrder.equals("n")) {
					break;
				} else {
					System.out.println("잘못입력했습니다. 추가주문여부(y/n) 다시 선택해주세요.");
				}
			}
			
			//if ..  y -> 계속 진행 
			//if ..  n -> 종료 -> 최종내역금액출력
			if(addOrder.equals("n")) {
				//최종 수량 금액 보여주고 종료

				System.out.println("=======================");
				int total = 0;
				for(int i=0; i<menuArr.length; i++){
					if(countArr[i] > 0 ) {
						System.out.printf("%s %d잔 : %d원\n", menuArr[i], countArr[i], countArr[i]*priceArr[i]);
						total = total + countArr[i]*priceArr[i];
					}
				}
				
				//총금액
				System.out.println("====================");
				System.out.println("총액 : " + total);
				
				break;					
			}
			
		}
		
		
		/*
		//개별 각각 변수 처리 + 하드코딩 버전
		
		int menu1Count = 0;
		int menu2Count = 0;
		int menu3Count = 0;
		
		int menu;  //메뉴선택입력
		int count; //수량입력
		String addOrder; //추가주문여부 입력받는 용도
		
		while(true) {
			//메뉴보여주기
			System.out.println("======메뉴======");
			System.out.println("1.아메리카노    3500원");
			System.out.println("2.카페라떼    4100원");
			System.out.println("3.바닐라라떼    4300원");
			System.out.println("===============");
			
			//메뉴선택
			System.out.print("메뉴 선택 : ");
			menu = scanner.nextInt();
			
			if(menu>=1 && menu<=3) {	//정상범위선택
				//정상선택
				
				//수량선택
				System.out.print("수량 선택 : ");
				count = scanner.nextInt();
				
				if(menu == 1) {
					menu1Count += count;
				} else if (menu == 2) {
					menu2Count += count;
				} else { // 1 ~ 3 
					menu3Count += count;
				}
				
				//추가주문여부
				
				scanner.nextLine(); //기존 입력값 엔터 청소용
				
				//끝나면? 주문금액 내역 출력 끝
				
				while(true) {  //y/n 제대로 입력할때까지 계속 시킴
					System.out.print("추가주문 하시겠습니까?(y/n)");
					addOrder = scanner.nextLine();
					

					// y 나 n 으로 입력했는가?
					if(addOrder.equals("y") || addOrder.equals("n")) {
						break;
					} else {
						System.out.println("잘못입력했습니다. 추가주문여부(y/n) 다시 선택해주세요.");
					}
				}
				
				//if ..  y -> 계속 진행 
				//if ..  n -> 종료 -> 최종내역금액출력
				
				if(addOrder.equals("n")) {
					
					//최종 수량 금액 보여주고 종료
					
					System.out.println("=======================");
					if(menu1Count > 0)
						System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*3500);
					
					if(menu2Count > 0)
						System.out.printf("카페라떼 %d잔 : %d원\n", menu2Count, menu2Count*4100);
					
					if(menu3Count > 0)
						System.out.printf("바닐라라떼 %d잔 : %d원\n", menu3Count, menu3Count*4300);
					
					//총금액
					int total = menu1Count*3500 + menu2Count*4100 + menu3Count*4300;
					System.out.println("====================");
					System.out.println("총액 : " + total);
					
					
					break;					
				}
				
				
//				if(addOrder.equals("y")) {
//					continue;
//				} else { //n
//					//최종 마무리
//				}
				
//				if(addOrder.equals("y")) {
//					continue; //다음진행
//				} else if(addOrder.equals("n")) {
//					// 추가없이 종료
//				} else {
//					//잘못입력
//				}
				
				
				
			} else { //메뉴 잘못 선택
				System.out.println("잘못입력했습니다. 메뉴를 다시 선택해주세요!!");
				continue; //밑에 생략
			}
			
			
		}
		 */
	}

}
