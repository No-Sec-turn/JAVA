import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		/*
		 * 패스워드 복잡도(유효성) 검사(Validation Check)
		 * 
		 * < 패스워드 작성 규칙 >
		 * 1. 영문자, 숫자, 특수문자(!@#$%)만을 사용하여 8~16자리 내로 작성
		 *    => 패스워드 길이 규칙을 위반하면 "사용 불가능한 패스워드"
		 * 2. 영문 대문자, 소문자, 숫자, 특수문자(!@#$%) 중
		 *    4가지를 조합하면 "안전도 : 우수"
		 *    3가지를 조합하면 "안전도 : 보통"
		 *    2가지를 조합하면 "안전도 : 위험"
		 *    1가지만 사용하면 "사용 불가능한 패스워드"
		 * 
		 */
		
		
		// 유효성 체크를 위한 패스워드 목록 생성
		String[] passwordArr = {
				"admin123!",
				"Admin123!",
				"admin123",
				"adminroot",
				"admin123패스워드",
				"1234",
				"aaaaaaaaaaaaaa"
		};
		
//		String regex = " ";
		
		// Pattern 클래스를 활용한 패스워드 길이 체크
//		char[] chpassword = passwordArr.toChar
//		Pattern pattern = Pattern.compile(regex);
		
//		Matcher matcher = pattern.matcher(passwordArr)
		
		
//		System.out.println(passwordArr[0].length());
//		for(int i=0;i<passwordArr.length;i++) {
//		
//		if(passwordArr[i].length()>=8 && passwordArr.) {
//			
//			
//			}
//		}
		
				String lengthRegex = "[A-Za-z0-9!@#$%]{8,16}";
		
		// 각 규칙에 따른 복잡도 검사를 위한 정규표현식 작성
		String engUpperRegex = "[A-Z]"; //대문자
		String engLowerRegex = "[a-z]"; // 소문자
		String numberRegex = "[0-9]";   // 숫자
		String specRegex = "[!@#$%]";   //특수 문자
		
		
		
		
		for(String password : passwordArr) {
		   
		boolean lengthResult = Pattern.matches(lengthRegex, password);
		  if(lengthResult){
//			  System.out.println(password + " : " + lengthResult );
			  //Pattern 객체의 compile() 메서드를 통해 wjdrbvygustlr emdfhrgn 
			
			  // Marcher() 메서드를 호출하여 Macher 객체를 리턴받은 뒤
			  // fine() 매서드를 호출하여 각 조건(영문, 숫자, 특수문자)를 판별
//			  Pattern pattern1 = Pattern.compile(engUpperRegex);
//			  Pattern pattern2 = Pattern.compile(engLowerRegex);
//			  Pattern pattern3 = Pattern.compile(numberRegex);
//			  Pattern pattern4 = Pattern.compile(specRegex);
//			  
//			  Matcher matcher = pattern1.matcher(password);
//			  
//			  System.out.println(password+ " : "+ matcher.find());
			  
//			  System.out.println("정규표현식으로 시작하는가?" + matcher.lookingAt());
			  
			  int count = 0;

//			 if(Pattern.compile(engUpperRegex).matcher(password).find()) {
//				 count += 1;
//			 }
//			 if(Pattern.compile(engLowerRegex).matcher(password).find()) {
//				 count += 1;
//			 }if(Pattern.compile(numberRegex).matcher(password).find()) {
//				 count += 1;
//			 }if(Pattern.compile(specRegex).matcher(password).find()) {
//				 count += 1;
//			 }
			 
			  //삼항 연산자를 활용해 if문 대신에 활용
			  count += Pattern.compile(engUpperRegex).matcher(password).find() ? 1: 0;
			  count += Pattern.compile(engLowerRegex).matcher(password).find() ? 1: 0;
			  count += Pattern.compile(numberRegex).matcher(password).find() ? 1: 0;
			  count += Pattern.compile(specRegex).matcher(password).find() ? 1: 0;

			  
			  
			 switch (count) {
				case 4: System.out.println(password + ": 안전도 : 우수" + " 점수 : " + count);
					break ;
				case 3: System.out.println(password + ": 안전도 : 보통" + " 점수 : " + count);
					break ;
				case 2: System.out.println(password + ": 안전도 : 위험" + " 점수 : " + count);
					break ;
				case 1:System.out.println(password + ": 패스워드 사용 불가" + " 점수 : " + count);
					break ;

		
				}	
//		
//				

			 
			 
			 
			  
			}else {
				System.out.println(password + " : " + "오류 - 패스워드 길이 : 8~16 자리 필수!" );
				// => Pattern.maches() 메서드는 전체 문자열에 대한
			}
		    //    정규표현식 일치 여부만 체크하므로
		    //    대문자, 소문자 등 각각의 조건을 만족하는지 검사 불가능
		    // => 따라서, Matcher 클래스를 활용하여 각 조건을 따로 판별 수행
		
		// if문을 사용하여 길이체크를 통과한 패스워드만 복잡도 체크 수행
		// 아니면, "오류 - 패스워드 길이 : 8~16 자리 필수!" 출력
		
		}

		
		System.out.println("====================================");
		
		
		/*
		 * 식별자 작성 규칙 검사
		 * 1. 첫글자에 숫자 사용 불가
		 * 2. 특수문자 $, _ 
		 * 3. 대소문자 포함 가능
		 * 4. 공백문자 사용 불가
		 * 5.길이 제한 없음(1글자 이상)
		 * 
		 * 6. 키워드 사용 불가   -- 생략
		 *  
		 * 
		 * 
		 */
		
		
		String [] variables = {
			"num", "7eleven", "seven11", "MAX_NUM", "$my_money", "자바", "my name",
			"myName", "abc@com", "a", "for"
			
			
		};
		
		
		String variableRegex = "^[A-Za-z$_가-힣][A-Za-z$_가-힣0-9]{0,}$";
		String[] reserve = {"for"};
		
		// => 정규식 해석: 영문자, 한글 특수문자($_) 중 한글자로 시작하고
		//    두번째 글자 부터 영문자, 숫자, 한글 특수문자($_)가 0번이상 반복
		
		for(String str : variables) {
			
			if(Pattern.compile(variableRegex).matcher(str).matches()) {
				System.out.println(str +" : " + "불가능 " );
			}
			
				if(Pattern.compile(variableRegex).matcher(str).find()) {
				
				System.out.println(str +" : " + "가능 " );
				
			}else {
				System.out.println(str +" : " + "불가능 " );
			}
		}
		
		
		
		
		
		
	}


}