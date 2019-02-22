/*==================================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ���� ���� �ǽ�
===================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// ��Ģ ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 10 5 
// ������ ������ �Է�(+ - * /)	  : +
// >> 10 + 5 = 15
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� Ǯ���� ���� (Test042 ����)
import java.util.Scanner;
import java.io.IOException;

class Operator
{
	// �ֿ� ���� ����
	int a, b, result;
	char op;

	// �Է� �޼ҵ� ����
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

			System.out.print("������ �� ���� �Է�(���� ����) : "); 
			a = sc.nextInt(); 
			b = sc.nextInt();

			System.out.print("������ ������ �Է�(+ - * /) : ");
			op = (char)System.in.read();
	}
	
	// ���� �޼ҵ� ����
	void calculate()
	{
		switch (op)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		default: return;
		}
		
	}
	
	// ��� �޼ҵ� ����
	void print()
	{
		System.out.printf(">> %d %c %d = %d", a, op, b, result); 
	}
}

public class Test073
{
	public static void main(String[] args) throws IOException
	{
		Operator ob = new Operator();
		
		ob.input();

		ob.calculate();

		ob.print();
	}
}