/*========================
  ■■■ 배열 ■■■
  - 배열의 기본적인 활용
=========================*/

// ○ 과제
// 사용자로부터 학생 수를 입력받고, 그 만큼의 점수(정수형태)를 입력받아
// 전체 학생 정수의 합, 평균, 편차를 구하여 결과를 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 학생 수 입력 : 5
// 1번 학생의 점수 입력 : 90
// 2번 학생의 점수 입력 : 82
// 3번 학생의 점수 입력 : 64
// 4번 학생의 점수 입력 : 36
// 5번 학생의 점수 입력 : 98

// >> 합 : 370
// >> 평균 : 74.0
// >> 편차 
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner; // import 구문으로 외부 클래스 Scanner 호출하기

public class Test084
{
	public static void main(String[] args) 
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in); 

		// ○ 주요 변수 선언
		int num;		// 사용자로부터 입력받는 학생 수 변수
		int sum=0;		// 정수형 합 변수
		int avg=0;      // 정수형 평균 변수
		
		// ○ 사용자에게 데이터 입력 받기
		System.out.print("학생 수 입력 : ");  // 사용자에게 안내 메시지 출력
		num = sc.nextInt();					  // num변수에 정수형 학생 수 입력 받음
		int[] score = new int[num];			  // 입력받은 학생의 수만큼 score 배열 생성  	
		
		for (int i=0; i<arr.length; i++)	  // 인덱스 i를 '0'으로 초기화, 첫 번째부터 학생의 수만큼 반복문 실행
		{
			System.out.printf("%d번 학생의 점수 입력 : ", i+1);	 // 사용자에게 안내 메시지 출력
			score[i] = sc.nextInt();							 // score배열의 i번째 공간에 숫자를 입력 받음
			sum += score[i];									 // 입력 받은 score배열의 인덱스 값을 합계인 sum에 대입함

			avg = sum / num;									 // 평균 = 합계 / 학생 수

			System.out.println();								 // 개행
			System.out.println(">> 합 : " + sum);				 // 학생 전체 합 출력
			System.out.println(">> 평균 : " + avg);				 // 학생 전체 평균 출력
			System.out.println(">> 편차 : ");					 // 학생 전체 편차 출력
			for (int i=0; i<arr.length; i++)					 // 학생 수만큼 반복시켜서 편차를 출력해야하므로 반복문 실행
			{
				System.out.printf("%d : %.1f\n", score[i], (
					
				avg*1.0)-score[i]);	// 입력받은 학생 수, 편차 = i번째 학생의 평균 - i번째 학생의 합	
			}
        }	
	}	
}


// 실행 결과
/*

*/