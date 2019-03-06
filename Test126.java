/*==================================================
	   ■■■ 자바의 주요(중요) 클래스 ■■■
	   - Wrapper 클래스
==================================================*/

public class Test126
{
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi);		// Boolean 이라는 클래스 타입의 객체 생성
		Boolean wBi = bi;						//-- 오토 박싱

		int n = 300;							
		Integer wrapN = new Integer(n);			// Integer 라는 클래스 타입의 객체 생성
		int n2 = wrapN;							//-- 오토 언박싱

		float f = 300.3f;
		Float wrapF = new Float(f);

		System.out.println(wrapBi.toString());	//--==>> true
		System.out.println(wrapN.toString());	//--==>> 300
		System.out.println(wrapF.toString());	//--==>> 300.3
		// 위의 과정은 자동으로 형 변환이 되는 것이지 호환되는 것은 아님

		System.out.println(wrapBi);				//--==>> true
		System.out.println(wrapN);				//--==>> 300
		System.out.println(wrapF);				//--==>> 300.3

		System.out.println(wBi);				//--==>> true
		System.out.println(n2);					//--==>> 300

		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();

		// Integer 클래스
		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  12

		ni = Integer.parseInt("0101", 2);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :   5 (2진수 형태를 정수화)
		
		ni = Integer.parseInt("12", 8);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  10 (8진수 형태를 정수화)

		ni = Integer.parseInt("A", 16);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  10 (16진수 형태를 정수화)

		sn = Integer.toBinaryString(20);
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 10100 (2진수 문자열 형태로 반환)

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 1f (16진수 문자열 형태로 반환)

		sn = Integer.toOctalString(31);
		System.out.printf("sn : %s\n", sn);
		//--==>> sn : 37 (8진수 문자열 형태로 반환)

		Integer num = new Integer(50);
		System.out.println(num.toString());
		//--==>> 50

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);
		//--==>> 345
	}
}