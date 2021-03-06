
public class Ex {
	public static void main(String[] args) {

		/* 추상클래스와 추상메서드
		 * 1. 추상메서드
		 *  - 메서드 구현부(바디, {})가 없는 메서드
		 *    = 실행할 코드가 없는 메서드
		 *  - 구현부가 없기 때문에 외부에서 호출되어도 실행할 코드가 없음
		 *    => 따라서, 추상메서드를 포함하는 클래스는 반드시 추상클래스로 선언해야한다!
		 *  - 추상메서드 정의시 리턴 타입 앞에 abstract 키워드 붙임
		 *  
		 *  < 추상메서드 정의 기본 문법 >
		 *   [ 접근제한자 ] abstract 리턴타입 메서드 명([매개변수...]);
		 *    
		 *        
		 * 2. 추상클래스
		 *  - 인스턴스 생성이 불가능한 클래스
		 *    => 인스턴스 생성이 가능할 경우 추상메서드 호출이 가능하므로
		 *       인스턴스 생성을 못하도록 막아놓은 클래스
		 *  - 상속을 통해 서브클래스에서 추상메서드를 구현하도록 강제하는 용도의 클래스로 주로 사용       			
		 *  - 추상클래스가 가질 수 있는 멤버
		 *    => 생성자, 일반 멤버변수, 상수, 일반 메서드와, "추상 메서드"
		 *  - 클래스 정의 시 class 키워드 앞에 abstract 키워드를 붙임
		 *  - 인스턴스 생성은 불가능 하지만, 참조변수 타입으로는 사용 가능!
		 *  
		 *  < 추상클래스 정의 기본 문법?
		 *   abstract class 클래스명 {}
		 *  
		 */
		
		
		//Shape s = new Shape();
		//Cannot instantiate the type Ex.Shape
		// => 인스턴스화가 불가능한 타입이므로 인스턴스 생성시 오류 발생!
		
		// 참조변수의 데이터타입으로 사용은 가능
		Shape s = new Circle();
		s.draw();
		
		
		s = new Rectangle();
		s.draw();
		
		

			
		

	
	}
	
}
//====================================================
// 강제성을 부여하지 않고 클래스를 정의하게 될 경우 발생하는 문제점              --> 강제성을 부여하는 방법: 추상메서드 만들기
 abstract class  Shape{
//	public abstract void draw(); //추상메서는 바디를 가질 수 없다!
	 public abstract void draw();
	 
}

 // 2. 추상클래스 Shape을 상속받는 서브클래스 Circle 정의
 // => 추상메서드가 존재하는 경우 서브클래스에서 반드시 추상메서드를 구현(implements)해야한다
 //    구현과 오버라이딩은 동일한 기능이지만 메서드 바디{}를 구현하는데 목적이 있기 떄문에 다른용어로 표현함
 
 class Circle extends Shape{
	 @Override // 오류 자동 완성시 implement(구현하다)라고 표현함
	public void draw() {
		 System.out.println("추상클래스로부터 상속받는 추상메서드 오버라이딩");
		 System.out.println("원 그리기!");
	}
 }

// Shape 클래스를 상속받는 Rectangle 클래스 정의
 
 class Rectangle extends Shape{
 	//추상메서드 오버라이딩이 강제성이 부여되므로
 	// 개발자가 실수로 빠뜨릴 위험이 없어짐!
	 
	 
	@Override
	public void draw() {
		System.out.println("추상클래스로부터 상속받은 추상 메서드 오버라이딩");
		System.out.println("사각형 그리기!");
		
		
	}


 }
	
	 
 
 

//==================================================================
// 도형 클래스 정의


//class shape{
//	
//	public void draw() {
//		System.out.println("도형 그리기!");
//	}
//	
//}
//
//// 원 클래스 정의
//class Circle extends shape{
//	/*
//	 * Shape 클래스를 상속받는 Circle 클래스는 draw() 메서드를 갖게 되지만 
//	 * draw() 메서드를 오버라이딩 하지 않고 다른 메서드를 정의하여
//	 * 원을 그려도 부모(shape) 입장에서는 강제할 방법이 없다!
//	 * 	 * 
//	 * 	
//	 */
//	
//	public void circleDraw(){
//		System.out.println("동그라미 그리기");
//		
//	}
//	
//	
//	
//}
//
//// 사각형 클래스 정의
//class Rectangle extends shape{
//	/*
//	 * shape클래스를 상속받는 Rectangle 클래스도 draw() 메서드를 갖게 되지
//	 * 실수로 인해 draw() 메서드 오버라이딩을 하지 않았더라도
//	 * 부모(Shape) 입장에서는 강제할 방법이 없다!
//	 * 
//	 */
// }