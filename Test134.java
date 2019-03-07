/*==================================================
	   ■■■ 자바의 주요(중요) 클래스 ■■■
	   - StringBuffer 클래스
==================================================*/

public class Test134
{
	public static void main(String[] args)
	{
		String s1 = "123456789";
		s1 = (s1 + "123").replace('2', 'A');
		// 123456789
		// 123456789123
		// 1A34567891A3

		System.out.println(s1);
		//--==>> 1A34567891A3

		StringBuffer s2 = new StringBuffer("123456789");
		s2.delete(0, 3).replace(1, 3, "24").delete(4, 6);
		// 123456789
		// 456789
		// 424789
		// 4247

		System.out.println(s2);
		//--==>> 4247

		StringBuffer s3 = new StringBuffer("123456789");
		String s4 = s3.substring(3, 6);		// ← StringBuffer 에도 substring( , )이 있음
		// 123456789
		// 456

		System.out.println(s4);
		//--==>> 456

		StringBuffer s5 = new StringBuffer("123456789");
		s5.delete(0, 3).delete(1, 3).delete(2, 5).insert(1, "24");
		// 123456789
		// 456789
		// 4789
		// 47
		// 4247

		System.out.println(s5);
		//--==>> 4247

		StringBuffer s6 = new StringBuffer("123456789");
		s6.delete(3, 20); 
		System.out.println(s6);
		//--==>> 123   //-- delete() 메소드는 매개변수가 문자열.length를 넘어가더라도 오류나지 않고 처리함

	}
}