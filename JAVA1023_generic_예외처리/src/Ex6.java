
public class Ex6 {

	public static void main(String[] args) {

		/*
		 * try ~ catch ~ finally 블록
		 * - try 블록에서 예외 발생 여부와 관계 없이
		 *   무조건 실행해야 하는 문장들은 finally 블록 내에 기술함
		 * - 예외가 발생하거나 발생하지 안항도 무조건 실행되며
		 *   심지어 return문을 만나 메서드 실행이 종료될 때도
		 *   finally 블록 내의 코드를 실행한 후 종료
		 * - 주로, 자원 반환을 위한 코드를 기술
		 *   (ex. DB 접속 종료, 입출력 스트림 종료 등) 
		 *   
		 *   < 기본 문법 >
		 *   try {
		 *   	 (예외 발생 예상 코드들...)
		 *   }catch {
		 *   	(해당 예외 발생 시 수행 할 코드들..
		 *   }finally{
		 *      // 예외 발생 여부와 관계없이 수행할 코드들
		 *   }
		 *   
		 * 
		 */
		
		int num1 = 10, num2 = 0;
		
		String str = null;
		
		System.out.println("프로그램 시작");
		
		
		//예외 처리할 구문을 블록지정하고 Alt + Shift + z 
		
		
		try {
			System.out.println(num1/num2);
			
			System.out.println(str.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("모든 예외 처리");
		}
		
		finally {
			System.out.println("예외 발생 여부와 관계 없이 무조건 실행");
			
		}
		
		
		System.out.println("프로그램 종료");
		
		System.out.println("==============================");
		
		
		System.out.println("메서드 호출 시작");
		
		exceptionMethod(1);  // 메서드 호출
		
		System.out.println("메서드 호출 종료");
	}
	
	
	public static void exceptionMethod(int num) {
		/*
		 * 1. 예외가 발생할 경우 코드 순서
		 *    Code1 -> Code3 -> Code4 -> Code5 
		 *    (return문을 만나지 않으므로 try 코드 바깥도 실행 됨)
		 *    
		 * 2. 예외가 발생 하지 않을 경우 코드 순서
		 *    Code1 -> Code2 -> return문 만남 -> Code4(finally 블럭) -> 메서드 끝
		 * 
		 */
		
		
		try {
			System.out.println("Code1 - num :" + num);
			
			int total = 1/num;
			
			System.out.println("Code2 : 예외 발생 없음" );
			
			return;   // 호출한 곳으로 돌아감
			// **중요**
			// 메서드 실행 도중  return 문을 만나면 메서드를 호출한 곳으로 즉시 되돌아 가지만
			// finally 블럭 내의 코드가 있을 경우 해당 코드를 실행한 후! 돌아감!!
		} catch (Exception e) {
			System.out.println("Code 3 : 예외 발생 후 처리 완료!");
		}finally {
			System.out.println("Code 4: 예외 발생 여부와 관계 없이 항상 실행");
		}
		
		System.out.println("Code 5 : try 문 종료 후 실행!");
		
		
	}
	
}
