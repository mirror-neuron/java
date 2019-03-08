/*==================================================
	   ■■■ 자바의 주요(중요) 클래스 ■■■
	   - Calendar 클래스
==================================================*/

// ○ 실습 문제
//    오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
//    확인하여 결과를 출력하는 프로그램을 구현한다.
//    단, Calendar 클래스를 활용하여 처리한다.

// 실행 예)
// 오늘 날짜 : 2019-3-8 금요일
// 몇 일 후의 날짜를 확인하고자 하십니까? : 200

// =========[확인결과]========
// 200일 후 : 2019-xx-xx x요일
// ===========================
// 계속하려면 아무 키나 누르세요...

import java.util.Calendar;
import java.util.Scanner;

public class Test139
{
	public static void main(String[] args)
	{
		// ○ 팀에서 풀이한 내용
		/*
		Scanner sc = new Scanner(System.in);
		String[] days = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		Calendar cal = Calendar.getInstance();

		int y, m, d, w;
		int num;
	
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("오늘 날짜 : %d-%d-%d %s", y, m, d, days[w-1]);
		System.out.print("\n몇 일 후의 날짜를 확인하고자 하십니까? : ");
		num = sc.nextInt();

		cal.set(Calendar.DATE, cal.get(Calendar.DATE)+num);
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("==========[확인결과]==========");
		System.out.printf("%d일 후 : %d-%d-%d %s", num, y, m, d, days[w-1]);
		System.out.println("\n============================");
		*/

		// ○ 함께 풀이한 내용
		// Scanner 클래스 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// Calendar 클래스 인스턴스 생성
		Calendar now = Calendar.getInstatnce();

		// 주요 변수 선언
		int nalsu;			//-- 사용자로부터 입력받은 날 수 
		int y, m, d, w;		//-- 연, 월, 일, 요일
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};

		// 현재의 연, 월, 일, 요일 확인(가져오기 : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;	// check~!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		// 현재의 연, 월, 일, 요일 확인결과 출력
		System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d +  "  " + week[w-1] + "요일");

		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);

		// 날 수 더하기 연산
		now.add(Calendar.DATE, nalsu);

		// 결과 출력
		System.out.println();
		System.out.println("==========[확인결과]==========");
		System.out.printf("%d일 후 : %tF %tA\n", nalsu, now, now); //-- %t : 날짜(시간) 타입을 담는 변수(옵션 더 확인해보기 → F: 2019-06-16, A:요일)
		System.out.println("==============================");


	}
}

// 실행 결과
/*
오늘 날짜 : 2019-3-8 금요일
몇 일 후의 날짜를 확인하고자 하십니까? : 100
==========[확인결과]==========
100일 후 : 2019-6-16 일요일
============================
계속하려면 아무 키나 누르십시오 . . .
*/