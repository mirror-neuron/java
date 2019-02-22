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

public class CircleTest 
{
	// 전역 변수 선언
	int r;
	final double PI = 3.141592; // Final(상수화)하면 변수명을 '대문자'로 구성함

	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// BufferedReader 인스턴스를 전역로 생성하게 되면, 
	// CircleTest(class)만 부르고 싶을 때에도
	// 매번 메모리를 같이 할당 받기 때문에
	// 특별한 경우가 아니면 해당 메소드 아래에 생성한다.

	// 반지름 입력하는 메소드 정의
	void input() throws IOException  //-- br.readLine()을 썼기 때문에 예외의 경우가 생기면 던짐
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}

	// 원의 넓이 메소드 정의
	double calArea()
    {
		// return r * r * PI;
		double result;
		result = r * r * PI;
		return result;
	}

	// 원의 둘레 메소드 정의
    double calLength()
	{
		//return r * 2 * PI;
		double result = r * 2 * PI;
		return result;
	}

	// 출력 메소드 정의
	void print(double a, double l)
	{
		System.out.printf("\n>> 반지름이 %d인 원의", r);
		System.out.printf("\n>> 넓이 : %.2f", a);
		System.out.printf("\n>> 둘레 : %.2f\n", l);
	}

}