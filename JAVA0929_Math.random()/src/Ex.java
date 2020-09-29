
public class Ex {

	public static void main(String[] args) {

		
		/*
		 * java.lang.Math 클래스
		 *  - 수학 관련 기능을 제공하는 클래스
		 *  - final 클래스이므로 상속 불가하며
		 *     모든 멤버든 static 으로 선언되어 있으므로 클래스명만으로 접근
		 *  - 1~n까지의 난수 발생 공식
		 *    1) ((int)(Math.random()*상한값n) + 하한값n 
		 *    2) ((int)(Math.random()*(상한값 - 하한값 + 1) + 하한값)   // 확률적으로 1)번보다 중복되는 숫자가 적음
		 *     
		 * 
		 * 
		 */
		
		int num1 = -10;
		System.out.println("num1의 절대값 : " + Math.abs(num1));
		
		int num2 = 10, num3 = 20;
		System.out.println("num2과 num3의 최대값 : " + Math.max(num2, num3));
		System.out.println("num2과 num3의 최소값 : " + Math.min(num2, num3));
		
		double num4 = 3.141592;
		System.out.println("파이값 : " + Math.PI);
		// => 파이값을 미리 Math클래스에서 상수로 만들어 제공
		System.out.println(Math.ceil(Math.PI)); //올림
		System.out.println(Math.floor(num4)); //내림
		System.out.println(Math.round(num4)); // 반올림 -> 정수 리턴 !
		
		
		// Math.pow(x,y) : x의 y승 값(역승)을 계산 --> double 타입으로 리턴
				System.out.println(Math.pow(2, 2)); // 2^2 = 4.0
				System.out.println(Math.pow(10, 2)); // 10^2 = 100.0
	
				
				
		/*
		 * 난수 (임의의 수) 발생
		 * - Math.random() 메서드 사용
		 * - 난수 x의 범위 : 0.0 <= x < 1.0 (double타입)    (대략) 0 ~ 0.99999999999999
		 * - 주로 난수의 자릿수를 지정하여 정수화 시킨 후 활용
		 *  (ex. 난수의 소수점 6자리까지 정수화 = 6자리 정수형 난수)
		 * 
		 * 
		 */
				
				// 0.0 <= x < 1.0 범위의 난수 발생
				System.out.println("기본 난수 : " + Math.random());
				
				// 0.0 <= x < 10.0 범위의 난수 발생
				System.out.println(Math.random() * 10);
				
				// 0 <= x < 10(0 ~ 9) 범위의 난수 발생(정수화)
				System.out.println((int)(Math.random() * 10));
				
				// 1 <= x <= 10(1 ~ 10) 범위의 난수 발생(정수화)
				System.out.println((int)(Math.random() * 10) + 1);

				// 1<= x <= 20(1~20) 범위의 난수 발생(정수화)
				for(int i =1; i<=10;i++) {
					System.out.println((int)((Math.random())*20+1));
				}
				
				
	}

}


