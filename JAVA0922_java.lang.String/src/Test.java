
public class Test {
	public static void main(String[] args) {

		Account ac = new Account("aa", "bb", 10);
		Account ac2 = new Account("bb", "dd", 20);
		
		System.out.println(ac); // toString() 메서드 호출 생략 가능
		System.err.println(ac2.toString());
		
		Account ac3 = new Account("aa", "bb", 10);
		
		System.out.println(ac);
		
		if(ac.equals(ac3)) {
			System.out.println("계좌가 같다");
		} else {
			System.out.println(" 계좌 같지 않다");
		}
		
		
	}
}



/*
 * Account 클래스 정의
 * - 멤버변수
 *   1) 계좌번호(문자열, accountNo)
 *   2) 예금주명(문자열, ownerName)
 *   3) 현재잔고(정수, balance)
 * 
 * - 생성자 : 계좌번호, 예금주명, 현재잔고를 전달받아 초기화
 * 
 * - toString() 메서드와 equals() 메서드 오버라이딩
 *   
 */




class Account{
	String accountNO;
	String ownerName;
	int balance;
	
	public Account(String accountNO, String ownerName, int balance) {
		super();
		this.accountNO = accountNO;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNO=" + accountNO + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((accountNO == null) ? 0 : accountNO.hashCode());
//		result = prime * result + balance;
//		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
//		return result;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNO == null) {
			if (other.accountNO != null)
				return false;
		} else if (!accountNO.equals(other.accountNO))
			return false;
		if (balance != other.balance)
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		return true;
	}
	
	
	
	
	
}