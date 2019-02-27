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
// 2. Sungjuk 클래스
//    - 인원 수를 입력받아, 입력받은 인원 수만큼
//      이름, 국어점수, 영어점수, 수학점수를 입력받고
//      총점과 평균을 산출하는 클래스로 설계할 것~!!
//    - 속성 : 인원 수, Record 형태의 배열
//    - 기능 : 인원 수 입력, 상세 데이터 입력, 총점/평균 산출, 결과 출력

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

import java.util.Scanner;

public class Sungjuk_1  //-- Test082.java 참고
{
	// 주요 속성 구성
	int inwon;				//-- 인원 수
	Record[] recArr;		//-- Record 배열
							//   (학생 1명 당 Record 배열의 방 1개 활용)

	// 기능(메소드 정의)
	// ① 인원 수 입력 
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~100) : ");
		    inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);

		// check~!!
		// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		// 배열방을 inwon 만큼 생성한 것이지,
		// Record 클래스의 인스턴스를 생성한 것은 아니다.
		recArr = new Record[inwon];
	}

	// 기능(메소드 정의)
	// ② 상세 데이터 입력 + ③ 총점/평균 산출
	void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] subTitle = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};

		for (int i=0; i<inwon; i++)		// 인원수 만큼 반복~!!! (== recArr.length)
		{
			// check~!!!
			// Record 클래스 기반의 인스턴스 생성
			recArr[i] = new Record();

			System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));
			recArr[i].name = sc.next();

			for (int j=0; j<subTitle.length; j++)
			{
				// 안내 메시지 출력
				System.out.print(subTitle[j]);

				// 사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
				recArr[i].score[j] = sc.nextInt();
				
				// 국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
				// 그 과정에서 총점 누적하기
				recArr[i].tot += recArr[i].score[j];
			}
			System.out.println();
			
			// 평균 산출하기
			recArr[i].avg = recArr[i].tot / 3.0;
		}
	}//end input()
	
	// 기능(메소드 정의)
	// ④ 결과 출력
	public void print()
	{
		// 석차 산출 메소드 호출구문 추가~!!!
		ranking();

		// 개행
		System.out.println();

		// 학생 1인당 반복 출력 구문
		for (int i=0; i<inwon; i++)		//-- 학생 인원수만큼 반복~!!
		{
			// 이름 출력
			System.out.printf("%5s", recArr[i].name);

			// 성적(국어, 영어, 수학) 반복 출력
			for (int j=0; j<3; j++)
			{
				System.out.printf("%4d", recArr[i].score[j]);
			}

			// 총점, 평균 출력
			System.out.printf("%5d", recArr[i].tot);
			System.out.printf("%8.2f", recArr[i].avg);
			
			// 석차 출력 구문 추가~!!!
			System.out.printf("%5d", recArr[i].rank);

			// 개행
			System.out.println(); //-- 학생 1명의 성적정보 출력할 때마다 개행
		}
	}//end print()

	// 기능(메소드 정의)
	// ⑤ 석차 산출 메소드 추가~!!!
	private void ranking()		//--외부에서 접근 못하고, 클래스 내부에서만 서로 호출할 수 있도록 접근제어 지시자 private붙임
	{
		// 루프 변수 
		int i, j;		

		// 모든 학생들의 등수(석차)를 1로 초기화
		for (i=0; i<inwon; i++)
			recArr[i].rank = 1;
		
		// 등수(석차) 산출
		for (i=0; i<inwon-1; i++)		// i → 비교 기준을 설정하는 인덱스, '-1': 내 점수와 내 점수는 비교할 필요 없음
		{
			for (j=i+1; j<inwon; j++)	// j → 비교 대상을 설정하는 인덱스
			{
				if (recArr[i].avg > recArr[j].avg)		// 기준 데이터가 비교 데이터보다 크다면...
				{
					// 비교 데이터의 rank를 1만큼 증가
					recArr[j].rank++;
				}
				else if (recArr[j].avg > recArr[i].avg)	 // 비교 데이터가 기준 데이터보다 크다면..
				{
					// 기준 데이터의 rank를 1만큼 증가
					recArr[i].rank++;
				}
			}
		}
	}
}