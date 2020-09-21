
public class Ex {

	public static void main(String[] args) {

		
		/*
		 * java.lang 패키지
		 * - 자바에서 기본이 되는 패키지
		 * - 자주 사용되는 자바 클래스와 인터페이스가 위치함
		 * - 별도의 import 없이도 접근 가능한 패키지
		 * - Object, String, Integer, System 등이 위치함
		 * 
		 * Object 클래스
		 * - 자바의 모든 클래스의 최상위 슈퍼클래스
		 * - 별도로 클래스를 상속받지 않으면 자동으로 상속되는 클래스
		 *   => 따라서, 모든 클래스는 Object 클래스의 멤버를 사용 가능
		 * - 대표적인 메서드
		 *   1) equals() : 두 객체가 같은지 비교 후 결과값 리턴
		 *      => 같은 주소를 참조하는지 동등 비교(==) 수행함
		 *      => 일반적으로 두 객체가 같은지를 비교하는 것은
		 *         두 객체의 멤버변수 값이 같은지를 비교하는 것이므로
		 *         equals() 메서드를 그대로 사용하지 않고
		 *         오버라이딩하여 객체 내의 참조변수 비교를 수행하도록 함
		 *      - 자바에서 제공되는 API 의 대부분의 클래스들은
		 *        equals() 메서드가 오버라이딩 되어 있으므로
		 *        두 객체 간의 실제 데이터에 대한 동등 비교가 가능
		 *        (ex. String, Wrapper 클래스들...)
		 *   2) toString() : 어떤 객체의 정보를 문자열로 리턴
		 */
				
		Person p1 = new Person("홍길동", "901010-1234567");
		Person p2 = new Person("홍길동", "901010-1234567");
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는주소값이 같다");
		}else {
			System.out.println("p1과 p2는 주소값이 다르다");
		}
		
		
		if(p1.name.equals(p2.name)) {
			System.out.println("객체안의 값이같다");
		}else {
			System.out.println("다르다");
		}
		
		System.out.println("------------------------");
		
		
		Person2 p3 = new Person2("이순신", "909090-23456789");
		Person2 p4 = new Person2("이순신", "909090-23456789");
		
		if(p3.equals(p4)) { // object클래스로부터 상속받아 오버라딩한 equals 메서드는 Person2꺼임.. 
			System.out.println("p3과 p4의 실제값이 같다");
		}else {
			System.out.println("p1과 p2는 실제값이 다르다");
		}
		
	}

}


class Person {

	String name;
	String jumin;
	
	public Person(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}
	
}

class Person2 {

	String name;
	String jumin;
	
	public Person2(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
	}


//	//object 클래스의 equals() 메서드 오버라이딩
//	@Override
//	// 메서드 호출 주체의 멤버변수와 메서드 파라미터 객체의 멤버변수를
//	// 비교하여 모두 같으면 true를 리턴하고, 하나라도 다르면 false를 리턴
//	public boolean equals(Object obj) {
//	// p1.equals(p2) 이므로 메서드 호출 주체 : p1
//	// 파라미터로 전달된 객체(Object obj 변수에 저장되는 객체) : p2
//		boolean result = false;
//		
//	// Object 타입으로 전달받은 객체는 다시 다운캐스팅 해야만 멤버에 접근가능
//	// => 다운캐스팅 전 타입 검사 필요(안전성을 위해)
//		if(obj instanceof Person2) {
//			//결과 값이 true이면 다운 캐스팅 가능
//			Person2 p = (Person2)obj;
//			
//			// Person2 타입 참조변수를 통해 p2 객체 내의 멤버변수에 접근 가능
//			if(name.equals(p.name) && jumin.equals(p.jumin)) {
//
//				// 만약 boolean 타입 변수를 사용하지 않을경우
//				//return true; //문장을 실행하면 됨
//				result = true;
//
//				
//			}
//			
//			
//			
//			
//		}
//		
//		
//		// 만약 boolean 타입 변수를 사용하지 않을경우
//		//return false; //문장을 실행하면 됨
//		return result;
//
//	}
	
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((jumin == null) ? 0 : jumin.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)   //this에는 내 인스턴스의 주소    // obj 매개변수의 전달받은 주소
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person2 other = (Person2) obj;   //다운캐스팅
		if (jumin == null) {
			if (other.jumin != null)
				return false;
		} else if (!jumin.equals(other.jumin))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}