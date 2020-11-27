import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex3 extends JFrame {

	public Ex3() {
		showFrame();
	}
	
	public void showFrame() {
		setTitle("Button 연습");
		setBounds(600, 400, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 크기 변경 불가능하도록 설정
		setResizable(false);

		
		// 버튼 부착을 위해 javax.swing.JButton 객체 생성
		JButton btn = new JButton("버튼");
		
		// 컴포넌트(버튼 등)를 프레임에 부착하기 위해서 
		// JFrame 객체의 add() 메서드 호출하여 부착
		// => 경우에 따라 부착할 위치 지정 필요
		add(btn);
		
		// JButton 객체에 ActionListener 연결하여 버튼 클릭시 이벤트 처리
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭");
				
			}
		});   //버튼,체크박스등 기능 다 제공
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex3 ex = new Ex3();
	}

}
