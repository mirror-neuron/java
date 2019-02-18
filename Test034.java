/*============================================
 ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
 - if ~ else문 실습
=============================================*/

// ○ 실습 문제
// 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 처리 결과를 출력하는 프로그램을 작성한다.
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 형태로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력    : 10
// 두 번째 정수 입력    : 14
// 연산자 입력(+ - * /) : +

// >> 10 + 14 = 24
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException 
	{
	    // 내가 풀이한 내용 
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
	    char str;
			
	    System.out.print("첫 번째 정수 입력 : ");
        a=Integer.parseInt(br.readLine());
    
     	System.out.print("두 번째 정수 입력 : ");
		b=Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력(+ - * /) : ");
		str=(char)System.in.read();
		
		if (str=='+')
		{
			str=a+b;
			System.out.printf(">> %d + %d = %d%n", a, b, str);
		}
		else if (str=='-')
		{
			str=a-b;
			System.out.printf(">> %d - %d = %d%n", a, b, str);
		}
		else if (str=='*')
		{
			str=a*b;
			System.out.printf(">> %d * %d = %d%n", a, b, str);
		}
		else if  (str=='/')
		{
			str=a/b;
			System.out.printf(">> %d / %d = %d%n", a, b, str);
		}
		*/
    
		// 방식 ①
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		char op;
		int temp;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력(+ - * /) : ");
		//op = Integer.parseInt(br.readLine()); -> 불가능
		//op = br.readLine();  -> 문자열을 문자에 담는 것은 안 됨(자동 형 변환 규칙)
		//temp = System.inread(); -> 가능
		op = (char)System.in.read(); 

		// "1234" → Integer.parseInt(); → 1234
		// "abcd" → Integer.parseInt(); → (X)

		if (op == '+')
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == '-')
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == '*')
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == '/')
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else 
		{
			System.out.println("입력 과정에 오류가 존재합니다.");
		}
		*/

		// 방식 ② 
		/*
		BufferedReader br = new BufferedReader(InputStreamReader(System.in));

		int a, b, op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		op = System.in.read();

		// 테스트(확인)
		System.out.println(" op : " + op);
		//-- + → op : 43
		//   - → op : 45
		//   * → op : 42
		//   / → op : 47	

        if (op == 43)		// '+' 
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == 45)		// '-'
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == 42)		// '*'
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == 47)		// '/'
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else 
		{
			System.out.println("입력 과정에 오류가 존재합니다.");
		}
		*/

		// 방식 ③
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, result=0;		//result값을 초기화 했으므로 마지막에 else문은 넣지 않아도 됨.
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력(+ - * /) : ");
		//op = Integer.parseInt(br.readLine()); -> 불가능
		//op = br.readLine();  -> 문자열을 문자에 담는 것은 안 됨(자동 형 변환 규칙)
		//temp = System.inread(); -> 가능
		op = (char)System.in.read(); 

		// "1234" → Integer.parseInt(); → 1234
		// "abcd" → Integer.parseInt(); → (X)

		if (op == '+')
			result = a + b;     
		else if (op == '-')
			result = a - b;
		else if (op == '*')
			result = a * b;
		else if (op == '/')
			result = a / b;

        System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
		
	}
}

// 실행 결과
/*
첫 번째 정수 입력 : 9
두 번째 정수 입력 : 5
연산자 입력(+ - * /) : /

>> 9 / 5 = 1
계속하려면 아무 키나 누르십시오 . . .
*/
