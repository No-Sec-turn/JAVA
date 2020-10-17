
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
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

		int i = 2;
		while (i<= 9) {

			System.out.println("< " + i + "단 >");
			int j = 1;
			while (j <= 9) {
				System.out.println(i + " * " + j + " = " + i * j);
				j++;
			}
			i++;
		}

		System.out.println("------------------------------");

		i = 1;
		int hap = 0;
		while (i <= 10) {
			// System.out.println(i);
			hap += i;
			i++;

		}
		System.out.println("1~10까지 정수의 합:" + hap);

		System.out.println("------------------------------");

		// 1~10까지 홀수의 합(oddTotal), 짝수의 합(evenTotal) 계산
		i = 1;
		int oddTotal = 0, evenTotal = 0;

		while (i <= 10) {
			if (i % 2 == 0) {
				evenTotal += i;

			} else if (i % 2 == 1) {
				oddTotal += i;
			}
			i++;

		}

		System.out.println(oddTotal);
		System.out.println(evenTotal);

	}

}
