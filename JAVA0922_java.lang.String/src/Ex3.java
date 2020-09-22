
public class Ex3 {
	public static void main(String[] args) {
	
	/* 
	 * 
	 * 
	 * 
	 */
		
		
		
		String s1 = "Java Programming!";
		String s2 = "                    아이티윌           부산교육센터                       ";
		String s3 = "김태희/전지현/송혜교";
		
		// length() : 문자열 길이 리턴
		System.out.println("s1.length() : " + s1.length());
		System.out.println("s2.length() : " + s2.length());
		
		//----------------------------------------------------
		
		
		// equals() : 문자열 비교(대소문자 구별)
		System.out.println("s1 과 JAVA PROGRAMMING! 은 같은 문자열인가? "
								+ s1.equals("JAVA PROGRAMMING!"));
		
		// equalsIgnoreCase() : 문자열 비교(대소문자 구별 없음)
		System.out.println("s1 과 JAVA PROGRAMMING! 은 같은 문자열인가? "
								+ s1.equalsIgnoreCase("JAVA PROGRAMMING!"));
		
		//----------------------------------------------------
		
		// char CharAt(int index) : 인덱스(index)에 해당하는 위치의 문자 1개 리턴
		// => 인덱스 번호는 자동으로 부여되며, 0~ 문자열길이 -1 까지 사용
		
		System.out.println("s1의 5번 인덱스 문자" + s1.charAt(5));
		//System.out.println("s1의 5번 인덱스 문자" + s1.charAt(17)); //인덱스 범위 벗어나면 오류발생!
		// => 오류발생! 배열과 마찬가지로 존재하지 앟는 인덱스일 경우 
		//  java.lang.StringIndexOutOfBoundsException 발생!
		
		
		//----------------------------------------------------
		
		// int indexOf(String str 또는 int ch) : 특정 문자 또는 문자열의 인덱스 리턴
		// => 만약, 찾는 문자열이 없을 경우 -1 리턴
		// => 문자열의 처음(앞)부터 탐색(정방향 탐색)
		System.out.println("s1 문자열에 Program 의 인덱스는? " + 
												s1.indexOf("Program"));
		
		// char 타입으로도 파라미터 전달 가능(문자 1개)
		System.out.println("s1 문자열에 a 의 인덱스는? " + s1.indexOf('a'));
		
		// int lastIndexOf(String str 또는 int ch)
		// => 문자열의 마지막(뒤)부터 탐색(역방향 탐색) = 인덱스 번호는 동일
		System.out.println("s1 문자열에 a 의 인덱스는? " + s1.lastIndexOf('a'));
		
		
		// boolean contains(CharSequence s) : 문자열 존재(포함) 여부 리턴
		System.out.println("s1 문자열에 Program 이 존재하는가? " + s1.contains("Program"));
		
		System.out.println("s1 문자열에 JSP 이 존재하는가? " + s1.contains("JSP"));
		
		// String replace(char, char) 또는 replae(String, String) : 문자 또는 문자열 치환
		System.out.println("s1문자열의 a를 @로 치환" + s1.replace("a", "@"));
		
		System.out.println("s1문자열의 Java를 JSP로 치환" + s1.replace("Java", "JSP"));

		// subString() : 부분 문자열 추출
		// subString(int beginIndex)
 
		
		System.out.println("s1의 5번 인덱스부터 끝까지 추출하면 : " + s1.substring(5));

		// subString(int begin index, int endindex) : beginIndex ~ endIndex - 1까지 추출!
		System.out.println("5번인덱스부터 11 - 1까지 인덱스를 추출하면 : " + s1.substring(5,11));
		
	}
}

