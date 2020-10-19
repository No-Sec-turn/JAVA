
public class Ex {
	

	public static void main(String[] args) {
		// 클래스를 정의한 뒤 반드시 인스턴스를 생성하여야만
		// 해당 클래스에 대한 실체화가 되고, 실체화 된 인스턴스를 통해
		// 변수에 데이터를 저장하거나 메서드를 소출하여 동작을 수행 가능
		
		/*
		 * < 객체 사용 순서>
		 * 1.클래스 타입(참조형) 변수 선언
		 * 2. new 연산자를 사용하여 클래스의 인스턴스 생성
		 * 	=> 생성된 인스턴스의 주소를 참조 변수에 저장
		 * 3. 주소가 저장된 참조 변수를 통해 인스턴스에 접근하여 사용
		 * 
		 * < 클래스타입(참조형) 변수 선언 기본 문법 >
		 * 클래스명 변수명;
		 * 
		 * < 클래스 인스턴스 생성 및 주소 저장 기본 문법 >
		 * 변수명 = new 클래스명();
		 *  
		 * <생성된 인스턴스 접근 방법>
		 * 변수명, 멤버변수명 또는 변수명.메서드명()
		 * 	 */
		 // 기본형 변수 사용 예시
		  	
		String S;
		
		
		
//		Int a
//		a = 10;
//		
//		System.out.println(a);
//			

//		// 클래스 변수 선언
//		Person p;
//		
//		//인스턴스 생성 및 주소 저장
//		p = new Person();
		
		// 위 두 문장을 결합
		
	Person p = new Person();

	p.name = "홍길동";
	
	p.age = 20;

	System.out.println(p.name);
	System.out.println(p.age);
	
	p.print();
	
	
	// 두번째 Person 인스턴스 생성 (변수 p2 사용)
	
	Person p2 = new Person();
	
	p2.name = "이순신";
	p2.age  = 40;
	
	System.out.println(p2.name);    // 
	System.out.println(p2.age);

	p.print();
	
	
	
	
	
	}
	
}  
//	
//}


