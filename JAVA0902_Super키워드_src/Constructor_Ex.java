public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/* 생성자(Constructor)
		 *  - 객체를 생성할 때 new 연산자 뒤에 붙어서 호출되며, 객체 초기화를 담당하는 메서드의 일종
		 *  - 객체 생성시 new뒤에서 단 한번만 호출 가능(임의로 호출 불가능)
		 *  - 메서드와 다른점
		 *   1) 생성자와 이름은 반드시 클래스명과 동일해야한다!
		 *   2) 리턴타입을 기술하지 않는다 (void 도 사용하지 않음)
		 *  - 클래스 정의 시 생성자를 하나도 정의하지 않을 경우
		 *    컴파일러에 의해 기본 생성자(Default Constructor)가 자동으로 생성됨
		 *     (public 클래스명() {} )
		 *      => 매개변수가 없고, 중괄호 블록 내에 코드가 없는 빈 생성자
		 *      
		 *      < 생성자 정의 기본 문법 >
		 *      
		 *       [접근 제한자 ] 클래스명([매개변수...]) {
		 *       // 생성자 호출(객체 생성) 시 수행할 코드들....
		 *       }
		 *       
		 *       < 기본 생성자 형태 >
		 *       public 클래스명() {}
		 *       
		 *    
		 * 
		 * 
		 * 
		 */
		
		
		
		Person p = new Person();
//		=> Person 클래스의 매개변수가 없는 Person() 생성자를 호출
   // 만약, Person() 생성자가
		p.name = "홍길동";
		p.age = 20;
		
		System.out.println(p.name);
		System.out.println(p.age);
		
		System.out.println("-------------------------------------------");
		
		DefaultPerson DDDD = new DefaultPerson();   // 인스터스 생성..
		// new DefaulPerson() 코드에 의해
		
		System.out.println("이름 " +  "DB.name");	
		System.out.println("나이 " +  "DB.age");
		
		System.out.println("-------------------------------------------");
		
		ParameterPerson PP = new ParameterPerson("홍길동", 20);
		System.out.println(PP.name + PP.age);
		
		}

}

//파라미터가 1개 이상인 파라미터 생성자 정의

class ParameterPerson{
	// 관례젹으로 클래스 밑에 맴버변수 정의
	String name;
	int age;
	// 다음 생성자 생성
	
	ParameterPerson(String newName, int newAge) {
		name = newName;
		age = newAge;
		
		
		System.out.println("ParameterPerson(String, int) 생성자 호출됨");
	}
	
	// => 파라미터 생성자는 한번 생성되면 
	
	//일반 메서드와 동일하게 생겅자에 전달할 데이터가 있을경우
	//생성자 정의 시 파라미터 부분에 매개변수를 선언할 수 있다!
	//이름 (newName_)
	
	
}



	
	

class Person{
	String name;
	int age;
	// 생성자가 하나도 정의 되지 않은 클래스는 컴파일러에 의해
	// 기본 생성자가 자동으로 생성됨
	
	// public Person() {}
	// => 컴파일러에 의해 생성될 기본 생성자는 생성됨
	
			
}


class DefaultPerson{
	
	//매개변수가 없는 기본생성자와 동일한 형태의 생성자를 정의
	// => 출력문을 사용하여 메세지 출럭!
	//일반 메서드와 동일하게 생성자에 전달할 데이터가 있을 경우
		// 생성자 정의시 파라미터 부분에 매개변수를 선언할 수있다!
	public DefaultPerson() {
	
	System.out.println("기본생성자 DefaultPerson() 호출됨!");	
		
	//생성자에서는 주로 멤버변수가 초디화나 다른 메서드의 호출을 통해
	// 객체가 실행될 떄 수행할 초기 작업을 수행하는 내용이 기술됨
	
	
	}
	
	
}

