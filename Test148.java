/*==================================================
	   ■■■ 예외(Exception) 처리 ■■■
	   - 다른 예외 다시 던지기
==================================================*/


public class Test148
{
	public int getValue(int value) throws Exception
	{
		int a=0;

		try
		{
			a=getData(-2); 
			//-- ⓐ 유형의 빨간 폭탄 잡아내기
		}
		catch (Exception e)
		{
			// ⓐ 유형의 빨간 폭탄 처리
			System.out.println("printStackTrace......(getValue)");
			e.printStackTrace();

			// 예외 발생 → ⓑ 유형의 파란 폭탄
			throw new Exception("Value 가 음수입니다.");
		}

		return a; //-- 이 구문이 없으면 컴파일 자체가 안 됨.
	
	}

	public int getData(int data) throws Exception
	{
		if (data<0)
			throw new Exception("data가 0보다 작습니다.");	
			//-- 예외 발생 ⓐ 유형의 빨간 폭탄 

		return data+10;
	}


	public static void main(String[] args) // throws Exception 
	{
		Test148 ob = new Test148();

		try
		{
			// ⓑ 유형의 파란 폭탄 잡아내기
			int a = ob.getValue(-2);
			System.out.println("a : " + a);
		}	
		catch (Exception e)
		{
			// ⓑ 유형의 파란 폭탄 처리
			System.out.println("printStackTrace.........(main)");
			e.printStackTrace();
		}
	}
}

// 실행 결과
/*
printStackTrace......(getValue)
java.lang.Exception: data가 0보다 작습니다.
        at Test148.getData(Test148.java:34)
        at Test148.getValue(Test148.java:15)
        at Test148.main(Test148.java:48)
printStackTrace.........(main)
java.lang.Exception: Value 가 음수입니다.
        at Test148.getValue(Test148.java:25)
        at Test148.main(Test148.java:48)
계속하려면 아무 키나 누르십시오 . . .
*/