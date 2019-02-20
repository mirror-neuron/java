/*============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - �ݺ��� (while��) �ǽ�
=============================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�
// ��� �Ϸ��� �ƹ� Ű��..

// ������ ���� �Է� : 11
// 11 �� �Ҽ� 
// ����Ϸ��� �ƹ� Ű��..

// �� �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿��� � ���ε� ���� �� ���� ��.
//           ��, 1�� �Ҽ� �ƴ�

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		//���� Ǯ���� ����
		/*
		System.out.print("������ ���� �Է� : ");
		int n;
		String rst = "�Ҽ�";
		
		n=Integer.parseInt(br.readLine());
 
		if (n==1)
		{
			rst = "�Ҽ� �ƴ�";
		}
		else 
		{
			int i = 2;
			while (n%i==0)
			{
				System.out.printf("�Ҽ� �ƴ�"); break;
			}
			else
				System.out.printf("%d �� �Ҽ�");break;
                i++;
		}
		*/
		
		//�Բ� Ǯ���� ����
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int num;			//-- ����� �Է°��� ���� ����
		
		// ���� �� ó�� 
		System.out.print("������ ���� �Է�: ");
		num = Integer.parseInt(br.readLine());
		
		int n=2;			//-- ������� �Է°��� �������
							//   ������ ������ ������ ����(1�� ���� ����)

		boolean flag=true;	//-- �Ҽ���~!!!(���Ƿ� �⺻�� ����) (check~!!)
	
		while (n<num)
		{
			if (num%n==0)
			{
				flag=false;		//-- �Ҽ� �ƴϴ�~!!
				break;          //-- �Ҽ��� �ƴϸ� ���߰� ����������.
			}

			n++;
		}
		// ��� ���(��� ���� �����ؾ��� �߰� Ȯ�� �� 1���� ���ο� ���� Ȯ��)
		// �Ҽ��� && 1�� �ƴϴ�
		// �� �������� ������� �Ҽ���
		// �׷��� ������
		// �� �������� ������� �Ҽ� �ƴϴ�

		if (flag && num!=1)
			System.out.printf("%d �� �Ҽ�~!!\n", num);
		else 
			System.out.printf("%d �� �Ҽ� �ƴ�~!!\n", num);

		
		}
	}
