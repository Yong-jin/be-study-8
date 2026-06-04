package be_study.quiz.quiz42;

public class FoodTruckMain {

	public static void main(String[] args) {
		
		//실제 푸드트럭 객체 생성
		//FoodTruck ft = new FoodTruck();
		FoodTruck ft = new FoodTruck("대박분식트럭");
		
		Food food = new Food("김밥", 4000);
		food.setStock(5);
		
		ft.addFood(food);
		ft.addFood("떡볶이", 6000, 5);
		ft.addFood("순대", 7000, 5);
		
		ft.startSales();
	}

}
