import java.net.InterfaceAddress;

public class Ex {
	public static void main(String[] args) {
		
	/*
	 *  인터페이스(interface)
	 *   - 다중 구현 (implements)이 가능
	 *    => 즉, 하나의 서브클래스가 둘 이상의 부모 인터페이스를 가질 수 있다
	 *    => 여러 부모 인터페이스의 모든 추상메서드를 오버라이딩
	 *   - 인터페이스끼리도 상속이 가능
	 *    => 인터페이스간의 상속은 implements가 아닌 extends를 사용!
	 *    => why? : 추상메서드를 구현하는것이 목적이 아니기 때문
	 *    
	 * 
	 * 
	 * 
	 */
		
		SubClass sc = new SubClass();
		sc.method1();  //Myinterface1의 추상메서드
		sc.method2();  //Myinterface2의 추상메서드
		
		 // sc는 Myinterface1 입니까?  --> Myinterface는 sc의 부모입니까? -> t
		
	if(sc instanceof Myinterface1 ) {
		System.out.println("sc는 Myinterface1입니다.");
		
		
	}   else {
		
		System.out.println("sc는 Myinterface1가 아닙니다!");
	}
	   
	    // sc는 Myinterface2 입니까? 
	if(sc instanceof Myinterface2 ) {
		System.out.println("sc는 Myinterface2입니다.");
		
		
	}   else {
		
		System.out.println("sc는 Myinterface2가 아닙니다!");
	}
	   
//		sc -> Myinterface1 타입으로 업캐스팅
	
	Myinterface1 mil1 = sc;
	mil1.method1();; // Myinterface1 이 가진 추상메서드
	System.out.println(mil1.NUM1);
	
	Myinterface2 mil2 = sc;
	mil2.method2();; // Myinterface2 이 가진 추상메서드
	System.out.println(mil2.NUM2);
	
		
		
	}
}


interface Myinterface1{
	
	// 상수 num
	
	public static final int NUM1 = 11; // 상수는 대문자로 표기
	
	public abstract void method1(); // 추상 메서드
	
	
}

interface Myinterface2{
	
	public static final int NUM2 = 20;
	
	public abstract void method2();
	
}


//Myinterface1 인터페이스를 구현하는 서브클래스 SubClass 정의

class SubClass implements Myinterface1, Myinterface2 {
	
	//부모 인터페이스로부터 상속받은 추상메서드 구현(오버라이딩) 필수
	@Override
	public void method1() {
		System.out.println("서브클래스에서 구현한 추상메서드 method1()");
	}

	@Override
	public void method2() {
		System.out.println("서브클래스에서 구현한 추상메서드 method2()");
	}
	
}

