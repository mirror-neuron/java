/*============================
  ■■■ 만년달력 ■■■
=============================*/

// 실행 예)
// 『연도』를 입력하세요 : 2019
// 『월』을 입력하세요   : 7
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

// ※ 문제 인식 및 분석 : 입력 받은 연, 월의 1일이 무슨 요일인지 알아내는 것이 포인트~!!!

import java.util.Scanner;

public class Test100
{
	public static void main(String[] args)
	{
		int y, m;
		int nalsu=1;
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner sc = new Scanner(System.in);

		System.out.print("『연도』를 입력하세요 : ");
		y = sc.nextInt();

		System.out.print("『월』을 입력하세요   : ");
		m = sc.nextInt();	


			




		}

		void print()
		{
			System.out.println("일   월   화   수   목   금   토");
			System.out.println("=================================");
			System.out.printf("%3d  %3d  %3d  %3d  %3d  %3d  %3d", arr[
			System.out.println("=================================");		
		}

	

	}
}

// 실행 결과 
/*

*/