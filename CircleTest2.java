/*==================================
  ■■■ 클래스와 인스턴스 ■■■
===================================*/

// ○ 실습 문제
// 원의 넓이와 둘레 구하기

// 원의 넓이와 둘레를 구할 수 있는 클래스를 독립적으로(별도로) 생성한다.
// (클래스명 : CircleTest) → CircleTest.java

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xxxx

// >> 반지름이 xxx인 원의
// >> 넓이 : xxx.xx
// >> 둘레 : xxx.xx
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest2 
{
	int r;
	final double PI = 3.141592; 

	double input() throws IOException  
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());

		double result = r * r * PI;
		double result = r * 2 * PI;

		System.out.printf("\n>> 반지름이 %d인 원의", r);
		System.out.printf("\n>> 넓이 : %.2f", a);
		System.out.printf("\n>> 둘레 : %.2f\n", l);
	}
}