/*========================
  ■■■ 배열 ■■■
  - 배열의 기본적인 활용
=========================*/

// ○ 과제
// 사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
// 입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 입력할 데이터의 갯수  : 10
// 데이터 입력(공백구분) : 45 92 75 13 2 65 25 63 90 17
// >> 가장 큰 수 → 92
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;  // 사용자로부터 임의의 정수형 데이터 입력 받음

public class Test083
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in); 

		int num, max=0;

		System.out.print("입력할 데이터의 갯수  : ");
		num = sc.nextInt();
	
		System.out.print("데이터 입력(공백구분) : ");			
		int[] arr = new int[num];

		for (int i=0; i<num; i++)
		{
			arr[i] = sc.nextInt();
		}

		max = arr[0];
		for (int i=1; i<num; i++)
		{
			if (max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.printf(">> 가장 큰 수 → %d\n", max);
	}
	
}

// 실행 결과
/*

*/