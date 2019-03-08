/*==================================================
	   ■■■ 자바의 주요(중요) 클래스 ■■■
	   - Calendar 클래스
==================================================*/

/*
○ java.util.Calendar 클래스는
   날짜와 시간을 객체 모델링화 한 클래스로
   연, 월, 일, 요일, 시, 분, 초까지의
   시간과 날짜와 관련된 정보를 제공한다.
   그리고, Calendar 클래스는 추상클래스이므로 직접 객체(Instance)를 생성할 수 없으며
   실제적인 메소드 구현은 Calendar 클래스의 서브 클래스인
   『GregorianCalendar』 클래스에 정의되어 있다.

   시스템으로부터 현재 시스템 시간 정보를 얻어올 때 
   getInstance() 라는 정적(static) 메소드를 이용하여 객체를 생성할 수 있다.
   생성된 Calendar 클래스 객체는 시스템의 현재 날짜와 시간 정보를 가지며,
   이 객체가 생성되면 갖고 있는 시간 정보들은
   get() 메소드를 이용하여 쉽게 가져올(사용할) 수 있다.

   getInstance() 메소드는 내부적으로 GregorianCalendar 객체를 생성하여
   돌려주기 때문에 GregorianCalendar 객체를 직접 생성하여 시간 정보를
   구할 수도 있다.
*/

// ○ 실습 문제
//    사용자로부터 연, 월을 입력받아
//    해당 연 월의 달력을 그려주는(출력하는) 프로그램을 구현한다.
//    단, Calendar 클래스를 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 연도 입력 : 0
// 연도 입력 : 2019
// 월 입력   : -2
// 월 입력   : 16
// 월 입력   : 7

/*
	[ 2019년 7월 ]

  일  월  화  수  목  금  토
============================
       1   2   3   4   5   6
   7   8   9  10  11  12  13
  14  15  16  17  18  19  20
  21  22  23  24  25  26  27
  28  29  30  31
============================
*/

/*
※ 문제 인식 및 분석(★입력 받은 연, 월의 1일이 무슨 요일인지 알아내는 것이 포인트~!!!)
   - 서기 1년 1월 1일 : 월요일

   - 연도가 4의 배수이면서 100의 배수가 아니거나,
     400의 배수이면 2월은 29일(윤년),
	 나머지 2월은 28일(평년).

   - 2019년 7월 달력을 그린다고 가정하면
     1. 1. 1 ~ 2019. 6. 30 까지의 전체 날 수를 구한다.
	 그 날 수에 + 1 연산을 수행하면... (2019년 7월 1일의 요일 확인)
	 7월의 달력 그릴 준비 끝~!!!

   - 요일 = 전체날수 % 7 
     요일 = 0 → 일요일
	        1 → 월요일
			2 → 화요일
			   :
*/  

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test138
{
	public static void main(String[] args)
	{
		int y=0, m=0;
		int i;

		Calendar rightNow = new GregorianCalendar();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("연도 입력 : ");
			y = sc.nextInt();
		}
		while (y<1);	

		do
		{
			System.out.print("월 입력 : ");
			m = sc.nextInt();
		}
		while (m<1 || m>12);

		rightNow.set(Calendar.YEAR, y);
		rightNow.set(Calendar.MONTH, m-1);
		rightNow.set(Calendar.DATE, 1);
		
		int startDay = rightNow.get(Calendar.DAY_OF_WEEK);
		int lastDay = rightNow.getActualMaximum(Calendar.DATE);
		
		System.out.println();
		System.out.println("\t [ " + y + "년 " + m + "월 ]");
	    System.out.println();
		System.out.println("	일	월	화	수	목	금	토"); // 두 칸 공백
		System.out.println("=============================");

		for (i=1; i<startDay; i++)
		{
			System.out.print("    ");
		}
		
		for (int j=rightNow.get(Calendar.DATE); j<=lastDay; j++)
		{
			System.out.printf("%4d", j);
			if (i==7)
			{
				System.out.println();
				i=0;
			}
			i++;
		}
		if(i!=7);
		{
			System.out.println();
		}
		System.out.println("=============================");
	




	
	}
}