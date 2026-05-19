package be_study.quiz;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
/*
		엘리베이터
		
		스마트 엘리베이터 시스템을 제작하려고 합니다.
		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
		(반복문, 조건문, 배열 최대한 사용하시면 됩니다. )
		
		- 기본 문제
		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다.
		(오로지 한번에 100층까지 쭉)
		(100층을 찍고 다시 1층까지 내려와야함)
		
		+ 탑승 인원을 입력받습니다.
		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
		(
		* 입력된 층은 중복되지 않게 입력이 된다고 가정
		예시)
		[10, 20, 35, 50, 11, 24] O 정상입력 케이스로 가정하고 진행
		[10, 20, 35, 10, 20, 24] X 중복층 입력 없음으로 가정
		)
*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("탑승 인원 수 입력 : ");
		int personCount = scanner.nextInt(); //탈 사람 수
		//5 10 ...
		
		//사람 수만큼 내리는 층수 입력 받기 -> 층수 저장 -> 배열 형태
		//destination
		int[] destFloorArr = new int[personCount];  //사람 수만큼 배열 ,  내리는 층수 배열
		System.out.print("목적지 층수 입력(2~100) : ");
		for(int i=0; i<destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
			//2~100층 이외 입력시 필터링 
		}
		
		
		// 1 -> 입력한 최고층 -> 1  
		// 예)  15 20 35 55 41   -> 55층 -> 1층      제일 높은층 찾기(max)
		// 1 -> 100 -> 1
		
		/*
		// Version 1.
		// 순서대로 반복문 up -> down 
		//1-> 100   내려야하는 층인가? 
		for(int floor=1; floor<=100; floor++) {  //1층 -> 100층 이동
			System.out.println(floor + "층");
			
			//여기는 내려야하는 층인가? -> destFloorArr 에 탑승객이 누른 내릴 층수가 저장
			
			// 2층 -> destFloorArr에 있는가? O -> 내린다  X -> 그냥 진행
			
			for(int i=0; i<destFloorArr.length; i++) {
				//현재 층이 목적지 층에 속해있는가?
				if(floor == destFloorArr[i]) {  //멈춰야하는 층이 맞다?
					System.out.println(">>> 도착 (승객하차)");
				}
			}
		}
		
		
		//100 -> 1 내려오기   99~1
		for(int floor=100; floor>=1; floor--) {
			System.out.println(floor + "층");
		}
		*/

		/*
		// Version 2.
		//진행 방향을 별도로 관리하는 형태로 처리
		//boolean flag 변수   +   while

		int floor = 1;
		boolean isUp = true;  //flag 역할   true 올라가는 방향 / false 내려가는 방향
		
		while(true) {
			System.out.println(floor + "층");
			
			//내릴층인가? 체크 -> 승객하차
			///
			if(floor == 1 && isUp == false) {  //1층이면 끝  +  내려가는 방향 상태
				break;
			}
			
			//100층 도착하면 내려가는 방향으로 전환
			if(floor == 100) {
				isUp = false;   //반대방향으로 전환
			}
			
			if(isUp) { //올라가는중 true -> +1
				floor++;
			} else { //올라가는중 false -> 내려가는 중 -> -1
				floor--;
			}
		}
		*/
		
		// Version 3.
		// 진행 방향을 별도로 관리역할 + 층수 변화
		
		int floor = 1;
		int flow = 1;  //flag 역할 + 변하는 값
		// flow : 1  -1    층 변화하는 연산에 참여 (층의 진행방향)   +1  -1
		
		while(true) {
			System.out.println(floor + "층");
			
			
			//내릴층인가? 체크 -> 승객하차
			//올라가는 중일때만 승객이 목적지 층에서 하차
			if(flow == 1) {
				for(int i=0; i<destFloorArr.length; i++) {
					//현재 층이 목적지 층에 속해있는가?
					if(floor == destFloorArr[i]) {  //멈춰야하는 층이 맞다?
						System.out.println(">>> 도착 (승객하차)");
					}
				}
			}

			
			if(floor == 1 && flow == -1) {  //1층이면 끝  +  내려가는 방향 상태
				break;
			}
			
			//100층 도착하면 내려가는 방향으로 전환
			if(floor == 100) {
				flow = -1;
			}
			
			floor = floor + flow; // flow:1 +1   flow:-1  -1 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
