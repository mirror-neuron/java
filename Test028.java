/*===========================================
 ���� ������(Operator) ����
 - ���� ������ == ���� ������
==========================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, ��������, 0���� �����Ͽ�
// ����� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ��, �Է� �����ʹ� BufferedReader �� readLine()�� ���� �Ѱ���� �� �ֵ��� �Ѵ�.
// ����, ���� ������(���� ������)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : -12
// -12 �� ����
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է� : 257 
// 257 �� ���
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է� : 0
// 0 �� �� 
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
     	//���� Ǯ���� ����
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int num; 
		String strResult;		

		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());
		strResult = ( num > 0) ? "���" : "����";
	    System.out.printf("%d �� %s\n", num, strResult);		
        */
		
		//�Բ� Ǯ���� ����
		// �� �ֿ� ���� ����
		
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;				    //-- ����� �Է°��� ���� ����
		String strResult;		//-- �������� ������� ������ �Ǻ� ����� ���� ���� 
		
		// �� ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		/*
		n�� 0���� ũ�� �� true �� ���
					   �� false �� n �� 0���� �۴� �� true �� ����
								                   �� false �� 0
		*/
		
		strResult = n>0 ? "���" : (n<0? "����": "��");   
     
        // �� ��� ���
		System.out.println(n + "��" + strResult);

	}
}

// ���� ���
/*
������ ���� �Է� : 12
12����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : -80
-80������
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


������ ���� �Է� : 0
0�濵
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/