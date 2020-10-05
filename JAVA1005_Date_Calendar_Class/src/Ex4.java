import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * java.time 패키지
		 * - Date, Calendar 클래스 등 기본 클래스들의 단점을 보완한
		 *   별도의 클래스를 제공하는 패키지
		 * - LocalDate(날짜), LocalTime(시각), LocalDateTime(날짜 및 시각) 
		 *   등의 클래스 등 제공
		 * - toString() 메서드가 오버라이딩 되어 있으므로 출력이 간편
		 * - 객체를 직접 생성하지 않고, 시스템으로부터 생성된 객체를
		 *   static 메서드인 now() 메서드를 호출하여 리턴받아 사용
		 * - of() 메서드를 호출하여 날짜 정보를 간편하게 설정 가능
		 * - 각종 메서드를 사용하여 날짜 및 시각 비교, 계산 등이 쉬움
		 */
		
		// 1. 날짜 정보를 관리하는 LocalDate 클래스
		LocalDate date = LocalDate.now(); // 현재 시스템 날짜 정보 가져오기
		System.out.println(date);
		
		LocalDate date2 = LocalDate.of(1999, 12, 31); // 연, 월, 일 설정
		System.out.println(date2);
		
		// 2. 시각 정보를 관리하는 LocalTime 클래스
		LocalTime time = LocalTime.now(); // 현재 시스템 시각 정보 가져오기
		System.out.println(time);
		
		LocalTime time2 = LocalTime.of(23, 50, 10); // 시(0 ~ 23), 분, 초 설정
		System.out.println(time2);
		
		// 3. 날짜 및 시각 정보를 관리하는 LocalDateTime 클래스
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// 연, 월, 일, 시, 분, 초 직접 지정하여 변경하는 방법
		LocalDateTime now2 = LocalDateTime.of(1999, 12, 31, 23, 50, 10);
		
		// LocalDate 객체와 LocalTime 객체를 사용하여 변경하는 방법
//		LocalDateTime now2 = LocalDateTime.of(date2, time2);
		System.out.println(now2);
		
		System.out.println("===================================");
		System.out.println("==============================");
		
		// getXXX(). isXXX() 메서드를 호출하여 각종 정보 처리 가능
		System.out.println(now2.getYear() + "년");
		System.out.println(now2.getMonthValue() + "월");
		System.out.println(now2.getDayOfMonth()+ "일");
		
		// plusXXXs(), minusXXXs() 메서드를 사용하여 날짜 더하기, 빼기
		// => XXX 은 증감할 항목명(Year, Month, Day)
		// => 증감 시 월, 연도 등이 연쇄적으로 변경될 수 있음
		System.out.println(now2.plusDays(1));
		// 1일 더하기 시 31일에서 1일로 변경되면서 연도, 월이 증가됨
		System.out.println(now2.plusMonths(1));
		// 1월 더하기시 12월에서 1월로 변하면서 연도가 증가됨
		
		System.out.println("==============================");
		System.out.println("=====================================");
		
		System.out.println("now = " + now + ", now2 = " + now2);
		
		// 자신객체.isXXX(대상객체)
		// => 자신의 객체가 대상 객체의 XXX 날짜 및 시각인지 판별
		// 1. 자신이 대상보다 미래인지 판별
		System.out.println("now 가 now2 보다 미래인가? " + now.isAfter(now2));
		
		// 2. 자신이 대상보다 과거인지 판별
		System.out.println("now 가 now2 보다 과거인가? " + now.isBefore(now2));
		
		// 3. 자신이 대상과 같은지 판별
		System.out.println("now 가 now2 와 같은가? " + now.isEqual(now2));
		
		// 4. 자신이 대상과 비교했을 때 빠른지(미래) 느린지(과거) 판별
		// => 양수 : 빠름, 음수 : 느림, 0 : 동일
		System.out.println(now.compareTo(now2));
		
		// 5. 자신을 기준으로 대상과의 차이 리턴
		//    (연, 월, 일 등 세부 항목 차이 계산 가능)
		// => 음수이면 대상 정보는 과거, 양수이면 미래
		System.out.println(now.until(now2, ChronoUnit.YEARS)); // 연도 차이
		System.out.println(now.until(now2, ChronoUnit.DAYS)); // 일수 차이
		
		long yearsGap = now.until(now2, ChronoUnit.YEARS);
		if(yearsGap < 0) {
			yearsGap = -yearsGap;
			System.out.println((yearsGap) + "년 지났습니다!");
		} else if(yearsGap > 0) {
			System.out.println(yearsGap + "년 남았습니다!");
		} else {
			System.out.println("올해입니다!");
		}

		System.out.println("==============================");
		
		// 날짜 및 시각 정보의 계산
		
		LocalDate date3 = LocalDate.of(2000, 1, 1);
		LocalDate date4 = LocalDate.now();
		
		// Period.between() : 연도, 월, 일에 대한 차이 계산(단위별 연산) 
		Period period = Period.between(date3, date4); 
		System.out.println(period); //PxxYxMxD로 출력됨
		System.out.println("연도 차이 : " + period.getYears());  //date4 -date3
		System.out.println("월 차이 : " + period.getMonths()); 
		System.out.println("일 차이 : " + period.getDays());
		
		
		//ChronoUnit.XXX.between() 메서드를 호출하여 전체 차이 계산
		// => XXX은 연도(YEARS), 월(MONTHS) 등 항목에 대한 Enum 상수 사용
		
		long yearGap = ChronoUnit.YEARS.between(date3, date4);
		System.out.println("총 몇년 차이인가? : " + yearGap + "년");
		
		long monthGap = ChronoUnit.MONTHS.between(date3, date4);
		System.out.println("총 몇개월 차이인가? : " + monthGap + "개월");
		
		long dayGap = ChronoUnit.DAYS.between(date3, date4);
		System.out.println("총 몇일 차이인가? : " + dayGap + "일");
		
		
		
		
		
	}

}





















