package core.chap2;

import lombok.Setter;

@Setter


public class AsianRestaurant implements Restaurant {
	
	//요리가 유명한 프랑스 셰프
	private Chef chef = new AsianChef();
	
	// 요리 코스
	private Course course = new SushiCourse();
	
	
	
	// 요리를 주문하는 기능
	public void order() {
		System.out.println("아시안 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}
	
	
	

}
