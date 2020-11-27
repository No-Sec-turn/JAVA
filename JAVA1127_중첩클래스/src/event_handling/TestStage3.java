package event_handling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestStage3 extends JFrame {

	public TestStage3() {
		showFrame();
	}
	
	public void showFrame() {
		setTitle("이벤트 처리-1");
		setBounds(600, 400, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 버튼 컴포넌트(JButton 객체) 생성하여 프레임에 부착
		JButton btn = new JButton("Button");
		add(btn);
		
		// 이벤트 처리 3단계 방법을 사용하여 버튼 클릭 시
		// "버튼 클릭!" 메세지를 출력하도록 구현
		// => ActionListener 인터페이스를 구현한 핸들러 클래스를 
		//    내부 클래스 형태로 정의하고 인스턴스를 생성하여 
		//    JButton 객체의 addActionListener() 메서드 호출하여 전달
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TestStage3 ex = new TestStage3();
	}

	// 이벤트 처리 3단계 방법(내부 클래스)으로 구현하는 방법
	// ActionListener 인터페이스를 구현하는 핸들러 클래스 정의
	// => 외부에서 접근을 막기 위해 private 접근제한자 적용
	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 버튼 클릭 등의 동작 발생 시 자동으로 호출되는 메서드
			System.out.println("버튼 클릭!");
		}
		
	}
	
}

















