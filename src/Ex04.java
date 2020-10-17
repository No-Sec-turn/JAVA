
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * break문 vs continue문
		 * 
		 * 1. break 문
		 *  - 현재 실행중인 반복문의 블럭을 빠져나가는 문
		 *  - 주로 if문과 조합하여 특정 조건일 떄 반복 실행을 중지 시킴
		 *  
		 *  <기본 문법>
		 *  반복문() {
		 *  	실행문....
		 *  	if(조건식){
		 *  	break;
		 *  
		 *  }
		 * 

		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		int i;

		for (i = 1; i <= 10; i++) {
			System.out.println(i + " Hello World");

			if (i == 5) {

				break;
			}

		}

		System.out.println("반복문 종료후 i값:" + i);

		System.out.println("--------------------------------------");

		i = 1;

		while (i <= 10) { // i 가 10보다 클경우 반복문 내부는 실행되지 못함
			System.out.println(i + "  Hello world");

			if (i == 5) {
				break;
			}

			i++;

		}

		System.out.println("반복문 종료후 i값:" + i);
		
		
		System.out.println("================================================");
				
		
		

		for (i = 1; i <= 10; i++) {
			

			if (i == 5) {

				continue;
			}
			System.out.println(i + " Hello World");
		}

		System.out.println("반복문 종료후 i값:" + i);

		
		System.out.println("================================================");
		
		
		
		for (i = 1; i <= 10; i++) {
		

			if (i == 5) {

				break;
			}
			System.out.println(i + " Hello World");
			
		}

		System.out.println("반복문 종료후 i값:" + i);

		System.out.println("--------------------------------------");

		i = 0;

		while (i < 10) { // i 가 10보다 클경우 반복문 내부는 실행되지 못함
			i++;

			if (i == 5) {
				continue;
			}

			System.out.println(i + "  Hello world");

		}

		System.out.println("반복문 종료후 i값:" + i);
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
