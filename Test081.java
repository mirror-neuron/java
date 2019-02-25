/*========================
  ■■■ 배열 ■■■
  - 배열의 선언과 초기화
  - 배열의 기본적인 활용
=========================*/

// ○ 실습 문제
// 『char』 자료형의 배열을 만들어 알파벳 대문자를 채우고
// 채워진 배열의 전체 요소를 출력하는 프로그램을 구현한다.

// 실행 예)
// A B C D .... W X Y Z
// 계속하려면 아무 키나...

public class Test081
{
	public static void main(String[] args)
	{
		
		
		
		/*
		char[] arr = new char[26];

		for (int i=0; i<26; i++)
		{
			arr[i] = (char)(65+i); 
			System.out.print(arr[i] + " ");
		}
		*/

		// 함께 풀이한 내용
		// 영문 알파벳 대문자 출력
		// 방법 ①
		/*
		char[] arr1 = new char[26];
		arr1[0]= 'A';
		arr1[1]= 'B';
		arr1[2]= 'C';
		arr1[3]= 'D';
		arr1[4]= 'E';
		arr1[5]= 'F';
		arr1[6]= 'G';
		arr1[7]= 'H';
		arr1[8]= 'I';
		arr1[9]= 'J';
		arr1[10]= 'K';
		arr1[11]= 'L';
		arr1[12]= 'M';
		arr1[13]= 'N';
		arr1[14]= 'O';
		arr1[15]= 'P';
		arr1[16]= 'Q';
		arr1[17]= 'R';
		arr1[18]= 'S';
		arr1[19]= 'T';
		arr1[20]= 'U';
		arr1[21]= 'V';
        arr1[22]= 'W';
		arr1[23]= 'X';
		arr1[24]= 'Y';
		arr1[25]= 'Z';

		// 방법 ②
	    char[] arr2 = {'A', 'B','C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T','U', 'V', 'W', 'X', 'Y', 'Z'};
		*/

		// 방법 ③
		char[] arr3 = new char[26];
		for (int i=0, ch=65; i<arr3.length; i++, ch++)
			arr3[i] = (char)ch;

		// 배열 요소 전체 출력
		for (int i=0; i<arr3.length; i++)
		 System.out.print(arr3[i] + " ");
		System.out.println();
	}
}

// 실행 결과
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
계속하려면 아무 키나 누르십시오 . . .
*/