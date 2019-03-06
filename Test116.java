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

// import�������� Scanner Ŭ���� �ҷ�����
import java.util.Scanner;

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ�� 
class Record
{
	String hak, name, rank;		//-- �й�, �̸� 
	int kor, eng, mat;		//-- ����, ����, ���� ����
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
// abstract SungjukImpl extends Record implements Sungjuk
//    ��
// Record�� ��ӹް� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl extends Record implements Sungjuk		
{
	int num;		//-- �ο� ���� ���� ������ ���� ����
	
	Record[] arr;	//-- �л� ������ ���� Record Ŭ���� �迭ȭ

	
	// set() �޼ҵ� ������ -- �ο� ���� �Է¹���
	@Override
	public void set()
	{
		
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// ��do ~ while���ݺ������� ������ 1~10 ������ �ο� ���� �Է��� ������ �ݺ�
		do
		{
			// �ο� �� �Է� �ȳ� �޽��� ���
			System.out.print("�ο� �� �Է�(1~10) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>10);	
	}

	// input() �޼ҵ� ������ -- ��Ÿ �л� ������ �Է¹���
	@Override
	public void input() 
	{
		Scanner sc = new Scanner(System.in);

		arr = new Record[num];		// �Էµ� �ο� ��(num) ��ŭ Record Ŭ���� �迭 ����

		// ��for���ݺ������� Record �迭�� ����(�ο� ��)��ŭ �� �л��� ���� �Է¹���
		for (int i=0; i<arr.length; i++) 
		{
			// �л� ���� �Է� �ȳ� �޽��� ���
			System.out.printf("%d��° �л��� �̸� �й� �Է�(���� ����) : ", (i+1));
			
			// �л� ������ ���� arr[] �迭�� Record Ŭ������ �ν��Ͻ�ȭ 
			arr[i] = new Record();  

			// �� �л� ���� �迭�� ���� �Է¹޾� ����
			arr[i].hak = sc.next();
			arr[i].name = sc.next();
			
			// ���� �Է� �ȳ� �޽��� ���
			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			
			// �� ���� �迭�� ���� �Է¹޾� ����
			arr[i].kor = sc.nextInt();
			arr[i].eng = sc.nextInt();
			arr[i].mat = sc.nextInt();

			arr[i].tot = arr[i].kor + arr[i].eng + arr[i].mat;
			arr[i].avg = arr[i].tot / 3;
		}
	}

	// pirnt() �޼ҵ� ������ -- �� ������ ��� ���� �� ��� ��� 
	@Override
	public void print()
	{
		// �� ����(����, ����, ����)�� ���ʷ� ������ ������ a[] �迭 ���� 
		int a[] = new int[3];

		// ��for���ݺ������� Record �迭�� ����(�ο� ��)��ŭ �� �л� ���� ���
		for (int i=0; i<arr.length; i++)
		{
			// Record[] �迭�� �� ������ ������ a[] �迭�� ���ʷ� ����
			a[0] = arr[i].kor;
			a[1] = arr[i].eng;
			a[2] = arr[i].mat;

			// �� �л��� ���� ���� ���
			System.out.printf("%s  %s\t%4d%4d%4d\t%d\t%d %n", arr[i].hak, arr[i].name, arr[i].kor, arr[i].eng, arr[i].mat, arr[i].tot, arr[i].avg);
			System.out.printf("\t\t");		// �� �� ������ ����� ���� �Ʒ��� ��µǵ��� ��
				
			// ū��for���ݺ������� ������ �� ������ �迭���� ����(3)��ŭ ������� ���ư���, ���� �� ����� �����
			for (int j=0; j<3; j++)
			{
				// ��if ~ else if�����ǹ����� ���� ������ ���� ��� ���
				if (a[j]>=90 && a[j]<=100)
				{
					System.out.print("  ��");
				}
				else if (a[j]>=80)
				{
					System.out.print("  ��");
				}
				else if (a[j]>=70)
				{
					System.out.print("  ��");
				}
				else if (a[j]>=60)
				{
					System.out.print("  ��");
				}
				else
					System.out.print("  ��");
			}
			System.out.println();	// ����
		}
	
	}

}

// main() �޼ҵ带 ������� �ϴ� �ܺ� Ŭ���� 
public class Test116
{
	public static void main(String[] args)
	{
		// Sungjuk �������̽� ��ü ����
		Sungjuk ob;

		// SungjukImpl Ŭ���� �� Sungjuk �������̽��� �� ĳ����
		// Sungjuk �������̽��� �����ϴ� SungjukImpl Ŭ������ �ν��Ͻ�ȭ
		ob = new SungjukImpl();

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����

		ob.set();
		ob.input();
		ob.print();
	}
}

// ���� ���
/*
�ο� �� �Է�(1~10) : 2
1��° �л��� �̸� �й� �Է�(���� ����) : ��� 2019851
���� ���� ���� ���� �Է�   (���� ����) : 90 80 70
2��° �л��� �̸� �й� �Է�(���� ����) : �Դ� 2019852
���� ���� ���� ���� �Է�   (���� ����) : 88 77 99
���  2019851     90  80  70    240     80
                  ��  ��  ��
�Դ�  2019852     88  77  99    264     88
                  ��  ��  ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/