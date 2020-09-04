
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account A = new Account();
		System.out.println(A.accountNumber + A.ownerName + A.balance);
		
		System.out.println("------------------------------------");
		
		Account A2 = new Account();
		System.out.println(A2.accountNumber +  A2.ownerName + A2.balance );
		
		System.out.println("------------------------------------");
		
		//파라미터 생성자 Account(Strng, String, int) 호출
		
		Account a3 = new Account("222-2222-222", "이순신", 100);
		
		System.out.println(a3.balance + a3.ownerName);
		
		
	}
	
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




class Account{
	String accountNumber; 
	String ownerName;
	int balance;
	
	Account(){
		accountNumber = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
		
	}

		// 생성자 오버로딩을 사용하여 파라미터 생성자 정의
		// ==> 계좌번호, 예금주 명, 현재 잔고를
		
		Account(String newAccountNo, String newOwnerName, int newBalance){
		
		
	}
		
}