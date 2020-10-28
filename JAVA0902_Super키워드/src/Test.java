
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpiderMan sm = new SpiderMan();
		
		sm.isSpider = true; // 스파이더 모드 설정
		sm.jump(); // SpiderMan 클래스의 점프 기능 호출됨
		
		sm.isSpider = false; //스파이더모드 해제
		sm.jump(); // SpiderMan 클래스의 jump() 메서드에서
		// 슈퍼클래스인 Person 클래스의 점프 기능이 호출됨
	
		
	}
}


class Person{
	String name;
	int age;
	
	public void eat(){
		System.out.println("밥먹기");
	}
	
	public void jump() {
		System.out.println("일반인의 점프!=> if문이 false");
		
	}
	
}

class SpiderMan extends Person{
	// 스파이더맨 모드 여부를 저장하는 boolean 타입 변수 isSpider 선언
	boolean isSpider=false;

	public void fireWeb(){
		System.out.println("거미줄 발사! ");
		
	}

	
	
	@Override
	public void jump() {
		//스파이더 모드(isSpider)가 true 일 때(스파이더모드)
		// "스파이더맨의 엄청난 점프!" 출력
		// flase일때 
		// Person 클래스의 메서드를 호출하도록
		
		if(isSpider) {  //isSpider == true 와 동일
			
			System.out.println("스파이더맨의 엄청난 점프! => if문이 true");
		}else {
			super.jump(); 
		}
		
		
	}
	
}

