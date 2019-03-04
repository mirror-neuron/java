/*===============================================
	���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
===============================================*/

/*
�� �ֹε�Ϲ�ȣ ���� ����

   �� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

   	  123456-1234567	(�� �ֹι�ȣ)
	  ****** *******
	  234567-892345		(�� �� �ڸ��� ������ ��)

   �� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

   ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
       * * * * * *   * * * * * * 
	   2 3 4 5 6 7   8 9 2 3 4 5
   --------------------------------
   �� 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15
      == 217

   �� ������ ������� 11�� ������ ������������ ���Ѵ�.
         19
   	  -----------
   11 | 217
        11
	  -----------
	    107
		 99
      -----------
	      8  ��  ������

    �� 11���� �������� �� ������� ���Ѵ�.

	   11 - 8 

	�� ���° ���� ó���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
	   ��ġ�ϴ��� ���Ѵ�.

						��ġ
	   11 - 8 ������ 3 == �ֹι�ȣ ������ ���� 3

    �� ������ ���ڿ� ���� ��� ��ȿ�� �ֹε�Ϲ�ȣ~!!!
*/    

// ���� ��)
// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-12345678 �� �Է°��� �ʰ�
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-123456   �� �Է°��� ����
// >> �Է� ����~!!!

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1252085  �� ��ȿ�� �ֹι�ȣ
// >> ��Ȯ�� �ֹι�ȣ~~!!!

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1252086  �� ��ȿ���� ���� �ֹι�ȣ
// >> �߸��� �ֹι�ȣ~~!!!

// �� ���ڿ�.length() �� ���ڿ��� ���� ��ȯ
//    ���ڿ�.substring() �� ���ڿ� ���� 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test101
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader Ŭ���� �ν��Ͻ� ����
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �Է¹��� �ֹι�ȣ
		String str;

		// �������� �� �迭 ����
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};	
		//							  '-' check~!!!
		
		// ���� ���� �� ������
		int tot = 0;
		
		// ����ڿ��� �ȳ� �޼��� ��� �� �ֹι�ȣ �Է¹ޱ�
		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> �Է¿���~!!!");

			return;
		}

		// Ȯ��
		//System.out.println(">> �ڸ��� ����~!!!");

		for (int i=0; i<13; i++)		// i �� 0 1 2 3 4 5 6('-') 7 8 9 10 11 12
		{
			if (i==6)
				continue;

			tot += chk[i] * Integer.parseInt(str.substring(i, (i+1)));
		}

		//-- ������� �����ϸ� �� �� �� �� ��� ���� ��Ȳ�̸�
		//   ��Ģ�� �°� ���� ������ ������ ����� ��� ���� ����
		//   ���� tot �� ����ִ� ���°� �ȴ�.

		int su = 11 - tot % 11;
		//            --------
		//       -------------

		// Ȯ��
		//System.out.println(su);		//--==>> 11

		// ���� ��� ��� ������ �߰� ���� �ʿ�~!!!
		// �� su�� ���� ���� ����� �� �ڸ��� ���� �ܿ�
		//    �ֹι�ȣ ������ �ڸ����� ���� �� ���� ��Ȳ
		su = su % 10;	// su %= 10;

		//-- ������� �����ϸ� ��� �긦 ��� ���� ��Ȳ�̸�
		//   ���� ���� ����� ���� su�� ����ִ� ��Ȳ�� �ȴ�.

		// ���� ��� ���
		if(su == Integer.parseInt(str.substring(13)))
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!!");
		else
			System.out.println(">> �߸��� �ֹι�ȣ~!!!");

		// �׽�Ʈ
		//String strTemp = "���ع�����λ��� �������⵵��";
		//System.out.println(strTemp.length());
		//--==>> 15

		// �׽�Ʈ
		//System.out.println("�������� �� �ҳ���".length());
		//--==>> 10

		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 5));
		//--==>> de(���ڿ� 3��° ~ 5-1��°)

		// �׽�Ʈ
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 50));
		//--==>> java.lang.StringIndexOutOfBoundsException(���ڿ� ����� ���� �߻�)

		// �׽�Ʈ
		//System.out.println("���̿��������װڳ�".substring(4, 9));
		//--==>> �����װڳ�

		// �׽�Ʈ
		//System.out.println("������������".substring(3));
		//System.out.println("������������".substring(3, "������������".length()));
		//--==>> ������
		//		 ������

		//--==>> ������  //--�Ű������� �ϳ��� ���, �ڿ� length��ŭ ���
	}
}

// ���� ���
/*
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750815-1598735
>> ��Ȯ�� �ֹι�ȣ~!!!.///
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750815-1598737
>> �߸��� �ֹι�ȣ~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/