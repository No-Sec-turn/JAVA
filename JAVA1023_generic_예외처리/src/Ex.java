import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Ex {
	public static void main(String[] args) {

		/*
		 * 제네릭(Generic) => 일반화(Generalization) - 컴파일 시점에 사용가능한 객체의 타입을 체크하는 것 - 클래스 또는
		 * 인터페이스를 정의할 때 해당 클래스 또는 인터페이스에서 사용하기 위한 어떤 타입을 미리 지정하는 것이 아니라 제네릭 타입으로 선언한 후
		 * 실제 객체 사용을 위해 인스턴스를 생성하는 시점에서 사용할 타입을 결정하는 것 - 자바에서 제공하는 컬렉션 프레임워크 등 클래스 및
		 * 인터페이스에는 제네릭이 적용된 경우가 많으며, 이 클래스 등의 인스턴스 생성 시 실제 사용할 데이터 타입을 지정해줘야한다..
		 * 
		 * 
		 */

		NormalBox nb = new NormalBox();

		nb.setSome(new Toy()); // 객체 저장하기
		// => Object 타입으로 저장할 경우 모든 데이터타입 사용 가능

		Object some = nb.getSome(); // 저장된 객체 가져오기
		// => Object 타입으로 저장할 경우 모든 데이터 타입 사용 가능

		// Object 타입으로 리턴받은 객체의 상세 내용에 접근하려면
		// 해당 객체의 클래스 타입으로 강제 형변환(다운캐스팅)이 필요함
		// 단, 변환 시 발생할 수 있는 ClassCastException을 방지하기 위해
		// instanceof 연산자를 통한 타입 변환 가능 여부 체크가 필요함

		if (some instanceof Toy) { // Icecream 타입인지 판별

			Toy toy = (Toy) some; // Icecream 타입으로 다운캐스팅

		} else if (some instanceof Icecream) {
			// icecream 으로 다운 캐스팅
			Icecream icecream = (Icecream) some;

		}

		//========================================
		// => 주의! 제네릭 타입에 실제 데이터 타입 지정시
		// 반드시 참조 데이터를 사용해야한다!
		
//		GenericBox<int> gb;// 기본 데이터 타입은 제네릭 타입 지정이 불가
//		GenericBox<Integer> gb; //Wrapper 클래스 타입으로 사용 가능 
		
		
		//GenericBox 인스턴스의 제네릭 타입을 Toy 타입으로 지정하기 위해
		// 클래스명 뒤에 <Toy> 타입을 지정하고 
		// 생성자 호출 코드의 생성자명 뒤에도 <Toy> 타입을 지정
		// => 클래스 내의 임시 저장 데이터타입(T)이 모두 Toy타입으로 지정
		// 
		
		GenericBox<Toy> toybox = new GenericBox<Toy>();
		// 파라미터 타입이 Toy 타입으로 변경되었으므로
		// 다른 데이터타입은 사용 불가능하게 바뀐다!
		// => 즉, 데이터를 저장하는 시점에서 미리 타입 검사가 수행됨
		
//		toybox.setSome(new icecream()); // 오류발생! Toy 타입만 생성 가능
		toybox.setSome(new Toy());
		
		// 저장된 객체를 꺼내올 때 별도의 변환 없이
		// 원본 그대로의 타입을 사용하기 때문(문제 발생 소지 없음)
		Toy toy = toybox.getSome();
		
		//만약, 다른데이터타입의 객체를 저장해야할 경우
		//새로운 객체를 생성하는 시점에서 해당데이터 타입을 지정하면 됨
		GenericBox<Icecream> icecreamBox = new GenericBox<Icecream>();
		icecreamBox.setSome(new Icecream());
		Icecream ic = icecreamBox.getSome();   //getter 에서도 Icecream 타입만 받아옴
		
		System.out.println(ic);
		
		//Object 타입의 경우 <generic>을 생략해도 Object로 적용 됨
		GenericBox box = new GenericBox();
		
	
		
		
		
	}
	
}

class Toy {
	String toyName;

}

class Icecream {
	String IcecreamName;
}

//제네릭 타입을 적용한 클래스 정의
// => 클래스 또는 인터페이스 선언 시 이름 뒤에 <>기호를 쓰고
//     해당 기호 사이에 알파벳 대문자 한 글자를 지정
//     (클래스 내에서 사용하게 될 임시 데이터타입 이름 지정)
//     주로 대문자 T(type) 또는 E(Element)를 사용
// => 지정된 임시 데이터타입은 실제 객체 생성 시점에서 실제 데이터 타입으로 변경됨
// (선언 시점에서는 실제 존재 하지 않는 데이터 타입)
class GenericBox<T> { // 부등호 사이에 T라는 알파벳을 넣은 순간 <T>를 데이터 타입처럼 쓸 수 있음 // a,b,c 다 가능..

	private T some; // 변수 some의 데이터타입은 무엇으로도 변할 수 있음

	public T getSome() {
		return some;
	}

	public void setSome(T some) {
		this.some = some;
	}
	
//	public void method() {
//		// 제네릭 타입은 instanceof 연산자의 타입파라미터로 사용 불가
//		Object o = new Object();
//		if(o instanceof T) {}
//	}
	
	
}

// 일반적인 클래스 정의
class NormalBox {
	private Object some; // Toy, icecream 등 다양한 타입을 저장하기위해 Obejct 타입으로 선언

	public Object getSome() {
		return some;
	}

	public void setSome(Object some) {
		this.some = some;
	}
}


interface Useable<D> {}

class Superclass<P> {
	protected P product;
	
}

class SubClass<P,D> extends Superclass<P> implements Useable<D> {
	public void method() {
		
		
	}
	
}