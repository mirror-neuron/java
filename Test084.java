/*========================
  ���� �迭 ����
  - �迭�� �⺻���� Ȱ��
=========================*/

// �� ����
// ����ڷκ��� �л� ���� �Է¹ް�, �� ��ŭ�� ����(��������)�� �Է¹޾�
// ��ü �л� ������ ��, ���, ������ ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// �л� �� �Է� : 5
// 1�� �л��� ���� �Է� : 90
// 2�� �л��� ���� �Է� : 82
// 3�� �л��� ���� �Է� : 64
// 4�� �л��� ���� �Է� : 36
// 5�� �л��� ���� �Է� : 98

// >> �� : 370
// >> ��� : 74.0
// >> ���� 
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int num, tot=0;
		double avg=0.0, std=0.0;

		System.out.print("�л� �� �Է� : ");
		num = sc.nextInt();
		int[] arr = new int[num];	
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.printf("%d�� �л��� ���� �Է� : ", i+1);		
			tot = sc.nextInt();

			for (int j=0; j<arr.length; j++)
			{
				std = tot - avg;		
			}
        }
		System.out.printf(">> �� : %d", tot);
		System.out.printf(">> ��� : %.2f", avg);
		System.out.printf(">> ���� : %.2f", std);
	}
		
		
}


// ���� ���
/*

*/