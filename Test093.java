/*======================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스와 인스턴스 활용 
=======================================*/

// ○ 실습 문제
// 학생별로 국어점수, 영어점수, 수학점수를 입력받아
// 총점, 평균을 산출하는 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.
// 마지막으로, 다음의 요구사항을 충족할 수 있도록 설계한다.

// 프로그램을 구성하는 클래스
// 1. Record 클래스
//    - 속성만 존재하는 클래스로 설계할 것~!!(메소드 없이 변수들만)
// 2. Sungjuk 클래스
//    - 인원 수를 입력받아, 입력받은 인원 수만큼
//      이름, 국어점수, 영어점수, 수학점수를 입력받고
//      총점과 평균을 산출하는 클래스로 설계할 것~!!
//    - 속성 : 인원 수, Record 형태의 배열
//    - 기능 : 인원 수 입력, 상세 데이터 입력, 총점/평균 산출, 결과 출력
// 3. Test093 클래스
//    - main() 메소드가 존재하는 외부의 다른 클래스로 설계할 것~!!

// 실행 예)
// 인원 수 입력(1~100) : 102
// 인원 수 입력(1~100) : -10
// 인원 수 입력(1~100) : 3
// 1번째 학생의 이름 입력 : 김정규
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70
// 2번째 학생의 이름 입력 : 김성희
// 국어 점수 : 82
// 영어 점수 : 72
// 수학 점수 : 62
// 3번재 학생의 이름 입력 : 김선아
// 국어 점수 : 98
// 영어 점수 : 88
// 수학 점수 : 78

// 김정규 90 80 70 240 80.00   2 
// 김성희 82 72 62 216 72.00   3
// 김선아 98 88 78 264 88.00   1

// 계속하려면 아무 키나 누르세요...



public class Test093
{
	public static void main(String[] args)
	{
		Sungjuk_1 ob = new Sungjuk_1();
		ob.set();
		ob.input();
		ob.print();

		/*
		Sungjuk sj = new Sungjuk();

		sj.write();
		sj.input();
		sj.record();
		sj.print();
		*/
	}
}

// 실행 결과
/*
인원 수 입력(1~100) : 3
1번째 학생의 이름 입력 : 김김이
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

2번째 학생의 이름 입력 : 님님이
국어 점수 : 87
영어 점수 : 65
수학 점수 : 98

3번째 학생의 이름 입력 : 딤디이
국어 점수 : 87
영어 점수 : 45
수학 점수 : 77


  김김이  90  80  70  240   80.00
  님님이  87  65  98  250   83.33
  딤디이  87  45  77  209   69.67
계속하려면 아무 키나 누르십시오 . . .
*/

// 석차 처리 기능 추가 후 실행 결과
/*
인원 수 입력(1~100) : 3
1번째 학생의 이름 입력 : 김김이
국어 점수 : 99
영어 점수 : 88
수학 점수 : 77

2번째 학생의 이름 입력 : 님님이
국어 점수 : 54
영어 점수 : 65
수학 점수 : 77

3번째 학생의 이름 입력 : 딤딤이
국어 점수 : 59
영어 점수 : 99
수학 점수 : 11


  김김이  99  88  77  264   88.00    1
  님님이  54  65  77  196   65.33    2
  딤딤이  59  99  11  169   56.33    3
계속하려면 아무 키나 누르십시오 . . .
*/