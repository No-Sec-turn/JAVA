
public class Ex2 {
	public static void main(String[] args) {
		// Ex2의 제목 : 인터페이스간의 상속과 클래스, 인터페이스의 동시 상속
	
		고래상어 고래상어 = new 고래상어();
		고래상어.번식();
		
		동물 동물 = 고래상어;  //업캐스팅
		동물.번식();
		
		
	
		
		
	}
	
	
}




// 두개의 부모인터페이스를 정의하고 하나의 인터페이스에서 모두 상속

interface ParentInterface1{
	public abstract void parentmethod1();
}


interface ParentInterface2{
	
	public abstract void parentmethod2();
}

// ChildInterface 인터페이스 정의 - ParentInterface1, ParentInterface2 상속
// 주의 1. 인터페이스간의 상속은 extends 키워드 사용
// 주의 2. 부모 인터페이스를 상속받은 자식인터페이스에서 추상메서드 구현 없음
//          ==> 인터페이스 내에는 무조건 추상메서드만 존재햐아하므로
interface Chileinterface extends ParentInterface1, ParentInterface2{
	// 2개의 인터페이스를 상속받으면
	// 부모인터페이스의 추상메서드와 자신의 추상메서드를 모두 갖게됨
	// 즉, parentmethod1(), parentmethod2() 추상메서드와
	
	public abstract void childMethod3(); // 자신의 추상메서드 총 3개를 갖는다
	
		
}

// SubClass2 클래스 정의 - ChildInterface 인터페이스 구현

class SubClass2 implements Chileinterface{

	@Override
	public void parentmethod1() {
		System.out.println("서브클래스에서 구현한 parentMethod1()");
		
	}

	@Override
	public void parentmethod2() {
		System.out.println("서브클래스에서 구현한 parentMethod2()");
	}

	@Override
	public void childMethod3() {
		System.out.println("서브클래스에서 구현한 parentMethod3()");
	}
	
}


// ============================================================

class ParentClass{
	
	public void normalMethod() {
		System.out.println("ParentClass의 normalMethod()");
	}
	
}
// extends 와 implements가 공존할 수 있다.
// interface 있는 이유
//extends 뒤에 클래스하나밖에 못받으니.. 자유도를 높히기 위해 interface로 계속 받아올수잇음



//하나의 서브클래스에는 하나의 슈퍼클래스와 1개이상의 인터페이스를 
//부모.로 가질 수 있다.

class SubClass3 extends ParentClass implements Chileinterface{

	@Override
	public void parentmethod1() {
	}

	@Override
	public void parentmethod2() {
	}

	@Override
	public void childMethod3() {
	}
	
}


// ======================================

//abstract class 동물{
//	
//	public abstract void 번식();
//	
//}
//
//class 고래 extends 동물{
//	@Override
//	public void 번식() {
//		System.out.println("새끼를 낳아 번식");
//	}
//}
//
//class 상어 extends 동물{
//	@Override
//	public void 번식() {
//		System.out.println("알을 낳아 번식");
//	}
//}

//// 만약, 클래스간의 다중 상속이 가능했다면 발생 할 수 있는 문제
//class 고래상어 extends 고래, 상어{
//	
//	//만약, 고래상어 클래스 내에서 번식() 메서드 호출하면
//	// 고래의 번식인가? 상어의 번식인가?
//	// => 다이아몬드 상속 관계에서의 문제(이슈)
//	//	  하나의 부모로부터 두 자식이 상속을 받고
//	//    다시 하나의 손자가 두 자식으로부터 상속을 받을 경우
//	//    부모로부터 상속된 메서드를 두 자식이 구현하고
//	//    손자가 해당 메서드를 접근 하려 할때 두 자식 중 누구의 메서드인지
//	//    구분 할 수 없게됨
//}



// 인터페이스는 다중 상속이 가능한 이유
interface 동물 {
	public abstract void 번식();
	
}

interface 고래 extends 동물{

	
	
	
}

interface 상어 extends 동물{


	
}

class 고래상어 implements 고래,상어{ 
	//고래.번식()? 상어.번식()? 구분할 필요가 없음!
	// why? 어차피 동일한 추상메서드임 구분 필요없이 바디{}만 구현하면 된다!
	

	@Override
	public void 번식() {
		System.out.println("알을 낳아 번식!");
		
	}
	
	


	
}



