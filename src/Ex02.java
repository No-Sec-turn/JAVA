
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 중첩 while 문 - 중첩 for문과 마찬가지로 while 내에 while 문을 기술하는 것 - 바깥쪽 while문이 1번 반복할 동안,
		 * 안쪽 while 문이 여러번 반복
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		for (int i = 1; i <= 3; i++) { // 바깥쪽 for문

			System.out.println("i=" + i);

			for (int j = 1; j <= 5; j++) { // 안쪽 for문
				// 안쪽 for문 반복횟수 = j 5번 * i 3번 = 15번

				System.out.println("----------> j = " + j);
			}

		}

		System.out.println("=============================");
		
		int i = 1;
		
		while(i<=3) {
			System.out.println("i=" + i);
			int j = 1;
			while(j<=5) {
				System.out.println("----------> j = " + j);
				j++;
			}
				
			i++;  // 증감식 1
				
		} 
		
		
		
		

	}

}
