/*=========================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if ~ else�� �ǽ�
=========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �ۼ��Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 4
// �� ��° ���� �Է� : 8
// �� ��° ���� �Է� : 73

// >> ���� ��� : 4 8 73
// ����Ϸ��� �ƹ� Ű�� ��������...

// >> ���� ��� : 10 10 20
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		//���� Ǯ���� ����
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, num3;
		
		System.out.print("ù ��° ���� �Է� :");
        num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� :");
		num2=Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� :");		
		num3=Integer.parseInt(br.readLine());
		
	    if (num1<num2 && num2<num3)
	    {
			System.out.printf(">> ���� ��� : %d %d %d", num1, num2, num3);
	    }		
		else if (num1<num3 && num3<num2)
		{
			System.out.printf(">> ���� ��� : %d %d %d", num1, num3, num2);
		}
		else if (num2<num1 && num1<num3)
		{
			System.out.printf(">> ���� ��� : %d %d %d", num2, num1, num3);
		}
		else if (num2<num3 && num3<num1)
		{
			System.out.printf(">> ���� ��� : %d %d %d", num2, num3, num1);
		}
    	else if (num3<num1 && num1<num2)
		{
			System.out.printf(">> ���� ��� : %d %d %d", num3, num1, num2);
		}
		else if (num3<num2 && num2<num1)
		{
			System.out.printf(">> ���� ��� : %d %d %d", num3, num2, num1);
		}
		else 
			System.out.println("�Ǻ��� �Ұ����� ��Ȳ~!!"); 
		*/

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int a, b, c;	//-- ����ڰ� �Է��ϴ� ������ ������ ���� ����
		int temp;		//-- �ӽ� ���� ����(�� ��)

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer`rseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());
		// 2 2 2 | 3 2 1 | 2 1 3 | 3 1 2 | 1 3 2 | 1 2 3
		//       | 2 3 1 | 1 2 3 | 1 3 2 | 1 2 3 |
                //       | 2 1 3 |       | 1 2 3 | 
                //       | 1 2 3 |


		if (a>b)	// �� ù ��° ������ �� ��° �������� ũ�ٸ�..
		{
			// �� ������ �ڸ��� �ٲ۴�.
			temp = a;
			a = b;
			b = temp;
		}
		if(b>c)		// �� �� ��° ������ �� ��° �������� ũ�ٸ�..
		{
			// �� ������ �ڸ��� �ٲ۴�.
			temp = b;
			b = c;
			c = temp;
		}
		if (a>b)   	// �� ù ��° ������ �� ��° �������� ũ�ٸ�..
		{
			// �� ������ �ڸ��� �ٲ۴�.
			temp = a;
			a = b;
			b = temp;
		}
		
		System.out.printf("��� ��� : %d %d %d\n", a, b, c);
	}
}

// ���� ���
/*
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 1
�� ��° ���� �Է� : 4
��� ��� : 1 4 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/