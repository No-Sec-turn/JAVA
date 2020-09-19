
public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 비교 연산자(관계연산자)
		 * 
		 *  - 두 피연산자 간의 대소 관계 비교를 수행하는 연산자
		 *  - 연산 수행 결과는 true 또는 false값으로 나타냄
		 * ==> 연산 결과를 출력문에서 출력하거나, boolean 타입 변수에 저장
		 *  
		 *  1) == (동등비교연산자) : 두 피연산자가 같은지 비교
		 *  2) != (Not Equal) : 두 피연산자가 같지 않은지(다른지) 비교
		 *  3) >, >=, <=, < : 두 피연산자의 대소 관계 비교
		 
		 * 
		 * 
		 */
		
		
		int a = 10, b = 4,c =10;
		
		System.out.println(a == b); // a와 b가 같은지 판별 결과를 출력 
		// ==> a와 b는 같지 않으므로 flase가 리턴되어 출력됨
		System.out.println(a != b);
		// ==> a와 b는 같지 않으므로 true가 리턴되어 출력됨
		System.out.println(a <= b);
		// ==> a가 b보다 작거나 같지 않으므로 f가 리턴되어 출력됨
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a > b);
		
		
//		대소 관계 비교 결과를 boolean 타입 변수에 저장할 수 있다
		
		boolean result = a>b; // a > b 판변 결과가 result에 저장됨
		System.out.println("result = "+	result);
		
		// 산술 연산자 등과 결합하여 사용할 수도 있다!
		// ==> 두 연산 결과를 비교연산자로 비교 가능
		
		
//		만약, 명확하게 산술연산자를 먼저 수행하도록 하려면 괄호 표시!  
		boolean result2 = (a + b) > (a - b) // 위의 코드와 결과 동일
				;
		
		System.out.println(result2);
		
		// char 타입도 정수이므로 비교연산자 사용 가능
		char ch = 'A';
		System.out.println("ch가 대문자 A보다 큰가?" + (ch >= 65 ));
		System.out.println("ch가 대문자 A보다 큰가?" + (ch >= 'a' ));
		
		
		// 비교 연산자도 피연산자 타입이 다르면 일치시킨 후 연산 수행
		System.out.println(10 == 10.0);
		// => int == double => double == double로 변환 후 수행(10.0 == 10.0)
		
		
		// 주의 사항!
		System.out.println(0.1 == 0.1f);
		// 유효자리수 때문에 double 과 float 형은 같지 않음!!
		
		float f = 0.1f;
		double d = 0.1;
		
		System.out.println(f == (float)d);
		
	}

}
