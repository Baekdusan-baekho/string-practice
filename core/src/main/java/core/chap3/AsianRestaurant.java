package core.chap3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Setter;

@Setter
public class AsianRestaurant implements Restaurant {
	
	//요리가 유명한 프랑스 셰프
	@Autowired
	@Qualifier("asianChef")
	private Chef chef;
	
	// 요리 코스
	@Autowired
	@Qualifier("shshi")
	private Course course;
	
	
//	@Autowired
//	public AsianRestaurant(@Qualifier("asianChef")Chef chef, @Qualifier("sushi") Course course) {
//		super();
//		this.chef = chef;
//		this.course = course;
//	}
	
	
	// 요리를 주문하는 기능
	public void order() {
		System.out.println("아시안 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}






	
	
	
	

}
