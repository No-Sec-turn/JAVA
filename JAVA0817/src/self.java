
public class self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	OverloadingMethod om = new OverloadingMethod();
	
	om.abs(-10);//public void abs(int num) {} 메서드가 호출됨
	om.abs(-1.1);// public void abs(double num) {} 메서드 호출됨				 
	om.abs(-30L); // public void abs(long num){} 매서드 호출 됨
	// ==> 즉, 매서드 파라미터 전달시, 매개변수를 구분할 수 있으면
	// 		매서드 오버로딩이 성립되는 것으로 간주하고 오류 발생 없음!
	
	
	NormalMethod nm = new NormalMethod();
	nm.abs(-10);
	
	
	
	
	
	
	
	
class OverloadingMethod{
	// 정수 1개를 전달받아 절대값을 계산하여 출력하는 abs() 메서드 정의
	// => int, double, long 타입에 대한 각 메서드를 abs() 이름으로 통일
	//    단, 매개변수 타입만 int, double, long 으로 구분
	
	public void abs(int num) {
		// 전달받은 정수 num 이 음수일 경우 양수로 변환 후 출력
		// 아니면 그대로 출력
		
		if(num < 0) {
			num = -num;
						
		}
		System.out.println("num : " +num);
		
	}
	
	// double 타입 실수를 전달받는 메서드를 별도로 정의
	// => 메서드명도 식별자이므로 중복되면 안된다!
	
	public void dAbs(double num) {
		// 전달받은 정수 num 이 음수일 경우 양수로 변환 후 출력
		// 아니면 그대로 출력
		if(num<0) {
			num = -num;
		}
		System.out.println("num : " + num);
		
	}

		// 데이터 1개를 전달받아 출력하는 print() 메서드
		public void intPrint(int data) {
			System.out.println(data);
		}
		
		public void StringPrint(String data) {
			
		}
		
		public void doublePrint(double data) {
			System.out.println(data);
		
	}
	
	
	
	
	
} // OverloadingMethd 클래스 끝
	
	
	
	
	
	
	
	}

}
