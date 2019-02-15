/*===========================================
 ■■■ 자바의 기본 프로그래밍 ■■■
 - 자바의 기본 입출력 : printf()
============================================*/

public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("ccc\n");  //-- 『\n』 개행

		// 서식 출력 메소드
		System.out.printf("1234567890");
		System.out.printf("1234567890\n");	//-- 『\n』 개행
		System.out.printf("1234567890%n");  //-- 『%n』 개행
		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		//--==>> AAABBBccc
		//		12345678901234567890
		//		1234567890
		//		10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123);
		System.out.printf("%010d\n", 123);
		//--==>> 123
		//		        123(총 10자리, 숫자는 우측 정렬/ 문자는 좌측 정렬)
		//		 0000000123

		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		//--==>> +365
		//		 +365

		System.out.printf("%d\n", +365);
		//--==>> 365

		//System.out.printf("%-d\n", 365);  //-- 런타임 에러 발생
											//   (매개변수가 소속된 메소드가 오류 판단, 컴파일러가 오류를 확인할 수 없음)
		System.out.printf("-%d\n", 365);
		System.out.printf("%d\n", -365);
		//--==>> -365
		//		 -365

		System.out.printf("%(d\n", -365);
		System.out.printf("%(d\n", 365);
		//--==>> (365) → 부호와 절대치에서 지출의 개념으로 많이 쓰임
		//		  365

		//System.out.printf("%d\n", 'A');		//-- 런타임 에러 발생
		System.out.printf("%c\n", 'A');
		//System.out.printf("%c\n", "ABCD");	//-- 런타임 에러 발생
		System.out.printf("%s\n", "ABCD");
		//--==>> A
		//		 ABCD

		System.out.printf("%h\n", 365);			//-- %h = 16진수 
		System.out.printf("%o\n", 24);			//-- %o = 8진수
		//--==>> 16d
		//		 30

		System.out.printf("%s\n", "true");
		System.out.printf("%b\n", true);		//--%b = boolean
		//--==>> true
		//		 true

		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23);
		System.out.printf("%.2f\n", 123.236);		
		System.out.printf("%8.2f\n", 123.236);
		System.out.printf("%2.2f\n", 123.1234);
		//--==>> 123.230000
		//		 123.23
		//		   123.24
		//       123.12

		//--==>
	}
}