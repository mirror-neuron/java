/*========================================
	���� Ŭ���� ��� ����
	-- ���(Inheritance)
=========================================*/

// �� �ǽ� ����
//	  ������ ���� ���α׷��� �����Ѵ�.
//    ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.io.IOException;

class AClass
{
	protected int x, y;
	protected char op;

	public AClass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}

class BClass extends AClass 
{
	Scanner sc = new Scanner(System.in);
	public void input() throws IOException
	{
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
		System.out.print(op);
	}

	public double calc()
	{
		double a=0;

		if (op == '+')
		{
			a = x + y;
		}
		else if (op == '-')
		{
			a = x - y;
		}
		else if (op == '*')
		{
			a = x * y;
		}
		else if (op == '/')
		{
			a = x / y;
		}
		return a;
	}	
	
}

public class Test108
{
	public static void main(String[] args) throws IOException
	{
		BClass ob = new BClass();
		ob.input();
		double result = ob.calc();
		ob.write(result);
	}
}

// ���� ���
/*

*/