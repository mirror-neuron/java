/*================================================
	   ■■■ 컬렉션 (Collection) ■■■
================================================*/

// 벡터 자료구조 객체 선언 및 생성 시 사용자 정의 클래스 활용
// → 자료형

import java.util.Vector;
// 사용자 정의 클래스 설계 → 자료형처럼 활용
class MyData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String name;		//-- 이름
	private int age;			//-- 연령

	// getter / setter 구성
	// getter(자료 반환)
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	// setter(설정)
	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age; 
	}

	// 생성자(인자 없는 생성자)
	public MyData()
	{
		name = "";
		age = 0;
	}

	// 생성자(인자 2개인 생성자)
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

}


public class Test157
{
	public static void main(String[] args)
	{
		// 벡터 자료구조 인스턴스 생성
		Vector<MyData> v = new Vector<MyData>();

		// 벡터 자료구조 v 에 
		// 이지혜 16세 / 이기승 24세 / 조현우 86세 
		// 담아내기

		// ①
		/*
		MyData st1 = new MyData();
		st1.setName("이지혜");
		st1.setAge(16);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("이기승");
		st2.setAge(24);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("조현우");
		st3.setAge(86);
		v.add(st3);
		*/

		// ②
		/*
		MyData st1 = new MyData("이지혜", 16);
		v.add(st1);
		MyData st2 = new MyData("이기승", 24);
		v.add(st2);
		MyData st3 = new MyData("조현우", 86);
		v.add(st3);
		*/

		// ③
		v.add(new MyData("이지혜", 16));
		v.add(new MyData("이기승", 24));
		v.add(new MyData("조현우", 86));



		// 벡터 자료구조 v 에 담긴 내용(요소) 전체 출력하기
		// 실행 예)  
		// 이름:이지혜, 나이:16세
		// 이름:이기승, 나이:24세
		// 이름:조현우, 나이:86세

		// ① 
		/*
		for (MyData obj : v)
			System.out.printf("이름 : %s, 나이 : %d\n", obj.getName(), obj.getAge()); //-- obj (벡터로부터 꺼내쓸 수 있음)
		System.out.println();
		//--==>> 이름 : 이지혜, 나이 : 16
		//		 이름 : 이기승, 나이 : 24
		//		 이름 : 조현우, 나이 : 86
		*/

		// ②
		/*
		for (int i=0; i<v.size(); i++)
		{
			System.out.printf("이름 : %s, 나이 : %d\n", v.elementAt(i).getName(), v.get(i).getAge()); 
														--------------			  ---------
														MyData 불러옴			MyData 불러옴
		}
		System.out.println();
		//--==>> 이름 : 이지혜, 나이 : 16
		//		 이름 : 이기승, 나이 : 24
		//		 이름 : 조현우, 나이 : 86
		*/

		// ③
		for (Object temp : v)  // temp : MyData가 Object(부모 클래스) 로 업 캐스팅
		{
			System.out.printf("이름 : %s, 나이 : %d\n", ((MyData)temp).getName(), ((MyData)temp).getAge());
		}
		System.out.println();
		//--==>> 이름 : 이지혜, 나이 : 16
		//		 이름 : 이기승, 나이 : 24
		//		 이름 : 조현우, 나이 : 86

	}
}

// 실행 결과
/*
이름 : 이지혜, 나이 : 16
이름 : 이기승, 나이 : 24
이름 : 조현우, 나이 : 86

계속하려면 아무 키나 누르십시오 . . .
*/
