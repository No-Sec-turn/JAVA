package event_handling;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Stage2 extends JFrame {

	
	/*
	 * 이벤트(Event)
	 * - 어떤 대상 컴포넌트(또는 컨테이너)에 사용자로부터 동작이 발생하는 것
	 *   ex) 버튼 클릭, 창 닫기, 체크박스 체크, 마우스 이동 등
	 * 
	 * 이벤트 핸들링(Handling)
	 * - 대상 컴포넌트에 이벤트가 발생했을 때 특정 작업을 수행하도록
	 *   동작을 구현하는 것
	 *   ex) 버튼 클릭 시 화면에 메세지 출력 등
	 *   
	 * 이벤트 리스너(Listener)
	 * - 지정된 대상에 특정 이벤트가 발생했을 때
	 *   해당 이벤트 발생 여부를 감시하는 객체
	 *   ex) 버튼 클릭 이벤트 = ActionListener 객체
	 *       마우스 동작 이벤트 = MouseListener 객체
	 * - 해당 리스너 객체 내의 추상메서드를 구현하여 이벤트를 처리
	 *   => 특정 동작에 대한 이벤트 발생 시 메서드가 자동으로 호출됨
	 * - 이벤트를 감지하여 동작을 수행하고자 하는 대상 컴포넌트의
	 *   addXXXListener() 메서드를 호출하여 이벤트 리스너 객체를 전달하면
	 *   해당 컴포넌트와 이벤트 리스너 객체가 연결됨
	 *   ex) 버튼 객체에 ActionListener 객체 연결 시
	 *       버튼 클릭 이벤트 발생 시 ActionListener 객체의
	 *       actionPerformed() 메서드가 자동으로 호출됨
	 */
	
	
	public Stage2() {
		showFrame();
	}
	
	
	
	public void showFrame() {
		setTitle("이벤트 처리-1");
		setBounds(600, 400, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// --------------------------------------------------------
		// 이벤트처리 2단계. 어댑터 클래스 사용
		// --------------------------------------------------------
		// JFrame 객체(프레임 = 윈도우)에 대한 이벤트 처리를 위해
		// WindowAdapter 클래스를 상속받아 구현한 핸들러 클래스를 연결
		// => 해당 객체 내의 addXXXListener() 메서드를 호출하여
		//    핸들러 클래스의 인스턴스를 파라미터로 전달
		// 1. 핸들러 클래스(MyWindowAdapter)의 인스턴스 생성
		MyWindowAdapter listener = new MyWindowAdapter();
		
		
		// 2. JFrame 객체의 addWindowListener() 메서드를 호출하여
		//    1번에서 생성한 핸들러 인스턴스를 전달
		
		addWindowListener(listener);
		setVisible(true);
		
		
		// ----------------------------------------------------------------------------------
		
		JFrame f = new JFrame();
		f.setSize(999, 999); //가로 300픽셀, 세로 200픽셀 크기 지정

		// 현재 JFrame 객체 f에 기존의 MyWindowListner 객체 연결
		f.addWindowListener(listener);

		f.setVisible(true);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		Stage2 ex = new Stage2();
	}

}

/*
 * 이벤트 처리 2단계
 * - 리스너 인터페이스의 추상메서드가 복수개(2개 이상)일 경우
 *   모든 추상메서드를 오버라이딩해야하므로 불필요한 코드 발생할 수 있음
 *   따라서, 리스너 인터페이스를 구현하는 어댑터 클래스(구현체)를 사용하여
 *   상속받을 핸들러 클래스를 정의하고, 원하는 메서드만 따로 구현
 * - 어댑터 클래스 이름은 리스너 인터페이스 이름에서
 *   Listener 대신 Adapter 로 바뀜
 *   ex) WindowListener = WindowAdapter
 * - 주의! 추상메서드가 1개뿐인 인터페이스는 어댑터 클래스가 없음
 * 	 ex) ActionListener => ActionAdapter 가 제공되지 않는다!
 */
// 프레임(윈도우)에 대한 이벤트를 담당하는 WindowAdapter 를 상속받아 구현
class MyWindowAdapter extends WindowAdapter{   //메서드 사용 강제성이 없다. -> 오버라이딩 선택해서 필요한것만 쓰면 됨
	// 필요한 메서드만 오버라이딩 해서 사용
	// Art + shift + v 
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}   
	
	
}

