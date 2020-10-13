import java.util.regex.Pattern;

public class test {

	public static void main(String[] args) {
		
		/*
		 * 정규표현식을 사용한 전화번호 양식 검증
		 * - 배열에 전화번호 4개를 저장
		 * - 저장된 각 번호를 정규표현식과 비교하여 규칙 일치 여부 체크
		 * 
		 * - 양식 : xxx-yyyy-zzzz, xxx yyyy zzzz 등
		 * 휴대폰 번호 검증
			=> 앞자리 숫자 3자리로 시작(010 또는 011)
			=> 가운데 자리는 숫자 3자리 또는 4자리
			=> 뒷자리는 숫자 4자리로 끝나야함
			=> 단, 각 자리 사이에는 -(하이픈) 기호 또는 공백이 올수도 있고 안올수도 있음
		 * 
		 * 검사할 전화번호(문자열) 목록(배열 numbers를 사용)
		 * 1) 010-123-4567  true
		 * 2) 01112345678   true
		 * 3) 010)1234 5678 false
		 * 4) 010 1234 567a false
		 */

		// 주의! 자바에서 예외 문자\ 기호를 문자열 내에서 표현할 경우
		// 반드시 \\ 형태로 사용해야한다! (ex. \\s, \\., \\d 등)
		//^(010|011)[-\s]?\d{3,4}[-\s]?\d{4}$
		//String regex = "^(010|011)[-\\s]?\\d{3,4}[-\\s]?\\d{4}$"; 
		//String regex = "^(010|011)[-\s]?\\d{3,4}[-\s]?[0-9]{4}"; 
		String regex = "^(010|011)[-\\s]?[0-9]{3,4}[-\\s]?[0-9]{4}"; 
		String[] numbers = {"010-123-4567","01112345678", "010)1234 5678", "010 1234 567a"}; 
		
		
		for(int i=0; i<numbers.length;i++) {
			
			boolean Test1 = Pattern.matches(regex, numbers[i]);
			
			System.out.println(numbers[i] +" : " +Test1);
		}
				
				
		
	}

}
