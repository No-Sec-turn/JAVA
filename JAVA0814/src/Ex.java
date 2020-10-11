import java.security.CryptoPrimitive;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Animal 클래스의 인스턴스(a1) 생성 및 데이터 저장 후 출력
		// ex) 이름 : 멍멍이, 나이 : 2
		// ex) 이름 : 야옹이, 나이 :3
		
		
		/*
		 * 클래스의 메서드(Method)
		 *  - 클래스 내에서 객체의 동작을 정의하는 것
		 *  - 기본적으로 메서드 호출되어야만 사용 가능
		 *    => 호출하는 메서드 : Caller, 호출당하는 메서드 : Worker
		 *    
		 * - 주로, 인스턴스 변수의 데이터를 저장하거나 꺼내서 사용하는 목적
		 * - 클래스 내의 메서드 구현부에서 클래스의 인스턴스 변수를 사용하면
		 *   인스턴스마다 변수내의 데이터는 달라지지만 매서드는 동일하므로 코드는 같고, 실행되는 데이터가 달라짐
		 *     
		 * < 메서드 정의 기본 문법 >
		 * [제한자] 리턴타입 메서드명([매개변수선언....]){
		 * 
		 * 	//메서드가 호출
		 * 
		 * 
		 * 
		 */
		
		
		
		
		Animal a1 = new Animal();
		
		a1.name = "멍멍이";
		a1.age  = 2;
		
		//a1.System.out.println(a1.name + a1.age);
		
	
		a1.print();
		
		
		// ==> 새로운 인스턴스  a2 생성
		
		Animal a2 = new Animal();
		
		a2.name = "야옹이";
		a2.age = 3;
		
		System.out.println(a2.name + a2.age );
		
		
// 동물(Animal) 클래스 정의
// 멤버변수 : 이름(name), 나이(age)
		
		
		
	}	
		
}
		
class Animal{
	// 멤버변수
	String name;
	int age;
	
	
	// "동물 울음 소리!" 를 출력하는 메서드 cry() 정의
	// => 매개변수도 없고, 리턴값도 없는 메서드
	
	public void cry() {
		System.out.println("동물 울음 소리!");
	}
	
		// 인스턴수 name 과 age의 데이터를 출력하는 메서드 print () 정의
	
	public void print() {
		// 클래스 내의 메서드에서는 멤버변수(인스턴스변수)에 자유롭게 접근 가능
		// => 단순히 변수 명만으로 접근
		System.out.println("이름:" + name +", 나이: " + age);
	

	}
	

}
				
		
		
	
		
		
	
	
	
	



