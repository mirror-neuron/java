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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Super class
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

// Sub class
class BClass extends AClass 
{
	/*
	protected int x, y;
	protected char op;

	public AClass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/

	BClass()
	{
	}

	boolean input() throws IOException  //-- boolean : ��ȿ�� �� �Է� ���� Ȯ��
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �� ���� �Է�(���� ����) : "); // 20 15
		String temp = br.readLine();						   // "20 15"
		String[] str = temp.split("\\s");    //  ������ �� ����
		// �� ���ڿ�.split("������");
		// ex) "��� ���� �ٳ���".split("\\s");
		//     ��ȯ �� {"���", "����", "�ٳ���"}
		// ex) "10 20 30 40".split("\\s");
		//     ��ȯ �� {"10", "20", "30", "40"}
		//--------------------------------------------> String[] str = {"20", "15"};(���ڿ� ������ �迭�� ��ȯ)

		if (str.length != 2)
			return false; //-- false(����)�� ��ȯ�Ͽ� input() �޼ҵ� ����
						  // ��ȿ���� ���� ��Ȳ(return : �簪�� ��ȯ, ��޼ҵ� ����)
						  
			// �� �� ���ǹ��� ������ ��� �Ʒ��� �ڵ���� �����ִ� ��Ȳ������
			//	  �� �̻� �������� �ʰ� ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.

			x = Integer.parseInt(str[0]);
			y = Integer.parseInt(str[1]);

			System.out.print("������ �Է�(+ - * /) : ");
			op = (char)System.in.read();
		
			/*
			if (op!='+' && op!='-' && op!='*' && op!='/') //-- '���� ������ && ����'�� �ٸ� �������� �ٲٸ� 
				return false;

			return true;
			*/

			if (op =='+' || op=='-' || op=='*' || op=='/') //--'||'�� �� ��������.
				return true;

			return false;
		
	}
			double calc()
			{
				double result = 0;
				switch (op)
				{
					case '+' : result = x + y; break;
					case '-' : result = x - y; break;
					case '*' : result = x * y; break;
					case '/' : result = (double)x / y; break;
				}
				return result;
			}

	}
	


public class Test108_1
{
	public static void main(String[] args) throws IOException
	{
		//AClass ob = new AClass(); -- �θ� Ŭ������ �ν��Ͻ� ������ �ʿ� ����(�ڽ� Ŭ������ �� �����̴ϱ�)
		BClass ob = new BClass();

		if (!ob.input())		//-- boolean���� �ν�, �Է°��� ��ȿ���� �ʴٸ�...
		{
			System.out.print("Error...");
			return;
		}

		double result = ob.calc();
		ob.write(result);
	}
}

// ���� ���
/*

*/