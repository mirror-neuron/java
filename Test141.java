/*==================================================
	   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	   - Random Ŭ����
==================================================*/

/*
�� java.util.Random Ŭ������
   
   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������� �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ� 
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.

*/

// �ζ� ��ȣ ������ (���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ� 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 2 39 40 41 42 45
// 1 2 8 16 28 42
// 4 9 10 13 14 28
// 20 24 31 33 37 41
// 5 7 8 11 36 40 
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Random;
import java.util.Arrays;

class Lotto
{
		// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6��
		private int[] num = new int[6];

		// getter (private�� ������ �� �� �ֵ��� �������)
		public int[] getNum()
		{
			return num;
		}

		// 6���� ������ �߻���Ű�� �޼ҵ� ����
		public void start()
		{
			int cnt = 0;
			Random rd = new Random();
			int n;

			jump:
			while (cnt<6)	// cnt �� 0 1 2 3 4 5
			{
				n = rd.nextInt(45)+1;		//-- rd'45'�� 0~44������ ������ �� �߻�, 1 ~ 45

				for (int i=0; i<cnt; i++)
				{
					if(num[i] == n)	
						continue jump;
				}

				num[cnt++] = n;
			}
			sorting();
		}
		


	// ���� �޼ҵ�
	private void sorting()
	{
		Arrays.sort(num);
	}
}


public class Test141
{
	public static void main(String[] args)
	{
		/*
		Random rd = new Random();
		int[][] lotto = new int[5][6];

		for (int i=0; i<lotto.length; i++)
		{
			for (int j=0; j<lotto[i].length; j++)
			{
				lotto[i][j] = rd.nextInt(45)+1;
				for (int k=0; k<lotto.length; k++)
				{
					if(lotto[i][j] == lotto[i][k])
						i--;
					    break;
				}
			}
		}

		
		for (int i=0; i<lotto.length; i++)
		{
			for (int j=0; j<lotto[i].length-1; j++)
			{
				for (int k=i+1; k<lotto[i].length; k++)
				{
					lotto[i][j] = lotto[i][j]^lotto[i][k];
					lotto[i][k] = lotto[i][k]^lotto[i][j];
					lotto[i][j] = lotto[i][j]^lotto[i][k];
				}
			}
		}

		for (int i=0; i<5; i++)
		{
			for (int j=0; i<6; j++)
			{
				System.out.printf("%3d",lotto[i][j]);
			}
			System.out.println();
		}
		*/


	// Lotto Ŭ���� �ν��Ͻ� ����
	Lotto lotto = new Lotto();

	// �⺻ 5����
	for (int i=1; i<=5; i++)
	{
		lotto.start();

		// ��� ���
		for (int n : lotto.getNum())
			System.out.printf("%4d", n);
		System.out.println();  // ����
	
	}
  }

}

// ���� ���
/*
   1  12  13  16  18  25
   8  10  16  21  26  44
  13  18  24  26  27  32
  16  19  20  26  34  44
   3   5   8   9  27  43
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/