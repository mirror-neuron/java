/*============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문 (while문) 실습
=============================================*/

// ○ 과제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 그 수까지의 전체 합과, 짝수의 합과, 홀수의 합을
// 각각 결과값으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 276
// >> 1 ~ 276 까지 정수의 합 : xxxx
// >> 1 ~ 276 까지 짝수의 합 : xxxx
// >> 1 ~ 276 까지 홀수의 합 : xxxx 
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		// 사용자로부터 문자 입력을 받는 BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 주요 변수 선언
		int num;   //사용자로부터 입력받는 임의의 정수
		int n=1;   //while문 반복에 사용할 정수형 변수
	    int sum=0, even=0, odd=0;	//정수의 합, 짝수의 합, 홀수의 합의 값을 초기화 
	    
		// 연산 및 처리
		System.out.print("임의의 정수 입력 : "); 
		num = Integer.parseInt(br.readLine()); // 사용자로부터 임의의 정수 입력 받음

		while (n<=num) // 사용자로부터 입력받는 임의의 정수(num)까지 반복하라
		{
			sum += n; // 정수의 합

			if (n%2==0) // 짝수를 판별하는 기준 
			{
			  even += n; // 짝수의 합
	
			}
			else 
			{
			  odd += n; // 홀수의 합
			}
	
			n++; // n을 1씩 증가시키면서 반복함
		}

		//각각 정수, 짝수, 홀수의 합 출력
		System.out.printf(">> 1 ~ %d 까지 정수의 합 : %d%n", num, sum);
		System.out.printf(">> 1 ~ %d 까지 짝수의 합 : %d%n", num, even);
		System.out.printf(">> 1 ~ %d 까지 홀수의 합 : %d%n", num, odd); 
	}
}	

// 실행 결과
/*
임의의 정수 입력 : 276
>> 1 ~ 276 까지 정수의 합 : 38226
>> 1 ~ 276 까지 짝수의 합 : 19182
>> 1 ~ 276 까지 홀수의 합 : 19044
계속하려면 아무 키나 누르십시오 . . .
*/
