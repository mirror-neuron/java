/*======================================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - 반복문 (for문) 실습 
  - 별찍기 연습
========================================================*/

// ○ 과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/*
	 *
	***
   *****
  *******
 *********	

*/

public class Test061
{
	public static void main(String[] args)
	{
	int i, j;  //각 행과 열의 루프 변수	

	for (i=0; i<5; i++)
	{
		for (j=0; j<9; j++)
		{
			int num1 = (9/2)-i;		//
		    int num2 = (9/2)+i;		//

			if (num1<=j && num2>=j)
			{
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
			System.out.println();
	}
	}
}

// 실행 결과
/*
    *
   ***
  *****
 *******
*********
계속하려면 아무 키나 누르십시오 . . .
*/
