/*======================================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ������ �ν��Ͻ� Ȱ�� 
=======================================*/

// �� �ǽ� ����
// �л����� ��������, ��������, ���������� �Է¹޾�
// ����, ����� �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ����, �� �������� �迭�� ���������� Ȱ���� �� �ֵ��� �Ѵ�.
// ����������, ������ �䱸������ ������ �� �ֵ��� �����Ѵ�.

// ���α׷��� �����ϴ� Ŭ����
// 1. Record Ŭ����
//    - �Ӽ��� �����ϴ� Ŭ������ ������ ��~!!(�޼ҵ� ���� �����鸸)
// 2. Sungjuk Ŭ����
//    - �ο� ���� �Է¹޾�, �Է¹��� �ο� ����ŭ
//      �̸�, ��������, ��������, ���������� �Է¹ް�
//      ������ ����� �����ϴ� Ŭ������ ������ ��~!!
//    - �Ӽ� : �ο� ��, Record ������ �迭
//    - ��� : �ο� �� �Է�, �� ������ �Է�, ����/��� ����, ��� ���
// 3. Test093 Ŭ����
//    - main() �޼ҵ尡 �����ϴ� �ܺ��� �ٸ� Ŭ������ ������ ��~!!

import java.util.Scanner;

public class Sungjuk
{
	Scanner sc = new Scanner(System.in);

		int num;
		Record[] rc;
		
		void write() {
		do
		{
			System.out.print("�ο� �� �Է�(1~100) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>100);

		rc = new Record[num];
		}

		void input(){
			for (int i=0; i<num; i++)
			{
				rc[i] = new Record();
				System.out.printf("%d��° �л��� �̸� �Է� : ", (i+1));
				rc[i].name = sc.next();

				System.out.print("���� ���� �Է� : ");
				rc[i].score[0] = sc.nextInt();

				System.out.print("���� ���� �Է� : ");
				rc[i].score[1] = sc.nextInt();

				System.out.print("���� ���� �Է� : ");
				rc[i].score[2] = sc.nextInt();
			}
		}

		void record(){
			for (int i=0; i<num; i++)
			{
				rc[i].tot = rc[i].score[0] + rc[i].score[1] + rc[i].score[2];
				rc[i].avg = rc[i].tot / 3.0;
			}
		}

		void print(){
			for (int i=0; i<num; i++)
			{
				System.out.printf("%s %d %d %d %d %.2f\n", rc[i].name, rc[i].score[0], rc[i].score[1], rc[i].score[2], rc[i].tot, rc[i].avg);
			}
		}
		
		// ��ũ �� 
		rank()
		{
			for (int i=0; i<num; i++)
 			{
				System.out.print
				for (int j=0; j<num; j++)
				{
					if (rc[i].tot < rc[j].tot)
					{
						rc[i].rank++;
					}

				}
			}

		}

}