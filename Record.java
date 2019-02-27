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

import java.util.Scanner;

public class Record
{
	Scanner sc = new Scanner(System.in);

	// 학생 1 명을 표현할 수 있는 속성들로 구성
	String name;
	int[] score = new int[3]; // -- 세 과목의 속성이 같아서 배열로 묶을 수 있음
	int tot;
	double avg;
	int rank;

	/*
	private String name;
	private int[] score = new int[3];
	private int tot;
	private double avg;
	private int rank;

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

			:
	*/
	
		
}