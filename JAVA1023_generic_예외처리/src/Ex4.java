
public class Ex4 {
	public static void main(String[] args) {

		/*
		 * 언어 구동 방식 2가지  Python, Java, C 등 구분 해보자~   거니유튜브 GoLang 수업때 들은것 같다
		 *컴파일 방식
		  인터프리터 방식
		 *
		 *JAVA의 소스코드 Run 시 작동 방법
		 *소스코드      
		 *.class로 만들때는 한꺼번에 변환
		 *기계어로 바꿀때는 한줄씩 interpreter
		 *
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		System.out.println("프로그램 시작!");
		
		int num =3;
//		System.out.println(num/0);//  java.lang.ArithmeticException: / by zero at Ex4.main(Ex4.java:26)

		
//		System.out.println(num/0);
		int[] arr = new int[3];
//		arr[3] = 10; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3 at Ex4.main(Ex4.java:32)

		
		String str = null;
//		System.out.println(str.length()); //Exception in thread "main" java.lang.NullPointerException	at Ex4.main(Ex4.java:35)

		
		Animal ani = new Dog();
//		Cat cat = (Cat)ani; // Exception in thread "main" java.lang.ClassCastException: Dog cannot be cast to Cat at Ex4.main(Ex4.java:40)

		System.out.println("프로그램 종료!");

		
	}

}

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}




