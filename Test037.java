/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else문 실습
=========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.
// 단, 입력 데이터를 한 번에 처리할 수 있도록 구성하며
// 『xor』연산자를 활용하여 스왑 처리를 할 수 있도록 한다.

// 실행 예)
// 임의의 세 정수 입력(공백 구분) : 160 80 241

// >> 정렬 결과 : 80 160 241
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test037
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		//함께 풀이한 내용
		int a, b, c;
		System.out.print("임의의 세 정수 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	
		if (a>b)
		{
			a=a^b; b=b^a; a=a^b;
		}
		if (b>c)
		{
			b=b^c; c=c^b; b=b^c;
		}
		if (a>b)
		{
			a=a^b; b=b^a; a=a^b;
		}
		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);

	
		//내가 풀이한 내용
		/*
		int a, b, c;
		
		System.out.print("임의의 세 정수 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

	    if (a>c)
	    {
			a=a^c;
			c=c^a;
			a=a^c;
	    }
		if (a>b)
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (b>c)
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}

		System.out.printf("%n>> 정렬 결과 : %d %d %d%n", a, b, c); 
		*/
	}
}

// 실행 결과
/*
임의의 세 정수 입력 : 8 9 5

>> 정렬 결과 : 5 8 9
계속하려면 아무 키나 누르십시오 . . .
*/