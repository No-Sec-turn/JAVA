package Inner_class;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 중첩 클래스(Nested Class)
		 * - 어떤 클래스 내에 또 다른 클래스를 정의하는 것
		 * - 내부에 정의된 클래스를 중첩 또는 내부(Inner) 클래스라고 함
		 * - 독립적인 일반 클래스로 생성할 필요는 없지만
		 *   나름대로 클래스 형식을 갖춰야할 때 사용
		 * - 워크스페이스의 bin 폴더에 클래스 파일이 생성될 때
		 *   내부클래스의 파일명은 외부클래스명$내부클래스명.class 가 됨
		 *   (ex. Outer$Inner.class)
		 *   => 단, 로컬 내부 클래스는 내부 클래스명 앞에 숫자 1붙음
		 *      (ex. Outer$1LocalInner.class)
		 *   
		 * - 주로 GUI 구현 시 이벤트 처리를 위한 핸들러(Handler) 정의에 사용
		 * - 클래스 정의 위치에 따라 다음과 같이 구분됨 
		 *   1) 인스턴스 내부 클래스
		 *      - 인스턴스 멤버변수의 위치와 동일한 위치에서 정의한 클래스
		 *      - static 멤버를 제외한 나머지 클래스 구성 요소 모두 사용 가능
		 *      - 외부클래스를 통해서만 접근 가능하며
		 *        외부클래스의 인스턴스를 생성 후 내부클래스 인스턴스 생성
		 *        
		 *   2) 정적 내부 클래스
		 *      - 인스턴스 내부 클래스와 동일하나 static 키워드가 붙은 클래스
		 *      - static 멤버를 포함한 클래스 구성 요소 모두 사용 가능
		 *      - 외부클래스를 통해서만 접근 가능하며
		 *        외부클래스의 인스턴스를 생성 없이 내부클래스 인스턴스 생성
		 *        ex) Outer.Inner inner = new Outer.Inner(); => 변수명.new 가 필요 없음!
		 *        		
		 *   3) 로컬 내부 클래스
		 *      - 메서드 내에서 정의한 클래스
		 *      - static 멤버를 제외한 나머지 클래스 구성 요소 모두 사용 가능
		 *      - 메서드 호출 시 인스턴스가 생성되어 사용 가능
		 * 
		 * < 다른 클래스에서 인스턴스 내부(Inner) 클래스의 인스턴스 생성 방법 >
		 * 외부클래스명.내부클래스명 변수명 = 
		 *              외부클래스참조변수.new 내부클래스명();
		 *              
		 * < 다른 클래스에서 정적 내부 클래스의 인스턴스 생성 방법 >
		 * 외부클래스명.내부클래스명 = new 외부클래스명.내부클래스명();
		 *  
		 */
		
		// 1. 외부클래스의 인스턴스 생성
		Outer outer = new Outer();
		
		// 2. 외부클래스를 통해 내부클래스에 접근하여 인스턴스 생성
		// => 클래스 지정 시 외부클래스명.내부클래스명으로 지정
		// => new 키워드를 통해 인스턴스 생성 시
		//    외부클래스의 인스턴스 참조변수명.new 내부클래스명(); 으로 생성
		Outer.Inner inner = outer.new Inner();
		
		// 3. 내부클래스 인스턴스의 멤버 접근
		// => 일반적인 클래스 인스턴스의 멤버 접근 방식과 동일
		inner.method1();
		
		// -------------------------------------------------
		outer.outerMethod();
		
	}

}

// 외부 클래스 Outer 정의
class Outer {
	// 멤버변수 선언
	int a = 10; // 인스턴스 멤버변수
	private int b = 20; // 인스턴스 멤버변수
	static int c = 30; // 정적(클래스) 멤버변수
	
	// 클래스 내의 메서드에서는 내부클래스를 자유롭게 접근할 수 있음
	public void a () {
		System.out.println(a);
		
		Inner inner = new Inner();
		inner.method1();
		
		
	}
	
	// 내부 클래스 Inner 정의 => 인스턴스 멤버 내부(Member Inner) 클래스
	// => 특정 클래스 내의 멤버 레벨에 해당 클래스 정의
	class Inner {
		public Inner() {} // 생성자 정의 가능
		
		int innerA = 10; // 인스턴스 멤버변수 선언 가능
//		static int innerB = 20; // 정적(클래스) 멤버변수 선언 불가능
		
		public void method1() { // 일반 메서드 정의 가능
			// 내부클래스에서는 외부클래스의 멤버에 자유롭게 접근 가능
			// => 즉, 내부클래스는 멤버레벨의 메서드와 동일한 권한을 갖는다
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(innerA);
		}
		
//		public static void method2() {} // 정적 메서드 정의 불가능
		
	} // Inner 클래스 끝
	
	
	public void outerMethod() {
		// 로컬 내부 클래스(Local Inner Class) 정의
		// => 클래스 내의 메서드 내에서 정의한 클래스
		// => 메서드 내부에서만 접근 가능한 클래스
		class LocalInner {
			public LocalInner() {} // 생성자
			
			int a = 10; // 인스턴스 멤버변수
//			static int b = 10; // static 멤버변수 선언 불가능
			
			public void method1() { // 메서드 정의 가능
				System.out.println("LocalInner 클래스 a = " + a);
			}
			
//			public static void method2() {} // static 메서드 정의 불가능
			
		}
		
		// 로컬 내부 클래스의 인스턴스 생성
		// => 반드시 로컬 내부 클래스 정의 부분의 아래쪽에서 접근해야한다!
		//    (로컬변수와 동일)
		LocalInner localInner = new LocalInner();
		localInner.method1();
		
	}
	
	
}













