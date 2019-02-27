/*======================================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ������ �ν��Ͻ� Ȱ�� 
=======================================*/

// �� �ǽ� ����
// 1 ~ 3 ������ ���� ������ ������ �߻�����
// ����, ����, �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ������ �� 1:����, 2:����, 3:��

// ���� ��)
// 1:���� 2:���� 3:�� �� �Է�(1~3) : 4
// 1:���� 2:���� 3:�� �� �Է�(1~3) : -12
// 1:���� 2:���� 3:�� �� �Է�(1~3) : 2
// - ����   : ����
// - ��ǻ�� : ��
// >> �º�������� : ��ǻ�Ͱ� �̰���ϴ�~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.util.Random;

class Game 
{
	int num, com;
	String[] playArr = {"����", "����", "��"};

	void set()
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		do
		{
			System.out.print("1:���� 2:���� 3:�� �� �Է�(1~3) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>3);
			com = r.nextInt(3)+1;
	}

	void play()
	{
		System.out.printf("- ����		: %4s\n", playArr[num-1]);
		System.out.printf("- ��ǻ��	: %4s\n", playArr[com-1]);
	}

	void print()
	{
		if ((num==1 && com==3) || (num==2 && com==1) || (num==3 && com==2))
		{
			System.out.print(">> �º�������� : ������ �̰���ϴ�~!!!\n");
		}
		else if (num==com)
		{
			System.out.print(">> �º�������� : �����ϴ�~!!!\n");
		}
		else
			System.out.print(">> �º�������� : ��ǻ�Ͱ� �̰���ϴ�~!!!\n");       
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