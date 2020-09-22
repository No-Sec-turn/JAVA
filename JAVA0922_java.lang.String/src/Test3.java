
public class Test3 {

	public static void main(String[] args) {

		//CharAt() 메서드 연습
		// 
		
		String jumin = "901010-1234567";
		
		System.out.println(jumin.charAt(7));
		
		
		
		//리턴되는 데이터를 직접 비교하거나
		if(jumin.charAt(7) == '1'){   //char 타입인것 주의!
			
			System.out.println("남성입니다.");
			
		
	}else {
		System.out.println("여성입니다.");
	}
		
		//char 타입으로 리턴받아 비교도 가능
		char genderNum = jumin.charAt(7);
		if(genderNum == '1' || genderNum ==3) {
			System.out.println("남성!!");
		}

		System.out.println("----------------------------------");
		
		String phone = "010-8755-8755";
		
		//입력받은 전화번호(phone)의 가운데 4자리 추출후
		// 정보보호를 위해 "****" 문자열로 대체
		
		int a;
		
		if(phone.length() == 13) {
			a = 8;
			System.out.println(phone.substring(4, a));
			System.out.println(phone.replace(phone.substring(4, a), "****"));
			
		}else if(phone.length() == 12) {
			a= 7;
			System.out.println(phone.replace(phone.substring(4, a), "***"));
		}
	
		
		String s = 
				phone.substring(0,4) + "*" + phone.substring(phone.) 		
		
		
		
}

}