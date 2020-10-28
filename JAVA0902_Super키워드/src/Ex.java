
public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	super 키워드
		 * 	- this와 마찬가지로 자동 생성되며, 특정 인스턴스 주소가 저장
		 *  - this는 자신의 인스턴스를 가리키지만, super는 자신의 부모(슈퍼클래스)의 인스턴스를 가리킴
		 *  - this 사용법과 동일한 방법으로 사용하며 슈퍼클래스의 접근 하는 용도로 사용
		 *  
		 *  
		 *
		 * 	cf) this 사용법
		 *  	1)  this. 을 붙여 내자신의 메서드나 멤버변수(내 인스턴스 변수)를 가리키기위해
		 *  	2) 생성자 this --> 내 자신의 또다른 생성자를 호출하는 모양
		 *  
		 *  1. 레퍼런스 super
		 *     - 슈퍼클래스의 인스턴스에 있는 멤버 (변수, 메서드)에 접근
		 *     - 오버라이딩으로 인해 은닉된 슈퍼클래스의 변수 또는 메서드에 접근하기 위해 용도로 사용
		 *     - 기본 사용법 : super.멤버변수 또는 메서드();
		 *     
		 *     
		 */
		
		Employee e = new Employee("홍길동", 3000);
		
		System.out.println(e.getEmployee()); // 리턴 값을 받기위해서는 출력문안에 넣거나 변수에 담에서 변수를 출력해야함!
		
		System.out.println("---------------------------");
		
		Manager man = new Manager("이순신", 5000, "개발1팀");
		
		System.out.println(man.getEmployee());
		
		System.out.println("---------------------------");
		
		Engineer en = new Engineer();
		
				
		System.out.println(en.getEmployee());
		
		en.print();
		
	}

}


//직원(Employee) 클래스 정의
// 멤버변수 : 이름(name, 문자열), 연봉(salary, 정수)
// 생성자
// 1) 기본 생성자 - 아무 작업도 수행하지 않음
// 2) 이름, 연봉 전달받아 초기화하는 생성자
// - 메서드
// 1) getEmployee() : 파라미터 없음, 리턴타입 String
//  ==> 이름, 연봉 문자열 결합 후 리턴

class Employee{
	
	String name;
	int salary;
	
	public Employee() {
				
	}
	
	
	
	public Employee(String name, int salary) { // 이름, 연봉 전달 받아 초기화하는 생성자
		super();
		this.name = name;
		this.salary = salary;
	}



	public String getEmployee() {

		
		return name + ", "+ salary;
	
	}
	
}

/* Manager 클래스 정의 - Employee 클래스를 상속
 * - 멤버변수 : 부서명(depart, 문자열)
 * - 생성자 : 이름, 연봉 부서명을 전달받아 초기화하는 생성자
 * - 메서드
 *  1) getEmployee() 메서드 오버라이딩
 *   ==> 이름, 연봉, 부서명을 문자열로 결합 후 리턴
 * 
 */

// Manager 클래스를 정의 - Employee 클래스를 상속 받아서 정의
class Manager extends Employee{
	String depart;
	

	
	public Manager(String name, int salary, String depart) {
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}


	
	@Override

	public String getEmployee() {
		//이름, 연봉, 부서명을 문자열로 결합하여 리턴하도록 오버라이딩
		// ==> 현재 Manager 클래스 내에서 더이상슈퍼클래스인 Employee 클래스의 getEmployee() 메서드는 보이지 않는다!
		//return name + ", " + salary + ", " + depart;
		
		//슈퍼클래스인 getEmployee() 메서드에서 이미
		//이름(name), 연봉(salary)을 문자열 결합하여 리턴하므로
		// 슈퍼클래스의 getEmployee() 메서드를 호출한 뒤
		// 부서명(depart)만 별도로 결합해도 된다.
		// => 이 때, 슈퍼클래스의 동일한 메서드를 호출하려면 super.메서드명() 을 통해 은닉된 메서드 호출이 가능
		
		return super.getEmployee() + ", " + depart;
		
		
	}



}
	

// Engineer 클래스 정의 - Employee 클래스 상속

class Engineer extends Employee{
	//메서드와 마찬가지로 멤버변수도 슈퍼클래스와 동일한 변수 선언시 
	// 슈퍼클래스의 멤버변수는은닉되어 보이지 않게 됨
	String name = "엔지니어이름";
	String skill;
	

	@Override
	public String getEmployee() {
		
		
		// TODO Auto-generated method stub
		
		//동일한 이름을 통해 부모의 변수가 은닉되면
		// 서브클래스에서 해당 변수 사용시 서브클래스의 변수가 호출됨
		//return name + ", " + salary + ", " + skill;
		
		// super는 부모를 지칭하므로 부모의 메서드의 name 은닉되어 뵈지 않음
		//return super.getEmployee() + ", " +skill;
		
		//만약, 슈퍼클래스의 은닉된 멤버변수에 접근하려면
		// suepr. 변수명의 형태로 부모의 은닉된 변수에 접근 가능
		return super.name + ", " + salary + ", " + skill;
			
	}
	
	//로컬변수, 멤버변수, 슈퍼클래스의 멤버변수를 각각 호출하는 방법
	public void print(String name) { //로컬변수
		//로컬변수(매개변수), 멤버변수, 슈퍼클래스의 멤버변수 이름이 모두 같을 때
		System.out.println("name = " + name); // 로컬변수
		System.out.println("this.name = " + this.name); // 자신의 인스턴스변수 
		System.out.println("super.name = " + super.name); //부모의 인스턴스변수
	}
	
	public void print() { //로컬변수
		//멤버변수, 슈퍼클래스의 멤버변수 이름이 모두 같을 때
		System.out.println("name = " + name); // 자신의 인스턴스변수
		System.out.println("this.name = " + this.name); // 자신의 인스턴스변수 
		System.out.println("super.name = " + super.name); //부모의 인스턴스변수
	}
	
	
	
}
