/*==================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스 설계 실습
===================================*/

// ○ 실습 문제
// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 사칙 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 10 5 
// 임의의 연산자 입력(+ - * /)	  : +
// >> 10 + 5 = 15
// 계속하려면 아무 키나 누르세요...

// ○ 내가 풀이한 내용 (Test042 참고)
import java.util.Scanner;
import java.io.IOException;

class Operator
{
	// 주요 변수 선언
	int a, b, result;
	char op;

	// 입력 메소드 정의
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

			System.out.print("임의의 두 정수 입력(공백 구분) : "); 
			a = sc.nextInt(); 
			b = sc.nextInt();

			System.out.print("임의의 연산자 입력(+ - * /) : ");
			op = (char)System.in.read();
	}
	
	// 연산 메소드 정의
	void calculate()
	{
		switch (op)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		default: return;
		}
		
	}
	
	// 출력 메소드 정의
	void print()
	{
		System.out.printf(">> %d %c %d = %d", a, op, b, result); 
	}
}

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		Operator ob = new Operator();
		
		ob.input();

		ob.calculate();

		ob.print();
	}
}