
public class Ex {

	public static void main(String[] args) {

		/*
		 * 별도의 클래스 구현체 정의하지 않고 바로 쓰레드 구현하는 방법
		 * 
		 */
		
		
		// Thread 클래스의 인스턴스 생성 시 생성자에 Runnable 객체 전달 필요
		// => 이 때 별도의 구현체 클래스를 정의하지 않고
		// Runnable 인터페이스 객체 생성하면서 run() 메서드 오버라이딩까지
		// 한꺼번에 수행하는 방법 사용 가능
		
		// 한개의 메서드안에서 구현체 없이 한꺼번에 수행하는 방법 
		
		//코드 압축 5단계 추후에 할 예정
		
		
//		Thread t1 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for(int i = 1; i <= 1000000; i++) {
//					System.out.println("A작업" + " : " + i);
//				}
//				
//				
//			}
//		
//					
//			
//			
//		});
//		
//		
//		
//		Thread t2 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for(int i = 1; i <= 1000000; i++) {
//					System.out.println("B작업" + " : " + i);
//				}
//				
//				
//			}
//		
//					
//			
//			
//		});
		
		
		//===========================================================
		// Runable 인터페이스를 바로 구현하지 않고
		// Thread 클래스의 run() 메서드를 직접 오버라이딩하는 방법
		Thread t1 = new Thread() {
			//Thread 클래스 생성자 호출 코드 뒤에 중괄호{} 를 붙이고
			// 중괄호 내에서 오버라이딩을 수행하면 된다!
			@Override
			public void run() {
				for(int i = 1; i <= 1000000; i++) {
					System.out.println("A작업" + " : " + i);
				}
			}
			
		};
		
		Thread t2 = new Thread() {
			//Thread 클래스 생성자 호출 코드 뒤에 중괄호{} 를 붙이고
			// 중괄호 내에서 오버라이딩을 수행하면 된다!
			@Override
			public void run() {
				for(int i = 1; i <= 1000000; i++) {
					System.out.println("B작업" + " : " + i);
				}
			}
			
		};
		
		t1.start();
		t2.start();
		
		//========================================================
		//만약, start() 메서드 외에 별도로 접근할 일이 없을 경우
		//Thread 클래스의 임시객체(저장할 변수가 없으니 한번만 쓰고 버리는 용도)
		// 바로 start() 메서드까지 호출을 수행

		// 람다 표현식(Lambda Expression)!!
		
		
		new Thread(new Runnable() {    //인터페이스 인스턴스 뒤에 바로 구현부 붙이는 문법
			
			@Override
			public void run() {
				for(int i =1; i<=1000000;i++){
					System.out.println("C작업" + " : " + i);
					
				}
				
			}
		}).start();
		
		
		// 메서드안에서 특정수행을 일임하기 위한 코드 (실무에서 많이 보게 될것임)
		
		
		
		
	}
}

