/*================================================
	   ■■■ 컬렉션 (Collection) ■■■
================================================*/

// Vector v = new Vector();
//-- 비어있는 Vector 자료구조 생성

// Vector v = new Vector(8);
//-- 8개의 초기 elements 를 가진 Vector 자료구조 생성
//   8개가 모두 채워지게 되면(모자라게 되면) 자동으로 확장된다.

// Vector v = new Vector(3, 5);
//-- 3개의 초기 elements 를 가진 Vector 자료구조 생성
//   3개가 모두 채워지게 되면(모자라게 되면) 5개 증가(확장)된다.

// ※ 벡터는 데이터 요소로서 정수형, 실수형, 문자열... 등을
//    담아내는 것이 가능하다.
//    → 접근 방법 → 데이터 안전성 확보 -- check~!!!


// MyVector 클래스 설계 → Vector 클래스 상속
class MyVector extends Vector<Object>
{
	/*
	... 기존 Vector 멤버 상속
	*/	

	// 생성자
	MyVector()
	{
		// Vector(슈퍼 클래스) 생성자 호출
		super(1, 1);
		//-- 첫 번째 인자 : 주어진 용량
		//-- 두 번째 인자 : 증가량
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}
}

public class Test154
{
	public static void main(String[] args)
	{
		// MyVector 클래스 인스턴스 생성
		MyVector v = new MyVector();

		// 주요 변수 선언 및 초기화
		int digit = 5;
		float real = 3.14f;
		String s = new String("안녕하세요");
		char[] letters = {'s', 't', 'u', 'd', 'y'};
		
		v.addInt(digit);		 //-- 벡터 자료구조에 정수 저장
		v.addFloat(real);		 //-- 벡터 자료구조에 실수 저장
		v.addString(s);			 //-- 벡터 자료구조에 문자열 저장
		v.addCharArray(letters); //-- 벡터 자료구조에 문자 배열 저장

	    v.write();

	}
}