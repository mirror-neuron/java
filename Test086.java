/*============================
  ���� �迭 ����
  - �迭�� �迭(2���� �迭)
=============================*/

// �� �ǽ� ����
// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5x5)�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
 1  2  3  4  5 
 6  7  8  9 10
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25
����Ϸ��� �ƹ� Ű�� ��������...
*/
public class Test086
{
	public static void main(String[] args)
	{
	
		 //
		 /*
		 int[][] num = new int[5][5];
		 int n=1;

		 for (int i=0; i<num.length; i++)
		 {
			 for (int j=0; j<num[i].length; j++)
			 {
				 num[i][j] = n;
				 n++;
			 }
		 }

		 for (int i=0; i<num.length; i++)
		 {
			 for (int j=0; j<num[i].length; j++)
			 {
				 System.out.printf("%3d", num[i][j]); 
			 }
			 System.out.println();
		 }
		 System.out.println();
		}
		*/

		// �Բ� Ǯ���� ����
		// �迭�� �迭 ����
		//int[][] arr;

		// �迭�� �迭 �޸� �Ҵ�
		// arr = new int[5][5];

		// �迭�� �迭 ���� + �޸� �Ҵ�
		int[][] arr = new int[5][5];

		// �ʱ�ȭ
		int n=1;
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;
			}
		}

		// �迭�� �迭 ��� ��ü ��� 
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
		}
		
	}
}

// ���� ���
/*
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/