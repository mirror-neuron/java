/*===========================================
   ■■■ 자바의 기본 프로그래밍 ■■■
   - 자바의 기본 입출력 : java.util.Scanner
=============================================*/

// ※ java.utill.Scanner
//	  단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//	  디폴트(default)로 사용되는 단락 문자는 공백이다.
//	  작성된 다음 토큰은 『next()』 메소드를 사용
//	  다른 형태의 값으로 변환할 수 있다.
import java.util.Scanner;

public class Test019
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String name;
		int kor, eng, mat, tot;

		System.out.print("이름,국어,영어,수학 입력(『,』구분) : ");

		//sc = new Scanner(sc.next()).useDelimiter("문자열과 문자열 사이의 ,");
		//sc = new Scanner(sc.next()).useDelimiter("\\s* 과 \\s* 사이의 ,");
		sc = new Scanner(sc.next()).useDelimiter("\\s*" "\\s*");

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		System.out.println();
		System.out.printf("이름 : %s%n", name);
		System.out.printf("총점 : %d%n", tot);


	}
}

// 실행 결과
/*
이름,국어,영어,수학 입력(『,』구분) : 이재준,90,80,70

이름 : 이재준
총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/
