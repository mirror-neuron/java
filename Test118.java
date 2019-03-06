/*========================================
	■■■ 클래스 고급 ■■■
	- 중첩 클래스
=========================================*/

class Test2
{
	static int a=10;	// 전역변수, 멤버변수, static 변수(클래스 변수)
	int b=20;			// 전역변수, 멤버변수, instance 변수(인스턴스 변수)

	// ▶ 첫 번째 write() 메소드
	void write()
	{
		System.out.println("write()...①");
		final int c=30;		// 지역변수, 상수화된 변수(값이 변하지 않는 변수)
		int d=40;			// 지역변수, 값이 수시로 변할 수 있는 변수

		// ※ 변수 c 와 변수 d 는 둘 다 지역변수이지만...
		//    c는 final 변수이기 때문에
		//    두 번째 write() 메소드에서 언제 접근하더라도
		//    고정된 값임을 보장받을 수 있다.
		//    반면에 d 는 그 값이 수시로 변동될 수 있는 상황이므로
		//    LocalTest 클래스의 인스턴스 생성 시점을
		//    보장받을 수 없기 때문에 d 에 접근하는 것은 피해야 한다.

		// 메소드 안에 존재하는 또다른 클래스(lcoal class)
		class LocalTest	//-- 지역 클래스
		{
			// ▶ 두 번째 write() 메소드
			void write()
			{
				System.out.println("write()... ②");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				//System.out.println("d : " + d);	//--==>> 컴파일 에러
			}
		}

		d=10;

		// 첫 번째 write() 메소드에서 생성한 지역 클래스의 인스턴스
		LocalTest ob1 = new LocalTest();
		d=30;
		ob1.write();	//-- 두 번째 write() 메소드 호출
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test118
{
	public static void main(String[] args)
	{
		Test2 ob2 = new Test2();
		ob2.write();	//-- 첫 번째 write() 메소드 호출
	}
}

// 실행 결과
/*
write()...①
write()... ②
a : 10
b : 20
c : 30
계속하려면 아무 키나 누르십시오 . . .
*/