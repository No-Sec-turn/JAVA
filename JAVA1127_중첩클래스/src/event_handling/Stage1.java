package event_handling;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Stage1 extends JFrame {

	
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
	
	
	public Stage1() {
		showFrame();
	}
	
	
	
	public void showFrame() {
		setTitle("이벤트 처리-1");
		setBounds(600, 400, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// --------------------------------------------------------
		// 이벤트처리 1단계. 리스너를 구현한 핸들러 클래스 사용
		// --------------------------------------------------------
		// JFrame 객체(프레임 = 윈도우)에 대한 이벤트 처리를 위해
		// WindowListener를 구현한 구현체(핸들러 클래스)를 연결
		// => 해당 객체 내의 addXXXListener() 메서드를 호출하여
		//	리스터 구현체(핸들러클래스)의 인스턴스를 파라미터로 전달
		//  1. 핸들러 클래스(MyWindowListener)의 인스턴스 생성
		MyWindowListener listener = new MyWindowListener();
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
		Stage1 ex = new Stage1();
	}

}

/*
 * 이벤트 처리 1단계
 * - 이벤트 처리를 담당하는 리스너 인터페이스를 구현하는
 *   구현체 클래스(= 핸들러(Handler))를 정의하여 이벤트를 처리하는 방법
 *   ex) 버튼의 이벤트를 처리하는 ActionListener 인터페이스를 사용 시
 *       ActionListener 인터페이스를 구현하는 별도의 서브클래스 정의
 * - 리스너 인터페이스는 java.awt.event 패키지에 위치
 */

//프레임(윈도우)에 대한 이벤트를 담당하는 WindowListener 구현
class MyWindowListener implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated : 클릭할 수 있는 활성화");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing : 프로그램 종료");
		System.exit(0); //현재 ㅍ로그램 종료(정상적인 강제종료)
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated : 비활성화");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified : de-아이콘화 ");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified : 아이콘화");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened : 윈도우창 실행시 1번만");
	}
	
}