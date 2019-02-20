/*==============================================
 ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
 - if ~ else문 실습
===============================================*/

// ○ 과제(2019-02-18)
// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가 윤년인지 평년인지 판별하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, if ~ else 조건문을 활용할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000 → 윤년
// 계속하려면 아무 키나...

// 임의의 연도 입력 : 2012
// 2012 → 윤년
// 계속하려면 아무 키나...

// 임의의 연도 입력 : 2018
// 2018 → 평년
// 계속하려면 아무 키나...

// 임의의 연도 입력 : 2019
// 2019 -> 평년 
// 계속하려면 아무 키나...

// ※ 윤년의 판별 조건
//    연도가 4의 배수이면서 100의 배수가 아니거나
//    400의 배수이면 윤년~!!!
//	  그렇지 않으면 평년~!!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{

	public static void main(String[] args) throws IOException
	{
	// ○ BufferedReader 인스턴스 생성
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

	// ○ 주요 변수 선언
	int year=0;		// year: 사용자로부터 임의의 연도 입력 받음

	// ○ 연산 및 처리
    System.out.print("임의의 연도 입력 : ");
	year = Integer.parseInt(br.readLine());
		
	if (year%400==0 && year%100!=0 || year%4==0) // if문 : 400년 주기이면서 100년 주기가 아니고, 4년 주기인 윤년 판별  
	{
		System.out.printf("%d년 → 윤년%n", year); // 윤년 출력
	}
	else
	{
		System.out.printf("%d년 → 평년%n", year); // else문 : 평년 출력
	}
	}
}

// 실행 결과
/*
임의의 연도 입력 : 2000
2000년 → 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2019
2019년 → 평년
계속하려면 아무 키나 누르십시오 . . .
*/