/*============================
  ■■■ 배열 ■■■
  - 배열과 난수 처리
=============================*/

// 사용자로부터 임의의 정수를 입력받아
// 그 정수의 갯수만큼 난수(1~100)를 발생시켜 배열에 담고
// 배열에 담겨있는 데이터들 중
// 가장 큰 값과 가장 작은 값을 선택하여 출력하는 프로그램을 구현한다.

// 실행 예)
// 발생시킬 난수의 갯수 입력 : 3
// 52 13 67 → 무작위로 발생한 정수들... → 배열에 담아내기(배열 구성)
// 가장 큰 값 : 67, 가장 작은 값 : 13
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.util.Random;

public class Test089
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 안내 메세지 출력
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		int size = sc.nextInt();

		// size 변수에 담아낸 수 만큼의 배열방 만들기
		// (배열 선언 및 메모리 할당)
		int[] arr = new int[size];

		// 방법 ① : java.Math 패키지의 randome 함수 이용 → 0.0~0.1의 실수 발생시켜서 필요에따라 추가적 연산이 필요함
		// 방법 ② : java.randome 클래스 이용 → 난수 발생 전용 객체 

		// 무작위 숫자(난수)를 발생시키기 위해서는
		// 난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』
		Random rd = new Random();

		// 테스트 
		//System.out.println("발생한 난수 : " + rd.nextInt(100));	// 0 ~ 99까지의 난수를 발생시킨다
		// 『Random』 클래스의 『nextInt()』 메소드 
		// 0 ~ 매개변수로 넘겨받은 정수-1 까지의 수 중
		// 무작위 정수(난수) 1개를 발생시킨다.
		for (int i=0; i<size; i++) //-- size = arr.length
		{
			arr[i] = rd.nextInt(100)+1; //-- 1 ~ 100 사이의 난수 중 1개 발생~!!	
			
			
			
			
			
			nextInt(101)의 경우 0~100 사이의 난수를 발생시킴
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();

		// ex)
		// 63   9   9  98  67  59  70  11  73  42

		// 가장 큰 값, 가장 작은 값 확인
		int max, min;			//-- 최대값, 최소값
		max = min = arr[0];		//-- max=min=63
		for (int i=1; i<arr.length; i++)  // 1번째의 배열값 9와 비교하는 것부터 시작
		{
			if (max<arr[i])    // max가 배열값보다 작으면 배열값으로 최대값 갱신
				max = arr[i];

			if (min>arr[i])		// min가 배열값보다 크면 배열값으로 최소값 갱신
			    min = arr[i];
		}

		// 결과 출력
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min); 
	}
}

// 실행 결과
/*
발생시킬 난수의 갯수 입력 : 6
 100  32  84  93  41  52
가장 큰 값 : 100, 가장 작은 값 : 32
계속하려면 아무 키나 누르십시오 . . .
*/