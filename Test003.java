/*===========================================
	■■■ 자바 기본 프로그래밍 ■■■
	- 자바 소스코드 입력 및 컴파일
	- 변수와 자료형
============================================*/

public class Test003
{
	public static void main(String[] args)
	{
		// 변수 선언
		int a;

		// 변수 초기화(변수 a에 10을 대입)
		a = 10;

		// 변수 선언 및 초기화 
		int b = 20;
		
		// 변수 선언
		int c;

		// 연산 및 처리(a와 b를 덧셈 연산한 결과값을 c에 대입)
		c = a + b;
		
		// 결과 출력
		//System.out.println(c);
		//--==>> 30		

		// 결과 출력
		//System.out.println(a b c);
		//--==>> 에러 발생(컴파일 에러)
		
		// 결과 출력
		//System.out.println("a : " + a);
		//--==>> a : 10

		/* ※ 덧셈 연산자(+)
			  피연산자 중 어느 하나라도 문자열 형태의 데이터가 존재한다면
			  산술 연산자로써의 기능을 수행하는 것이 아니라
			  문자열 결합 연산자로써의 기능을 수행하게 된다. */
		// 결과 출력
		//System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		//--==>> a : 10, b : 20, c : 30

		/* 
		변수 a : 10
		변수 b : 20
		a와 b를 더한 결과값 : 30
		*/
		// 결과 출력
		System.out.println("변수 a : " + a + "\n변수 b : " + b + "\na와 b를 더한 결과값 : " + c);

		System.out.println("변수 a : " +  a);
		System.out.println("변수 b : " +  b);
		System.out.println("a와 b를 더한 결과값 :" + c);
		

	}
}