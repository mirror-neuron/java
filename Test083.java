/*========================
  ���� �迭 ����
  - �迭�� �⺻���� Ȱ��
=========================*/

// �� ����
// ����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
// �Է¹��� �� �߿��� ���� ū ���� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// �Է��� �������� ����  : 10
// ������ �Է�(���鱸��) : 45 92 75 13 2 65 25 63 90 17
// >> ���� ū �� �� 92
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;  // ����ڷκ��� ������ ������ ������ �Է� ����

public class Test083
{
	public static void main(String[] args)
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in); 

		int num, max=0;

		System.out.print("�Է��� �������� ����  : ");
		num = sc.nextInt();
	
		System.out.print("������ �Է�(���鱸��) : ");			
		int[] arr = new int[num];

		for (int i=0; i<num; i++)
		{
			arr[i] = sc.nextInt();
		}

		max = arr[0];
		for (int i=1; i<num; i++)
		{
			if (max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.printf(">> ���� ū �� �� %d\n", max);
	}
	
}

// ���� ���
/*

*/