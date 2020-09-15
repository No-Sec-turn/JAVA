
public class Ex2 {

	public static void main(String[] args) {

		Person p = new Person("홍길동", "11111-222222");
		System.out.println("국적 : " + p.nation  );
		System.out.println("이름 : " + p.name);
		System.out.println("주민번호: " + p.ssn);
			
		
		
	}

}

class Person{
	
	//final String nation; // final 변수는 초기화 하지 않으면 오류 발생!
	
	final String nation = "KOREA"; // 초기화 필수!
	
	String name;
	
	final String ssn; // 만약, final 변수 선언 시 초기화 하지 않을 경우
	// 생성자에서 초기화를 수행하면 오류가 발생하지 않음
	// => 변수 선언시 초기화 하지 않은 final 변수를 blank final 변수라고 함
	//	  blank final 변수는 생성자에서 반드시 초기화 필수!

	public Person(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
		
		ssn="11111";
		//한번 초기화 된 final 변수는 더이상 값 변경 불가능
		//nation = "대한민국";
		
	}
	
	
	

}