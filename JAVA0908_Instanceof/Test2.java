
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee("1111", "홍길동", 4000);
		
		Manager  man = new Manager("222", "이순신", 5000, "영업팀");
		
		Engieer eng = new Engieer("333", "강감찬", 3000, 3);
		
		
		
	}

}


class Employee{
	String id; //사원 번호  멤버변수(인스턴스 변수)
	String name; // 사원 이름
	int salary; // 연봉

	
	// 사원번호 이름을 전달받아 초기화 하는 생성자 Emp
	public Employee(String id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// 사원 정보(사원번호, 이름)을 문자열로 결합하여 리턴하는
	// getEmployee() 메서드 정의
	public String getEmployee() {
		return id + ", " + name+ ", " + salary;
		
	}
	
	// 1. 메서드 오버라이딩을 통해 각 클래스 에서 따로 연봉계산 할 경우
	//연봉을 계산하는 calcSalary() 메서드 정의
//	public void calcSalary(Employee emp) {
//		System.out.println("연봉 :" + salary);
//		
//	}
	
	// 2. 슈퍼클래스인 Employee 에서 모든 직원의 연봉을 다 계산 할 경우
	// ==> 메서드 하나로 Employee, Manaver, Engineer 인스턴스를 모두 전달받아야 하므로 업캐스팅 활용
	
	public void calcSalary(Employee emp) {
		//instanceof 연산자를 사용하여 Employee, Manager, Engineer 판별
		
		if(emp instanceof Manager) {
			//다운캐스팅 필요
			Manager m = (Manager)emp;
			
			
			
			//매니저의 연봉계산
			System.out.println("관리부서:" + m.depart + " 에 따른 연봉 계산");
			// ex) depart 가 "영업팀일 경우 보너스 50%"
			System.out.println("매니저의 연봉 : " + salary);
	
		}else 	if(emp instanceof Employee) {
			
			Employee e = (Employee)emp;
			//엔지니어의 연봉계산
			System.out.println("자격증 갯수:" + e.certCount + " 에 따른 연봉 계산");
			// ex) certCount 갯수 * 10만원 보내스 연봉
			System.out.println("엔지니어의 연봉 : " + salary);
		}else if (emp instanceof Employee) {
			
			System.out.println("사원의 연봉" + salary);
			
			
		}
		
		
	
		
		
	}
	
}

// Manager 클래스 정의 - Employee 클래스 상속
// 멤버변수 : 관리부서명(depart, 문자열)
// 사원번호, 이름, 관리부서명을 전달받아 초기화하는 생성자 Manager() 정의
// 사원정보(사원번호, 이름, 부서명)을 문자열로 결합하여 리턴하는
// getEmployee() 메서드 오버라이딩

class Manager extends Employee{
	String depart;

	public Manager(String id, String name,int salary , String depart) {
		super(id, name, salary);  // 슈퍼클래스의 생성자 호출하여 대신 초기화
		
		//=> 슈퍼클래스 Employee 에 기본 생성자가 없으므로
		//    파라미터 생성자를 명시적으로 호출하지않으면 오류 발생
		this.depart = depart;
	}

	@Override
	public String getEmployee() {
		// 오버라이딩으로 인해 은닉된 슈퍼클래스의 메서드를 호출하려면
		// 레퍼런스 super 를 통해 접근(super.메서드명())
		return super.getEmployee() + depart; 
	}

//	// 1. 메서드 오버라이딩을 통해 각 클래스 에서 따로 연봉계산 할 경우
//	@Override
//	public void calcSalary() {
//		// TODO Auto-generated method stub
//		System.out.println("관리부서:" + depart + " 에 따른 연봉 계산");
//		// ex) depart 가 "영업팀일 경우 보너스 50%"
//		System.out.println("매니저의 연봉 : " + salary);
//	}
//	
	
		
	
}

class Engieer extends Employee{
	int certCount;   //자격증 갯수

	public Engieer(String id, String name,int salary , int certCount) {
		super(id, name, salary);  // 슈퍼클래스의 생성자 호출하여 대신 초기화
		
		//=> 슈퍼클래스 Employee 에 기본 생성자가 없으므로
		//    파라미터 생성자를 명시적으로 호출하지않으면 오류 발생
		this.certCount = certCount;
	}

	@Override
	public String getEmployee() {
		// 오버라이딩으로 인해 은닉된 슈퍼클래스의 메서드를 호출하려면
		// 레퍼런스 super 를 통해 접근(super.메서드명())
		return super.getEmployee() + certCount; 
	}
	

//	// 1. 메서드 오버라이딩을 통해 각 클래스 에서 따로 연봉계산 할 경우
//	@Override
//	public void calcSalary() {
//		// TODO Auto-generated method stub
//		System.out.println("자격증 갯수:" + salary + " 에 따른 연봉 계산");
//		// ex) certCount 갯수 * 10만원 보내스 연봉
//		System.out.println("엔지니어의 연봉 : " + salary);
//	}
//	
//}







