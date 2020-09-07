
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//업캐스팅 연습
		// 1. 서브클래스 타입 인스턴스 생성
		
		SmartPhone 내폰 = new SmartPhone();
		
		//서브클래스 타입으로 접근 가능한 메서드 : 4개
		내폰.call();  //상속받은 메서드
		내폰.sms();	//상속받은 메서드
		내폰.kakaoTalk();	//서브클래스에서 직접 정의한 메서드
		내폰.youtube();	//서브클래스에서 직접 정의한 메서드
		
		
		// 2. 슈퍼클래스 타입 변수 선언 및 서브클래스의 인스턴스 전달
		HandPhone 엄마폰 = 내폰; // 서브클래스타입 - > 슈퍼클래스타입(업캐스팅)
		// => 참조변수 sp가 가진 데이터(주소값)을 전달

		
		// 슈퍼클래스 타입으로 접근 가능한 메서드 : ?개
		엄마폰.call();  //상속받은 메서드
		엄마폰.sms();	//상속받은 메서드
		// 업캐스팅 시 참조 가능한 영역의 축소가 일어나므로
		// 슈퍼클래스 타입으로 접근 가능한 메서드 갯수가 줄어들게 됨
		// => 즉, 슈퍼클래스 내의 멤버와 동일한 멤버에만 접근 가능하게 됨
		System.out.println("========================");
		//엄마폰.kakaoTalk();	//서브클래스에서 직접 정의한 메서드
		//엄마폰).youtube();	//서브클래스에서 직접 정의한 메서드
		
		//또 다른 서브클래스 타입 인스턴스 생성
		SmartPhone 동생폰 = new SmartPhone();
		
		엄마폰 = 동생폰; // 서브클래스 -> 슈퍼클래스타입으로 변환(업캐스팅)
		
		
		
		System.out.println("==================================다운캐스팅 오류 발생 예시");
		
		//다운 캐스팅 연습(허용되지 않는 경우)
		// 1. 슈퍼클래스의 인스턴스 생성
		
		HandPhone hp2 = new HandPhone();
		
		//슈퍼클래스 타입으로 접근 가능한 메서드 : 2개
		
		hp2.call();
		hp2.sms();
		
		// 2. 서브클래스 타입 변수에 슈퍼클래스 인스턴스 전달
		// ==> 다운캐스팅 수행
		
		//SmartPhone sp2 = (SmartPhone)hp2; 다운 캐스팅(오류 발생)
		
		
		System.out.println("==========================다운캐스팅 허용되는 경우");
		
		//다운캐스팅 연습(허용 되는 경우)
		
		HandPhone 엄마폰3 = new SmartPhone(); // 한문장으로 업캐스팅 수행
		//슈퍼클래스 타입으로 호출 가능한 메서드 : 2개
		엄마폰3.call();
		엄마폰3.sms();
		
		
		// 2. 서브클래스 타입으로 다운 캐스팅 수행!
		SmartPhone 내폰3 = (SmartPhone)엄마폰3; // 비유 하자면.. 엄마폰을 스마트폰으로 바꿔서 내가 받는것
		
		//서브 클래스 타입으로 호출 가능한 메서드 : 4개
		
		내폰3.call();  // 슈퍼클래스꺼
		내폰3.sms();	// 슈퍼클래스꺼
		내폰3.kakaoTalk();  //서브클래스꺼
		내폰3.youtube(); //서브클래스꺼
		
		
	}

}

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