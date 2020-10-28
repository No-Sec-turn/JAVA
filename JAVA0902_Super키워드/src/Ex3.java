
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * final 제한자
	 * -클래스, 메서드, 변수 선언 시 변경의 마지막을 표시
	 * 
	 * 
	 * 
	 * 
	 */
		
	
		FinalVariable fv = new FinalVariable();
		fv.num1 = 100; // 일반 멤버변수는 값 변경 가능
		//fv.num2 = 200; // final 키ㅜ어드가 선언된 변수(상수)는 값 변경 불가능
		// ==> The final field FinalVariable.b cannot be assigned
		
		

	
	
	}

}

// 1. 멤버변수에 final 키워드 사용 
class FinalVariable{
	int num1 = 10;
	final int NUM2 =20;
	
}

// 2. 메서드에 final 키워드 사용
class FinalMethod{
	
	public void normalMethod() {
		System.out.println("일반 메서드!");
	}

	public final void finalMethod() {
		System.out.println("final 메서드");
	}
	
	
}

class finalMethodSubClass extends FinalMethod{
	
	public void normalMethod() {
		System.out.println("일반 메서드!");
		finalMethod(); // final 메서드 호출하는 것은 가능! but 변경은 불가능
	}

//  final 제한자가 사용된 메서드는 오버라이딩 불가능
//	public final void finalMethod() {
//		System.out.println("final 메서드");
//	}

	
}


// 3. 클래스의 final 키워드 사용 => 상속 금지
final class FinalClass {}

// final 제한자가 붙은 클래스를 상속받는 경우
// => 상속 불가능한 클래스이므로 오류 발생
// The type ooooo cannot subclass the final class FinalClass

class HasAClass{
	//final 클래스는 상속 불가능하지만, 인스턴스 생성을 통해 사용 가능
	FinalClass fc = new FinalClass();
	
}
