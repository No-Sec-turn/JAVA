
public class Ex4 {

	public static void main(String[] args) {
		
		/*
		 * 쓰레드 동기화(Synchronization)
		 * - 여러 쓰레드가 하나의 객체를 공유할 때
		 *   각 쓰레드에서 처리하던 작업을 다른 쓰레드가 접근해서 변경하면
		 *   쓰레드에서 사용중인 데이터의 일관성이 깨지는 것을 방지
		 * - 특정 시점에서 동기화 메서드에 쓰레드가 접근하면
		 *   나머지 쓰레드는 접근하지 못하도록 잠금(Lock) 기능이 동작함
		 * - 메서드 정의 시 리턴타입 앞에 synchronized 키워드를 사용
		 */

		Account acc = new Account(5000000);
		
		WithdrawThread iBanking = new WithdrawThread("인터넷 뱅킹", acc, 1000);
		
		WithdrawThread mBanking = 
				new WithdrawThread("모바일 뱅킹", acc, 1000);
		
		iBanking.start();
		mBanking.start();
		
		
	}

}


class Account {
	int balance; // 은행 잔고

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	public int deposit(int amount) {
		balance += amount;
		
		return balance;
		
		
	}
	
	public synchronized int withdraw(int amount) {    //출금 동기화!!
		
		String threadName = Thread.currentThread().getName();
		if(balance >= amount) {
			try {
				Thread.sleep(300);  //0.3 초 재움
			} catch (InterruptedException e) {
				e.printStackTrace();
			
			
			}
			
			balance -= amount;
			
			
			System.out.println(threadName + "출금 => 잔액 : " + balance);
			
			
			
		
		
		}else {
			System.out.println(threadName + "출금 불가! 잔액부족!");
		
		
		
	}	
		
		return balance;
		
	}
	
}


class WithdrawThread extends Thread{
	Account account;
	int amount;
	public WithdrawThread(String name, Account account, int amount) {
		super(name);
		this.account = account;
		this.amount = amount;
	}
	@Override
	public void run() {
		for(int i = 1; i <= 600; i++) {
			// Account 객체의 withdraw() 메서드를 호출하여 출금금액 전달
			// 출금 작업 후 결과값으로 현재잔고를 리턴받기
			int balance = account.withdraw(amount);
	}
	
	
	
	
}
	
}