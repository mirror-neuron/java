/*===========================================
	���� �ڹ� �⺻ ���α׷��� ����
	- �ڹ� �ҽ��ڵ� �Է� �� ������
	- ������ �ڷ���
============================================*/

public class Test003
{
	public static void main(String[] args)
	{
		// ���� ����
		int a;

		// ���� �ʱ�ȭ(���� a�� 10�� ����)
		a = 10;

		// ���� ���� �� �ʱ�ȭ 
		int b = 20;
		
		// ���� ����
		int c;

		// ���� �� ó��(a�� b�� ���� ������ ������� c�� ����)
		c = a + b;
		
		// ��� ���
		//System.out.println(c);
		//--==>> 30		

		// ��� ���
		//System.out.println(a b c);
		//--==>> ���� �߻�(������ ����)
		
		// ��� ���
		//System.out.println("a : " + a);
		//--==>> a : 10

		/* �� ���� ������(+)
			  �ǿ����� �� ��� �ϳ��� ���ڿ� ������ �����Ͱ� �����Ѵٸ�
			  ��� �����ڷν��� ����� �����ϴ� ���� �ƴ϶�
			  ���ڿ� ���� �����ڷν��� ����� �����ϰ� �ȴ�. */
		// ��� ���
		//System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		//--==>> a : 10, b : 20, c : 30

		/* 
		���� a : 10
		���� b : 20
		a�� b�� ���� ����� : 30
		*/
		// ��� ���
		System.out.println("���� a : " + a + "\n���� b : " + b + "\na�� b�� ���� ����� : " + c);

		System.out.println("���� a : " +  a);
		System.out.println("���� b : " +  b);
		System.out.println("a�� b�� ���� ����� :" + c);
		

	}
}