/*==========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문 (while문) 실습
===========================================*/

/* 1부터 100까지 정수의 합 : 5050
   1부터 100까지 짝수의 합 : 2550
   1부터 100까지 홀수의 합 : 2500
   계속하려면 아무 키나 ...
*/


public class Test046
{
	public static void main(String[] args)
	{
	//내가 풀이한 내용
	/*
	int n=1;
	int tot=0, even=0, odd=0;	

	while (n<=100)
	{
	  tot += n;

	  if (n%2==0)
	  {
		even += n;
	  }
	  else 
	  {
		odd += n;
	  }
		n++;
	}
	System.out.println("1부터 100까지의 정수의 합 : " + tot);
	System.out.println("1부터 100까지의 짝수의 합 : " + even);
	System.out.println("1부터 100까지의 홀수의 합 : " + odd);
	*/

	//함께 풀이한 내용
	// ○ 주요 변수 선언
	//int n=1, sum=0, even=0, odd=0;
	int n=1, sum, even, odd;
	sum=even=odd=0;
	
	// ○ 연산 및 처리(반복문 구성)
	while (n<=100)
	{
		sum += n;

		if (n%2==0)
		{
			even += n;
		}
		else 
		{
			odd += n;
		}

		n++;
	}

	// ○ 결과 출력
	System.out.println("1부터 100까지 정수의 합 : " + sum);
	System.out.println("1부터 100까지의 짝수의 합 : " + even);
	System.out.println("1부터 100까지의 홀수의 합 : " + odd);
	}
}

// 실행 결과
/*
1부터 100까지 정수의 합 : 5050
1부터 100까지의 짝수의 합 : 2550
1부터 100까지의 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/
