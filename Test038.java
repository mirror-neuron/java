/*=========================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else문 실습
=========================================*/

// ○ 과제
// 사용자로부터 알파벳 한 문자를 입력받아
// 이를 판별하여 입력받은 알파벳이 모음일 경우만
// 결과를 출력하는 프로그램을 구현한다.
// 단, 대소문자를 모두 적용할 수 있도록 처리한다.
// 또한, 알파벳 이외의 문자가 입력되었을 경우
// 입력 오류에 대한 내용을 사용자에게 안내해줄 수 있도록 한다.

// 실행 예)
// 알파벳 한 문자 입력 : A
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 알파벳 한 문자 입력 : e
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 알파벳 한 문자 입력 : B
// 계속하려면 아무 키나 누르세요...

// 알파벳 한 문자 입력 : 1
// >> 입력 오류~!!
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	{
		
		System.out.print("알파벳 한 문자 입력 : ");  
		int a = System.in.read();		//a : 아스키 코드 범위를 판별하기 위한 정수형 변수
		char c =(char)a;				//c : 문자를 입력 받을 변수, 정수형 → 문자형으로 데이터 형 변환
		

		if ((a>=65 && a<=90) || (a>=97 && a<=122)) //알파벳의 범위에 있는 변수인지 판별
		{
		  // if문 : 각 모음의 경우의 수를 'or 논리 연산'으로 판별 후 출력
		  if (c=='a'|| c=='A' || c=='e'|| c=='E' || c=='i'|| c=='I' || c=='o' || c=='O'|| c=='u'|| c=='U')
		  {
			System.out.println("모음 OK~!!");	
		  }
		  else // else문 : 모음 이외의 수는 전부 출력 안함
			{	
			}
		}
		else // else 문 : 알파벳이 아닌 변수는 입력 오류로 출력 
		{
			System.out.print("입력 오류~!!\n"); 
		}
	}
}

// 실행 결과
/*
알파벳 한 문자 입력 : a
모음 OK~!!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : A
모음 OK~!!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : B
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : ㅋ
입력 오류~!!
계속하려면 아무 키나 누르십시오 . . .
*/