/*============================
  ■■■ 배열 ■■■
  - 배열의 배열(2차원 배열)
=============================*/

// ○ 실습 문제
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열(5x5)을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  1  2  3  4  5		
  5  1  2  3  4		
  4  5  1  2  3		
  3  4  5  1  2		
  2  3  4  5  1		
계속하려면 아무 키나 누르세요...
*/

/*
  1  2  3  4  5		a = 0
  5  1  2  3  4		a = 1
  4  5  1  2  3		a = 2
  3  4  5  1  2		a = 3
  2  3  4  5  1		a = 4

 00	01 02 03 04
 |	
  1

 10 11 12 13 14 
	|
	 1

 20 21 22 23 24
	   |
		1

 30 31 32 33 34
		  |
		   1	

 40 41 42 43 44  
			 |
			  1

*/

public class Test088
{
	public static void main(String[] args)
	{
	 // 배열의 배열 선언 및 메모리 할당
	 int[][] arr = new int[5][5];

	 // 초기화
	 // n → 1,2,3,4,5 / 1,2,3,4,5 / 1,2,3,4,5 / ...
	 for (int a=0; a<arr.length; a++)	// a → 0, 1, 2, 3, 4
	 {
		 for (int b=a, n=1; n<=5; n++)  // n → 1, 2, 3, 4, 5 
		 {
			 arr[a][b] = n;		// 00=1, 01=2, 02=3, 03=4, 04=5 
			 b++;				// 10=5, 11=1, 12=2, 13=3, 14=4 
			 if(b==5)			// 20=4, 21=5, 22=1, 23=2, 24=3
				 b=0;
		 }
	 }

	 // 배열의 배열 요소 전체 출력
	 for (int i=0; i<arr.length; i++)
	 {
 		 for (int j=0; j<arr[i].length; j++)
			System.out.printf("%3d", arr[i][j]);
		 System.out.println();
	 }
	}
}

// 실행 결과
/*
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .
*/