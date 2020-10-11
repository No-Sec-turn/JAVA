
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Car a1 = new Car();
		
		a1.carName = "SONATA";
		a1.companyName ="Hyundai";
		a1.cc = 3000;
		
		System.out.println(a1.carName);
		System.out.println(a1.companyName);
		System.out.println(a1.cc);
		System.out.println(a1.maxSpeed);
		System.out.println(a1.speed);
		
		System.out.println("-----------------------");
		
		a1.speedup(50);
		a1.speedup(100);
		a1.speedup(100);
		
		a1.speedDown(50);
		a1.speedDown(250);
		
		
	}

}

class Car {
	String carName;
	String companyName;
	int cc;
	int maxSpeed = 200;
	int speed;	
	


public void speedup(int s) {
	
		speed += s;
	
		if (speed > maxSpeed ) {    //현재 속력 이 최대속력보다 높거나 또는 높힐려는 속도가 200보다도 클경우도!
		
			speed = maxSpeed;
			System.out.println("최대 속력(200) 도달!");
		}else
			
			
		
		System.out.println("현재 속력:" + speed + "km/h");
	
}

public void speedDown(int s) {
		
		
		speed -= s;
		if(speed <0) {
			
			System.out.println("차량 정지!");
		}else {
		
		System.out.println("현재 속력:" + speed + "km/h");
		
		
		}

}

}
/*	자동차(Car) 클래스 정의
 * 멤버변수 선언
 * 
 * - 자동차 차종(carName String)
 * - 자동차 브랜드(companyName, String)
 * - 자동차 배기량(cc, int)
 * - 최대속력(maxSpeed, int) => 200;, 현재속력(speed, int)
 * 
 * 메서드
 * 1) 속력 증가 speedUp()
 * 	- 증가시킬 속력(s)을 전달받아 현재 속력(speed)에 누적 후
 *  - "현재속력 : XXX km/h" 출력 단, 현재 속력이 최대속력(maxSpeed) 클 경우
 *  	현재 속력을 최대속력으로 변경 후 "최대 속력 도달!" 출력
 *  - 매개변수 1개(증가시킬 속력 s), 리턴값 없음
 * 
 * 2) 속력 감소speedDown()
 *  - 감소시킬 속력(s)을 전달받아 현재속력(speed)에서 차감한 후
 *    "현재속력 : XXX km/h" 출력
 *    단, 현재속력이 0보다 작을 경우 현재 속력을 0으로 변경
 *    "차량 정지!" 출력
 *  - 매개변수 1개(감소시킬 속력 s), 리턴값 없음
 * 
 */ 
  
