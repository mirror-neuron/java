/*==============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문 (do~while문) 실습 
===============================================*/

// ○ 실습 문제
// 사용자로부터 여러 개의 정수를 입력받아
// 그 합을 계산하여 결과를 출력해주는 프로그램을 구현한다.
// 단, 사용자가 『-1』 을 입력 시
// 입력받는 행위를 중지하고
// 그동안 입력받아둔 정수들의 합을 출력할 수 있도록 구현한다.
// 입력받는 과정은 Scanner 인스턴스를 생성하여 처리한다.

// 실행 예)
// 1번째 정수 입력(-1 종료) : 10 
// 2번째 정수 입력(-1 종료) : 10
// 3번째 정수 입력(-1 종료) : 5
// 4번째 정수 입력(-1 종료) : 8
// 5번째 정수 입력(-1 종료) : 9
// 6번째 정수 입력(-1 종료) : -1

// >> 현재까지 입력된 정수의 합 : 42
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test055
{
	public static void main(String[] args)
	{
		
		//내가 풀이한 내용
		/*
		Scanner sc = new Scanner(System.in);

		int num, n=1, sum=0;		

		do
		{
			System.out.print( n + "번째 정수 입력(-1 종료) : ");
			num = sc.nextInt();
			
			//if( n == -1)
			  {
				break; //continue;
			  }
			sum += num;
			n++;
		}
		while (num!=-1);
	     
			//System.out.printf(">> 현재까지의 입력된 정수의 합: %d%n", sum);
			System.out.printf(">> 현재까지의 입력된 정수의 합: %d%n", ++sum);
		*/

		//함께 풀이한 내용
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// ○ 주요 변수 선언
	    int num;		//-- 외부로부터 사용자 입력값을 담아둘 변수
		int sum=0;		//-- 누적합을 담을 변수
		int n=1;		//-- 몇 번 째 입력값인지 담아둘 변수 

		// ○ 연산 및 처리
		do
		{
			System.out.printf("%d번째 정수 입력(-1 종료) : ", n); //입력값을 받을 문장 출력
			num = sc.nextInt(); // 사용자로부터 입력값 받아둠
			sum += num; // 사용자 입력값을 누적합에 반복해서 담아둠
			n++; //n번째 입력값은 -1이 입력되기 전까지 1씩 증가
		}
		while (num != -1);  //-- num이 '음수 1'이 아닐때까지 반복해서 처리

		// ○ 결과출력
		System.out.printf("\n>> 현재까지 입력된 정수의 합 : %d\n", (sum+1)); 
		//do~while반복문을 중지하는 기준이 '음수 1'이므로 누적합에 '양수 1'을 더해줘야 지금까지 입력된 정수의 합이 나옴
	}
}

// 실행 결과
/*
1번째 정수 입력(-1 종료) : 5
2번째 정수 입력(-1 종료) : 8
3번째 정수 입력(-1 종료) : 9
4번째 정수 입력(-1 종료) : 1
5번째 정수 입력(-1 종료) : -1
>> 현재까지의 입력된 정수의 합: 23
계속하려면 아무 키나 누르십시오 . . .
*/