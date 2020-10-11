
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Account 인스턴스 생성후 다음과 같이 데이터 저장후 출력 계좌번호 : 111-1111-111 예금주명 : 홍길동 현재잔고 :
		 * 100,000원
		 * 
		 * 메서드 정의
		 * 1) 입금(deposit)
		 *  - 매개변수 1개(정수형 amount)
		 *  - 리턴값 없음
		 *  - 입금할 금액(amount)를 전달받아 현재잔고(balance)에 누적
		 *  
		 *  
		 *  2) 출금(withraw)
		 *  - 매개변수 1개(정수형 amount - 출금할 금액)
		 *  - 리턴값 있음(int - 출금된 금액)
		 *  - 출금할 금액(amount)를 전달 받아 현재잔고(balance)와 비교
		 *   => 만약, 현재잔고보다 출금할 금액이 클경우 출금 불가능 하므로
		 *			"출금 불가! (잔액 부족)"
		 *			"출금할 금액 : xxxx원, 현재 잔고: xxxx원" 출력 후 메서드 종료
		 *	=> 아니면, 현재 잔고보다 출금할 금액이 크지 않을 경우) 출금이 가능하므로
		 *		출금할 금액만큼 현재 잔고(balance)에서 차감한 후
		 *		출금할 금액을 리턴
		 *  
		 */
		
		
		
		Account a1 = new Account();
		
		
		
		a1.accountNo = "111-1111-111";
		a1.ownerName = "홍길동";
		a1.balance = 100000;
		a1.deposit(50000);    //색깔로도 인스턴스 변수, 매개변수 구분 가능
		
		System.out.println("계좌번호 : " + a1.accountNo );
		System.out.println("예금주명 : " +a1.ownerName);
		System.out.println( "현재잔고 :" +a1.balance);
		
		
		System.out.println("----------------------------------withraw");
		
		a1.withdraw(5000);
		System.out.println("--------------");
		a1.withdraw(5000000);
		System.out.println("나온 금액 :"+ a1.withdraw(5000000));
		
	
	
		System.out.println("===============================================");
		
		Account a2 = new Account();
		
		a2.accountNo = "91030345655";
		a2.ownerName = "홍순찬";
		a2.balance = 100000000;
		
		a2.withdraw(99999999);
		System.out.println("나온 금액 :"+ a2.withdraw(5000000));
		
		
	
	}

}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	

	void deposit(int amount){
	
		
		balance += amount; 
		
		System.out.println("입금된 금액" + amount);
		System.out.println("현재 잔고" + balance);
			
	}
	
	
	int withdraw(int amount){
		
		if(amount <= balance) {
		balance -= amount;
		
		System.out.println("출금할 금액 : " + amount);
		System.out.println("현재 잔고 :" + balance);
		
	
	
		
		} else {
			
			int more = amount - balance;
			System.out.println("출금 불가! (잔액부족)");
			System.out.println("현재잔고 :" + balance);
			System.out.println("부족금액"+ more );
		
			amount = 0;
		}
		
		
		return amount;   // 내가 지금 한거는 출금 요청한 금액 그대로 다나옴....
	
}

	
}
/*
 * 
 * 
 * 은행계좌(Account) 클래스 정의
 * 
 * 멤버변수 1) 계좌번호(accountNo, String) ex ) 111-1111-111 2) 예금주명(ownerName, 문자열) ex
 * ) "홍길동" 3) 현재 잔고(balance, 정수) ex 100000
 * 
 * 
 */
