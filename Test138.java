/*==================================================
	   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	   - Calendar Ŭ����
==================================================*/

/*
�� java.util.Calendar Ŭ������
   ��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
   ��, ��, ��, ����, ��, ��, �ʱ�����
   �ð��� ��¥�� ���õ� ������ �����Ѵ�.
   �׸���, Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü(Instance)�� ������ �� ������
   �������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
   ��GregorianCalendar�� Ŭ������ ���ǵǾ� �ִ�.

   �ý������κ��� ���� �ý��� �ð� ������ ���� �� 
   getInstance() ��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
   ������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
   �� ��ü�� �����Ǹ� ���� �ִ� �ð� ��������
   get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

   getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
   �����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
   ���� ���� �ִ�.
*/

// �� �ǽ� ����
//    ����ڷκ��� ��, ���� �Է¹޾�
//    �ش� �� ���� �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//    ��, Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���� �Է� : 0
// ���� �Է� : 2019
// �� �Է�   : -2
// �� �Է�   : 16
// �� �Է�   : 7

/*
	[ 2019�� 7�� ]

  ��  ��  ȭ  ��  ��  ��  ��
============================
       1   2   3   4   5   6
   7   8   9  10  11  12  13
  14  15  16  17  18  19  20
  21  22  23  24  25  26  27
  28  29  30  31
============================
*/

/*
�� ���� �ν� �� �м�(���Է� ���� ��, ���� 1���� ���� �������� �˾Ƴ��� ���� ����Ʈ~!!!)
   - ���� 1�� 1�� 1�� : ������

   - ������ 4�� ����̸鼭 100�� ����� �ƴϰų�,
     400�� ����̸� 2���� 29��(����),
	 ������ 2���� 28��(���).

   - 2019�� 7�� �޷��� �׸��ٰ� �����ϸ�
     1. 1. 1 ~ 2019. 6. 30 ������ ��ü �� ���� ���Ѵ�.
	 �� �� ���� + 1 ������ �����ϸ�... (2019�� 7�� 1���� ���� Ȯ��)
	 7���� �޷� �׸� �غ� ��~!!!

   - ���� = ��ü���� % 7 
     ���� = 0 �� �Ͽ���
	        1 �� ������
			2 �� ȭ����
			   :
*/  

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test138
{
	public static void main(String[] args)
	{
		int y=0, m=0;
		int i;

		Calendar rightNow = new GregorianCalendar();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("���� �Է� : ");
			y = sc.nextInt();
		}
		while (y<1);	

		do
		{
			System.out.print("�� �Է� : ");
			m = sc.nextInt();
		}
		while (m<1 || m>12);

		rightNow.set(Calendar.YEAR, y);
		rightNow.set(Calendar.MONTH, m-1);
		rightNow.set(Calendar.DATE, 1);
		
		int startDay = rightNow.get(Calendar.DAY_OF_WEEK);
		int lastDay = rightNow.getActualMaximum(Calendar.DATE);
		
		System.out.println();
		System.out.println("\t [ " + y + "�� " + m + "�� ]");
	    System.out.println();
		System.out.println("	��	��	ȭ	��	��	��	��"); // �� ĭ ����
		System.out.println("=============================");

		for (i=1; i<startDay; i++)
		{
			System.out.print("    ");
		}
		
		for (int j=rightNow.get(Calendar.DATE); j<=lastDay; j++)
		{
			System.out.printf("%4d", j);
			if (i==7)
			{
				System.out.println();
				i=0;
			}
			i++;
		}
		if(i!=7);
		{
			System.out.println();
		}
		System.out.println("=============================");
	




	
	}
}