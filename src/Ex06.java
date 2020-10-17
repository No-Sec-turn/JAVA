
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * System.out.printf() 메서드 - 출력할 내용을 특정 형식에 맞춰 출력하는 메서드 - 형식 지정 문자열을 사용하여 출력할
		 * 형식을 결정하고 해당 형식 지정 문자열 사용하여 출력할 형식을 결정
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		//%d : 정수
		
//		System.out.println(); // 줄바꿈
//		System.out.printf();  // 오류 발생

		System.out.printf("값: %d\n", 50000);

		int num = 10;
		System.out.printf("값: %d\n", num);

		
		// %xd 지정 시 x 만큼 자릿 수 확보한 후, 우측부터 채움
		System.out.printf("값: %10d\n", 50000);

		// %f : 실수 (소수점 7자리까지)
		System.out.printf("값: %f\n", 3.14);
		
		// %.x : 실수 )소수점 x째짜리까지 반올림!)
		System.out.printf("값: %.1f\n", 3.15);
		
		// %c : 문자
		System.out.printf("문자: %c\n", 'A');
		System.out.printf("문자: %c\n", 65);	// 정수 -> 문자로 변환
		System.out.printf("문자: %C\n", 'a');   // %C C를 대문자를 쓰면 소문자를 넣어도 대문자로 바뀜
	
		// %s : 문자열 
		System.out.printf("문자열: %s\n", "KOREA");
		// %.xs : 문자열  // 좌측부터 x자까지만 표기
		System.out.printf("문자열: %.3s\n", "KOREA");
	
		
		System.out.println("=======================================================================");
		
		int dan = 9;

		System.out.println("< 구구단 >");

		for (int i = 1; i <= 9; i++) {
			//System.out.println("< " + i + "단 >");
			System.out.printf("< %d 단 >\n", i);
			for (int j = 1; j <= 9; j++)

				//System.out.println(i + "*" + j + "=" + (i * j));
				System.out.printf("%d * %d = %2d\n", i, j, i*j);
				System.out.printf("\n");
				

		
		
		
		
		
		
	}

}
	
}
