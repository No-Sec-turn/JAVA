package event_handling;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class ExStage4 extends JFrame {

	public ExStage4() {
		showFrame();
	}
	
	public void showFrame() {
		setTitle("이벤트 처리-4");
		setBounds(600, 400, 300, 200);
		
		// --------------------------------------------------------
		// 이벤트처리 4단계. 어댑터 클래스 사용
		// --------------------------------------------------------
		// 로컬(멤버) 내부 클래스(Local Inner Class) 형태로 정의할 경우
		// => 실제 처리되는 GUI 구현 메서드 내부에 클래스를 정의
		// => 단, 리스너 연결 코드보다 윗쪽에 위치해야한다!
		
		
		WindowAdapter listener = new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		};
		
		
		
		// --------------------------------------------------------
		// JFrame 객체(프레임 = 윈도우)에 대한 이벤트 처리를 위해
		// WindowAdapter 클래스를 상속받아 구현한 핸들러 클래스를 연결
		// => 해당 객체 내의 addXXXListener() 메서드를 호출하여
		//    핸들러 클래스의 인스턴스를 파라미터로 전달
		// 1. 핸들러 클래스(MyWindowAdapter)의 인스턴스 생성
	
		
		// 2. JFrame 객체의 addWindowListener() 메서드를 호출하여
		//    1번에서 생성한 핸들러 인스턴스를 전달
		addWindowListener(listener);
		
		setVisible(true);
		
		// --------------------------------------------------------
		// 새로운 프레임 생성 시에도 기존 핸들러 인스턴스만 연결하면
		// 구현해 놓은 이벤트 핸들링을 그대로 적용 가능 = 재사용 가능
		JFrame f = new JFrame();
		f.setSize(300, 200); // 가로 300픽셀, 세로 200픽셀 크기 지정
		
		// 현재 JFrame 객체 f 에 기존의 MyWindowListener 객체 연결
		f.addWindowListener(listener);
		
		f.setVisible(true); // 보여지게 하기 위해 true 값 전달
		
		
		
	}
	
	public static void main(String[] args) {
		ExStage4 ex = new ExStage4();
	}
	
	
	/*
	 * 이벤트 처리 3단계
	 * - 1단계 또는 2단계에서 구현한 핸들러 클래스는
	 *   GUI 구현 클래스에서만 접근하므로 굳이 별도의 클래스로 정의할 필요가 없음
	 *   그러나, 클래스 자체의 형태는 유지해야하므로 GUI 클래스 내부에
	 *   내부 클래스 형태로 정의하면 GUI 클래스 전용으로 사용 가능
	 *   => 이 때, 해당 클래스를 private 접근제한자를 적용하여 외부로부터 숨김
	 */
	
//	// 인스턴스(멤버) 내부 클래스(Member Inner Class) 형태로 정의할 경우
//	// => 멤버 레벨에 클래스를 정의
//	private class MyWindowAdapter extends WindowAdapter {
//		// 필요한 메서드만 오버라이딩해서 사용
//		@Override
//		public void windowClosing(WindowEvent e) {
//			System.exit(0);
//		}
//		
//	}
	
	
	WindowListener winListener = new WindowListener() {
		
		@Override
		public void windowOpened(WindowEvent e) {
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
		}
		
		@Override
		public void windowDeiconified(WindowEvent e) {
		}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
		@Override
		public void windowClosed(WindowEvent e) {
		}
		
		@Override
		public void windowActivated(WindowEvent e) {
		}
	};

}















