/*=======================================================
  ■■■ 메소드 중복정의(Method Overloading) ■■■
  - 메소드 오버로딩이 가능한 형태와 불가능한 형태
========================================================*/

public class Test096
{	
	public static void main(String[] args)
	{
		print();
		print(10);
		print('a');
		print(10, 20);
		print(10, 3.14);
		print(3.14, 10);
		double result = print(3.14);		//-- 연산자 '='은 우선순위가 가장 낮으므로 Java에서는 오른쪽 항이 먼저 처리된다.
		//print(3.14);						//-- 위의 print(3.14)가 아래의 메소드와 구별되지 않음
	}

	public static void print(){}
	public static void print(int i){}
	//public static void print(int j){}			//-- (X)
	public static void print(char c){}			//-- (O), ※ 자동 형변환 규칙 check~!!
	public static void print(int i, int j){}    //-- 
	public static void print(int i, double d){}	//-- (O), ※ 자동 형변환 규칙 check~!!
	public static void print(double d, int i){}	//-- (O), ※ 자동 형변환 규칙 check~!!
	public static double print(double d){return 3.14;}
	//public static void print(double d){}		//-- (X)
}

// 실행 결과
/*

*/