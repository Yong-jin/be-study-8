package be_study.quiz;

import java.util.Scanner;

public class Quiz23_lv1 {

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
		
		
		- 레벨 1
		부실 공사로 인한 전기 공급의 한계로, 엘리베이터가 멈출 수 있는 횟수에 제한이 생깁니다.
		엘리베이터는 마지막 횟수가 되면, 남아 있는 사람들은 계단으로 보내며
		(마지막 횟수가 3일 때, 사람들의 내릴 층이 2, 3, 4, 5층이라면 4층에서 멈추어야 함)
		현재 층 수에 점검 중 표시를 하고 운영을 멈춥니다.
		
		+ 엘리베이터가 멈출 수 있는 최대 횟수는 사용자 입력을 받습니다.

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
		
		// level1. 추가.   최대 멈추는 횟수 입력
		System.out.print("최대 멈춤 횟수 입력 : ");
		int maxStopCount = scanner.nextInt();
		
		// maxStopCount : 3    -> 2 1 0 ... -> 점검
		// stopCount : 0   -> 1 2 3   -> 점검
		
		
		// Version 3.
		// 진행 방향을 별도로 관리역할 + 층수 변화
		
		int floor = 1;
		int flow = 1;  //flag 역할 + 변하는 값
		// flow : 1  -1    층 변화하는 연산에 참여 (층의 진행방향)   +1  -1
		int stopCount = 0; //엘리베이터 멈추는 횟수 기록
		// 최대 멈춤 횟수까지 멈춤  maxStopCount 까지
		
		
		while(true) {
			System.out.println(floor + "층");
			
			//내릴층인가? 체크 -> 승객하차
			//올라가는 중일때만 승객이 목적지 층에서 하차
			if(flow == 1) {
				for(int i=0; i<destFloorArr.length; i++) {
					//현재 층이 목적지 층에 속해있는가?
					if(floor == destFloorArr[i]) {  //멈춰야하는 층이 맞다?
						System.out.println(">>> 도착 (승객하차)");
						stopCount++; //멈춤 횟수 증가
						break; //목적지 층수를 찾았으면 더이상 불필요하게 반복하지말고 종료
					}
				}
			}
			
			//최대 멈춤 횟수 채우면 점검으로 운행중지 
			if(stopCount == maxStopCount) { //멈춤횟수 전부 소모
				System.out.println("===운행중지 (점검중) ===");
				System.out.println("===계단을 이용해주세요===");
				break;
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
