import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class Ex2 extends JFrame {
	
	public Ex2 () {
		showFrame();
		
	}
	
	public void showFrame() {
//		setTitle("상속받아서 만들어보래");
//		setSize(300,300);
		
		// setSize(Dimension d) : 크기를 관리하는 Dimension 객체 사용
		// => 구성요소들의 크기가 균일할 경우 Dimension  객체 하나로 동시 사용
		// 한번에 크기 변경이 가능하므로 관리가 용이
		Dimension d = new Dimension(300,300);
		setSize(d);
		
		setTitle("DISPOSE_ON_CLOSE");
		// 프레임 닫기 버튼에 대한 동작 설정
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(false);
		
	
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Ex2 e2 = new Ex2();
		
		JFrame j = new JFrame("EXIT_ON_CLOSE");
//		j.setSize(800, 200);
		//setLocation(): 대상을 표시할 위치 지정
//		j.setLocation(800, 200);
		
		j.setBounds(800, 200, 300, 200); //  x좌표, y좌표, 가로크기,세로크기
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
		
	}
}
