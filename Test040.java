/*==========================================
 ���� ���� �帧�� ��Ʈ�� (���) ����
 - switch �� �ǽ�
==========================================*/

/*
�� ���� ���ù��̶� �ϸ�, switch �� ������ ���� ���� ���� 
   ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

�� ���� �� ����
   switch(����)
   {	
		case ���1 : ����1; [break;]
		case ���2 : ����2; [break;]
			:
		[default : ����n+1;] [break;]
	}
	
	switch ���� �����ġ��� case�� ��������� 
	byte, short, int, long ���̾�� �Ѵ�.

	case �� �ڿ� ��break;�� �� ���� ������ ���
	���� case ���� ������ ����ؼ� �����ϰ� �ȴ�. (�⺻ ��)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test040
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸��� �Է� �ϼ���: ");
		String name = br.readLine();
		
		System.out.print("���� ���� �Է� : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		int mat = Integer.parseInt(br.readLine());

		int tot = kor + eng + mat;
		//double avg = tot / 3.0;
		int avg = tot / 3;

		char grade= 'F';		
		
		switch (avg / 10)
		{
			case 10 : case 9 : grade = 'A' ; break;
			case 8	: grade = 'B'; break;
			case 7	: grade = 'C'; break;
			case 6	: grade = 'D'; break;
			default : grade = 'F'; break;
		}
 
		System.out.printf("����� ����� %c�Դϴ�.\n", grade);
	}
}
//���� ���
/*
�̸��� �Է� �ϼ���: sue
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70
����� ����� B�Դϴ�.����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/