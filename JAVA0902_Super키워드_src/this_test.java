
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Account A = new Account();
//		System.out.println(A.accountNumber + A.ownerName + A.balance);
//		
//		System.out.println("------------------------------------");
//		
//		Account A2 = new Account();
//		System.out.println(A2.accountNumber +  A2.ownerName + A2.balance );
//		
//		System.out.println("------------------------------------");
//		
//		//파라미터 생성자 Account(Strng, String, int) 호출
//		
//		Account a3 = new Account("222-2222-222", "이순신", 100);
//		
//		System.out.println(a3.balance + a3.ownerName);
//		
//		
//	}
//	
}




/* Account 클래스 정의
 * 
 * - 멤버변수
 * 1)계좌번호 (accountNo, 문자열)
 * 2) 예금주명(ownerName, 문자열)
 * 
 * - 기본생성자 정의(안에 매개변수 없는것) 및 다음 데이터로 초기화
 *  계좌번호 ~~
 *  예금주명 : ~
 *  현재잔고 ~
 * 
 */

	Account2 n = new Account2("11111-11111111");

	Account2 n2 = new Account2("222-22222-2222");
	
	Account2 n3 = new Account2("33333333", "김길동", 100);



}



class Account2{
	String accountNumber; 
	String ownerName;
	int balance;
	
	
	// 계좌번호(accountNo)를 전달받아 초기화하는 생성자 정의
	// 예금주명 : "홍길동", 현재잔고 : 0으로 직접초기화
	public Account2(String accountNumber) {
		this.accountNumber = accountNumber;
	
		ownerName = "홍길동";
		balance = 0;
	}
	
	// 계좌번호(accountNo), 예금주 명(ownerName)을 전달받아 초기화하는 생성자 정의
	// 현재잔고 : 0으로 직접초기화

	public Account2(String accountNumber, String ownerName) {
	
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		balance = 0;

	}

	// 계좌번호(accountNo), 예금주 명(ownerName), 현재잔고(balance)를 전달받아 초기화하는 생성자 정의
	// 
	public Account2(String accountNumber, String ownerName, int balance) {

		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void print() {
	System.out.println("계좌번호 : " + accountNumber);	
	System.out.println("예금주 명 :  " + ownerName );
	System.out.println("잔고 : " + balance);
	}
	
	

	
}
	
		
		
