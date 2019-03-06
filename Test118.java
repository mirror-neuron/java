/*========================================
	���� Ŭ���� ��� ����
	- ��ø Ŭ����
=========================================*/

class Test2
{
	static int a=10;	// ��������, �������, static ����(Ŭ���� ����)
	int b=20;			// ��������, �������, instance ����(�ν��Ͻ� ����)

	// �� ù ��° write() �޼ҵ�
	void write()
	{
		System.out.println("write()...��");
		final int c=30;		// ��������, ���ȭ�� ����(���� ������ �ʴ� ����)
		int d=40;			// ��������, ���� ���÷� ���� �� �ִ� ����

		// �� ���� c �� ���� d �� �� �� ��������������...
		//    c�� final �����̱� ������
		//    �� ��° write() �޼ҵ忡�� ���� �����ϴ���
		//    ������ ������ ������� �� �ִ�.
		//    �ݸ鿡 d �� �� ���� ���÷� ������ �� �ִ� ��Ȳ�̹Ƿ�
		//    LocalTest Ŭ������ �ν��Ͻ� ���� ������
		//    ������� �� ���� ������ d �� �����ϴ� ���� ���ؾ� �Ѵ�.

		// �޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(lcoal class)
		class LocalTest	//-- ���� Ŭ����
		{
			// �� �� ��° write() �޼ҵ�
			void write()
			{
				System.out.println("write()... ��");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				//System.out.println("d : " + d);	//--==>> ������ ����
			}
		}

		d=10;

		// ù ��° write() �޼ҵ忡�� ������ ���� Ŭ������ �ν��Ͻ�
		LocalTest ob1 = new LocalTest();
		d=30;
		ob1.write();	//-- �� ��° write() �޼ҵ� ȣ��
	}
}

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test118
{
	public static void main(String[] args)
	{
		Test2 ob2 = new Test2();
		ob2.write();	//-- ù ��° write() �޼ҵ� ȣ��
	}
}

// ���� ���
/*
write()...��
write()... ��
a : 10
b : 20
c : 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/