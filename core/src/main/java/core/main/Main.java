package core.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import core.chap2.Hotel;

public class Main {

	public static void main(String[] args) {	
		
		//첫번째 chap1
//		Hotel hotel = new Hotel();
//		hotel.inform();
		
		
		
		//chap2
		// 빈 등록에 사용된 xml의 설정을 가져오는 객체를 생성.
		// (classpath == src/main/resources)
//		GenericXmlApplicationContext ct = 
//				new GenericXmlApplicationContext("classpath:hetel-config.xml");
//		
//		//빈의 아이디와 리턴받고자 하는 것의 타입
//		Hotel hotel = ct.getBean("hotel", Hotel.class);
//		hotel.inform();
		
		GenericXmlApplicationContext ct = 
				new GenericXmlApplicationContext("classpath:hotel-config.xml");
		
		Hotel hotel1 = ct.getBean("hotel1", Hotel.class);
		hotel1.inform();
		
		System.out.println("==================================");
		
		Hotel hotel2 = ct.getBean("hotel2", Hotel.class);
		hotel2.inform();
		
		
		
		
		

	}

}
