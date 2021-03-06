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
	// 주요 변수 선언
	int i, j;  // i:행값, j:열값	

    // 연산 및 처리(중첩 for문과 if문으로 해결)
	for (i=0; i<5; i++)		// 행값을 '5'까지 1씩 증가시킨다.
	{
		for (j=0; j<9; j++)	// 열값을 '9'까지 1씩 증가시킨다.
		{
			int num1 = (9/2)-i;		// num1 :행과 열의 중심에 "*"이 찍히므로 이를 중심으로 왼쪽 공백 변수
		    int num2 = (9/2)+i;		// num2 :행과 열의 중심에 "*"이 찍히므로 이를 중심으로 오른쪽 공백 변수

			if (num1<=j && num2>=j) // 행값과 열값의 차가 동일할 때 "*" 출력
 			{
				System.out.print("*");   //if문에 각 행,열값을 대입 후 "*" 출력
			}
			else
				System.out.print(" ");  //if문에 각 행,열값을 대입 후 " " 출력
		}
			System.out.println(); // 개행
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
