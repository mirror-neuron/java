/*==================================================
	   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	   - Calendar Ŭ����
==================================================*/

// �� �ǽ� ����
//    ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
//    Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//    ��, Calendar Ŭ������ Ȱ���Ͽ� ó���Ѵ�.

// ���� ��)
// ���� ��¥ : 2019-3-8 �ݿ���
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

// =========[Ȯ�ΰ��]========
// 200�� �� : 2019-xx-xx x����
// ===========================
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Calendar;
import java.util.Scanner;

public class Test139
{
	public static void main(String[] args)
	{
		// �� ������ Ǯ���� ����
		/*
		Scanner sc = new Scanner(System.in);
		String[] days = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		Calendar cal = Calendar.getInstance();

		int y, m, d, w;
		int num;
	
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("���� ��¥ : %d-%d-%d %s", y, m, d, days[w-1]);
		System.out.print("\n�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		num = sc.nextInt();

		cal.set(Calendar.DATE, cal.get(Calendar.DATE)+num);
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("==========[Ȯ�ΰ��]==========");
		System.out.printf("%d�� �� : %d-%d-%d %s", num, y, m, d, days[w-1]);
		System.out.println("\n============================");
		*/

		// �� �Բ� Ǯ���� ����
		// Scanner Ŭ���� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// Calendar Ŭ���� �ν��Ͻ� ����
		Calendar now = Calendar.getInstatnce();

		// �ֿ� ���� ����
		int nalsu;			//-- ����ڷκ��� �Է¹��� �� �� 
		int y, m, d, w;		//-- ��, ��, ��, ����
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};

		// ������ ��, ��, ��, ���� Ȯ��(�������� : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;	// check~!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		// ������ ��, ��, ��, ���� Ȯ�ΰ�� ���
		System.out.println("���� ��¥ : " + y + "-" + m + "-" + d +  "  " + week[w-1] + "����");

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);

		// �� �� ���ϱ� ����
		now.add(Calendar.DATE, nalsu);

		// ��� ���
		System.out.println();
		System.out.println("==========[Ȯ�ΰ��]==========");
		System.out.printf("%d�� �� : %tF %tA\n", nalsu, now, now); //-- %t : ��¥(�ð�) Ÿ���� ��� ����(�ɼ� �� Ȯ���غ��� �� F: 2019-06-16, A:����)
		System.out.println("==============================");


	}
}

// ���� ���
/*
���� ��¥ : 2019-3-8 �ݿ���
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 100
==========[Ȯ�ΰ��]==========
100�� �� : 2019-6-16 �Ͽ���
============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/