/*==============================================
■■■ 자바 기본 프로그래밍 ■■■
- 변수와 자료형
- 자바의 기본 입출력
================================================*/

// 삼각형의 밑변의 길이와 높이를 사용자로부터 입력 받아
// 삼각형의 넓이를 구하는 프로그램을 구현한다.

// 실행 예) 
// ■ 삼각형의 넓이 구하기 ■
// - 삼각형의 밑변 입력 : 3
// - 삼각형의 높이 입력 : 5

// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : xxxx
// 계속하려면 아무 키나 누르세요... 

// ※ 삼각형의 넓이 = 밑변 * 높이 / 2

//내가 풀이한 내용

//import java.io.BufferedReader;, BufferedReader(설계도)를 메모리를 할당받아 따로 저장 
//import java.io.InputStreamReader;
//import java.io.IOException;

import java.io.*; // * = all, 효율적이지만 클래스를 전부 불러오니까 메모리 낭비

public class Test013
{
	public static void main(String[] args) throws IOException
	{
	
	//내가 풀이한 내용
	/*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// 주요 변수 선언
    int w;			//-- 밑변 
    int h;			//-- 높이
    double a;       //-- 삼각형의 넓이

	// 연산 및 처리 
    System.out.print("■ 삼각형의 넓이 구하기 ■\n");
   
	System.out.printf(" - 삼각형의 밑변 입력 : ");
    w= Integer.parseInt(br.readLine());

	System.out.printf(" - 삼각형의 높이 입력 : ");
    h= Integer.parseInt(br.readLine());

    a = w * h / 2.0;
    System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 :%.2f\n", w, h, a); */

    // 함께 풀이한 내용
	// 외부로부터 데이터를 입력받도록 처리하기 위해서
	// BufferedReader 인스턴스 생성
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	// 주요 변수 선언
    int underLength, height;			//-- 밑변과 높이
    double area;					//-- 넓이
	
	// 연산 및 처리
	// ① 사용자에게 안내 메세지 출력
	System.out.println("■ 삼각형의 넓이 구하기 ■");
    System.out.print("- 삼각형의 밑변 입력 : ");

	// ② 사용자가 입력한 데이터를 정수 형태로 변환한 후 
    //    변수 underLength 에 담아내기
	underLength = Integer.parseInt(br.readLine());

    // ③ 다시 사용자에게 안내 메세지 출력
	System.out.print("- 삼각형의 높이 입력 : ");

	// ④ 사용자가 입력한 데이터를 정수 형태로 변환한 후
	//    변수 hegith 에 담아내기
    height = Integer.parseInt(br.readLine());

	// ⑤ 삼각형의 넓이를 구하는 연산 처리
	area = underLength * height / 2.0;
	//        정수        정수   정수
	//-- 실수 자료형이 결과값으로 나오는 과정에서 
	//   실수 기반의 연산이 필요한 상황이다.
    //   정수형 『2』 가 아닌 실수형 『2.0』으로 나눗셈 연산을 수행하게 되면
	//   이 연산은 실수 기반으로 처리된다.
    System.out.println();      //-- 개행, () → 인자, 인수, 매개변수, 파라미터
    //System.out.print();        //-- 컴파일 에러
	System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f%n", underLength, height, area );
	//println(\n)만 개행, printf(%, \n) 모두 개행
   	}
}


// 실행 결과
/*
■ 삼각형의 넓이 구하기 ■
 - 삼각형의 밑변 입력 : 3
 - 삼각형의 높이 입력 : 5
>> 밑변이 3, 높이가 5인 삼각형의 넓이 :7.50
계속하려면 아무 키나 누르십시오 . . .
*/