/*==================================================
	   ���� ����(Exception) ó�� ����
==================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test144
{
	private String[] data = new String[3];

	public void proc() //throws IOException (�� try ~ catch �� ����ó��)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n=0;

		try
		{	
			System.out.print("�̸� �Է�[����:Ctrl+z] : ");

			while ((str=br.readLine()) != null)
			{
				data[n++]=str;
				System.out.print("�̸� �Է�[����:Ctrl+z] : ");
			}	
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("���� �߻�~!!!");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString : " + e.toString());
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
		catch (IOException e)		//���ܵ� ��ü��(e :��������)
		{
			System.out.println(e.toString()); // ���⿡���� toString(): exception�� ������ �ִ� to String()(object or string X)
		}
		
		System.out.println("�Էµ� ����...");
		for (String s: data)
		{
			/*
			System.out.println(s);
			*/
			if (s != null)
			{
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) //throws IOException 
	{
		Test144 ob = new Test144();
		ob.proc();
	}
}

// ���� ���
/*
�̸� �Է�[����:Ctrl+z] : �����
�̸� �Է�[����:Ctrl+z] : �Դ���
�̸� �Է�[����:Ctrl+z] : ������
�̸� �Է�[����:Ctrl+z] : ^Z
�Էµ� ����...
�����
�Դ���
������

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
�̸� �Է�[����:Ctrl+z] : �����
�̸� �Է�[����:Ctrl+z] : �Դ���
�̸� �Է�[����:Ctrl+z] : ������
�̸� �Է�[����:Ctrl+z] : ������
���� �߻�~!!!
getMessage : 3
toString : java.lang.ArrayIndexOutOfBoundsException: 3
printStackTrace...
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test144.proc(Test144.java:26)
        at Test144.main(Test144.java:52)
�Էµ� ����...
�����
�Դ���
������

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
�̸� �Է�[����:Ctrl+z] : �����
�̸� �Է�[����:Ctrl+z] : ^Z
�Էµ� ����...
�����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/