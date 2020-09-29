import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		double num = Math.PI;

		// 파이 값의 소수 넷째자리에서 반올림하여 소수점 셋째자리까지 표기
		System.out.println(Math.round(num * 1000) / 1000.0);

		System.out.println("----------------------------");

		// Math.pow() 메서드를 활용하여 자릿수 변경하면서 반올림 수행

		// Math.pow() 메서드를 활용하여 자릿수를 변경하면서 반올림 수행
		int roundPosition = 4; // 반올림을 수행할 자릿수 지정
		// 입력받은 자릿수 -1 값을 10의 승수로 계산하면 표현할 자릿수 계산
		// ex) 4 입력 시 소수점 4번째자리에서 반올림하여 3번째 자리까지 표기
		// => 10^3 = 1000 을 가중치로 사용해야함

		int weight = (int) Math.pow(10, roundPosition - 1);
		System.out.println((double) Math.round(num * weight) / weight);

		System.out.println("==========================================");

		/*
		 * 로또 번호 생성기 - 1~45사이의 난수 6개 배열(myLotto)에 저장 후 출력 - 배열에 중복 제거 
		 * - 1등 당첨번호(35, 3, 1, 7, 9, 15)를 배열(thisWeekLotto)로 생성하여 자신의 로또번호와 비교한 뒤 일치하는 숫자 갯수를 출력
		 * 
		 * <실행 예시> 나의 로또 번호 : 40, 15, 10, 25, 7, 32 1등 당첨 번호 : 35, 3, 1, 7, 9, 15 일치하는
		 * 숫자 갯수 : 2개
		 */

		int[] myLotto;
		myLotto = new int[6];
		int n = 0;
		int count = 0;
		
		end:
		for(n=0;n <=6;n++) {

		for (int i = 0; i < myLotto.length; i++) {
			
			myLotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (myLotto[i] == myLotto[j]) {
					i--;
				//	System.out.println("실행");
					break;
					
				}
			}

		}
		Arrays.sort(myLotto);
		
		System.out.print("이번주 내 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(myLotto[i] + " ");
			
		}
		
		System.out.println();
		int[] thisWeekLotto = {35, 3, 1, 7, 9, 15};
		Arrays.sort(thisWeekLotto);
		
		System.out.print("이번주 당첨번호: ");
		for (int i = 0; i < 6; i++) {
	
			System.out.print(thisWeekLotto[i] + " ");
		}
		
		System.out.println();
	
		for (int i = 0; i < myLotto.length; i++) {
			
				if(myLotto[i] == thisWeekLotto[i]) {
					n++;
				
			}
			
		}
		
		
		count++;
		
		System.out.println("맞춘 갯수 : " + n + "개");
		System.out.println();
		
		if(n==6) {
			break end;
		}
		
		
		
		n = 0;
		
		System.out.println("실행횟수: "+count);
		
		}
		
	

	
	}
}
