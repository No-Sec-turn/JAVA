import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex3 {
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			
			
		}
		
		int amPm = now.get(Calendar.AM_PM);
		// 오전 / 오후 정보가 정수로 리턴되므로 문자열 변환시
		// Calendar.AM 상수와 비교하여 오전 여부 판별 가능
		
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm	= "오전";
		}else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR); // HOUR은 12시간 단위
		//int hour = now.get(Calendar.HOUR_OF_DAY); //HOUR_OF_DAY 는 24시간 단위로 나옴
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + "");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
		
		System.out.println();
		System.out.println(amPm); // 1이 오후  // 0이 오전(?)
		System.out.println(now.get(Calendar.AM_PM));
		
		System.out.println("===============================================");
		//Date d = new Date();
		Calendar cal2 = Calendar.getInstance();
		
		//Calendar 객체의 set() 메서드를 호출하면 날짜 및 시각 설정 가능
		// 1. set(필드명, 값)
		//     => 필드명에 해당하는 정보를 전달받은 값으로 설정(변경)
		cal2.set(Calendar.YEAR, 2000);
		//System.out.println(cal2.get(Calendar.YEAR));
		
		// 2.set(연,월,일,시,분,초) => 해당 값으로 날짜 및 시각 변경
		cal2.set(1999, 11, 31, 23, 59, 59);
		
		Date d = cal2.getTime(); // **Calendar 객체로부터 Date 객체 얻어오기 ** 결합해서 많이 사용
		
		// SimpleDateFormat 클래스를 활용하여
		// XXXX년 XX월 XX일 X요일 XX시 XX분 XX초 형식으로 출력
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EE HH시 mm분 ss초");
		System.out.println(sdf.format(d));
		
		
		
		
	}
}
