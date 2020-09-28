
public class Ex2 {


	public static void main(String[] args) {
		/*
		 * Character 클래스를 활용한 문자 처리
		 *  - 문자 데이터를 Charater 클래스의 메서드를 활용하여
		 *    문자데이터에 대한 다양한 처리 가능
		 * 
		 */
		
		char ch = ' ';
		
		
		//매서드 규칙 
		// is-000 : ooo인지 아닌지 판별
		// to-000 : 000으로 변환
		
		System.out.println("ch는 대문자인가 ? : " + Character.isUpperCase(ch)); //대문자인지 판별
		System.out.println("ch는 소문자인가 ? : " + Character.isLowerCase(ch)); //소문자인지 판별
		
		System.out.println("ch는 문자인가? : " + Character.isLetter(ch)); // 문자인지 판별
		System.out.println("ch는 숫자인가?" + Character.isDigit(ch));
		
		System.out.println("ch는 공백문자인가?" + Character.isSpace(ch));
		
		// => deprecated 처리된 메서드로 다른 메서드 제공 또는 보안상 사용 x
		
		System.out.println("ch는 공백문자인가?" + Character.isWhitespace(ch));
		
		System.out.println("=========================");
		
		char ch2 = 'a';
		
		System.out.println(ch2 + " -> 대문자로 변환 " + Character.toUpperCase(ch2));
		
		char ch3 = 'A';
		System.out.println(ch3 + " -> 소문자로 변환 " + Character.toLowerCase(ch3));
	}

}
