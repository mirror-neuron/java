/*======================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스와 인스턴스 활용 
=======================================*/

// ○ 실습 문제
// 1 ~ 3 사이의 정수 형태의 난수를 발생시켜
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.

// 기준 데이터 → 1:가위, 2:바위, 3:보

// 실행 예)
// 1:가위 2:바위 3:보 중 입력(1~3) : 4
// 1:가위 2:바위 3:보 중 입력(1~3) : -12
// 1:가위 2:바위 3:보 중 입력(1~3) : 2
// - 유저   : 바위
// - 컴퓨터 : 보
// >> 승부최종결과 : 컴퓨터가 이겼습니다~!!!
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.util.Random;

class Game 
{
	int num, com;
	String[] playArr = {"가위", "바위", "보"};

	void set()
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		do
		{
			System.out.print("1:가위 2:바위 3:보 중 입력(1~3) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>3);
			com = r.nextInt(3)+1;
	}

	void play()
	{
		System.out.printf("- 유저		: %4s\n", playArr[num-1]);
		System.out.printf("- 컴퓨터	: %4s\n", playArr[com-1]);
	}

	void print()
	{
		if ((num==1 && com==3) || (num==2 && com==1) || (num==3 && com==2))
		{
			System.out.print(">> 승부최종결과 : 유저가 이겼습니다~!!!\n");
		}
		else if (num==com)
		{
			System.out.print(">> 승부최종결과 : 비겼습니다~!!!\n");
		}
		else
			System.out.print(">> 승부최종결과 : 컴퓨터가 이겼습니다~!!!\n");       
	}
}

public class Test094
{
	public static void main(String[] args)
	{
		Game ob = new Game();
		ob.set();
		ob.play();
		ob.print();
	}
}