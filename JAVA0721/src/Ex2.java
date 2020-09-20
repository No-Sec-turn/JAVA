
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 삼항 연산자(조건연산자) ? : 
		 *  - 피 연산자가(항)가 3개인 연산자
		 *  - ? 앞의 조건식에 따라 : 앞 뒤의 문장을 선택하는 연산자
		 *  
		 *  < 기본 문법>
		 *  조건식 ?    값1:값2;
		 *  ==> 조건식은 연산 결과가 true 또는 false인 식만 올 수 있다!
		 *  ==> 조건식 결과가 true 이면 값1을 선택하고, 
		 *      조건식 결과가 false이면 값 2를 선택
		 *  => 삼항 연산자 연산 결과를 변수에 대입하거나, 출력문 등에 결합하여 사용 가능!
		 *  
		 *  
		 */
		
		int num = 10;
//		num >= 10 ? "num이 10 이상이다"  : " num이 10 이상이 아니다"
		System.out.println(num >= 10 ? "num이 10 이상이다"  : " num이 10 이상이 아니다");   // num이 10이상인가?
		
		
		
		String result = num >= 10 ? "num이 10 이상이다"  : " num이 10 이상이 아니다";
		System.out.println(result);
		
		
		
		//num이 10보다 크면 정수형 변수 result2 의 갑에 1을 더하고
//		아니면, 정수 형 변수 reult2의 값에 10을 더하기 
		
		
		int result2 = 0;
		//result2 = num > 10 ? result2++ : (result2= result2 +10);
		result2 += num > 10 ? 1: 10;
		System.out.println(result2);
		
		
	}

}
