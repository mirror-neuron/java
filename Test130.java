/*==================================================
	   ■■■ 자바의 주요(중요) 클래스 ■■■
	   - Wrapper 클래스
==================================================*/


public class Test130
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);	// Integer. 으로 쓰기 때문에 'static final'
		System.out.println(Integer.MIN_VALUE);
		//--==>> 2147483647    (int의 표현범위 최대값)
		//       -2147483648   (int의 표현범위 최소값)

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		//--==>> 9223372036854775807
		//       -9223372036854775808

		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		//--==>> 1.7976931348623157E308
		//       4.9E-324(4.9에 -324승)

		System.out.println();

		System.out.println("1 : " + 3.0/0);		//-- 0으로 무한으로 몫과 나머지가 나눠지기 때문에
		System.out.println("2 : " + -3.0/0);	
		//--==>> 1 : Infinity
		//       2 : -Infinity

		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("4 : " + (3.0/0 == -3.0/0));
		//--==>> 3 : true		//-- 무한대 끼리의 비교가 가능
		//		 4 : false		//-- 양수 무한대와 음수 무한대를 다르게 취급함

		// 『Double.isInfinite()』
		System.out.println("5 : " + Double.isInfinite(3.0/0));	
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		//--==>> 5 : true		
		//       6 : true

		//-- isxxx() 메소드 대부분은 "~인지 ~아닌지"를 확인해서 그 결과값을 반환해준다.
		//   음수이건 양수이건 무한대인지 아닌지만 확인해서 결과값 반환해줌

		System.out.println();

		System.out.println("7 : " + (3.0/0 + -3.0/0));
		System.out.println("8 : " + 0.0/0);
		//--==>> 7 : NaN(Not a Number)
		//		 8 : NaN

		System.out.println("9 : " + (0.0/0 == 0.0/0));
		System.out.println("10 : " + (0.0/0 != 0.0/0));
		//--==>> 9 : false
		//       10: true

		// ※ NaN(Not a Number) 값(상태)과 임의의 수를
		//    『==』 연산자를 통해 비교 연산을 수행하게 되면
		//    결과는 언제나 『false』를 반환한다.

		System.out.println("11 : " + Double.isNaN(0.0/0));
		//--==>> 11 : true   //-- is 구문으로 NaN인지 아닌지 확인해줌


	}
}