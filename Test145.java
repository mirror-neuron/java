/*==================================================
	   ■■■ 예외(Exception) 처리 ■■■
==================================================*/

// Test146.java와 비교~!!

class Demo
{
	private int value;	//-- value : 전역변수(default 값 = 0으로 자동초기화)

	// setter
	public void setValue(int value)
	{
		if(value<=0)
			return;	//-- 메소드 종료

		this.value = value;
	}

	// getter
	public int getValue()
	{
		return value;
	}
}


public class Test145
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}