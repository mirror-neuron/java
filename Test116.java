/*========================================
	■■■ 클래스 고급 ■■■
	- 인터페이스(Interface)
=========================================*/

// ○ 실습 문제
//    성적 처리 프로그램을 구현한다.
//    단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 1921004 이원영
// 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85 
// 2번째 학생의 학번 이름 입력(공백 구분) :	1921005 이재준
// 국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

// 1921004 이원영 90 100  85		275		91
//		          수  수  우
// 1921005 이재준 85  70  65		220     73
//                우  미  양

// 계속하려면 아무 키나 누르세요...


// 속성만 존재하는 클래스 → 자료형 활용

import java.util.Scanner;
import java.io.IOException;

class Record
{
	String hak, name, rank;		//-- 학번, 이름 
	int num, kor, eng, mat;		//-- 국어, 영어, 수학 점수
	int tot, avg;			//-- 총점, 평균(편의상 정수 처리)
}

// 인터페이스
interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}

// 문제 해결 과정에서 설계해야 할 클래스
class SungjukImpl extends Record implements Sungjuk 
{
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			num = sc.nextInt();
		}
		while (num<1);
	}

	@Override
	public void input() 
	{
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[num];

		for (int i=1; i<=num; i++)
		{
			System.out.printf("%d번째 학생의 이름 학번 입력(공백 구분) : ", i);
			name = sc.next();
			hak = sc.next();
			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
			kor = sc.nextInt();
			eng = sc.nextInt();
			mat = sc.nextInt();
		}
	}

	@Override
	public void print()
	{
		tot = kor + eng + mat;
		avg = tot / 3;
		
		int[] rank = new int[i];

		System.out.printf("%s %s %2d %2d %2d %4d %2d", hak, name, kor, eng, mat, tot, avg);
		System.out.printf("\t\t %2s  %2s %2s", rank); 
	}

}

public class Test116
{
	public static void main(String[] args) throws IOException
	{
		Sungjuk ob = new SungjukImpl();

		// 문제 해결 과정에서 작성해야 할 ob 구성

		
		((SungjukImpl)ob).set();
		((SungjukImpl)ob).input();
		((SungjukImpl)ob).print();
	}
}

// 실행 결과
/*

*/