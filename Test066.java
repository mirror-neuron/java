/*===============================================================
   ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
   - return 활용
     (1. 값을 반환 2. 메소드 종료(main()종료 = 프로그램의 종료) 
================================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test066
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, s;
			
		System.out.print("임의의 정수 입력(10 이상)  : ");
		n = Integer.parseInt(br.readLine());

		if (n<10)
		{
			System.out.println("10 이상의 정수를 입력해야 합니다~!!!");
			return; //-- main() 종료(프로그램 종료), 이후의 연산은 무시
		}
		s = 0;
		for (int i=1; i<=n; i++)
			s += i;

		System.out.println("결과 : " + s);

	}
}

// 실행결과 
/*

*/