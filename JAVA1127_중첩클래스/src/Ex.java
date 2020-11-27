import javax.swing.JFrame;


//JFrame 인스턴스 생성없이 JFrame 클래스를 상속받아 정의하는 방법
// 1.생성자를 통해 GUI를 구현하는 메서드 호출
// 2. GUI 구현 메서드 내에서 코딩
// 3. main() 메서드 등에서 해당 클래스의 인스턴스 새엉(자동으로 생성자 호출

public class Ex extends JFrame{

	public Ex() {
		showFrame();
		
	}
	public void showFrame() { // GUI 구현을 수행할 메서드
		//상속 받은 경우 참조변수 없이 메서드 바로 호출!
		setTitle("상속받아 구현한 프레임");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// JFrame 클래스를 상속받아 GUI 구현시
		// 생성자가 실행되어야 하므로 자신의 클래스 인스턴스 생성 필수!
		Ex e = new Ex();
		
		
		
		/*
		 * 
		 * 
		 */
		
		
		
		
		
		
		
//		// JFrame 클래스의 인스턴스 생성하여 구현하는 방법
//		JFrame f = new JFrame();
//		f.setSize(300, 200); //가로 300픽셀, 세로 200픽셀 크기 지정
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //매개변수 값이 int인데 뭔지 모르겠으면 클래스명.  cntl + space로 상수(Static final)를 찾아봐라
//		f.setVisible(true);
//		
//		
//		JFrame f2 = new JFrame();
//		f2.setTitle("프레임 연습");
//		f2.setSize(400, 800); //가로 300픽셀, 세로 200픽셀 크기 지정
//		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f2.setVisible(true);
//		
//		JFrame f3 = new JFrame("");
//		// => JFRAME 생성자에 문자열 전달시 setTitle() 과 동일한 결과 적용
//		f3.setSize(800, 400); //가로 300픽셀, 세로 200픽셀 크기 지정
//		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f3.setVisible(true);
		
		
		
	}
}
