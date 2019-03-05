/*========================================
	���� Ŭ���� ��� ����
	- �������̽�(Interface)
=========================================*/

// �� �ǽ� ����
//    ���� ó�� ���α׷��� �����Ѵ�.
//    ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 1921004 �̿���
// ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85 
// 2��° �л��� �й� �̸� �Է�(���� ����) :	1921005 ������
// ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

// 1921004 �̿��� 90 100  85		275		91
//		          ��  ��  ��
// 1921005 ������ 85  70  65		220     73
//                ��  ��  ��

// ����Ϸ��� �ƹ� Ű�� ��������...


// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��

import java.util.Scanner;
import java.io.IOException;

class Record
{
	String hak, name, rank;		//-- �й�, �̸� 
	int num, kor, eng, mat;		//-- ����, ����, ���� ����
	int tot, avg;			//-- ����, ���(���ǻ� ���� ó��)
}

// �������̽�
interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}

// ���� �ذ� �������� �����ؾ� �� Ŭ����
class SungjukImpl extends Record implements Sungjuk 
{
	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			num = sc.nextInt();
		}
		while (num<1);
	}

	@Override
	public void input() 
	{
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[num];

		for (int i=1; i<=num; i++)
		{
			System.out.printf("%d��° �л��� �̸� �й� �Է�(���� ����) : ", i);
			name = sc.next();
			hak = sc.next();
			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			kor = sc.nextInt();
			eng = sc.nextInt();
			mat = sc.nextInt();
		}
	}

	@Override
	public void print()
	{
		tot = kor + eng + mat;
		avg = tot / 3;
		
		int[] rank = new int[i];

		System.out.printf("%s %s %2d %2d %2d %4d %2d", hak, name, kor, eng, mat, tot, avg);
		System.out.printf("\t\t %2s  %2s %2s", rank); 
	}

}

public class Test116
{
	public static void main(String[] args) throws IOException
	{
		Sungjuk ob = new SungjukImpl();

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����

		
		((SungjukImpl)ob).set();
		((SungjukImpl)ob).input();
		((SungjukImpl)ob).print();
	}
}

// ���� ���
/*

*/