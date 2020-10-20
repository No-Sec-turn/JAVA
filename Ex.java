import javax.swing.Box;

public class Ex {

	public static void main(String[] args) {

		
		/*
		 * Object 타입을 파라미터로 갖는 경우
		 * 모든 데이터타입을 전달 받을 수 있으므로
		 * 모든 객체를 전달 할 수 있기 때문에 데이터 저장시 편리함
		 * 그러나, 객체를 꺼내서 사용해야할 경우 형변환이 필요하며
		 * 잘못된 변환 수행시 ClassCastException이 발생할 수도 있다.
		 * 
		 * 장점 : 모든 타입을 다 받을 수 있다.
		 * 단점 : 모든 타입을 다 꺼내서 쓸 수 있기 때문에 꺼내 쓸때 검사 해야한다!
		 * 
		 */
		
		//NormalBox box = new NormalBox(new Toy());
		NormalBox box = new NormalBox();
		box.setItem(new Toy());
		
		Object item = box.getItem();
//		Toy toy= (Toy) item; // 다운캐스팅으로 형변환
		// 먄약, Toy 가 아닌 다른 객체일 경우 문제 발생하므로
		// 형변환 전 변환 가능 여부를 판별해야한다!
		// ==> Instanceof 연산자를 통해 변환 가능 여부 판별
		if(item instanceof Toy) {
			Toy toy = (Toy) item;
			
			
		}else if(item instanceof Icecream) { //Icecream 타입으로 변환 가능 한가?
			Icecream icecream = (Icecream)item;
				
			}else {
				System.out.println("변환 불가능한 객체");
			
		}
		
		
//		box.setItem(new Icecream());
//		item = box.getItem();
//		Icecream icecream = (Icecream)item;
		
	}
	
	

}

class Toy{
	String toyName;
	
}
	
class Icecream{
	String IcecreamName;
}



class NormalBox{
	
	Object item;
	
	public NormalBox() {}

	public NormalBox(Object item) {
		super();
		this.item = item;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}

	
	
	
	
	
	
}