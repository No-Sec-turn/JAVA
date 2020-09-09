
public class Test {

	public static void main(String[] args) {
		/* 
		 * Account 클래스의 인스턴스 생성 및 다음과 같이 데이터 저장, 출력
		 * 계좌번호 : 111-1111-111
		 * 예금주명 : 홍길동
		 * 현재잔고 : 100000원
		 */
		Account acc = new Account();
		// Account 클래스의 멤버변수들은 모두 private 접근제한자이므로
		// 외부 클래스에서 인스턴스 생성 후 직접 접근이 불가능하다!
//		acc.accountNo = "111-1111-111";
//		acc.ownerName = "홍길동";
//		acc.balance = 100000;
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("홍길동");
//		acc.setBalance(100000); // private 메서드는 외부에서 접근 불가
		// => 대신 deposit() 또는 withdraw() 메서드로 입/출금 기능 활용
		
		
//		System.out.println("계좌번호 : " + acc.accountNo);
//		System.out.println("예금주명 : " + acc.ownerName);
//		System.out.println("현재잔고 : " + acc.balance + "원");
		System.out.println("계좌번호 : " + acc.getAccountNo());
		System.out.println("예금주명 : " + acc.getOwnerName());
		System.out.println("현재잔고 : " + acc.getBalance() + "원");
	}

}

/*
 * Account 클래스 정의
 * - 멤버변수
 *   1) 계좌번호(accountNo, String)
 *   2) 예금주명(ownerName, String)
 *   3) 현재잔고(balance, int)
 */
class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	// 멤버변수들에 대한 Getter/Setter 정의
//	public String getAccountNo() {
//		return accountNo;
//	}
//	
//	public void setAccountNo(String newAccountNo) {
//		accountNo = newAccountNo;
//	}
//	
//	public String getOwnerName() {
//		return ownerName;
//	}
//	
//	public void setOwnerName(String newOwnerName) {
//		ownerName = newOwnerName;
//	}
//	
//	public int getBalance() {
//		return balance;
//	}
//	
//	public void setBalance(int newBalance) {
//		balance = newBalance;
//	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	
	// 은행계좌에서 현재잔고를 직접 수정하는 것은 좋지 못하므로
	// setBalance() 메서드를 제외하거나, private 으로 선언하면 된다!
	private void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}














