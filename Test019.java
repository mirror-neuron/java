/*===========================================
   ���� �ڹ��� �⺻ ���α׷��� ����
   - �ڹ��� �⺻ ����� : java.util.Scanner
=============================================*/

// �� java.utill.Scanner
//	  �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	  ����Ʈ(default)�� ���Ǵ� �ܶ� ���ڴ� �����̴�.
//	  �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
//	  �ٸ� ������ ������ ��ȯ�� �� �ִ�.
import java.util.Scanner;

public class Test019
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String name;
		int kor, eng, mat, tot;

		System.out.print("�̸�,����,����,���� �Է�(��,������) : ");

		//sc = new Scanner(sc.next()).useDelimiter("���ڿ��� ���ڿ� ������ ,");
		//sc = new Scanner(sc.next()).useDelimiter("\\s* �� \\s* ������ ,");
		sc = new Scanner(sc.next()).useDelimiter("\\s*" "\\s*");

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		System.out.println();
		System.out.printf("�̸� : %s%n", name);
		System.out.printf("���� : %d%n", tot);


	}
}

// ���� ���
/*
�̸�,����,����,���� �Է�(��,������) : ������,90,80,70

�̸� : ������
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
