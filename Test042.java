/*================================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - switch�� �ǽ�
=================================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�
// ���� ����� ���ǻ� ���� ���·� ó���ϵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�	: 10
// �� ��° ���� �Է�	: 28
// ������ �Է�(+ - * /) : +

// >> 10 + 28 = 38
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	//���� Ǯ���� ����
	/*
	int n1, n2;
	int op,o1;

    System.out.print("ù ��° ���� �Է� : ");
	n1 = Integer.parseInt(br.readLine());

	System.out.print("�� ��° ���� �Է� : ");
	n2 = Integer.parseInt(br.readLine());

	System.out.print("������ �Է�(+ - * /) : ");
	op = System.in.read();
	
	switch (op)
	{
	case 43 : System.out.printf("%d + %d = %d%n", n1, n2, (n1+n2)); break; 
	case 45 : System.out.printf("%d - %d = %d%n", n1, n2, (n1-n2)); break;
    case 42 : System.out.printf("%d * %d = %d%n", n1, n2, (n1*n2)); break;
    case 47 : System.out.printf("%d / %d = %d%n", n1, n2, (n1/n2)); break;
	default : System.out.println("�Է� ����~!!");
	}
	*/

	//�Բ� Ǯ���� ����
	int a, b, result;
	char op;
	
	System.out.print("ù ��° ���� �Է� : ");
	a = Integer.parseInt(br.readLine());
	System.out.print("�� ��° ���� �Է� : ");
	b = Integer.parseInt(br.readLine());
	System.out.print("������ �Է�(+ - * /) : ");
	op = (char)System.in.read();
	
	switch (op)								//--==>> swith���� [byte/short/int/long]�� ���ȭ��ų �� �־�����, JDK1.5 ver.���� [char]�� ���ȭ �������� 
	{
		case '+': result=a+b; break;
		case '-': result=a-b; break;
		case '*': result=a*b; break;
        case '/': result=a/b; break;
		default: return;	//-- return : �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����				
	}

	// �� ��return�� : 1. ���� ��ȯ
	//				   2. �޼ҵ� ����

	System.out.println();
	System.out.printf(">> %d %c %d = %d\n", a, op, b, result); 
	}
}

// ���� ���
/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 9
������ �Է�(+ - * /) : /

>> 10 / 9 = 1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 9
�� ��° ���� �Է� : 8
������ �Է�(+ - * /) : .
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
