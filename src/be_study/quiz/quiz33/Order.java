package be_study.quiz.quiz33;

import java.util.ArrayList;

public class Order {
	// 필드(인스턴스 필드)
	int orderNum;
	//Menu[] menus;
	ArrayList<Menu> menus;
	
	// 생성자
	public Order(int i, ArrayList<Menu> menus) {
		orderNum = i;
		this.menus = menus;
	}
	// 메소드(인스턴스 메소드)
	public int totalPrice() {
		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
		
		// 현재 이 주문(Order)에 주문된 메뉴 목록 -> menus
		// menus 안에 Menu 객체 필드변수에 price 가격
		int total = 0; 
		
//		for(int i=0; i<menus.size(); i++) {
//			total += menus.get(i).price;
//		}
		//total 총 메뉴의 누적 합
		
		for(Menu m : menus) {
			total += m.price;
		}
		
		
		return total;
	}
}