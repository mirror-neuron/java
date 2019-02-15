/*========================================
■■■ 자바의 기본 프로그래밍 ■■■
- 변수와 자료형
- 자바의 기본 입출력 : BufferedReader
=========================================*/

// 사용자로부터 이름과 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 한승원
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

// ==== [결과] ====
// 이름 : 한승원
// 총점 : 240
// ================
// 계속하려면 아무 키나 누르세요...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

	//int name;			 //-- 이름
    String strName;	
    int nKor, nEng, nMat, nTot;  // 국어, 영어, 수학, 총점 변수
	 	
	//추가변수 선언
	String strTemp;		// 문자열 데이터 임시 저장 변수

	//연산 및 처리
	//사용자에게 안내 메세지 출력(이름입력안내)
    System.out.print("이름을 입력하세요 : ");
 
	//사용자가 입력한 값을 변수에 담아내기
	strName = br.readLine();
	System.out.print("국어 점수를 입력하세요 : ");

	strTemp = br.readLine();		      // 문자열 임시 저장
	nKor = Integer.parseInt(strTemp);	  // 임시저장 데이터를 변환 후 국어점수 변수에 담아내기

	System.out.print("영어 점수를 입력하세요 : ");

	// 사용자가 입력한 값을 변수에 담아내기

	strTemp = br.readLine();			// 문자열 임시 저장(기존 국어 점수에 덮어쓰기)
    nEng = Integer.parseInt(strTemp);	// 임시저장 데이터를 형 변환 후 영어점수 변수에 담아내기

	System.out.print("수학 점수 입력 : ");

    strTemp = br.readLine();			// 문자열 임시 저장(기존 영어 점수에 덮어쓰기)
    nMat = Integer.parseInt(strTemp);	// 임시저장 데이터를 형 변환 후 수학점수 변수에 담아내기
	
	// 입력한 데이터들 종합하여 총점 산출하기
	nTot = nKor + nEng + nMat;

	System.out.println("\n======== [결과] =========");   // 개행
	System.out.println("이름 : "+strName);
	System.out.println("총점 : "+nTot);
    System.out.println("===========================");	
	}
}

// 실행 결과
/*
이름을 입력하세요 : 한승원
국어 점수를 입력하세요 : 90
영어 점수를 입력하세요 : 80
수학 점수 입력 : 70

======== [결과] =========
이름 : 한승원
총점 : 240
===========================
계속하려면 아무 키나 누르십시오 . . .
*/