
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 정수 5개를 저장하는 배열을 생성하고 10,20,30,40,50 으로 초기화한 후 출력하고 정수형 변수 total에 배열내의 정수의 합을
		 * 누적한뒤 결과값을 출력
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		// int arr[] = {10,20,30,40,50}; // 배열 정의 및 초기화 첫번째 방법

		int[] arr = new int[5];   // 배열 정의 두번째 방법
		arr[0]= 10;	
		arr[1]= 20;
		arr[2]= 30;
		arr[3]= 40;
		arr[4]= 57;

		
		
//		// for문을 사용하여 배열 arr 각 인덱스에 값 넣기
//		int[] arr = new int[5]; 
//
//		for (int i = 0; i < arr.length; i++) {
//
//			arr[i] = 10 * (i + 1);

//		}

		int total = 0;
		for (int i = 0; i < arr.length; i++) {

			System.out.printf("%d번째 인덱스 값 : %d\n", i, arr[i]);
			total += arr[i];

		}

		System.out.printf("배열에 담긴 정수형 변수 의 총합 total : %d", total);

	System.out.println();
	double avg = (double)total / arr.length;    // 문자 (연산) 문자 이면 보통 앞쪽에 강제 형변환! 
		
	System.out.println("정수의 평균값 :" + avg);
	
	
	}

}
