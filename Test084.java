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

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int num, tot=0;
		double avg=0.0, std=0.0;

		System.out.print("학생 수 입력 : ");
		num = sc.nextInt();
		int[] arr = new int[num];	
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ", i+1);		
			tot = sc.nextInt();

			for (int j=0; j<arr.length; j++)
			{
				std = tot - avg;		
			}
        }
		System.out.printf(">> 합 : %d", tot);
		System.out.printf(">> 평균 : %.2f", avg);
		System.out.printf(">> 편차 : %.2f", std);
	}
		
		
}


// 실행 결과
/*

*/