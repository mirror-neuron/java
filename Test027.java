/*========================================
  ���� ������(Operator) ����
  - ���� ������ == ���� ������
=========================================*/

// �ǿ����� ������ �ǿ����� ������ �ǿ�����
// --------		   --------		   --------
//   1��			 2��			  3��

// �ǿ����� ? �ǿ����� : �ǿ�����
// --------	  --------	 --------
//   1��		 2��	   3��

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ ¦������ Ȧ������ �Ǻ��ϴ� ���α׷��� �����Ѵ�.
// ��, ���ǿ�����(���׿�����)�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 5

// ==[�Ǻ� ���]==
// 5 �� Ȧ�� 
// =============== 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test027
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �� �ֿ� ���� ����
		int n;					//-- ����ڷκ��� �Է¹��� ������ ����(������)�� ���� ����
		String strResult;		//-- Ȧ������ ¦�������� ���� �Ǻ� ����� ���� ����
		
		// �� ���� �� ó��
		// �� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("������ ���� �Է� : ");

		// �� ����ڰ� �Է��� ���� ��ȯ�� �� ������ ��Ƴ���
		n = Integer.parseInt(br.readLine());

		// �� Ȧ������ ¦�������� ���� �Ǻ� ����
		// _________? _________ : __________;
		//   ����1		����2		����3
	
		// ����1 : �� �Ǵ� ������ ��ȯ�� �� �ִ� ������ ���·� �ۼ�
		// ����2 : ����1�� ó�� ����� ���� ��� �����ϴ� ����
		// ����3 : ����1�� ó�� ����� ������ ��� �����ϴ� ����

		// n�� 2�� ���� �������� 0�̸� ¦��... �ƴϸ� Ȧ��
		strResult = (n % 2 == 0)? "¦��" : "Ȧ��";
		
		// ex) ������� �Է°��� 5�� ���
		// �� strResult = (5 % 2 == 0) ? "¦��" : "Ȧ��";
	    // �� strResult = (1 == 0) ? "¦��" : "Ȧ��";
		// �� strResult = false ? "¦��" : "Ȧ��";
		// �� strResult = "Ȧ��";
		
		// �� ��� ���
		System.out.println();
		System.out.println("=====[�Ǻ����]=====");
		System.out.printf("%d �� %s\n", n, strResult);
		System.out.println("=====================");

	}
}

// ���� ���
/*
������ ���� �Է� : 5

=====[�Ǻ����]=====
5 �� Ȧ��
=====================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/