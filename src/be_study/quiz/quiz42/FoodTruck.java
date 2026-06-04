package be_study.quiz.quiz42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {

	String truckName; // 트럭이름
	int totalSales; // 총매출액
	boolean isOpened; // 영업중 여부

	// 푸드트럭이 판매하는 메뉴들
	List<Food> foodList;
	
	//Scanner scanner = new Scanner(System.in);

	public FoodTruck() {
		truckName = null;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}

	public FoodTruck(String truckName) {
		this.truckName = truckName;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}

	// 판매 메뉴로 추가하고 싶은 food 객체 추가
	public void addFood(Food food) {
		foodList.add(food);
	}

	public void addFood(String name, int price, int stock) {
		Food food = new Food(name, price, stock);
		foodList.add(food);
	}

	// 판매 관련 로직
	public void startSales() { // 영업시작

		// 처리 로직
		isOpened = true; // 영업 상태로 전환
		System.out.println("=======[" + truckName + " 푸드트럭 영업시작 ]=======");

		Scanner scanner = new Scanner(System.in);

		while (isOpened) {
			// 메뉴 보여주고
			// 메뉴 선택하고
			int menuInput = getMainMenu();

			switch (menuInput) {
			case 1: // 메뉴보기
				showFoodList();
				break;
			case 2: // 주문하기
				orderMenu();
				break;
			case 3: // 재고관리
				manageStock();
				break;
			case 4: // 마감하기
				finishSales();
				break;
			// 새로운 메뉴 입력받아서 추가 // 5. 메뉴관리 (메뉴추가, 메뉴삭제) 확장...
//			default:
//				System.out.println("메뉴를 잘못입력하셨습니다.");
			}
		}
	}

	// 메인메뉴 선택 입력받기
	public int getMainMenu() {
		// 메뉴 보여주고
		Scanner scanner = new Scanner(System.in);

		int menuInput;
		
		while(true) {
			System.out.println();
			System.out.println("***[메뉴선택]***");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print(">>> 입력 : ");
			// 메뉴 선택하고
			menuInput = scanner.nextInt();
			
			if(menuInput >= 1 && menuInput <= 4 ) {
				break;
			} else {
				System.out.println(" >>> 잘못입력했습니다.");
				System.out.println(" >>> 메뉴 1~4 보기중에 선택하세요.");
			}
		}
		
		return menuInput;

	}

	public void showFoodList() { // 푸드리스트 메뉴 보여주기
		// 메뉴 보여주기
		System.out.println();
		System.out.println("------[메뉴]-------");
		for (int i = 0; i < foodList.size(); i++) {
			System.out.printf("[%d]. %s\n", (i + 1), foodList.get(i).getFoodInfo());
		}

	}

	//2번메뉴 주문하기
	public void orderMenu() {

		//주문 메뉴...
		int orderMenuIndex = getFoodMenuIndex();

		// 주문메뉴 재고수량 -수량
		// 주문메뉴 금액만큼 매출액 증가
		// 재고수량 부족하면 품절..주문불가
		int orderCount = 1; // 주문수량
		
		Food orderFood = foodList.get(orderMenuIndex);

		if (orderFood.stock >= orderCount) {
			orderFood.modifyStock(-orderCount); // 재고 1개 감소
			totalSales += orderFood.price; // 매출액 증가
			System.out.printf("[주문정보] %s 메뉴 %d개 주문완료! \n", orderFood.name, orderCount);
		} else {
			System.out.println("[품절안내] 해당 메뉴는 품절입니다.");
		}
	}
	
	//푸드메뉴 선택하는 과정 담당 -> 선택 메뉴의 인덱스 return
	public int getFoodMenuIndex() {
		Scanner scanner = new Scanner(System.in);
		int orderMenu;

		while(true) {
			// 메뉴 보여주기
			showFoodList();
			// 주문 메뉴 번호 받기
			System.out.print(">>> 메뉴 번호 입력 : ");
			orderMenu = scanner.nextInt();
			
			if(orderMenu >= 1 && orderMenu <= foodList.size()) {
				break;
			} else {
				System.out.println(" >>> 잘못입력했습니다.");
				System.out.println(" >>> 푸드 메뉴 보기중에 선택하세요.");
			}
		}
		
		int orderMenuIndex = orderMenu - 1;
		return orderMenuIndex;	//index return     // foodList.get(orderMenuIndex) 
	}

	public void manageStock() {
		
		// 각 메뉴별로 재고 수량 조정
		// 재고 조정할 메뉴 선택
		System.out.println(">>> 재고 관리할 메뉴 번호를 선택하세요.");
		int menuIndex = getFoodMenuIndex();

		Scanner scanner = new Scanner(System.in);
		// 조정할 재고 갯수 입력
		System.out.print(">>> 재고 조정할 개수 입력 : ");
		int inputStockCount = scanner.nextInt();

		// 몇번인덱스 위치에 있는 메뉴를 재고 조정해라
		foodList.get(menuIndex).modifyStock(inputStockCount);
		System.out.println("[재고 조정 적용]");
		System.out.println(foodList.get(menuIndex).getFoodInfo());
		System.out.println();
	}

	public void finishSales() {

		System.out.println();
		System.out.println("======[영업마감]======");

		isOpened = false;

		// 매출
		// 남은재고 원가 차감 계산 (판매금액의 30%)

		// 재고남은 메뉴 -> 메뉴의가격 * 30% * 남은재고수량
		int lossSales = 0;
		for (Food food : foodList) {
			lossSales += (food.price * 0.3 * food.stock);
		}

		System.out.println("-----[마감정보]-----");
		System.out.println(">>> 총매출액 : " + totalSales);
		System.out.println(">>> 원가차감 : " + lossSales);
		System.out.println(">>> 최종수익 : " + (totalSales - lossSales));
	}
	
}

/*
 * 푸드트럭 - 푸드트럭은 여러종류의 음식들을 메뉴로 가지고 있을 수 있다. - 각 음식들은 각각의 이름, 가격, 재고를 가지고 있다. -
 * 초기에 이름과 가격을 가지고 생성된다. - 각 음식별 재고를 설정할 수 있다. - 메뉴를 보여주는 기능(메뉴와 함께 주문가능한 재고까지)이
 * 있다. - 메뉴중 주문을 할 수 있으며, 주문 시 금액만큼 매출이 증가하고 재고가 떨어진다. - 재고가 없는 메뉴는 판매할 수 없다.
 * 
 * -기능 기준 (메뉴보기, 주문하기, 재고관리(메뉴 재고 추가), 마감하기)
 * 
 * - 마감시 남은 재고만큼 매출액이 마이너스된다. ※마이너스 금액은 각 음식의 가격의 30% 원가 - 마감시 당일 매출액을 보여주고
 * 종료됩니다.
 * 
 * 김밥 1000 재고 50개 40개 -> 40,000원 10개 ->마감 -> 3000 매출 4만 - 폐기손해3천 최종수익 37000원
 */
