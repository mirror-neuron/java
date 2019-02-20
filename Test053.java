/*============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문 (while문) 실습
=============================================*/

// ○ 과제
// 사용자로부터 원하는 단(구구단)을 입력받아 
// 해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
// 프로그램을 종료할 수 있도록 처리한다.

// 실행 예)
// 원하는 단(구구단) 입력 : 7
// 7 * 1 = 7
// 7 * 2 = 14
//   :
// 7 * 9 = 63
// 계속하려면 아무 키나...

// 원하는 단(구구단) 입력 : 11
// 1부터 9까지의 정수만 입력 가능합니다.
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		// 사용자로부터 문자 입력을 받는 BufferedReader 인스턴스 생성 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 		
		// 주요 변수 선언
		int num;			        // 사용자로부터 입력받는 구구단 값
		int i=1, sum=0;				// i: while문 반복에 사용할 정수형 변수, sum: 구구단 결과 값
    
		// 연산 및 처리
		System.out.print("원하는 단(구구단) 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		if ((0<num) && (9>=num)) // 구구단 입력 값이 1~9일 경우로 제한함
		{
		while (i<=9)
		{

			// 구구단 출력 연산 	
			if (i>=1 && i<=9)	// i 입력값을 1부터 9사이로 제한함
			{
			  sum = num * i;
			  System.out.printf("%d * %d = %d%n", num, i, sum);  // num에 1부터 9까지 곱한 값을 출력
			  i++;			// 9까지 i의 숫자가 1씩 증가함

			}
			else     // 9이상의 값 또는 '0'을 입력 시 출력
			{
			   System.out.println("1부터 9까지의 정수만 입력 가능합니다."); break;
			}
		}
	    }
   }
}

// 실행 결과
/*
원하는 단(구구단) 입력 : 9
9 * 1 = 9
9 * 2 = 18
9 * 3 = 27
9 * 4 = 36
9 * 5 = 45
9 * 6 = 54
9 * 7 = 63
9 * 8 = 72
9 * 9 = 81
계속하려면 아무 키나 누르십시오 . . .

원하는 단(구구단) 입력 : 0
계속하려면 아무 키나 누르십시오 . . .
*/

