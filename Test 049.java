/*============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문 (while문) 실습
=============================================*/

// 실행 예)
// 연산 결과 : xxxx


// 1 * 2 * 3 * 4 * ... * 10

public class Test 049
{
	public static void main(String[] args)
	{
    int n=1, sum=0;
	while (n<=10)
	{
		sum += n*(n+1);
		n++;
	} 
		System.out.printf("연산 결과 : %d%n", sum);
	}
}