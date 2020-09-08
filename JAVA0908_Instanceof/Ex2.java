
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* instanceof 연산자
	 *  - 어떤 객체가 특정 클래스 타입의 인스턴스인지를 판별하는 연산자
	 *  -> 형변환 가능 여부(is-a관계)를 판별
	 *   ex) a is a b => a instanceof b 로 바꿔서 사용 가능
	 *  - 판별 결과를 boolean 타입으로 리턴
	 *  => boolean 타입 변수에 결과값을 저장하거나 
	 *   
	 * 
	 * < 기본 문법 >
	 * 
	 * a instanceof b
	 * => a : 객체(참조변수)
	 * => b : 클래스명(또는 인터페이스명)
	 * 	
	 */
	
		Parent2 p = new Parent2();
		//if문을 사용하여 PArent2 객체가 Child2 타입으로 변환가능 여부 판별
		// ==> p is a Child2 에 대한 판별 수행

		if(p instanceof Child2) {
			// 판별 결과가 true 이면 무조건 Child2 타입으로 변환 가능!
			System.out.println("p -> Child2 타입으로 형변환 가능!");
			
		
		}else {
			System.out.println("p-> Child2 타입으로 형변환 불가능!");
		}
			
		
		
		System.out.println("------------------");
		
		Parent2 p2 = new Child2();
		
		if(p2 instanceof Child2) {
			// 판별 결과가 true 이면 무조건 Child2 타입으로 변환 가능!
			// => 서브클래스를 이미 업캐스팅 해놓은 상태이므로
			// 형볗놘 가능하다는 true 가 리턴됨
			System.out.println("p -> Child2 타입으로 형변환 가능!");
			//child2 c = p2; // 자동 형변환은 불가능한 관계이므로
			Child2 c = (Child2)p2;
		
		}else {
			System.out.println("p -> Child2 타입으로 형변환 불가능!");
		}
		
		
	
		System.out.println("======================");
		
		// SmartPhone 인스턴스(sp) 생성
		SmartPhone 내폰 = new SmartPhone();
		
		//sp는 SmartPhone 입니까?
		
		if(내폰 instanceof SmartPhone) {
			
			System.out.println("내 폰은 SmartPhone 이다!");
			// --> 그러므로 SmartPhone 타입 변수에 대입 가능
			SmartPhone 동생폰 = 내폰;
			
			동생폰.call();
			동생폰.sms();
			동생폰.kakaoTalk();
			동생폰.youtube();
			
		}
		
		System.out.println("-----------------instanceof 판별 업캐스팅 ");
		
		
		//내폰은 핸드폰 입니까?
		
		if(내폰 instanceof HandPhone) {
			System.out.println("내폰은 HandPhone이 맞습니다. 왜냐.. HandPhone이 부모 클래스이니까 ");
			System.out.println("그러므로 HandPHone으로 형변환 가능하다!");
			
			HandPhone 엄마폰 = (HandPhone)내폰;
			System.out.println("내폰은 HandPhone의 모든 기능을 포함한다!");
			엄마폰.call();
			엄마폰.sms();
		}
		
		System.out.println("------------------instanceof 판별 그냥 다운 캐스팅");
		
		HandPhone 엄마폰 = new HandPhone();
		
		// 엄마폰은 SmartPhone 입니까?
		if(엄마폰 instanceof SmartPhone) {
			
			System.out.println("엄마폰은 스마트폰 이다");
		}else {
			System.out.println("엄마폰은 스마트폰 아님");
			System.out.println("그러므로 SmartPhone으로 형변환 불가!");
			//SmartPhone 내폰2 = (SmartPhone)엄마폰;
			//위에 코드 실행시 오류..
			System.out.println("왜냐면 엄마폰은 SmartPhone의 모든 기능을 포함하지 않음");
		}

		
		System.out.println("----------------instanceof 판별 업캐스팅 후 다운캐스팅");
			
		// SmartPhone 서브 클래스를 HandPhone 엄마폰2 참조변수에 업캐스팅!
			HandPhone 엄마폰2 = new SmartPhone();    
			
			// 엄마폰은 SmartPhone 입니까?
			
			if(엄마폰2 instanceof SmartPhone) {
				System.out.println("엄마폰2는 스마트폰이다!");
				System.out.println("그러므로 SmartPhone으로 형변환 후에도");
				System.out.println("정상적으로 SmartPhone의 모든 기능 사용 가능!");
				
				//SmartPhone 내폰2 = 엄마폰2; <-- 다운캐스팅 하려면 강제 형변환 필요!
				SmartPhone 내폰2 = (SmartPhone)엄마폰2;
				
				내폰2.call();
				내폰2.sms();
				내폰2.kakaoTalk();
				내폰2.youtube();
				
			}
		
		
		
		
		
		
	}

}

class Parent2{}

class Child2 extends Parent2{}

//--------------------------------------------

class HandPhone {
	
	String phoneNumber;

	public void call() {
		System.out.println("HandPhone의 전화 기능!");
	}
		
	public void sms() { 
		System.out.println("HandPhone의 문자 기능!");

		
	}
	
	
}

// SmartPhone 클래스 정의 - HandPhone 클래스 상속
class SmartPhone extends HandPhone{
	String osName;
	
	public void kakaoTalk() {
		System.out.println("SmartPhone의 카톡 기능!");
	}
	
	public void youtube() {
		System.out.println("SmartPhone의 유튜브 기능!");
		
	}
	
}







