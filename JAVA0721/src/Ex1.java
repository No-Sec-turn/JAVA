
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 비교 연산자와 논리연산자를 활용한 char 타입 연산
		 * 
		 * - char 타입은 주로 비교연산자와 논리연산자를 활용하여
		 * 특정 범위 내의 문자인지를 판별하는 용도로 사용
		 * 
		 * ex) 대문자 판별, 소문자 판별, 영문자 판별, 숫자 판별 등
		 * 
		 */
		char ch = 'r';
		
		boolean result =ch >= 'A'; // ch >= 65 사용 가능
		System.out.println(ch+" 이(가) 대문자 A이상인가?" + result);
		
		result = ch <='Z'; //ch >= 65 사용 가능
		
		System.out.println(ch+" 이(가) 대문자 Z(90)이상인가?" + result);
		
		// 문자 ch가 대문자 인지 판별?
		
		//result = (ch >= 'A') && (ch <= 'Z');
		result = (ch >= 65) && (ch <= 90);
		System.out.println(ch+" 가 대문자 인가?" + result);		
		
		// 문자 ch가 소문자 인지 판별?
		
		// ==> 
		
		result = (ch >= 97) && (ch <= 122);
		System.out.println(ch+" 가 소문자 인가?" + result);
		
//		char a = 48;
//		System.out.println(a);
		
		// 문자ch가 영문자 인지 판별?
		
//		A 65 90   97 122
		
		result = (ch >= 65 && ch <= 90) || (ch >= 97 && ch <=122);
		System.out.println(result);
		
		for(char i=90;i<=96;i++) {
			System.out.println(i);
		}
		
		
		
		
	}

}
