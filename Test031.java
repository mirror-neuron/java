/*=========================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if�� �ǽ� 
==========================================*/

// �� �ǽ� ����
// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸� �Է� : ���ȯ
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� ���ȯ�Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80�Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ����� ��� ������ �������� ó���Ѵ�.
// 90�� ~ 100�� : A   80�� ~ 89�� : B
// 70�� ~ 79��  : C   60�� ~ 69�� : D
// 60�� �̸�    : F

// 80 <= avg < 90 (X) �� avg >= 80 ��������(&&) avg < 90
// ������ 2���� �̻��� �� �߰��� �� ������(&&, ||, !)�� ���� ��.
   

// ��, BufferedReader �� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� �ϸ�,
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{	
		//���� Ǯ���� ����
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strName;
		int kor, eng, mat, tot, avg;		

		System.out.print("�̸� �Է� : ");
		strName = br.readLine();

		System.out.print("���� ���� : ");
       	kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
        eng = Integer.parseInt(br.readLine());

        System.out.print("���� ���� : ");
        mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot / 3;
				

		System.out.printf(">> ����� �̸��� %s�Դϴ�.%n", strName);
		System.out.printf(">> ���� ������ %d,%n", kor);
		System.out.printf(">> ���� ������ %d,%n", eng);
		System.out.printf(">> ���� ������ %d,%n", mat);
		System.out.printf(">> ������ %d�̰�, ����� %d�Դϴ�.%n", tot, avg);

        if(100>=avg && avg>=90)
        {
			System.out.print("����� A�Դϴ�.");
        }
		if (90>avg & avg>=80)
		{
			System.out.print("����� B�Դϴ�.");
		}		
		if (80>avg & avg>=70)
		{
			System.out.print("����� C�Դϴ�.");
		}
		if (70>avg & avg>=60)
		{
			System.out.print("����� D�Դϴ�.");
		}	
		if (60>avg)
		{
			System.out.print("����� F�Դϴ�.");
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor, eng, mat;
		
		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());

		//���� ����
		int tot = kor + eng + mat;
		
		//��� ����
		double avg = tot / 3.0;

		//��� ����
		char grade = 'F';
		
		if (avg >= 90)
		{
			grade = 'A';
		}
		else if (avg >= 80)
		{
			grade = 'B';
		}
		else if (avg >= 70)
		{
			grade = 'c';
		}
		else if (avg >= 60)
		{
			grade = 'D';
		}
		/*
		else if (avg < 60)
		{
			grade = 'F';
		}
		*/
		System.out.println();
		System.out.printf(">> ����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf(">> ���� ������ %d, \n", kor);
		System.out.printf(">> ���� ������ %d, \n", eng);
		System.out.printf(">> ���� ������ %d, \n", mat);
		System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�.\n", tot, avg);
		System.out.printf(">> ����� ����� %c�Դϴ�.\n", grade);
		
	}
}

// ���� ���
/*
�̸� �Է� : sue
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� sue�Դϴ�.
>> ���� ������ 90,
>> ���� ������ 80,
>> ���� ������ 70,
>> ������ 240�̰�, ����� 80.00�Դϴ�.
>> ����� ����� B�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/