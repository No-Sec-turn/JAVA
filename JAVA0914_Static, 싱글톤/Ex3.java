
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * 정적(static) 메서드
	 * - 메모리 로딩 시점은 정적 멤버변수와 동일함
	 * - 호출방법도 정적 멤버변수와 동일함
	 * - 메서드 정의 시 리턴타입 앞에 static 키워드를 붙여서 정의
	 * - static 메서드 내에서는 레퍼런스 this 사용 불가!
	 *   => 레퍼런스 this 에 저장되는 인스턴스 주소는
	 *      인스턴스가 생성되는 시점에서 만들어지므로
	 *      static 멤버가 로딩되는 시점에서는 접근 불가능하다! 
	 *      
	 *       //ex 나 ex2에 필기 덜한ㄱ ㅓ있음
	 */

	// 인스턴스 생성 전 클래스명을 사용하여 멤버 메서드 호출
	StaticEx2.staticmethod(); // 정적 멤버 메서드 호출 가능
	//StaticEx2.normalMethod(); // 인스턴스 멤버 메서드는 호출 불가능
		
	StaticEx2 se = new StaticEx2();
	se.normalMethod();
	se.staticmethod(); // 인스턴스를 통해 접근해서 메서드 호출도 가능하나
						// 클래스명으로 접근하는 것을 권장함
		
	System.out.println("==========================");
	// static 멤버도 private 접근제한자 사용 시 외부클래스에서 접근불가!
	//System.out.println("StaticEx3.a = " + StaticEx3.a);
	
	//따라서, Getter/Setter 를 사용하여 static 멤버에 접근해야함
	System.out.println("StaticEx3.getA() = " + StaticEx3.getA());
	StaticEx3 ex3 = new StaticEx3();
	System.out.println("StaticEx3.getA() = " + ex3.getA());
	}

}

class StaticEx2{
	public void normalMethod() {
		System.out.println("일반 메서드 normalMethod()");	
	
	}
	
	public static void staticmethod() {
		System.out.println("정적 메서드 staticMethod()");
		

	}
	
	
	
	
	
}

class StaticEx3 {
	//static 멤버변수와 static 메서드 정의 시 주의사항!
	private static int a = 10;
	private int b = 20;
	// ===================================
	
	public static int getA() {
		return a;
	}
	
	public static void setA(int a) {
		//static 메서드 내에서는 레퍼런스 this 사용 불가!
		// => 레퍼런스this에 저장되는 인스턴스 주소는
		//     인스턴스가 생성되는 시점에서 만들어지므로
		//     static 멤버가 로딩되는 시점에서는 접근 불가능하다!
		//this.a = a; // 오류 발생! // 나의 인스턴스 주소가 들어있음
		StaticEx3.a = a;
	}
	
	public static void print() {
		// static 메서드 내에서는 인스턴스 멤버변수 사용불가
		// => 클래스 로딩(static 멤버)
		System.out.println("a = " + a);
		//System.out.println("b = " + b); // 오류 발생! 접근 불가!
	} 
	
	// ==================================
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
	
}

