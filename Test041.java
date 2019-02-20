/*=========================================
 ���� ���� �帧�� ��Ʈ�� (���) ����
 - switch �� �ǽ�
==========================================*/

// �� �ǽ�����
// 1 ���� 3 ������ ���� �� �ϳ��� ����ڷκ��� �Է¹޾�
// �Է¹��� ������ŭ ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

// �� switch ���� �Ϲ� ���� Ȱ���Ѵ�.
// �� switch ���� �⺻ ���� Ȱ���ϵ�, 
//    ��break���� �� �� ���� ����� �� �ִ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//���� Ǯ���� ����
	/*	
	int n;
	n = Integer.parseInt(br.readLine());

	switch (n)	// �Ϲݸ�
	{
	case 1 : System.out.print("��\n"); break;
    case 2 : System.out.print("�ڡ�\n"); break;
	case 3 : System.out.print("�ڡڡ�\n"); break;
	default : System.out.println("�Է� ����~!!"); 
	}
	
	//��
	switch (n)  // �⺻��
	{
	case 3 : System.out.print("��"); 
    case 2 : System.out.print("��"); 
	case 1 : System.out.print("��\n"); break;
	default : System.out.println("�Է� ����~!!"); 
	*/

	//�Բ� Ǯ���� ����
	int n;
	
	System.out.print("������ ���� �Է�(1~3) : ");
	n = Integer.parseInt(br.readLine());
	
	//��
	/*
	switch (n)
	{
	case 1: System.out.println("��"); break;
	case 2: System.out.println("�ڡ�"); break;
	case 3: System.out.println("�ڡڡ�"); break;
	default: System.out.println("�Է� ����~!!!");
	}
	*/
	
	//��
	switch (n)
	{
	default: System.out.println("�Է� ����~!!");break;
	case 3: System.out.print("��\n");
	case 2: System.out.print("��\n");
	case 1: System.out.print("��\n");
	
	}
		
	}
}
//���� ���
/*
������ ���� �Է�(1~3) : 3
�ڡڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(1~3) : 4
�Է� ����~!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/