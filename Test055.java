/*==============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - �ݺ��� (do~while��) �ǽ� 
===============================================*/

// �� �ǽ� ����
// ����ڷκ��� ���� ���� ������ �Է¹޾�
// �� ���� ����Ͽ� ����� ������ִ� ���α׷��� �����Ѵ�.
// ��, ����ڰ� ��-1�� �� �Է� ��
// �Է¹޴� ������ �����ϰ�
// �׵��� �Է¹޾Ƶ� �������� ���� ����� �� �ֵ��� �����Ѵ�.
// �Է¹޴� ������ Scanner �ν��Ͻ��� �����Ͽ� ó���Ѵ�.

// ���� ��)
// 1��° ���� �Է�(-1 ����) : 10 
// 2��° ���� �Է�(-1 ����) : 10
// 3��° ���� �Է�(-1 ����) : 5
// 4��° ���� �Է�(-1 ����) : 8
// 5��° ���� �Է�(-1 ����) : 9
// 6��° ���� �Է�(-1 ����) : -1

// >> ������� �Էµ� ������ �� : 42
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;

public class Test055
{
	public static void main(String[] args)
	{
		
		//���� Ǯ���� ����
		/*
		Scanner sc = new Scanner(System.in);

		int num, n=1, sum=0;		

		do
		{
			System.out.print( n + "��° ���� �Է�(-1 ����) : ");
			num = sc.nextInt();
			
			//if( n == -1)
			  {
				break; //continue;
			  }
			sum += num;
			n++;
		}
		while (num!=-1);
	     
			//System.out.printf(">> ��������� �Էµ� ������ ��: %d%n", sum);
			System.out.printf(">> ��������� �Էµ� ������ ��: %d%n", ++sum);
		*/

		//�Բ� Ǯ���� ����
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		// �� �ֿ� ���� ����
	    int num;		//-- �ܺηκ��� ����� �Է°��� ��Ƶ� ����
		int sum=0;		//-- �������� ���� ����
		int n=1;		//-- �� �� ° �Է°����� ��Ƶ� ���� 

		// �� ���� �� ó��
		do
		{
			System.out.printf("%d��° ���� �Է�(-1 ����) : ", n); //�Է°��� ���� ���� ���
			num = sc.nextInt(); // ����ڷκ��� �Է°� �޾Ƶ�
			sum += num; // ����� �Է°��� �����տ� �ݺ��ؼ� ��Ƶ�
			n++; //n��° �Է°��� -1�� �ԷµǱ� ������ 1�� ����
		}
		while (num != -1);  //-- num�� '���� 1'�� �ƴҶ����� �ݺ��ؼ� ó��

		// �� ������
		System.out.printf("\n>> ������� �Էµ� ������ �� : %d\n", (sum+1)); 
		//do~while�ݺ����� �����ϴ� ������ '���� 1'�̹Ƿ� �����տ� '��� 1'�� ������� ���ݱ��� �Էµ� ������ ���� ����
	}
}

// ���� ���
/*
1��° ���� �Է�(-1 ����) : 5
2��° ���� �Է�(-1 ����) : 8
3��° ���� �Է�(-1 ����) : 9
4��° ���� �Է�(-1 ����) : 1
5��° ���� �Է�(-1 ����) : -1
>> ��������� �Էµ� ������ ��: 23
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/