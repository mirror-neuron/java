/*============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - �ݺ��� (while��) �ǽ�
=============================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ �� ������ �Է� �޾�
// ���� ������ ū ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ���� ���� �Է� : 20
// >> 10 ~ 20 ������ �� : xxxx
// ����Ϸ��� �ƹ� Ű��...

// ù ��° ���� �Է� : 10
// �� ���� ���� �Է� : 2
// >> 2 ~ 10 ������ �� : xxxx
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		//���� Ǯ���� ����
		/*
		int num1, num2, sum=0;		
		int n=1;

		System.out.println("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.println("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		
		while (n<num1)
		{
			if (num1>num2)
			{
				sum += num1;
				num1++;			
			}
			else 
			{
				sum += num2;
				num2++;
			}
		}

		System.out.printf(">> %d ~ %d ������ �� : %d%n", num1, num2, sum); 
		*/

		// �� �ֿ� ���� ����
		int n, su1, su2, result=0;
		//-- ���� ����, ù ��° �Է°�, �� ��° �Է°�, �����(������ ������)

		// �� ���� �� ó��
		// �� ����ڿ��� �ȳ��޼��� ��� �� �Է°� ��Ƴ���
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());

		// �������� ���꿡 ���� �ռ� 
		//	 �Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		//   ��, su1�� su2���� Ŭ ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		if (su1>su2)   // 5 3 �� 3 5
		{
			// �� ���� �ڸ� �ٲ�
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		// �ݺ����� �����ϱ� ��
		// ���� ���� ���� �����صд�.
		// (�� ���� ���� ��� �������� �ʿ��� ���̸�
		// ������ �����ص��� ���� ��� �ݺ����� �����ϴ� ����
		// �� ���� ��� ���� ���̱� ����)
		n = su1;
		
		while (n<=su2)
		{
			result += n;  // 0 + 3 + 4 + 5
			n++;
		}
		
		// �� ��� ���
		System.out.printf(">> %d ~ %d������ �� : %d\n", su1, su2, result);
	}
}

// ���� ���
/*
ù ��° ���� �Է� : 100
�� ��° ���� �Է� : 1
>> 1 ~ 100������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/