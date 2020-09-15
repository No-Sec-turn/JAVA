package interfaces;



public interface RemoteControl {
	// 인터페이스 내의 모든 변수는 상수(public static final)로 취급
	public static final int MAX_VOLUME = 100;
	public static final int MIN_VOLUME = 0;
	
	int MAX_CHANEL = 100;   // 상수(public static final 생략되어 있음)
	public int MIN_CHANNEL = 1; // 상수 (static final 생략되어 있음)
	
	// 인터페이스 내의 모든 메서드는 추상메서드(public abstract)로 취급됨
	// public void turnPower() {} // 중괄호{} fmf vhgkagkf tn djqtek!
	
//	public void turnPower() {} // 중괄호{} 를 포함 할 수 없다!
	public void turnPower(); // 추상 메서드 (abstract 생략 되어있음)
	
	public abstract void channelUP(); // 추상메서드
	public abstract void channelDown(); // 추상메서드
	public abstract void changeChannel(int channel); // 추상메서드
	
	void volumeUp();  // 추상메서드(public abstract 생략되어있음)
	void volumeDown(); // 추상메서드(public abstract 생략되어있음)
	
}
