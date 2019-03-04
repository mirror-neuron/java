/*========================================
	���� ����(sort) �˰��� ����
	-- ���� ���� ����(Bubble Sort)
=========================================*/

// �� �ǽ� ����
//    ����ڷκ��� ���� �л��� ���� ������ ���� ���·� �Է¹޾�
//    ������ ���� ������ ����� �ο��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//    ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է� : 5
// �̸� ���� �Է�(1) : ���ֿ� 90
// �̸� ���� �Է�(2) : ������ 80
// �̸� ���� �Է�(3) : ������ 85
// �̸� ���� �Է�(4) : ������ 75
// �̸� ���� �Է�(5) : �̱�� 95

// ===================
// 1�� �̱�� 95
// 2�� ���ֿ� 90
// 3�� ������ 85
// 4�� ������ 80
// 5�� ������ 75
// ===================
// ����Ϸ��� �ƹ� Ű��...

import java.util.Scanner;

public class Test105
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		boolean flag;
		String temp;
	
		do
		{
			System.out.print("�ο� �� �Է� : ");
			num = sc.nextInt();
		}
		while (num<1);
	
		String[] name = new String[num];
		int[] score = new int[num];

		for (int i=0; i<num; i++)
		{
			System.out.printf("�̸� ���� �Է�(%d) : ", i);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}

		int pass=0;
		do
		{
			flag =false;
			pass++;

			for (int j=0; j<num-pass; j++)
			{
				if (score[j] < score[j+1])
				{
					// ��(j) ��(j+1) temp
					// temp = ��
					// �� = ��
					// �� = temp

					temp = name[j];
					name[j] = name[j+1];
					name[j+1] = temp;

					score[j] = score[j]^score[j+1];
					score[j+1] = score[j+1]^score[j];
					score[j] = score[j]^score[j+1];
					flag = true;	
				}			

			}
		}
		while (flag);
		
		int rank = 0;

		System.out.println("\n======================================");
		for (int i=0; i<num; i++)
		{
			rank++;
			if (i!=0 && score[i]==score[i-1])
			{
				rank--;
				System.out.printf("%d�� %s %d\n", rank, name[i], score[i]);
			}
			else 
			{
				System.out.printf("%d�� %s %d\n", i+1, name[i], score[i]);
			}
		}
		System.out.println("========================================");
	}
}

// ���� ���
/*
�ο� �� �Է� : 3
�̸� ���� �Է�(0) : ���� 90
�̸� ���� �Է�(1) : ���� 85
�̸� ���� �Է�(2) : ���� 90

======================================
1�� ���� 90
1�� ���� 90
3�� ���� 85
========================================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/