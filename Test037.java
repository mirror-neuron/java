/*=========================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if ~ else�� �ǽ�
=========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����͸� �� ���� ó���� �� �ֵ��� �����ϸ�
// ��xor�������ڸ� Ȱ���Ͽ� ���� ó���� �� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 160 80 241

// >> ���� ��� : 80 160 241
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;

public class Test037
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		//�Բ� Ǯ���� ����
		int a, b, c;
		System.out.print("������ �� ���� �Է� : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	
		if (a>b)
		{
			a=a^b; b=b^a; a=a^b;
		}
		if (b>c)
		{
			b=b^c; c=c^b; b=b^c;
		}
		if (a>b)
		{
			a=a^b; b=b^a; a=a^b;
		}
		System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);

	
		//���� Ǯ���� ����
		/*
		int a, b, c;
		
		System.out.print("������ �� ���� �Է� : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

	    if (a>c)
	    {
			a=a^c;
			c=c^a;
			a=a^c;
	    }
		if (a>b)
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (b>c)
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}

		System.out.printf("%n>> ���� ��� : %d %d %d%n", a, b, c); 
		*/
	}
}

// ���� ���
/*
������ �� ���� �Է� : 8 9 5

>> ���� ��� : 5 8 9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/