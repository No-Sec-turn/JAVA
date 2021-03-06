import interfaces.RemoteControl;

public class Ex4 {

	/*
	 * 인터페이스(Interface) 
	 *  - 어떤 객체와 개발자 사이의 접점(중개) 역활
	 *  - 인터페이스 정의시 class 키워드 대신 interface 키워드를 사용!
	 *  - 인터페이스는 상수와 추상메서드만 가질 수 있음
	 *   1) 상수 : public static final 을 사용하여 선언하며 생략도 가능
	 *   2) 추상메서드 : public abstract 를 사용하여 정의하며 생략도 가능
	 *   3) 
	 *   
	 *  - 추상클래스와 마찬가지로 객체 생성이 불가능하며, 상속 전용으로 사용 가능
	 *     단, 데이터타입으로는 사용 가능하므로, 다형성 활용 가능 
	 *  - 추상클래스보다 강제성이 더 강하다! 
	 *    => 추상클래스는 일부 멤버(메서드)에 대한 강제성을 부여하지만
	 *    => 인터페이스는 모든 메서드와 모든 상수에 대한 강제성을 부여
	 *  - 동일한 인터페이스를 구현하는 클래스를 사용하는 경우
	 *    하나의 인터페이스 ㅌ입으로 모든 객체를 컨트롤 할 수 있다! => 다형성에 대한 이야기
	 *    
	 *    
	 *    < 인터페이스 정의 기본 문법 >
	 *   [접근제한자] interface 인터페이스명{
	 *   	// 상수 선언
	 *   	// 추상메서드 정의
	 *   
	 *   }
	 *   
	 */
	
	
	
	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.turnPower();
		tv.Tvstatus();
		
		Audio au = new Audio();
		au.turnPower();
		
		
		System.out.println("------------------");
		
		//인터페이스를 구현한 클래스가 존재하는 경우
		// 일반적으로 인터페이스 타입으로 업캐스팅 후에
		// 공통된 기능을 다형성으로 다루는 것이 보편적
		// => Tv& Audio의 부모 인터페이스인 RemoteControl 타입 사용
		
		// 인터페이스는 인스턴스 생성(new) 불가능! = 추상클래스와 동일!
//		RemoteControl remote = new RemoteConrol();
		
		RemoteControl remote = new Tv(); // 업캐스팅 가능
		
		remote.turnPower();
		remote.channelUP();
		remote.channelDown();
		remote.volumeUp();
		remote.volumeDown();
		
		// Audio -> RemoteControl 업캐스팅
		
		remote = new Audio(); // 업캐스팅 가능
		remote.turnPower();
		remote.channelUP();
		remote.channelDown();
		remote.volumeUp();
		remote.volumeDown();
		
		
		
	}

}



// interfaces 패키지의 RemoteControl 인터페이스를 구현하는
// 구현체 클래스 Tv를 정의
// ==> 클래스명 뒤에 implements 키워드를 쓰고 뒤에 인터페이스명을 지정
class Tv implements RemoteControl{
	// RemoteControl 인터페이스를 구현하기 위해 implements 할 경우
	// 인터페이스 내의 모든 추상메서드를 구현(오버라이딩) 해야한다!
	
	boolean isPowerOn = false; // boolean 타입은 변수명에 보통 is를 붙인다!
	
	
	@Override
	public void turnPower() {
		System.out.println("Tv 전원 상태 변경!");
	}

	@Override
	public void channelUP() {
		System.out.println("Tv 채널 증가!");
	}

	@Override
	public void channelDown() {
		System.out.println("Tv 채널 감소!");
	}
	
	@Override
	public void changeChannel(int channel) {
		System.out.println("Tv 채널을 변경 - " + channel + "번 ! " );
		
	}

	@Override
	public void volumeUp() {
		System.out.println("Tv 볼륨 증가!");
	}

	@Override
	public void volumeDown() {
		System.out.println("Tv 볼륨 감소!");
	}
	
	public void Tvstatus() {
		System.out.println("전원 상태 :" + isPowerOn);
		System.out.println("최대 채널 상태 :" + MAX_CHANEL );
		System.out.println("최소 채널 상태 :" + MIN_CHANNEL);
		
	}
	
}

class Audio implements RemoteControl{

	@Override
	public void turnPower() {
		System.out.println("Audio 전원 상태 변경!");
	}

	@Override
	public void channelUP() {
		System.out.println("Audio 채널 증가!");
	}

	@Override
	public void channelDown() {
		System.out.println("Audio 채널 감소!");
	}
	
	@Override
	public void changeChannel(int channel) {
		System.out.println("Audio 채널을 변경 - " + channel + "번 ! " );
		
	}

	@Override
	public void volumeUp() {
		System.out.println("Audio 볼륨 증가!");
	}

	@Override
	public void volumeDown() {
		System.out.println("Audio 볼륨 감소!");
	}

}
