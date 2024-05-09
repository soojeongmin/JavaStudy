package chap17_usefulclass;

import java.util.Calendar;

public class _01_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Calendar 객체 생성
		// Calendar 클래스의 static 메소드인 getInstance()를 이용해서 객체를 생성한다.
		// getInstance()를 통해 생성되는 객체는 Calendar를 상속받아 구현된
		// GregrianCalendar 클래스이다.
		Calendar calendar = Calendar.getInstance(); // 시스템의 현재 날짜와 시간을 가지고 있는 객체
		
		// 2. 시간표시
		// HOUR(0 ~ 11로 시간 표시)
		// HOUR_OF_DAY(0 ~ 23로 시간 표시)
		// MINUTE(0 ~ 59로 분 표시)
		// SECOND(0 ~ 59로 초 표시)
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println("현재 시간은 " +
			calendar.get(Calendar.HOUR_OF_DAY) + ":" +
			calendar.get(Calendar.MINUTE) + ":" + 
			calendar.get(Calendar.SECOND)
		);
	
		// 3. 오전, 오후표시
		// AM_PM(오전이면 0, 오후 1)
		System.out.println(calendar.get(Calendar.AM_PM) == 0 ? "오전입니다." : "오후입니다.");
		
		// 4. 년월일 표시
		// YEAR(현재 년도를 네자리로 표시)
		// MONTH(1월 ~ 12월을 0 ~ 11로 표시)
		// WEEK_OF_YEAR(올해의 몇 번째 주인지 표시)
		// WEEK_OF_MONTH(이번 달의 몇 번째 주인지 표시)
		// DAY_OF_WEEK(일요일 ~ 토요일을 1 ~ 7로 표시)
		// DATE(현재 날짜의 일자 표시)
		System.out.println("현재 날짜는 " + 
			calendar.get(Calendar.YEAR) + "-" +
			((calendar.get(Calendar.MONTH) + 1) < 10 
					? "0" + (calendar.get(Calendar.MONTH) + 1) 
					: (calendar.get(Calendar.MONTH) + 1)) + "-" +
			(calendar.get(Calendar.DATE) < 10 
					? "0" + calendar.get(Calendar.DATE)
					: calendar.get(Calendar.DATE))
		);
		
		System.out.println("올해의 몇 째 주: " + calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번 달의의 몇 째 주: " + calendar.get(Calendar.WEEK_OF_MONTH));
		
		String[] dayArr = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		System.out.println("오늘은 " +
				dayArr[calendar.get(Calendar.DAY_OF_WEEK)]
		);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
