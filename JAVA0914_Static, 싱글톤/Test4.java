
public class Test4 {

	public static void main(String[] args) {
	
//		SingletonClass st = new SingletoneTest(); //인스턴스 생성불가
		
		SingletonTest st = SingletonTest.getInstance();
		SingletonTest st2 = SingletonTest.getInstance();
		
		System.out.println(st.num + ", " + st2.num); //10,10 출력
		
		// 인스턴스 내의 인스턴스 변수 값을 변경하면 나머지도 공유됨
		st.num = 100;
		System.out.println(st.num + ", " + st2.num); // 100, 100 출력

		System.out.println("===========================");
		
		JavaTeacher jt = JavaTeacher.getInstance();
		JavaTeacher jt2 = JavaTeacher.getInstance();
		JavaTeacher jt3 = JavaTeacher.getInstance();
		
		
		jt2.name = "홍진숙";   // 인스턴스내 어떤 변수 값 하나라도 바뀌어도 전부 다 바뀜!!
		// ==> ex) 싱글톤 디자인패턴 활용처 : 금융권에서 한국거래소에서 주식 거래가 한 증권사에서 발생하면 모두 동시에 바뀐다..  
		System.out.println(jt.name + ", "+ jt2.name + " + " + jt3.name);
	}

}


// 	1. SingletoneTest 클래스 정의 => 싱글톤 디자인 패턴 적용


class SingletonTest{
	
	//1단계 객체 생성되면 안되기 때문에 생성자 정의시 private으로 선언
	// 1. 생성자 정의
	private SingletonTest() {
	}
	
	// 2단계 자신의 클래스내에서 직접 객체 생성
	// 2. 인스턴스 생성
	private static SingletonTest instance = new SingletonTest();
	
	//3.Getter 정의
	public static SingletonTest getInstance() {
		return instance;
	}
	
	// =====================================
	
	//싱글톤 패턴 객체 확인을 위한 인스턴스 변수 1개 선언
	int num = 10;
	
	
	
}


// 2. JavaTeacher 클래스 정의 => 싱글톤 패턴 적용

class JavaTeacher{
	
	String name = "이연태";
	
	//1. 단계 생성자 정의!! // 외부에서 인스턴스 생성 못하도록 생성자의 접근을 private으로 막음
	private JavaTeacher() {
		
	}
	
	//2 단계 자신의 클래스안에서 인스턴스 생성!
	// 
	private static JavaTeacher instance = new JavaTeacher();

	// 3단계 getter 정의!
	// private을 접근할 수있도록 getter 메서드 정의
	public static JavaTeacher getInstance() {
		return instance;
	}
	
	
	
}
