
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		
		// 짝수란 ? 숫자를 2로 나누었을때 나머지가 0인수
		

				
		String result = "";
		
		result = (num % 2 == 1) ? "홀수" : "짝수";
		System.out.println(num +  " result : " + result);
		
		
		// 변수 num 이 양수이면 " 양수" 음수이면 "음수"를 result에 저장
		result = num >= 0 ? "양수":"음수" ;
		System.out.println(num + " : " + result);
		
		
		/* 삼항연산자의 중첩 사용
		 * - 기본 삼항연산자는두가지 경우의 수를 판별할 수 있으나
		 * 세가지 경우 이상은 판별이 불가능
		 * 
		 * => 이때 삼항연산자를 중첩해서 사용하면 두가지 이상의 경우의 수를 판별할 수 있다. 
		 * 
		 * <기본 문법>
		 * 조건식1 ? 값1 : 조건식2 ? 값2 : 값3;
		 * ==> 조건식 1의 결과가 true 이면 값1을 선택하고 아니면,다시 조건2를 판별하여
		 * 조건식 2의 결과가 
		 *  * 
		 */
		
		
		num = 15;
//		result = num >= 10 ? "num이 10 이상이다"  : " num이 10 이상이 아니다";
		// num이 10보다 클때, 10보다 작을때, 10일때 3가지 경우 판별
		

		
		result = num > 10? "10보다 크다!" : num < 10 ? "10보다 작다!" : "10이다";
		System.out.println(result);
		
		
		System.out.println("==============================");
		
		num = 0;
		// 변수 num이 양수이면 "양수", 음수이면 " 음수" 아니면 "0"을 result에 저장
		result = num > 0 ? "양수" : num <0 ? "음수" : "0";
		System.out.println(result);
		
		System.out.println("==============================");
		
		char c = ' ';
		System.out.println((int)c);		
		
		
		
		
		
		
		
		
	}

}
