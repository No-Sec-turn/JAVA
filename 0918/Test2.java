
public class Test2 {
	public static void main(String[] args) {

		LgTv lg = new LgTv();
		lg.powerOn();
		lg.volumeUp();
		lg.volumeDown();
		lg.changeChannel(10);
		lg.powerOff();
		
		System.out.println("현재 넷플릭스 객체는? " + lg.netflix);
		lg.setNetflixAccount("root");
		System.out.println("현재 넷플릭스 객체는? " + lg.netflix);
		
		// LgTv 인스턴스가 갖고 있는 Netflix 인스턴스 내의
		// showNetflix() 메서드 호출
		lg.netflix.showNetflix(); // 인스턴스변수.다른클래스(1)의 변수.(1)의 메서드 로 호출 가능함
		
	}

}

interface Appliance {
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	public abstract void volumeUp();
	public abstract void volumeDown();
	
}

// Tv인터페이스정의


interface Tv extends Appliance{
	

	public abstract void changeChannel(int channelNumber);
	
}

// 스피커 인터페이스 정의 
// 
interface Speaker extends Appliance{

}

class Netflix{
	String account; 
	
	public Netflix(String account) {
		this.account = account;
	}
	
	
	public void showNetflix() {
		System.out.println("넷플릭스 기능!");
		
		
	}
}


class LgTv implements Tv, Speaker {
	// 넷플릭스 기능은 별도의 상속을 거치지 않고
	// 클래스 내에서 has-a 관계로 포함시켜 사용할 수 있다!
//	Netflix netflix = new Netflix("root"); // 인스턴스를 바로 생성
	Netflix netflix; // Netflix 타입 인스턴스 변수 netflix 선언
	
	public void setNetflixAccount(String account) {
		// 넷플릭스에서 사용할 계정을 전달받아
		// 넷플릭스 인스턴스를 생성하면서 생성자에 계정 전달
		// => 생성된 인스턴스를 Netflix 타입 멤버변수에 저장
		netflix = new Netflix(account);
	}
	
	

	@Override
	public void powerOn() {
		System.out.println("LGTV 켜기");
	}

	@Override
	public void powerOff() {
		System.out.println("LGTV 끄기");
	}

	@Override
	public void volumeUp() {
		System.out.println("LGTV 볼륨 업");
	}

	@Override
	public void volumeDown() {
		System.out.println("LGTV 볼륨 다운");
	}

	@Override
	public void changeChannel(int channelNumber) {
		System.out.println(channelNumber +  "번으로 LGTV 채널 변경");
	}
	
	public void D3() {
		System.out.println("LGTV 3D 기능");
	}
	
}

class SamsungTv implements Tv, Speaker{

	@Override
	public void powerOn() {
	}

	@Override
	public void powerOff() {
	}

	@Override
	public void volumeUp() {
	}

	@Override
	public void volumeDown() {
	}

	@Override
	public void changeChannel(int channelNumber) {
	}
	
	public void smart() { 
		
	}
	
}
