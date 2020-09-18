
public class Ex {

	public static void main(String[] args) {
		/*
		 * 인터페이스(Interface)
		 * - 다중 구현(implements)이 가능
		 *   => 하나의 서브클래스가 둘 이상의 부모 인터페이스를 가질 수 있다.
		 *   => 여러 부모인터페이스의 모든 추상메서드를 오버라이딩
		 * - 인터페이스끼리도 상속이 가능
		 *   => 인터페이스간의 상속은 implements 가 아닌 extends 를 사용
		 *      추상메서드를 구현하는 것이 목적이 아니기 때문!
		 *      
		 */
		
		SubClass sc = new SubClass();
		sc.method1(); // MyInterface1 의 추상메서드
		sc.method2(); // MyInterface2 의 추상메서드
		
		// 인터페이스도 instanceof 연산자의 판별 대상이 될 수 있다!
		// sc 는 MyInterface1 입니까? true
		if(sc instanceof MyInterface1) {
			System.out.println("sc 는 MyInterface1 입니다!");
		} else {
			System.out.println("sc 는 MyInterface1 이 아닙니다!");
		}
		
		// sc 는 MyInterface2 입니까? true
		if(sc instanceof MyInterface2) {
			System.out.println("sc 는 MyInterface2 입니다!");
		} else {
			System.out.println("sc 는 MyInterface2 가 아닙니다!");
		}
		
		// sc -> MyInterface1 타입으로 업캐스팅
		MyInterface1 mi1 = sc;
		mi1.method1(); // MyInterface1 이 가진 추상메서드
//		System.out.println(SubClass.NUM1); // MyInterface1 이 가진 상수
		System.out.println(MyInterface1.NUM1); // MyInterface1 이 가진 상수
		
		// sc -> MyInterface2 타입으로 업캐스팅
		MyInterface2 mi2 = sc;
		mi2.method2(); // MyInterface1 이 가진 추상메서드
		System.out.println(SubClass.NUM2); // MyInterface1 이 가진 상수
		
		
	}

}

interface MyInterface1 {
	
	public static final int NUM1 = 10; // 상수
	
	public abstract void method1(); // 추상메서드
	
}

interface MyInterface2 {
	
	public static final int NUM2 = 20; // 상수
	
	public abstract void method2(); // 추상메서드
	
}

// MyInterface1, MyInterface2 인터페이스를 구현하는 서브클래스 SubClass 정의
class SubClass implements MyInterface1, MyInterface2 {

	// 부모 인터페이스로부터 상속받은 추상메서드 구현(오버라이딩) 필수
	@Override
	public void method1() {
		System.out.println("서브클래스에서 구현한 추상메서드 method1()");
	}

	@Override
	public void method2() {
		System.out.println("서브클래스에서 구현한 추상메서드 method2()");
	}
	
}
















