package be_study.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
			1.
			2x + 4y = 10 이 만족하는
			모든 x, y 쌍을 구하시오.
			(x와 y는 자연수 1~10)
			
			2x + 4y = 10
			x:1 y:2
			2*1 + 4*2 = 10
			
			x:3 y:1
			2*3 + 4*1 = 10
			
			x:1~10
			y:1~10
			
			x:1				   2  				.... 10
			y:1 2 3 4 .. 9 10  1 2 3 4 ... 9 10
*/
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(2*x + 4*y == 10) {
					System.out.printf("(x:%d y:%d)\n", x, y );
				}
			}
		}
		
		//x:1 y:2 -> 10
		//x:1 y:3 -> 14
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				
				if(2*x + 4*y > 10) {
					break;
				}
				
				if(2*x + 4*y == 10) {
					System.out.printf("(x:%d y:%d)\n", x, y );
				}
			}
		}
			
		// x: 1 ~ 10
		// y: 1 ~ 10
		//2x + 4y = 10
		// 2x
		// x:1 -> 2
		// x:2 -> 4
		// x:3 -> 6
		// ...
		// x:5 -> 10
		// x:6 -> 12 
		
		for(int x=1; 2*x<10; x++) {
			for(int y=1; 4*y<10; y++) {
				
				if(2*x + 4*y == 10) {
					System.out.printf("(x:%d y:%d)\n", x, y );
				}
			}
		}
		
		
		/*
			2.
			정수 2개를 입력 받아서,
			아래 계산 결과를 출력하시오.
			큰수 - 작은수
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.print("숫자 2개 입력하세요 : ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		if( n1 > n2 ) {  //n1 더 크다
			System.out.printf("%d - %d = %d\n", n1, n2, (n1-n2) );
		} else {  //n1이 더 크지 않다.  n2 가 더 크거나 같다
			System.out.printf("%d - %d = %d\n", n2, n1, (n2-n1) );
		}
		*/
		
		
		/*
		
			3.
			윷놀이 게임
			4개의 윷을 입력받고 결과를 출력하시오.
			(뒷도는 없습니다!)
			0 : 안 뒤집어진 상태
			1 : 뒤집어진 상태
			ex) 입력 0 0 1 0
			결과 도
			입력 0 1 0 1
			결과 개
			
			뒤집어진 윷의 갯수
			1 도     1 0 0 0   |  0 1 0 0 |  0 0 1 0 | 0 0 0 1
			2 개     1 1 0 0   |  1 0 1 0 |  1 0 0 1 | ...
			3 걸
			4 윷 	1 1 1 1
			0 모     0 0 0 0
			
			
		*/
		
		System.out.print("윷 4개 입력 (0 or 1) 1이 뒤집어진거 : ");
//		int n1, n2, n3, n4;
//		n1 = scanner.nextInt();
//		n2 = scanner.nextInt();
//		n3 = scanner.nextInt();
//		n4 = scanner.nextInt();
		
		//int count = n1 + n2 + n3 + n4; //뒤집어진 갯수
		int count = 0;
		
		int[] arr = new int[4];
		for(int i=0; i<4; i++) {
			arr[i] = scanner.nextInt();
			count = count + arr[i]; // +0 1
//			if(arr[i] == 1) {
//				count++;
//			}
		}
		
//		for(int i=0; i<4; i++) {
//			count = count + scanner.nextInt();
//		}
		
//		if( (n1==1 && n2==0 && n3==0 && n4 == 0) ||  
//				(n1==0 && n2==1 && n3==0 && n4 == 0) ||
//				(n1==0 && n2==0 && n3==1 && n4 == 0) ||
//				(n1==0 && n2==0 && n3==0 && n4 == 1) ) {}
		
		/*
			0 0 1 1 => 2
			1 1 0 0 => 2
			1 0 0 1 => 2
			
			뒤집어진 갯수의 총합 -> 몇개 뒤집어졌다 판별
		 */
		
		String[] yutText = {"모", "도", "개", "걸", "윷"};
		System.out.println(yutText[count]);
		
		switch(count) {
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3: 
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		//case 0:  //모
		default:
			System.out.println("모");
			break;
		//default: 잘못입력...
		}
		
		
		
		
		/*
			4. 입력받은 수 만큼 별 출력하기
			ex) 4
			****
			5
			*****
		*/
		
		
//		int n = scanner.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			System.out.print("*");
//		}
		
	}

}
