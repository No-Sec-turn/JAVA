
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * super 클래스 사용법
		 * 
		 * 서브클래스의 생성자에서는 묵시적(implicit)으로 슈퍼클래스의 기본 생성자를 자동으로 호출(invoke)함
		 * => 이 때, 슈퍼클래스에 기본 생성자 없이, 파라미터 생성자만 존재할 경우
		 * 	  서브클래스의 생성자에서 기본 생성자를 호출하면 오류 발생하게 됨
		 * 
		 * 	해결책 1) 슈퍼클래스의 기본생성자 명시적으로 정의
		 * 	해결책 2) 슈퍼클래스의 파라미터 생성자를 명시적으로 호출
     	 *               => 생성자 super() 를 통해 파라미터 생성자 호출 가능
		 * 
		 * - 	생성자 super() 를 사용하여 슈퍼클래스 생성자를 호출하면
     	 *      슈퍼클래스의 멤버변수는 슈퍼클래스가, 서브클래스의 멤버변수는
     	 *      서브클래스가 초기화하게 되어, 초기화 코드 중복을 제거하게 됨
     	 *      => 생성자 this() 와 사용 용도가 동일함
     	 *    - 생성자 this() 처럼 생성자 내의 첫번째 라인에서 호출 필수!
     	 *      => 따라서, 생성자 this() 와 super() 는 동시 사용 불가!  
		 * 
		 */
		
		
		
	}

}


class Employee2{
	
	String name;
	int salary;
	
//	public Employee2() {
//		
//	}
	
	
	public Employee2(String name, int salary) { // 이름, 연봉 전달 받아 초기화하는 생성자
		super();
		this.name = name;
		this.salary = salary;
	}



	public String getEmployee() {

		
		return name + ", "+ salary;
	
	}
	
}

class Manager2 extends Employee2{
	String depart;
	

	
	public Manager2(String name, int salary, String depart) {
//		this.name = name;
//		this.salary = salary;
		
		//슈퍼클래스의 파라미터 생성자를 명시적으로 호출
		super(name, salary);
		// => 슈퍼클래스의 파라미터 생성자에서 멤버변수를 초기화하므로 
		//     서브클래스의 멤버변수만 직접 초기화하면됨 => 코드중복 제거
		// => 생성자 super() 보다 윗쪽에 코드가 올 수 없다!
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
	