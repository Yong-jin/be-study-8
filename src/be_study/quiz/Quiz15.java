package be_study.quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
	
		String[] menuArr = {"입력", "수정", "조회", "삭제", "종료"};
		
		int menu = 0;
		
		//while( menu != 5 ) {
		while(true) {
		
			//메뉴표시 
			for(int i=0; i<menuArr.length; i++) {  
				//index   i: 0 1 2 3 4
				//      순번:  1 2 3 4 5 
				//System.out.println( (i+1) + ". " + menuArr[i] );
				System.out.printf("%d. %s\n", (i+1), menuArr[i]);
			}
			
			//메뉴 입력
			System.out.print("메뉴 번호를 입력하세요 : ");
			menu = scanner.nextInt();   //4번 선택 -> index 3
			
			//메뉴 선택에 대한 처리
			if(menu >= 1 && menu <= 4) {
				System.out.println( menuArr[menu-1] +  " 메뉴입니다.");
			} else if (menu == 5) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			} else {
				System.out.println("잘못 입력 했습니다.");
			}
			System.out.println("--------------------");
			
//			if(menu == 5)
//				break;
			
		}
	
		/*
		while( menu != 5 ) {
			
			//메뉴 표시
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("5. 종료");
			
			//메뉴 입력
			System.out.print("메뉴 번호를 입력하세요 : ");
			menu = scanner.nextInt();
			
			//메뉴 선택에 대한 처리
			if(menu == 1) {
				System.out.println("입력 메뉴입니다.");
			} else if (menu == 2) {
				System.out.println("수정 메뉴입니다.");
			} else if (menu == 3) {
				System.out.println("조회 메뉴입니다.");
			} else if (menu == 4) {
				System.out.println("삭제 메뉴입니다.");
			} else if (menu == 5) {
				System.out.println("프로그램이 종료됩니다.");
			} else {
				System.out.println("잘못 입력 했습니다.");
			}
			
			
			//사전에 정상범위 입력 체크
			if( menu >= 1 && menu <= 5) {
				if(menu == 1) {
					System.out.println("입력 메뉴입니다.");
				} else if (menu == 2) {
					System.out.println("수정 메뉴입니다.");
				} else if (menu == 3) {
					System.out.println("조회 메뉴입니다.");
				} else if (menu == 4) {
					System.out.println("삭제 메뉴입니다.");
				} else {  //menu == 5 
					System.out.println("프로그램이 종료됩니다.");
				}
			} else {
				System.out.println("잘못 입력 했습니다.");
			}
			
			
			switch(menu) {
			case 1:
				System.out.println("입력 메뉴입니다.");
				break;
			case 2:
				System.out.println("수정 메뉴입니다.");
				break;
			case 3:
				System.out.println("조회 메뉴입니다.");
				break;
			case 4:
				System.out.println("삭제 메뉴입니다.");
				break;
			case 5:
				System.out.println("프로그램이 종료됩니다.");
				break;
			default:
				System.out.println("잘못 입력 했습니다.");
			}
			
			System.out.println();
		}
		*/
		
	}
	
	
	
	
	
	
	
	
	
}
