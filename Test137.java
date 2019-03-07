/*==================================================
	   ■■■ 자바의 주요(중요) 클래스 ■■■
	   - Calendar 클래스
==================================================*/

/*
※ Calendar 클래스는 추상 클래스이기 때문에 객체를 생성할 수 없다.
   (추상 클래스 : 미완성된 클래스)

   즉, 『Calendar ob = new Calendar();』 → 이와 같은 구문을 통해 인스턴스 생성 불가
  
○ Calendar 클래스 객체(인스턴스)를 생성할 수 있는 방법

   1. Calendar ob1 = Calendar.getInstance();  //Calendar가 가진 static이 붙은 클래스 메소드(정적 메소드)인 getInstance() 메소드 호출

   2. Calendar ob2 = new GregorianCalendar(); //업 캐스팅(Calendar ← GregorianCalendar)

   3. GregorianCalendar ob3 = new GregorianCalendar();

   (※ GregorianCalendar : Calendar 클래스의 하위(자식) 클래스)

*/

// 년, 월, 일, 요일을 Calendar 클래스로부터 가져와 출력

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test137
{
	public static void main(String[] args)
	{
		// Calendar 클래스 인스턴스 생성
		Calendar rightNow = Calendar.getInstance();

		// 생성된 달력(Calendar) 인스턴스를 통해
		// 날짜 관련 정보를 얻어낼 수 있는 메소드 → get()
		int y = rightNow.get(Calendar.YEAR);
		int m = rightNow.get(Calendar.MONTH)+1;		//-- 『+1』check~!!!
		int d = rightNow.get(Calendar.DATE);
		int w = rightNow.get(Calendar.DAY_OF_WEEK);

		System.out.println(y + "-" + m + "-" + d + " " + w);
		//--==>> 2019-3-7 5

		// 테스트
		/*
		System.out.println(Calendar.SUNDAY);		//--==>> 1 → 일
		System.out.println(Calendar.MONDAY);		//--==>> 2 → 월
		System.out.println(Calendar.TUESDAY);		//--==>> 3 → 화
		System.out.println(Calendar.WEDNESDAY);		//--==>> 4 → 수
		System.out.println(Calendar.THURSDAY);		//--==>> 5 → 목
		System.out.println(Calendar.FRIDAY);		//--==>> 6 → 금
		System.out.println(Calendar.SATURDAY);		//--==>> 7 → 토
		*/

		String week = " ";
		switch (w)
		{
		
			//case 1: week="일요일";break;
			case Calendar.SUNDAY: week="일요일";break;
			//case 2: week="월요일";break;
			case Calendar.MONDAY: week="월요일";break;
			//case 3: week="화요일";break;
			case Calendar.TUESDAY: week="화요일";break;
			//case 4: week="수요일";break;
			case Calendar.WEDNESDAY: week="수요일";break;
			//case 5: week="목요일";break;
			case Calendar.THURSDAY: week="목요일";break;
			//case 6: week="금요일";break;
			case Calendar.FRIDAY: week="금요일";break;
			//case 7: week="토요일";break;
			case Calendar.SATURDAY: week="토요일";break;
	
		}

		System.out.println(y + "-" + m + "-" + d + " " + week);
		//--==>> 2019-3-7 목요일


		/////////////////////////////////////////////////////////////////////////////////////////

		// Calendar 클래스 인스턴스 생성
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		// 달력의 날짜 세팅 → 『set()』 메소드 활용
		rightNow2.set(2019, 6, 18);		// 7월 check~!!! 입력을 할 때 월은 (-1) 해서 입력해야 함

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>> 5 → 목요일

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> 목요일

		System.out.println();

		rightNow2.set(1990, 3, 16);
		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>> 2

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> 월요일
	}
}