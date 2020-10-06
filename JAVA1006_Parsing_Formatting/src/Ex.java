import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 포맷팅(Formatting)
		 * - 특정 객체를 원하는 형식의 문자열로 변환
		 * 
		 * 파싱(Parsing)
		 * - 문자열을 객체로 변환
		 */
		
		// 문자열로 된 날짜를 LocalDate 객체로 변환(파싱 = Parsing)
		String strDate = "2020-10-06"; // "연도-월-일" 형식으로 지정
		LocalDate date1 = LocalDate.parse(strDate); // LocalDate 타입 객체로 변환
		System.out.println(date1);
		
		// 문자열로 된 시각을 LocalTime 객체로 변환
		String strTime = "09:18:30"; // "시:분:초" 형식으로 지정
		LocalTime time1 = LocalTime.parse(strTime);
		System.out.println(time1);
		
		// ----------------------------------------------------------
		/*
		 * DateTimeFormatter 클래스
		 * - 날짜 및 시각에 대한 형식 지정 클래스
		 * - 사용자가 특정 형식을 지정하여 해당 형식에 맞게 문자열을 읽어옴
		 * - 형식 지정문자는 SimpleDateFormat 클래스의 형식지정문자와 동일 
		 */
		// 주의! 기본 형식에 맞지 않은 문자열을 파싱할 경우 오류 발생!
//		String strDate2 = "2020-10-06(화)"; 
//		LocalDate date2 = LocalDate.parse(strDate2);
		// => java.time.format.DateTimeParseException 예외 발생
		
		// 기본 형식이 아닌 문자열을 파싱해야할 경우
		// DateTimeFormatter 클래스를 사용하여 해당 문자열의 형식을 지정해야함
		String strDate2 = "2020-10-06(화)";
		// 연도 4자리 : yyyy
		// 월 2자리 : MM(1 ~ 9월의 경우 01 ~ 09로 표기해야함)
		//            만약, 0을 제외하고 싶으면 M 한 글자로 표기
		// 일 2자리 : dd(월과 표기법 동일)
		// 요일 1자리 : E(요일 3자리(ex. 화요일)의 경우 EEEE 사용)
		String pattern = "yyyy-MM-dd(E)"; // 읽어올 날짜의 형식을 지정
		// 지정된 형식문자열을 DateTimeFormatter.ofPattern() 메서드에 전달
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		// LocalDate.parse() 메서드의 파라미터로 날짜와 패턴을 전달
		LocalDate date2 = LocalDate.parse(strDate2, dtf);
		
		System.out.println(date2);
		System.out.println(date2.getDayOfWeek());
		// ----------------------------------------
		
		String strTime2 = "오후 09:18:30";
		// 시 2자리 : HH(0 ~ 23시) 또는 KK(0 ~ 11시)
		// 분 2자리 : mm
		// 초 2자리 : ss
		// => 시, 분, 초 2자리 표기를 위해 1자리 단위는 0 필요
		//    만약, 한자리에서 0을 제외할 경우 H 또는 K 등 한 글자 사용
		// 오전/오후 표기 : a
		String pattern2 = "a KK:mm:ss";
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(pattern2);
		
		LocalTime time2 = LocalTime.parse(strTime2, dtf2);
		System.out.println(time2);
		
		// ----------------------------------------
		
		String strDateTime = "2020년 10월 6일 화요일 오전 09시 38분 10초";
		
		String pattern3 = "yyyy년 MM월 d일 EEEE a KK시 mm분 ss초";
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern(pattern3);
		
		LocalDateTime dateTime = LocalDateTime.parse(strDateTime, dtf3);
		System.out.println(dateTime);
		
	}

}





















