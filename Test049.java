/*============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문 (while문) 실습
=============================================*/

// 실행 예)
// 연산 결과 : xxxx

// 1 * 2 * 3 * ...* 10

public class Test049
{
	public static void main(String[] args)
	{
	//내가 풀이한 내용
	/*
	int n=1, sum=1;

	while (n<=10)
	{
		sum *= n;
		n++;
	}
	 System.out.printf("연산 결과 : %d\n", sum);
	*/
	
	//함께 풀이한 내용
	int n=0, result=1;	// check~!!
						// 누적곱을 답을 변수 → 1로 초기화!!
  	while (n<=10)
	{
		n++;
		result *= n;
	}
	 System.out.println("연산 결과 : " + result);
	
	}
}
// 실행 결과
/*
연산 결과 : 39916800
계속하려면 아무 키나 누르십시오 . . .
*/