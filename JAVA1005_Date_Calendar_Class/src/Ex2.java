import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex2 {

	public static void main(String[] args) {

		/*
		    Date 클래스, Calendar 클래스
		 * - 날짜 및 시각 정보를 처리하는 클래스
		 * - 일반적으로 Calendar 클래스를 사용하여 날짜 정보를 조작,
		 *   Date 클래스를 사용하여 날짜 정보를 표현
		 */

		// 현재 날짜 및 시각 정보를 갖는 Date 객체 생성
		Date d = new Date();
		System.out.println(d); //toString() 생략 가능(날짜 정보 표시)
		
		// 실제 사용하진 않지만 연, 월, 일 정보를 전달하여 객체 생성 가능
		// 단, 연도는 1900년을 기준으로 덧셈 수행하므로
		// 만약 2000년도를 지정해야할 경우 100 지정
		// 월은 0~11 사이의 범위 값을 사용하므로 1~12월 지정 시
		// 실제 값 -1 값을 전달해야함(가져 올때는 +1값을 사용해야함)
		//Date d2 = new Date(2000, 1, 1); // 3900년 2월 1일
		Date d2 = new Date(100, 0, 1); //2000년 1월 1일   
		System.out.println(d2);
		
		//Date 객체에서 연, 월, 일 등의 개별 정보를 가져올 경우
		// getXXX() 메서드를 호출(XXX은 각 항목 정보 이름)
		
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int day = d.getDate();
				
		System.out.println(year+"년 " + month + "월 " + day +  "일");
		//System.out.println(year); // 1900년 기준으로 현재 연도와의 차이
		//System.out.println(month); //  
		//System.out.println(day);
				
		// long 타입 값을 파라미터로 갖는 Date(long) 생성자 호출
		// => 1900년 1월 1일을 기준으로 long 값을 밀리초(ms) 단위로 사용하여
		//    해당 날짜 및 시각 정보를 설정
		Date d3 = new Date(1500000000000L);
		System.out.println(d3);
		
		// getTime() 메서드를 사용하여 1970년 1월 1일을 기준으로
		// 밀리초 단위의 날짜 및 시각 정보를 가져올 수 있다.
		// => 초, 분, 시간, 일 단위로 변환 시
		//    한꺼번에 계산하기 보다 각 단위별로 따로 변환을 추천
		long gap = d.getTime() - d3.getTime();
		System.out.println("d 와 d3 의 날짜 차이 : " + gap + "밀리초");
		long gapSec = gap / 1000;
		System.out.println("d 와 d3 의 날짜 차이 : " + gapSec + "초");
		long gapMin = gap / 1000 / 60;
		System.out.println("d 와 d3 의 날짜 차이 : " + gapMin + "분");
		long gapHour = gap / 1000 / 60 / 60;
		System.out.println("d 와 d3 의 날짜 차이 : " + gapHour + "시간");
		long gapDay = gap / 1000 / 60 / 60 / 24;
		System.out.println("d 와 d3 의 날짜 차이 : " + gapDay + "일");
		
		System.out.println("=============================");
		
		/*
		 * SimpleDataFormat 클래스
		 * - 날짜 형식을 지정하여 표현 가능한 클래스
		 * - 형식 지정문자 사용하여 표현할 형식 지정
		 *   yyyy : 연도 4자리
		 *   mm : 월 2자리
		 *   dd : 일 2자리
		 *   hh : 0 ~ 23시간 (kk: 0 ~ 11시간)
		 *   mm : 분 2자리
		 *   ss : 초 2자리
		 *   EEEE : 요일(전체), EE : 요일(약식 한글 1글자)
		 *   
		 *   hh: 0 ~ 11 시간(kk: 0 ~ 23시간)
		 *    
		ㄷㅇ*   H	Hour in day (0-23) ; 0 ~ 23 시간	
			 k	Hour in day (1-24)	: 1 ~ 24 시간
             K	Hour in am/pm (0-11) : 0 ~ 11시간
             h	Hour in am/pm (1-12) : 1 ~ 12시간
		 *   mm : 분 2자리
		 *   ss : 초 2자리

		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		System.out.println(sdf.format(d));
		
		
	}

}
