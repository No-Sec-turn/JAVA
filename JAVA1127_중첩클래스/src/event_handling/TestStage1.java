package event_handling;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.accessibility.AccessibleKeyBinding;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestStage1 extends JFrame{
	
	public TestStage1() {
		showFrame();
	}
	
	public void showFrame() {
		setTitle("이벤트 처리-1");
		setBounds(600, 400, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// 버튼 컴포넌트(JButton 객체) 생성하여 프레임에 부착
		JButton btn = new JButton("버트으은");
		add(btn);
		
		
		setVisible(true);
		
		
		
		
		// 이벤트 처리 1단계 방법을 사용하여 버튼 클릭 시
		// "버튼 클릭!" 메세지를 출력하도록 구현
		// => ActionListener 인터페이스 활용
		// 핸들러 클래스의 인스턴스 생성 후 
		// JButton 객체의 addActionListener() 메서드 호출하여 전달
		AL A = new AL();
		btn.addActionListener(A);
		
		
		
	}

	public static void main(String[] args) {
		TestStage1 ex = new TestStage1();
		
		
		
		
		
		
		
	}

}



//ActionListener 인터페이스를 구현하는 핸들러 클래스 정의
class AL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼 클릭등의 동작 발생 시 자동으로 호출되는 메서드
		System.out.println("버튼 클릭!");
	}
	
}
	
