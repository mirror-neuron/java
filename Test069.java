/*=====================================
  ���� ���� ������ ���� ���� ����
  - ���� ������ �ʱ�ȭ �׽�Ʈ �ǽ�
======================================*/

// Test068.java �� ���ϱ�!!

public class Test069
{
	// ���� ���� ���� (=�۷ι� ����)
	int a;
	//-- ���� ������ ����ϴ� �������� �ʱ�ȭ�� �������� �ʾ��� ���
	//   �ڵ����� 0���� �ʱ�ȭ ���� (cf. boolean �� false, char �� " ", double �� 0.0)

	boolean b;

	char c;

	double d;
	
	public static void main(String[] args)
	{
		//System.out.println("a : " + a);
		//static�� �ν��Ͻ����� ���� �޸𸮸� �Ҵ�ޱ� ������ ��µ� �� ����

		// Test069 ����� �ν��Ͻ� ����
		Test069 ob = new Test069();

		System.out.println("ob.a : " + ob.a);	
		//--==>> ob.a : 0 

		System.out.println("ob.b : " + ob.b);
		//--==>> ob.b : false

		System.out.println("ob.c : " + ob.c);
		//--==>> ob.c :

		System.out.println("ob.d : " + ob.d);
		//--==>> ob.d : 0.0
	}
}