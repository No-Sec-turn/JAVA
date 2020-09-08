
public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 다형성(Polymorphism)
		 *  - 하나의 클래스 타입으로 여러 인스턴스를 참조하는 것
		 *  - 업캐스팅을 의미
		 *  => 서브클래스에서 메서드 오버라이딩을 수행했을 때
		 *     슈퍼클래스 타입으로 업캐스팅 후 메서드 호출시
		 *     오버라이딩 된 메서드가 호출되어
		 *     코드는 동일하나 실행 결과가 달라지게 됨
		 *  
		 *  - 다형성을 통해 코드의 통일성을 향상시킬 수 있으나
		 *    해당 인스턴스의 상세 속성에 접근하려면
		 *    다운캐스팅을 통해 서브클래스 타입으로 변환한 뒤 접근 가능함
		 * 
		 * 
		 * 
		 * 
		 * 업캐스팅 시 오버라이딩 메서드
		 *  - 동적 바인딩 : 코드상의 실행할 메서드와 컴파일 후 실행 시점에서
		 *    실행되는 메서드가 달라지는 것
		 *  - 오버라이딩 된 메서드가 존재할 경우
		 *    업캐스팅 후에도 오버라이딩 된 메서드가 호출됨
		 *   => 즉, 메서드 호출 시 참조 타입이 누구인지 중요하지 않고 실제 인스턴스가 누군지가 중요하다!
		 * 
		 * 
		 */
		
		
		
		
	// * 트럭의 인스턴스를 생성해서 접근가능한 메소드 호출
		
		System.out.println("-------Truck---------");
		// Truck 인스턴스 생성 및 접근 가능한 메서드 호출
		
		Truck truck = new Truck();
	
		truck.dump();
		truck.SpeedDown();
		truck.speedUp();
		
		System.out.println("---------Taxi--------");
		
		Taxi taxi = new Taxi();
		
		taxi.lift();
		taxi.drop();
		taxi.SpeedDown();
		taxi.speedUp();
		
		
		
		System.out.println("======================");
		
		System.out.println("--------Truck -> Car 업캐스팅 ---------");
		//Trcuk -> Car 업캐스팅
		Car car = truck; //업 캐스팅 수행
		
		car.speedUp();	//업캐스팅 후 호출 가능한 메서드 1개
		car.SpeedDown();
		
		//car.dump(); ;; 참조 영역 축소로 상속 멤버 외에 접근 불가
		
		System.out.println("--------Car -> Truck 다운 캐스팅-------");
		

		truck = (Truck)car; // 다운 캐스팅 수행(업캐스팅 이후라서 오류 안남)
		
		truck.dump();  //다운캐스팅 하여 접근 가능해짐
		truck.SpeedDown();
		truck.speedUp();
		
		System.out.println("-------Taxi -> Car 업캐스팅--------------");
		//Taxi --> Car 업스캐팅 및 접근 가능한 메서드 호출
		
		car = taxi;
		car.speedUp();
		car.SpeedDown();
		
		System.out.println("-----------Car -> Taxi 다운 캐스팅");
		
		taxi = (Taxi)car;
		
		taxi.drop();
		taxi.lift();
		taxi.SpeedDown();
		taxi.speedUp();
		
		
		// 참조 영역 축소로 상속 멤버 외에 접근 불가
		
		//참조 영역 축소로 상속 멤버외에 접근 불가
		//car.lift();
		
	
	
	}
	
}




class Car{
	
	
	public void speedUp() {
		System.out.println("Car의 속력 증가!");
				
	}
	
	public void SpeedDown() {
		System.out.println("Car의 속력 감소!");
		
	}
	
}


class Truck extends Car{
	
	
	
	
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("Truck의 속력 증가!");
	}

	@Override
	public void SpeedDown() {
		// TODO Auto-generated method stub
		System.out.println("Truck의 속력 감소!");
	}

	public void dump() {
		System.out.println("Truck에 짐 싣기");
		
	}
	
}

class Taxi extends Car{
	
	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("Taxi의 속력 증가!");
	}

	@Override
	public void SpeedDown() {
		// TODO Auto-generated method stub
		System.out.println("Taxi의 속력 감소!");
	}
	
	public void lift() {
		System.out.println("Taxi의 승객 승차!");
		
	}
	
	public void drop() {
		System.out.println("Taxi의 승객 하차!");
	}
	
}