
public class Ex2 {

	public static void main(String[] args) {
		// Student 클래스의 인스턴스 생성(변수명 s1)
		Student s1 = new Student();
		
		// Student 인스턴스 생성 시 기본값 확인
		// s1 인스턴스의 각 인스턴스변수에 접근하여 데이터 출력
		System.out.println("이름 : " + s1.name);
		System.out.println("과정명 : " + s1.className);
		System.out.println("나이 : " + s1.age);
		
		// 각 인스턴스 변수값 초기화 및 출력
		// 이름 = 각자 이름
		// 과정명 = 빅데이터 활용 자바 파이썬 개발자 양성
		// 나이 = 각자 나이
		s1.name = "홍길동";
		s1.className = "빅데이터 활용 자바 파이썬 개발자 양성";
		s1.age = 20;
		
		System.out.println("이름 : " + s1.name);
		System.out.println("과정명 : " + s1.className);
		System.out.println("나이 : " + s1.age);
		
		System.out.println("===============================");
		
		// 새로운 학생 추가(= 새로운 Student 인스턴스 생성, 변수명 s2)
		Student s2 = new Student();
		s2.name = "이순신";
		s2.className = "네트워크 서버 보안 과정";
		s2.age = 44;
		System.out.println("이름 : " + s2.name);
		System.out.println("과정명 : " + s2.className);
		System.out.println("나이 : " + s2.age);
		
	}

} // Ex2 클래스 끝

// 하나의 java 파일 내에 여러개의 클래스를 정의할 수 있다.
// => 단, java 파일명과 동일한 클래스에만 public 키워드를 사용
// 학생(Student) 클래스 정의
class Student {
	// 인스턴스 멤버변수 선언
	// 1. 학생 이름(name, 문자열)
	// 2. 학생 반 이름(className, 문자열)
	// 3. 학생 나이(age, 정수)
	String name; // 기본값 null 로 초기화
	String className; // 기본값 null 로 초기화
	int age; // 기본값 0 으로 초기화
}











