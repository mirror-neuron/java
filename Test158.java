/*================================================
	   ���� �÷��� (Collection) ����
================================================*/

// �� �ǽ� ����
// ���� �ۼ����� Test158 Ŭ������ �ϼ��Ͽ� 
// ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 1

	1��° ��� �Է� : ���Ѿ�
	1��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? : y

	2��° ��� �Է� : ��ȫ��
	2��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? : n


	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		���Ѿ�
		��ȫ��
    ���� ��ü ��� �Ϸ�~!!


	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : ���Ѿ�

	[�˻� ��� ���]
	�׸��� �����մϴ�.(cf. �׸��� �������� �ʽ��ϴ�.)

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ���ȯ

	[���� ��� ���]
	�׸��� �������� �ʾ� ������ �� �����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ��ȫ��
	������ ���� �Է� : �輱��

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 6

	���α׷� ����
	����Ϸ��� �ƹ� Ű��........
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menues
{
	public static final int E_ADD = 1;		//-- ��� �߰�
	public static final int E_DISP=2;		//-- ��� ���
	public static final int E_FIND=3;		//-- ��� �˻�
	public static final int E_DEL=4;		//-- ��� ����
	public static final int E_CHA=5;		//-- ��� ����
	public static final int E_EXIT=6;		//-- ����
}

public class Test158
{
	// �ֿ� �Ӽ� ����
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;					//-- ���� ��
	private static String con;					//-- ��� ����

	// static �ʱ�ȭ ��
	static 
	{
		// Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		// BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	// �޴� ��� �޼ҵ�
	public static void menuDisp() throws IOException
	{
		System.out.print("\n[�޴� ����]\n1. ��� �߰�\n2. ��� ���\n3. ��� �˻�\n4. ��� ����\n5. ��� ����\n6. ����\n");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException
	{
		do
		{
			System.out.print(">> �޴� ����(1~6) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>6);
	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
		case Menues.E_ADD : addElement(); break;
		case Menues.E_DISP: dispElement(); break;
		case Menues.E_FIND: findElement(); break;
		case Menues.E_DEL : delElement(); break;
		case Menues.E_CHA : chaElement(); break;
		case Menues.E_EXIT : exit(); break;
		}
	}

	// ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException 
	{
		do
		{
			System.out.printf("%d��° ��� �Է� : ", vt.size()+1);
			vt.add(br.readLine());
			System.out.printf("%d��° ��� �Է� ����~!!!\n", vt.size());

			System.out.print("��� �Է� ���(Y/N)? : ");
			con = br.readLine();
		}
		while (con.equals("Y") || con.equals("y")); 
	}

	// ��� ��� �޼ҵ�
	public static void dispElement() throws IOException
	{
		System.out.println("[���� ��ü ���]");

		if (vt.size()==0)
		{
			System.out.print("���Ͱ� ����ֽ��ϴ�.");	
		}
		else 
		{
			/*
			for (Object n : vt)
			{
				System.out.println("    " +n);
			}
			*/




		}
	}

	// ��� �˻� �޼ҵ�
	public static void findElement() throws IOException 
	{
		System.out.print("\n�˻��� ��� �Է� : ");
		int i = vt.indexOf(br.readLine());
		System.out.println("[�˻� ��� ���]");
		if (i>-1)
		{
			System.out.println("�׸��� �����մϴ�.");
		}
		else 
		{
			System.out.println("�׸��� �������� �ʽ��ϴ�.");
		}
		System.out.println();
	}

	// ��� ���� �޼ҵ�
	public static void delElement() throws IOException 
	{
		System.out.print("\n������ ��� �Է� : ");
		int i = vt.indexOf(br.readLine());
		System.out.println("[���� ��� ���]");
		if (i>-1)
		{
			System.out.println("���� �Ϸ�.");
			vt.remove(i);
		}
		else 
		{
			System.out.println("������ ��Ұ� �������� �ʽ��ϴ�.");
		}
	}
	
	// ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		System.out.print("\n������ ��� �Է� : ");
		int i = vt.indexOf(br.readLine());
		
		System.out.println("[���� ��� ���]");
		if (i>-1)
		{
			System.out.println("������ ��Ұ� �����մϴ�.");
			System.out.println("������ ������ �Է����ּ���.");
			String name = br.readLine();
			vt.setElementAt(name, i);
		}
		else
		{
			System.out.println("������ ��Ұ� �������� �ʽ��ϴ�.");
		}
	}

	// ���α׷� ���� �޼ҵ� -- �ϼ�~!!!
	public static void exit() 
	{
		System.out.println("\n\t���α׷� ����~!!!");
		System.exit(-1);
	}

	// main() �޼ҵ� -- �ϼ�~!!!
	public static void main(String[] args) throws IOException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}
