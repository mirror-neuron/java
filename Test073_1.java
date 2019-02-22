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


// �� �Բ� Ǯ���� ����
import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// �� �ֿ� �Ӽ� ���� 
	int su1, su2; // ���������� '0'���� �ڵ��ʱ�ȭ ������
	char op;

	// �� �޼ҵ� ����(��� : �Է�)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
	}

	// �� �޼ҵ� ����(��� : ����)
	int cal() //-- ����ڷκ��� su1, su2, op�� �Է¹޾� ���� �޾����Ƿ� �Ű������� �Ѱܹ��� �� ����
	{
		int result=0; //(1) ���������̹Ƿ� �ڵ��ʱ�ȭ ���� �� ��
		
		// �����ڿ� ���� ������ ������ �޶����Ƿ� �б⹮�� �ʿ�
		switch (op)
		{
			case '+': result = su1 + su2; break;
			case '-': result = su1 - su2; break;
			case '*': result = su1 * su2; break;
			case '/': result = su1 / su2; break;
		    // (2) default: result = 0;
		
		}
		return result;
	}

	// �� �޼ҵ� ����(��� : ���)
	// >> 10 + 5 = 15
	void print(int r) // result���� �谳���� ���·� �޾ƿ�
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, r);
	}
}


public class Test073_1
{
	public static void main(String[] args) throws IOException
    {
		// Calculate Ŭ���� ����� �ν��Ͻ� ����
		Calculate ob = new Calculate();

		ob.input();					//-- ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
        int result = ob.cal();		//-- ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		ob.print(result);			//-- ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
	}
}

// ���� ���
/*
������ �� ���� �Է�(���� ����) : 5 6
������ ������ �Է�(+ - * /) : +
>> 5 + 6 = 11
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/