
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator mycal = new Calculator();   // 인스턴스 생성
		
		mycal.powerOn();  // powerOn() 매서드 호출
		
		// plus() 매서드를 호출하여 2개의 정수 5,6 전달 후
		//덧셈 결과를 리턴받아 result1에 저장 후 출력
		int result1 = mycal.plus(5,6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		// divede() 메서드를 호출하여 2개의 정수 10,4 전달 후
		double result2 = mycal.divide(x,y);
		System.out.println("result: " + result2);
		
		mycal.powerOff();
		
		mycal.changePower();
		System.out.println(mycal.isPowerOn);
		mycal.changePower();
		System.out.println(mycal.isPowerOn);
		
		
		
	}

}



class Calculator {
	
	boolean isPowerOn ; // 기본값 false
	
	// powerOn();, powerOff() 메서드 대신 하나의 메서드로 전원 on/off 관리
	
	public void changePower() {
		isPowerOn = !isPowerOn;
		
	}
	
	
	void powerOn() {
		
		if(!isPowerOn) { // isPowerOn == false 와 같은 코드
		System.out.println("전원을 켭니다");
		// 전원을 켜기 위해 isPowerOn 변수를 true로 변경
		isPowerOn = true;
		
		}else {
			System.out.println("전원이 아직 켜져 있습니다.");
		}
	}
	
	int plus(int x, int y) {
		
		//전달 받은 두개의 정수 x,y 합을 result에 저장 후 리턴
		int result = x + y;
		


		return result;
		
	}
	
		
		// 두 피연산자중 최소 하나의 피연산자는 double 필수!
		double divide(int x, int y) {
		double result = (double)x / (double)y;  // 만약 double 안쓰면 int / int = int 이므로 정수부분만 계산됨
		
		return result;
	}
	
	
	void powerOff() {
		// 전원을 끄기 위해 isPowerOn 변수를 false로 변경
		if(isPowerOn) { // 변수에 들어있는 값 자체가 true false이므로 변수만 써도 됨 // isPwerOn == true 와 동일한 조건식
		isPowerOn = false;
		System.out.println("전원을 끕니다");
		
		}
	}
	
}