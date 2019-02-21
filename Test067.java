/*==============================================
  ■■■ 매소드 재귀호출 (재귀 메소드) ■■■
==============================================*/

public class Test067
{
	public static void main(String[] args)
	{
		showHi(3);
	}
	public static void showHi(int cnt)
	{	
	
		//문제
		/*
		System.out.println("Hi~!!"); 
		showHi(cnt--);
		if (cnt==1)			
			return;
		*/

    	System.out.println("Hi~!!"); 
		if (cnt==1)			// cnt==1이 되는 순간 메소드 종료
			return;
		
		showHi(--cnt);		// 먼저 1씩 감소시키므로 cnt에 3→2→1 순으로 값이 들어감
		 				
	}
}


