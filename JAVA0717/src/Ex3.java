
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		산술 연산에서의 자동 형변환
		- 산술 연산 수행 시 두 피연산자의 타입이 다를 경우
		  연산 수행 전에 두 피연산자의 타입을 일치시킨 후 연산을 수행함
		  
		  <타입을 일치시키는 규칙>
		  1. int 보다 작은 타입(byte, short, char) 끼리의 연산 시
		  	모든 피연산자를 int로 변환
		  	ex) byte + byte = int + int = int 
		  		short + char = int + int = int 
		  		
		  2. int 이상의 타입이 피연산자로 있을 경우
		  		두 피연산자 중 큰 타입으로 일치시킨 후 연산을 진행
		  		ex) int 
		  	*/
	
		byte b1 = 10, b2 = 3;
		byte b3 = (byte)(b1+b2);
		
		System.out.println(b3);
		
		short s1 = 10;
		short s2 = (short)(b1+s1);
		
		System.out.println(s2);
 		
		char ch1 = 'A';
		//char ch2 = ch1 + 3; char + int = int 
		char ch2 = (char)(ch1+3);
		
		System.out.println(ch2);
		
		
		int i1 = 100;
		long l1 = 200;
		int i2 = (int)(i1 + l1);
		//int i1 +l1; // int + long = long +long = long  
		
		System.out.println(i2);
		
		float f1 = 1.6f;
		//long l2 = f1+l1; // float + long = float + float = float 
		long l2 = (long)(f1+l1);
		System.out.println(l2);
		
		
		
		System.out.println((double)(10)/(double)(3));
		// 나눗셈 연산자는 몫만 계산하지만
		// 정수 연산에서 연산 결과와 
		// 실수가 포함된 나눗셈 연산 결과가 달라짐	
		
		System.out.println(10/3.0);
		
		
		
		byte b5 = (byte)127;
		System.out.println(b5);
		
		
		float f10= 2.0f, f11=1.1f;
		float f12= f10-f11;
		System.out.println(f12);
		
		double d10 = 2.0, d11 = 1.1;
		double d12 = d10 - d11;
		System.out.println(d12);
		
		
		
		
		
		
	
	}

}
