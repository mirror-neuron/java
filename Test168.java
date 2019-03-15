/*================================================
	   ���� �ڹ��� �⺻ �����(I/O) ����
================================================*/

// Reader �ǽ�(Test166 �� ��~!!)

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test168
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;

		// System.in         : �ڹ��� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ��
		// InputStreamReader : ����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ
		//					   (��ȯ��, ������ ���� ����)
		// Reader            : ���� ��� ��Ʈ�� ��ü(cf. writer)
		Reader rd = new InputStreamReader(System.in);


		System.out.println("���ڿ��� �Է�(����:Ctrl+z)");


		// read() : InputStream Ŭ������ ��ǥ�� �޼ҵ� (�� ����Ʈ ��Ʈ��)
		while ( ( data = rd.read() ) != -1  )
		{
			ch = (char)data;

			// print() : ���� ��Ʈ�� 
			//System.out.print(ch);		
			//--==>>
			/*
			���ڿ��� �Է�(����:Ctrl+z)
			1234
			1234
			abcd
			abcd
			�����ٶ�
			�����ٶ�
			??
			??
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/

			// write() : OutputStream Ŭ������ ��ǥ�� �޼ҵ�(�� ����Ʈ ��Ʈ��)
		    System.out.write(ch);	//-- �ѱ۱���
			//--==>> ���ڿ��� �Է�(����:Ctrl+z)
			/*
			���ڿ��� �Է�(����:Ctrl+z)
			1234
			1234
			abcd
			abcd
			�����ٶ�
			 ��|
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/

		}
	}
}