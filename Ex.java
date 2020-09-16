
public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1 = 1234;
		long l1 = i1; // int --> long 으로 자동 형변환 가능
		
		System.out.println(i1+ "\t" + l1);
		
		byte b1= (byte)i1;  // 이클립스의 좋은점? 마우스 위에 
		
				
		System.out.println(i1 + "\t" + b1);
		
		double d1 = i1; 
		System.out.println(i1 + "," + d1);
		
		double d2 = 0.12345678901234567890;
		
		float f1 = (float)d2 ;
		System.out.println(d2 + "\t"+ f1);
		
		
		byte b3 = 67;
		char c1 = (char)b3;
		
		// char byte short 의경우 서로 반드시 명시적 형변환 필요
		
		System.out.println(b3 + "\t" + c1 );
		
		// boolean 은 어떤 데이터 타입과도 형변환 불가능
		
	
				
		
	}

}
