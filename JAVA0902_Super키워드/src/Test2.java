
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student("홍길동", 20, "900000-000000", "서울대", "001");
		
		System.out.println(s.getinfo());
		
		
	}

}

class Person2{
	String name;
	int age;
	String jumin;
	
	public Person2(String name, int age, String jumin) {  // name, age, jumin을 초기화하는 생성자 생성
		super(); // 슈퍼클래스 object 클래스의 기본 생성자 호출코드 (생략가능)
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
	
	// 메서드 정의
	// 이름, 나이, 주민번호를 문자열로 결합 후 리턴하는 getinfo()메서드 정의
	
	public String getinfo() {
		return name + ", " + age +", " + jumin;
	
	}
	
}

/*
 * Student 클래스 정의
 * - 멤버변수 : 학교명(schoolName, 문자열), 학번(schoolId, 문자열)
 * - 생성자 : 이름, 나이, 주민번호, 학교명, 학번을 전달받아 초기화
 * - 메서드 : getInfo() 메서드 오버라이딩
 *            => 이름, 나이, 주민번호, 학교명, 학번을 문자열 결합 후 리턴 
 */

class Student extends Person2{

	String schoolName;
	String schoolId;
	
	
	
	
	
	public Student(String name, int age, String jumin, String schoolName, String schoolId) {
		super(name, age, jumin);
		this.schoolName = schoolName;
		this.schoolId = schoolId;
	}


	



	//getinfo() 메서드 오버라이딩	
	

	@Override
	public String getinfo() {
		// TODO Auto-generated method stub
		return super.getinfo() + ", " + schoolName + ", " + schoolId;
	}
	
	

	
}
 

