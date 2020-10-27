import java.time.LocalTime;

public class Ex3 {

	public static void main(String[] args) {

		
		/*
		 * 쓰레드의 우선순위
		 * - 우선순위가 높은 쓰레드를 가급적 더 많이 실행해 주지만
		 *   무조건 우선순위에 따라 실행 되는 것은 아니다!
		 *    => 항상, 스케쥴링에 따라 실행되므로 결과는 항상 다를 수 있음
		 * 
		 * 
		 */
		
		
		MyThread mt1 = new MyThread("T");
		MyThread mt2= new MyThread("F");
		
		
		//쓰레드 우선순위 확인 : getPriority() 메서드 사용
		System.out.println("mt1의 우선순위"+mt1.getPriority());
		System.out.println("mt2의 우선순위"+mt2.getPriority());
		
		mt1.setPriority(Thread.MAX_PRIORITY); //우선순위 10로 지정
		mt2.setPriority(1);  //우선순위 1로 지정

		//쓰레드 우선순위 확인 : getPriority() 메서드 사용
		System.out.println("우선순위 지정후 mt1의 우선순위"+mt1.getPriority());
		System.out.println("우선순위 지정 후 mt2의 우선순위"+mt2.getPriority());

		
		
//		mt1.start();
//		mt2.start();
//		
		
		System.out.println("==========================");
		
			
		
		Timer t = new Timer();
		
		t.start();
		
		
	}

}


class MyThread extends Thread{

	public MyThread(String name){
	
	
		super(name);
	}

	@Override
	public void run() {
		for(int i =1; i<30;i++) {
			System.out.print(this.getName());  //현재 쓰레드 이름 출력
		}
		
	}
	
}

class Timer extends Thread{
	@Override
	public void run() {
		//현재 시각 정보 출력
		// 단, 1초마다 1번씩 출력하기 위해 현재 쓰레드 sleep 시키기
		for(int i=1;i<60;i++) {
		try {
			Thread.sleep(1000);  // 1000ms = 1s
			// => 1초 동안 일시 정지 상태가되어 대기풀(Waiting)에서 대기하다가
			//     지정되 시간이 만료되면 다시 Runnable 상태로 변경된 후
			//      CPU에 의해 실행될 때 Running 상태로 변경됨
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			System.out.println("째깍 : " + LocalTime.now());
		}
	}
	
}