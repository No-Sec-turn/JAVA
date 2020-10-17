
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * do ~ while 문
		 * 
		 * - while 문과 기본적인동작은 유사하나 while문과 달리 do문장을 통해 실행문을 먼저 실행하고 마지막에 while문의 조건식을 통해
		 * 반복 여부를 결정
		 * 
		 * - while 문은 조건식에 따라 실맹문이 실행되지 않을 수도 있지만 do ~ while 문은 조건식과 관계없이 실행문이 무조건 한번은
		 * 실행 됨 - do ~ while문의 while (조건식) 뒤에 반드시 세미코론 필수!
		 * 
		 * 
		 * <기본 문법>
		 * 
		 * do { // 실행할 문장들.. } while(조건식); // 세미콜론 필수!!
		 * 
		 */

		int i = 11;

		while (i <= 10) { // i 가 10보다 클경우 반복문 내부는 실행되지 못함
			System.out.println(i + "  Hello world");
			i++;

		}

		System.out.println("반복문 종료후 i값:" + i);

		System.out.println("=============================");

		// do~ while 을 사용할 경우

		i = 11;

		do { // i가 11이므로 while 결과가 false이지만 일단 do문에 의해 반복 내용을 한번 실행한 후
			// 마지막에 while조건을 판별하여 false가 되어 빠져 나감

			System.out.println(i + "  Hello world");
			i++;

		} while (i <= 10);

		System.out.println("반복문 종료후 i값:" + i);

	}

}
