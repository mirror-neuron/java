/*============================================
 ���� ���� �帧�� ��Ʈ�� (���) ����
 - if ~ else�� �ǽ�
=============================================*/

// �� �ǽ� ����
// ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ó�� ����� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�    : 10
// �� ��° ���� �Է�    : 14
// ������ �Է�(+ - * /) : +

// >> 10 + 14 = 24
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException 
	{
	    // ���� Ǯ���� ���� 
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
	    char str;
			
	    System.out.print("ù ��° ���� �Է� : ");
        a=Integer.parseInt(br.readLine());
    
     	System.out.print("�� ��° ���� �Է� : ");
		b=Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�(+ - * /) : ");
		str=(char)System.in.read();
		
		if (str=='+')
		{
			str=a+b;
			System.out.printf(">> %d + %d = %d%n", a, b, str);
		}
		else if (str=='-')
		{
			str=a-b;
			System.out.printf(">> %d - %d = %d%n", a, b, str);
		}
		else if (str=='*')
		{
			str=a*b;
			System.out.printf(">> %d * %d = %d%n", a, b, str);
		}
		else if  (str=='/')
		{
			str=a/b;
			System.out.printf(">> %d / %d = %d%n", a, b, str);
		}
		*/
    
		// ��� ��
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		char op;
		int temp;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�(+ - * /) : ");
		//op = Integer.parseInt(br.readLine()); -> �Ұ���
		//op = br.readLine();  -> ���ڿ��� ���ڿ� ��� ���� �� ��(�ڵ� �� ��ȯ ��Ģ)
		//temp = System.inread(); -> ����
		op = (char)System.in.read(); 

		// "1234" �� Integer.parseInt(); �� 1234
		// "abcd" �� Integer.parseInt(); �� (X)

		if (op == '+')
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == '-')
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == '*')
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == '/')
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else 
		{
			System.out.println("�Է� ������ ������ �����մϴ�.");
		}
		*/

		// ��� �� 
		/*
		BufferedReader br = new BufferedReader(InputStreamReader(System.in));

		int a, b, op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�(+ - * /) : ");
		op = System.in.read();

		// �׽�Ʈ(Ȯ��)
		System.out.println(" op : " + op);
		//-- + �� op : 43
		//   - �� op : 45
		//   * �� op : 42
		//   / �� op : 47	

        if (op == 43)		// '+' 
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if (op == 45)		// '-'
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if (op == 42)		// '*'
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if (op == 47)		// '/'
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else 
		{
			System.out.println("�Է� ������ ������ �����մϴ�.");
		}
		*/

		// ��� ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, result=0;		//result���� �ʱ�ȭ �����Ƿ� �������� else���� ���� �ʾƵ� ��.
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�(+ - * /) : ");
		//op = Integer.parseInt(br.readLine()); -> �Ұ���
		//op = br.readLine();  -> ���ڿ��� ���ڿ� ��� ���� �� ��(�ڵ� �� ��ȯ ��Ģ)
		//temp = System.inread(); -> ����
		op = (char)System.in.read(); 

		// "1234" �� Integer.parseInt(); �� 1234
		// "abcd" �� Integer.parseInt(); �� (X)

		if (op == '+')
			result = a + b;     
		else if (op == '-')
			result = a - b;
		else if (op == '*')
			result = a * b;
		else if (op == '/')
			result = a / b;

        System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
		
	}
}

// ���� ���
/*
ù ��° ���� �Է� : 9
�� ��° ���� �Է� : 5
������ �Է�(+ - * /) : /

>> 9 / 5 = 1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
