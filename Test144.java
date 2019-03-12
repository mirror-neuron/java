/*==================================================
	   ■■■ 예외(Exception) 처리 ■■■
==================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test144
{
	private String[] data = new String[3];

	public void proc() //throws IOException (→ try ~ catch 로 예외처리)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n=0;

		try
		{	
			System.out.print("이름 입력[종료:Ctrl+z] : ");

			while ((str=br.readLine()) != null)
			{
				data[n++]=str;
				System.out.print("이름 입력[종료:Ctrl+z] : ");
			}	
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("예외 발생~!!!");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString : " + e.toString());
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
		catch (IOException e)		//예외도 객체다(e :참조변수)
		{
			System.out.println(e.toString()); // 여기에서의 toString(): exception이 가지고 있는 to String()(object or string X)
		}
		
		System.out.println("입력된 내용...");
		for (String s: data)
		{
			/*
			System.out.println(s);
			*/
			if (s != null)
			{
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) //throws IOException 
	{
		Test144 ob = new Test144();
		ob.proc();
	}
}

// 실행 결과
/*
이름 입력[종료:Ctrl+z] : 김김이
이름 입력[종료:Ctrl+z] : 님님이
이름 입력[종료:Ctrl+z] : 딤딤이
이름 입력[종료:Ctrl+z] : ^Z
입력된 내용...
김김이
님님이
딤딤이

계속하려면 아무 키나 누르십시오 . . .
*/

/*
이름 입력[종료:Ctrl+z] : 김김이
이름 입력[종료:Ctrl+z] : 님님이
이름 입력[종료:Ctrl+z] : 딤딤이
이름 입력[종료:Ctrl+z] : 림림이
예외 발생~!!!
getMessage : 3
toString : java.lang.ArrayIndexOutOfBoundsException: 3
printStackTrace...
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test144.proc(Test144.java:26)
        at Test144.main(Test144.java:52)
입력된 내용...
김김이
님님이
딤딤이

계속하려면 아무 키나 누르십시오 . . .
*/

/*
이름 입력[종료:Ctrl+z] : 김김이
이름 입력[종료:Ctrl+z] : ^Z
입력된 내용...
김김이
계속하려면 아무 키나 누르십시오 . . .
*/