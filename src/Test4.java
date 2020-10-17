
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 
		 * 1 ~ 차례대로 1씩 증가하면서 차례대로 누적하여 누적 합계가 
		 * 누적 합계가 1000보다 클때 i 값 출력
		 * 
		 * 
		 */
		
		int i =1;
		int sum = 0;
		while(sum<1000) {
		
		
			
			sum += i;
			
			i++;
			System.out.println("i=" + i + "sum=" + sum);
			System.out.println();
			
			
			
			
		}
		
		
		
		System.out.println("종료후 i값:" + i);
		
		
		System.out.println("-------------------------------");
		
		i =1;
		sum = 0;
		while(true) {
		
		
			
			sum += i;
			
			i++;
			System.out.println("i=" + i + "sum=" + sum);
			System.out.println();
			
			// 누적 변수의 값이 1000보다 클때 반복문을 종료
			
			if(sum>1000) {
				
				break;
				
			}
			
			
			
			
		}
		
		
		
		System.out.println("종료후 i값:" + i);
		
		
		
		
		
	}

}
