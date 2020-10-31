
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 덧셈 연산자의 경우 일반적인 덧셈 기능 외에 문자열에 사용시 문자열 결합 연산자로 동작함
		 * (문자열의 특정 데이터타입간에 덧셈 연산시 두 데이터를 결합하여 하나의 문자열로 만들어 준다)
		 * 
		 * ex) "문자열" + 정수 = "문자열 정수"
		 * 		실수 + " 문자열" = 실수 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		int a= 10, b=3,c;
		
		c= a+b;
		System.out.println(a + "+"+ b + "=" + c );
		
		c= a-b;
		System.out.println(a + "-"+ b + "=" + c );
		
		c= a*b;
		System.out.println(a + "*"+ b + "=" + c );
		
		c= a/b;
		System.out.println(a + "/"+ b + "=" + c );
		
		c= a%b;
		System.out.println(a + "%"+ b + "=" + c );
					
		
		
		System.out.println("---------------------------------------------------------");

		//덧셈 연산자(+)의 다른 사용법 = 문자열의 결합
		
		String s1 = "java";
		String s2 = "Programming";
		
		String s3 = s1+s2;
		
		System.out.println(s3);
		
		String s4 = s1+111; 
		
		System.out.println(s4);
		
		System.out.println(1+1+"1");
		System.out.println("1"+1+1*0);
	}

}
