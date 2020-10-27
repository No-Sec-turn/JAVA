public class Ex2 {

	public static void main(String[] args) {
		
		// 쓰레드의 이름
		// => 디버깅 등의 용도로 사용할 수 있음
		// => 쓰레드 객체의 getName() 메서드를 호출하여 얻어올 수 있음
		
		
		
		// 현재 동작중인 쓰레드 객체 가져오기
		Thread mainThread = Thread.currentThread();
		
		System.out.println("현재 쓰레드명:" + mainThread.getName());
		
		Thread threadA = new Thread();
		
		System.out.println("ThreadA 쓰레드명" + threadA.getName());
		
		Thread threadB = new Thread();
		
		System.out.println("ThreadB 쓰레드명" + threadB.getName());
		
		Thread threadC = new Thread("Thread C");
		
		System.out.println("ThreadC 쓰레드명" + threadC.getName());
		
		threadC.setName("Thrad-C2");
		System.out.println("ThreadC 쓰레드명" + threadC.getName());
	
		
	}

}
