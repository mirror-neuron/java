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

// import구문으로 Scanner 클래스 불러오기
import java.util.Scanner;

// 속성만 존재하는 클래스 → 자료형 활용 
class Record
{
	String hak, name, rank;		//-- 학번, 이름 
	int kor, eng, mat;		//-- 국어, 영어, 수학 점수
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
// abstract SungjukImpl extends Record implements Sungjuk
//    ↓
// Record를 상속받고 Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl extends Record implements Sungjuk		
{
	int num;		//-- 인원 수를 담을 정수형 변수 선언
	
	Record[] arr;	//-- 학생 정보를 담은 Record 클래스 배열화

	
	// set() 메소드 재정의 -- 인원 수를 입력받음
	@Override
	public void set()
	{
		
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 『do ~ while』반복문으로 정수형 1~10 사이의 인원 수를 입력할 때까지 반복
		do
		{
			// 인원 수 입력 안내 메시지 출력
			System.out.print("인원 수 입력(1~10) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>10);	
	}

	// input() 메소드 재정의 -- 기타 학생 정보를 입력받음
	@Override
	public void input() 
	{
		Scanner sc = new Scanner(System.in);

		arr = new Record[num];		// 입력된 인원 수(num) 만큼 Record 클래스 배열 생성

		// 『for』반복문으로 Record 배열의 길이(인원 수)만큼 각 학생의 정보 입력받음
		for (int i=0; i<arr.length; i++) 
		{
			// 학생 정보 입력 안내 메시지 출력
			System.out.printf("%d번째 학생의 이름 학번 입력(공백 구분) : ", (i+1));
			
			// 학생 정보를 담은 arr[] 배열에 Record 클래스를 인스턴스화 
			arr[i] = new Record();  

			// 각 학생 정보 배열에 값을 입력받아 넣음
			arr[i].hak = sc.next();
			arr[i].name = sc.next();
			
			// 성적 입력 안내 메시지 출력
			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
			
			// 각 성적 배열에 값을 입력받아 넣음
			arr[i].kor = sc.nextInt();
			arr[i].eng = sc.nextInt();
			arr[i].mat = sc.nextInt();

			arr[i].tot = arr[i].kor + arr[i].eng + arr[i].mat;
			arr[i].avg = arr[i].tot / 3;
		}
	}

	// pirnt() 메소드 재정의 -- 각 과목의 등급 연산 및 결과 출력 
	@Override
	public void print()
	{
		// 세 과목(국어, 영어, 수학)이 차례로 들어가도록 임의의 a[] 배열 생성 
		int a[] = new int[3];

		// 『for』반복문으로 Record 배열의 길이(인원 수)만큼 각 학생 정보 출력
		for (int i=0; i<arr.length; i++)
		{
			// Record[] 배열의 각 과목값을 임의의 a[] 배열에 차례로 넣음
			a[0] = arr[i].kor;
			a[1] = arr[i].eng;
			a[2] = arr[i].mat;

			// 각 학생의 성적 정보 출력
			System.out.printf("%s  %s\t%4d%4d%4d\t%d\t%d %n", arr[i].hak, arr[i].name, arr[i].kor, arr[i].eng, arr[i].mat, arr[i].tot, arr[i].avg);
			System.out.printf("\t\t");		// 탭 두 번으로 등급이 과목 아래에 출력되도록 함
				
			// 큰『for』반복문에서 정의한 세 과목의 배열값이 길이(3)만큼 순서대로 돌아가고, 연산 후 등급을 출력함
			for (int j=0; j<3; j++)
			{
				// 『if ~ else if』조건문으로 점수 범위에 따라 등급 출력
				if (a[j]>=90 && a[j]<=100)
				{
					System.out.print("  수");
				}
				else if (a[j]>=80)
				{
					System.out.print("  우");
				}
				else if (a[j]>=70)
				{
					System.out.print("  미");
				}
				else if (a[j]>=60)
				{
					System.out.print("  양");
				}
				else
					System.out.print("  가");
			}
			System.out.println();	// 개행
		}
	
	}

}

// main() 메소드를 기반으로 하는 외부 클래스 
public class Test116
{
	public static void main(String[] args)
	{
		// Sungjuk 인터페이스 객체 생성
		Sungjuk ob;

		// SungjukImpl 클래스 → Sungjuk 인터페이스로 업 캐스팅
		// Sungjuk 인터페이스를 구현하는 SungjukImpl 클래스로 인스턴스화
		ob = new SungjukImpl();

		// 문제 해결 과정에서 작성해야 할 ob 구성

		ob.set();
		ob.input();
		ob.print();
	}
}

// 실행 결과
/*
인원 수 입력(1~10) : 2
1번째 학생의 이름 학번 입력(공백 구분) : 김김 2019851
국어 영어 수학 점수 입력   (공백 구분) : 90 80 70
2번째 학생의 이름 학번 입력(공백 구분) : 님님 2019852
국어 영어 수학 점수 입력   (공백 구분) : 88 77 99
김김  2019851     90  80  70    240     80
                  수  우  미
님님  2019852     88  77  99    264     88
                  우  미  수
계속하려면 아무 키나 누르십시오 . . .

*/