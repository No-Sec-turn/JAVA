
public class Ex3 {

	public static void main(String[] args) {


	/*
	 * 인터페이스의 필요성(장점)
	 * 1. 구현의 강제로 표준화
	 *  - 추상메서드를 갖는 인터페이스를 서브클래스에서 상속받으면 
	 *    반드시 추상메서드를 구현해야함
	 *     => 따라서, 개발자가 실수로 구현을 빠뜨릴 위험이 없다.
	 *     
       2.모듈 교체가 쉬움   
         - 인터페이스를 통해 업캐스팅을 사용하여 다형성을 적용시켜
           단순한 모듈(객체) 교체만으로 동일한 코드를 사용하여
           여러 객체를 다룰 수 있게 됨
	 * 3. 상속관계가 없는 클래스끼리 관계 부여가 가능(다형성이 확장된다는 의미)
	 * 4. 모듈간 독립적으로 프로그래밍으로 개발 시간 단축   
	 * 
	 */

		
		//====  2. 묘듈 교체가 쉬움 예시 ====
		
		PrintClient pc = new PrintClient();
		pc.setPrinter(new LaserPrinter());
		
		pc.print("ex.java");
		
		pc.setPrinter(new DotPrinter());
		
		pc.print("ex.java");
		
		
	}

}

interface Printer{
	
	public abstract void print(String fileName);
}

class LaserPrinter implements Printer{
	
	@Override
	public void print(String fileName) {
		System.out.println("LaserPrinter로 출력중 - " + fileName);
		
	}
}

class DotPrinter implements Printer{
	@Override
	public void print(String fileName) {
		System.out.println("DotPrinter로 출력중 - " + fileName);
	}
	
}

class PrintClient{
	private Printer printer; // 인스턴스타입 참조변수 선언

	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public void print(String fileName) {
		// Printer 타입 객체 내의 print() 메서드를 호출하여
		// 전달받은 fileName 에 내용 출력하도록 요청
		
		printer.print(fileName);
		
		
	}
	
}

