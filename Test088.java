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
  5  1  2  3  4  
  4  5  1  2  3 
  3  4  5  1  2 
  2  3  4  5  1 
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test088
{
	public static void main(String[] args)
	{
	 int[][] arr = new int[5][5];
	 int n;

	 for (int i=0; i<arr.length; i++)
	 {
		 n = i;
		 for (int j=0; j<arr[i].length; j++)
		 {
			 n++;
			 arr[i][j] = n;
			 
		 }
	 }

	 for (int i=0; i<arr.length; i++)
	 {
 		 for (int j=0; j<arr[i].length; j++)
			System.out.printf("%3d", arr[i][j]);
		 System.out.println();
	 }



	}
}