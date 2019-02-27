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

public class Sungjuk
{
	Scanner sc = new Scanner(System.in);

		int num;
		Record[] rc;
		
		void write() {
		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>100);

		rc = new Record[num];
		}

		void input(){
			for (int i=0; i<num; i++)
			{
				rc[i] = new Record();
				System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));
				rc[i].name = sc.next();

				System.out.print("국어 점수 입력 : ");
				rc[i].score[0] = sc.nextInt();

				System.out.print("영어 점수 입력 : ");
				rc[i].score[1] = sc.nextInt();

				System.out.print("수학 점수 입력 : ");
				rc[i].score[2] = sc.nextInt();
			}
		}

		void record(){
			for (int i=0; i<num; i++)
			{
				rc[i].tot = rc[i].score[0] + rc[i].score[1] + rc[i].score[2];
				rc[i].avg = rc[i].tot / 3.0;
			}
		}

		void print(){
			for (int i=0; i<num; i++)
			{
				System.out.printf("%s %d %d %d %d %.2f\n", rc[i].name, rc[i].score[0], rc[i].score[1], rc[i].score[2], rc[i].tot, rc[i].avg);
			}
		}
		
		// 랭크 비교 
		rank()
		{
			for (int i=0; i<num; i++)
 			{
				System.out.print
				for (int j=0; j<num; j++)
				{
					if (rc[i].tot < rc[j].tot)
					{
						rc[i].rank++;
					}

				}
			}

		}

}