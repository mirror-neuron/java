/*========================================
	■■■ 클래스 고급 ■■■
	-- 상속(Inheritance)
=========================================*/

// ○ 실습 문제
//	  다음과 같은 프로그램을 구현한다.
//    단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Super class
class AClass
{
	protected int x, y;
	protected char op;

	public AClass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

// Sub class
class BClass extends AClass 
{
	/*
	protected int x, y;
	protected char op;

	public AClass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/

	BClass()
	{
	}

	boolean input() throws IOException  //-- boolean : 유효한 값 입력 여부 확인
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 두 정수 입력(공백 구분) : "); // 20 15
		String temp = br.readLine();						   // "20 15"
		String[] str = temp.split("\\s");    //  구분자 → 공백
		// ※ 문자열.split("구분자");
		// ex) "사과 딸기 바나나".split("\\s");
		//     반환 → {"사과", "딸기", "바나나"}
		// ex) "10 20 30 40".split("\\s");
		//     반환 → {"10", "20", "30", "40"}
		//--------------------------------------------> String[] str = {"20", "15"};(문자열 형태의 배열로 반환)

		if (str.length != 2)
			return false; //-- false(거짓)을 반환하여 input() 메소드 종료
						  // 유효하지 않은 상황(return : ①값의 반환, ②메소드 종료)
						  
			// ※ 이 조건문을 수행할 경우 아래에 코드들이 남아있는 상황이지만
			//	  더 이상 수행하지 않고 결과값을 반환하며 메소드는 종료된다.

			x = Integer.parseInt(str[0]);
			y = Integer.parseInt(str[1]);

			System.out.print("연산자 입력(+ - * /) : ");
			op = (char)System.in.read();
		
			/*
			if (op!='+' && op!='-' && op!='*' && op!='/') //-- '부정 조건의 && 연산'을 다른 조건으로 바꾸면 
				return false;

			return true;
			*/

			if (op =='+' || op=='-' || op=='*' || op=='/') //--'||'로 다 뒤집힌다.
				return true;

			return false;
		
	}
			double calc()
			{
				double result = 0;
				switch (op)
				{
					case '+' : result = x + y; break;
					case '-' : result = x - y; break;
					case '*' : result = x * y; break;
					case '/' : result = (double)x / y; break;
				}
				return result;
			}

	}
	


public class Test108_1
{
	public static void main(String[] args) throws IOException
	{
		//AClass ob = new AClass(); -- 부모 클래스로 인스턴스 생성할 필요 없음(자식 클래스에 다 포함이니까)
		BClass ob = new BClass();

		if (!ob.input())		//-- boolean으로 인식, 입력값이 유효하지 않다면...
		{
			System.out.print("Error...");
			return;
		}

		double result = ob.calc();
		ob.write(result);
	}
}

// 실행 결과
/*

*/