
public class Ex2 {

	public static void main(String[] args) {

		/*
		 * 멀티 쓰레드(Multi Thread)환경
		 * 
		 *  - 하나의 프로세스(Process) 내에서 여러 작업들을
		 *    번갈아 가면서 처리할 수 있도록 구현한 환경
		 *    ex) 메신저에서 파일을 전송하면서 채팅 메시지를 입/출력 시
		 *        파일 전송 쓰레드, 메시지 입력 쓰레드, 메시지 출력 쓰레드로
		 *        사가지 작업을 번갈아 가면서 수행하기 때문에 하나의 작업이
		 *        진행중이더라도 다른 작업을 대기하지 않고 번갈아가면서 수행하여
		 *        마치 동시에 수행되는것처럼 만드는 것
		 *  - 멀티 쓰레딩으로 구현된 프로그램은 동작속도가 빨라지는것 보단
		 *    대기 없이 여러작업을 번갈아 가면서 빠르게 수행하는데 중점을 둠! 
		 *    ==> (멀티 쓰레드를 쓴다고 절대 수행 속도가 빨라지는것은 아니다!)      
		 * 
		 * 
		 * < 멀티 쓰레드 환경 구현 방법 2가지>
		 * 
		 * 멀티 쓰레드를 구현할 클래스를 구현할 때
		 * 1. Thread 클래스를 상속받아 정의
		 *    - run() 메서드를 오버라이딩 하여 멀티쓰레딩으로 처리할 코드를 기술
		 *    - Thread를 구현한 클래스 객체의 run()메서드를 호출하는 것이 아니라
		 *      반드시 start() 메서드를 호출해야 한다! 
		 * 2. Runable 인터페이스를 구현하여 정의   <- 이 방법을 많이 씀
		 *    why? 상속 받을게 많으므로.. extends는 하나밖에 상속 못함
		 *    - 다른 클래스를 상속받은 경우 Thread 클래스 상속이 불가능하므로
		 *      이 때, Runnable 인터페이스를 구현하는 클래스를 정의
		 *    - Thread 클래스와 마찬가지로 run() 메서드 오버라이딩은 동일함
		 *    - 단, Runnable 인터페이스 내에 start() 메서드가 없으므로
		 *      Thread 클래스의 인스턴스를 통해 Runnable 구현체를 전달하고
		 *      Thread 객체의 start() 메서드를 호출하여 간접적으로 실행해야함
		 * 
		 * 
		 * 공통점 : Run 메서드 오버라이딩
		 * 차이점 : 인터페이스에는 start() 메서드가 없음!
		 * 
		 */
		
		
		YourThread mt1 = new YourThread("A작업", 100);
		YourThread mt2 = new YourThread("B작업", 50);
		YourThread mt3 = new YourThread("C작업", 100);
//
//		mt1.run();
//		mt2.run(); // nt1.run() 메서드 실행이 종료되면 실행됨
//		mt3.run(); // nt1.run() nt2.run() 메서드
		// => 주의! run() 메서드를 직접 호출하는 것이 아니라
		//    start() 메서드를 호출해야 멀티쓰레딩이 수행됨
		
		    //자동완성해서 아이콘에 시계가 달려있으면 멀티쓰레드와 관련 있음
		
//		mt1.start();// 호출 불가능한 메서드(존재하지 않음)
		// 반드시Thread 클래스의 객체를 통해 
		// Runnable 인터페이스를 구현한 구현체 클래스 인스턴스를 전달하고
		// Thread 객체의 start() 메서드를 호출해야한다!
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		Thread t3 = new Thread(mt3);
		
		// Thread 객체의 start() 메서드를 호출하여 간접적으로 실행
		t1.start();
		t2.start();
		t3.start();
		
		
		// => mt1.run(), mt2.run(), mt3.run() 메서드가 **번갈아가며** 수행됨
		//    수행횟수, 수행순서 등은 스케쥴러에 따라 항상 변할 수 있음
		//    즉, 실행 결과가 항상 같을 수 없다!
	}

}

//멀티 쓰레드 환경을 구현할 MyThread 클래스 정의
// => java.lang.Thread 클래스를 상속받아 정의
// => 
class MyThread extends Thread{
	String name;
	int count;
	
	
	
	@Override
	//멀티 쓰레딩으로 처리될 코드를 기술하는 공간(메서드)
	public void run() {
		super.run();
		for(int i =1; i<=count; i++) {
			System.out.println(name + " : " + i);

		}
	
	}



	public MyThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	
}

// 2. java.lang.Runnable 인터페이스를 구현하여 정의
// 인터페이스는 추상메서드(실행코드가 없는ㄱ  상수만 가질 수 있따.
class YourThread implements Runnable {  //Runable 을 상속받은것만으로는 쓰레드가 될 수 없음

	String name;
	int count;
	
	public YourThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	@Override
	public void run() {
		// 멀티쓰레딩으로 처리될 코드를 기술하는 공간(메서드)
		for(int i = 1; i <= count; i++) {
			System.out.println(name + " : " + i);
		}
	}
	
}
