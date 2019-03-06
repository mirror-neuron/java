/*========================================
	■■■ 클래스 고급 ■■■
	- 중첩 클래스
=========================================*/

/*
○ Anonymous 클래스(익명의 클래스, 무명 클래스)

   - awt 나 안드로이드 이벤트(사용자가 취하는 모든 액션) 처리에서 일반적으로 사용
   - 상위 클래스(상속하는 부모 클래스) 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
   - 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는
     번거로움 때문에 익명의 클래스를 생성하여 처리한다.
   
○ 형식 및 구조

   new 상위클래스의생성자()
   {
	   접근제어지시자 자료형 메소드()
	   {
		   //...
	   }
   };	← 반드시 세미콜론(;) 필요함~!!!

○ 물리적인 파일 구조 상(탐색기 상에서)
   『클래스명$1.class』 파일이 생성되며
   $ 뒤의 숫자가 순차적으로 부여된다.

   
*/

//import java.lang.*;	//-- 모든 클래스들은 import 구문(java.lang 패키지)를 포함하고 있다.
						//   ex) Sytem, String, Object 클래스 같이 따로 import 구문 없이 작성되는 것들은 모두 lang 패키지에 포함되어 있는 것이다.

class Test03	// extends Object
{
	/*
	.....
	...
	........
	...
	*/

	public Object getString()
	{
		// return ____; ← Object

		// ↓

		// Object ob = new Object();.
		// return ob;

		// ↓

		// return new Object();

		// ↓

		// return new Object(){중얼중얼};
		// ↓

		return new Object()	//-- Object() 클래스의 생성자 자체가 상위 클래스의 객체가 됨
		{
			@Override
			public String toString()
			{
				return "익명의 클래스...";
			}
		};		// ← 세미콜론(미 작성 시 에러 발생)
	}
}

public class Test120 //extends Object -- 자바의 모든 클래스는 Object 클래스를 상속받고 있다.
{
	public static void main(String[] args)
	{
		Test03 ob1 = new Test03();
		Test03 ob2 = new Test03();

		System.out.println(ob1.toString());
		//--==>> Test03@15db9742 
		//-- 자바가 객체를 구분하기 위해 임의로 부여하는 식별 번호(해시코드)

		System.out.println(ob2.getString());
		//--==>> 익명의 클래스...
	}
}