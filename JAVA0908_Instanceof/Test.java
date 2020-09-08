
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Circle c = new Circle();
		c.rad = 3;
		//c.draw();
		
		
		Rectangle r = new Rectangle();
		r.line1 = 10;
		r.line2 = 20;
	//	r.draw();

		
		Triangle t = new Triangle();
		t.a = 10;
		t.b = 20;
		t.c = 30;
	//	t.draw();
		
		System.out.println("===================");
		
		Shape s = c;  // c에 있는 메서드에 접근 할 수 없지만 이미 오버라이딩 되어잇음
	//	s.draw();
		
		s = r;  // s라는 변수에 Rec 클래스의 인스턴스를 덮어씀
	//	s.draw();	

		s = t;
		//s.draw();
		
		System.out.println("=================");
		Circle c2 = new Circle();
		shapeDraw(c2);
		
		Rectangle r2 = new Rectangle();
		shapeDraw(r2);
		
	

		s.draw();
	
	
	}  // Main 메서드 끝
	
	
	


	public static void shapeDraw() {
		
		
	}
	
	public static void shapeDraw(Circle x) {
		x.draw();
	}
	
	// 메서드 오버로딩을 통해 다른 타입의 파라미터를 전달받을 수는 있음
	// => 코드의 중복이 발생함
	public static void shapeDraw(Rectangle x) {
		x.draw();
	}
	
	// Circle, Rectangle, Triangle 타입 인스턴스를 
	// 하나의 메서드에서 모두 전달받으려면 업캐스팅 활용하여 파라미터 선언
	// => 즉, 공통된 슈퍼클래스 타입인 Shape 타입의 변수를 
	//        메서드의 매개변수로 선언하면 모든 인스턴스를 하나로 전달 가능
	public static void shapeDraw(Shape s) {
		// 업캐스팅 후에도 공통된 메서드인 draw() 호출이 가능
		s.draw();
	
	}
	
	
	
	
	
	
	
} // Test 클래스 끝



/*
 * 도형(Shape)클래서 정의 - draw() 메서드 정의 : 파라미터 없음, 리턴 x => "도형 그리기!" 출력
 *	 
 * 
 * 원(Circle) 클래스 정의 - 도형 (Shape) 클래스 상속 - draw() 메서드 오버라이딩 => "원 그리기!" 출력
 *  - 멤버 변수 : 반지름(rad, 실수)
 * 사각형(Rectangle) 클래스 정의 - 도형 (Shape) 클래스 상속 - draw() 메서드 오버라이딩 => "사각형 그리기!" 출력
 *  - 멤버 변수 : 두 직선으 길이(line1, line2, 정수형)
 * 
 * 삼각형(Triangle) 클래스 정의 - 도형 (Shape) 클래스 상속 - draw() 메서드 오버라이딩 => "삼각형 그리기!" 출력
 *  - 멤버 변수 : 세 꼭지점이 좌표(a,b,c, 정수형) 
 * *
 */

class Shape {
	
	public void draw() {
		
		System.out.println("도형 그리기!");
	}

}

class Circle extends Shape {
	double rad;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(rad + "를 이용하여 원 그리기");
	}
	

}

class Rectangle extends Shape {
	int line1, line2;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(line1 +", " + line2 +"를 사용하여 사각형 그리기" );
	
	}

	
}

class Triangle extends Shape {
	int a, b, c;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(a + ", " + b + ", " + c + "꼭지점 세개 사용하여 삼각형 그리기");
	}
	
	
}