
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a = false, b= true;
		
		System.out.println("a && a = " + (a && a));
		System.out.println("a && b = " + (a && b));
		System.out.println("b && a = " + (b && a));
		System.out.println("b && b = " + (b && b));
		System.out.println("---------------------");
		
		System.out.println("a || a = " + (a || a));
		System.out.println("a || b = " + (a || b));
		System.out.println("b || a = " + (b || a));
		System.out.println("b || b = " + (b || b));
		System.out.println("---------------------");
		
		System.out.println("a ^ a = " + (a ^ a));
		System.out.println("a ^ b = " + (a ^ b));
		System.out.println("b ^ a = " + (b ^ a));
		System.out.println("b ^ b = " + (b ^ b));
		System.out.println("---------------------");
		
		System.out.println("!a =  " + !a);
		System.out.println("!b =  " + !b);		
	
		System.out.println("======================");
		
		// 비교 연산자와 결합하여 사용하는 경우
		int num = 5
				;
		
//		// 정수 num이 5보다 크고 작거나 같은거??
		// ==> ~이고, 그리고 가 포함되므로 두 연산을 AND연산(&&)으로 묶음
		
		boolean result = num > 5 && num <= 10; 
		System.out.println("num이 5보다 크고 작거나 같은가?"+result);
		
		// 두가지 이상의 비교를 조합해야 하는 경우 논리연산자와 결합 필요
		//=> 주로, 
		
		
		
		
		
		
		
	}

}
