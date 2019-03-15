/*================================================
	   ���� �ڹ��� �⺻ �����(I/O) ����
================================================*/

// Reader Writer �ǽ�

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Test170
{
	public void process(InputStream is)
	{
		int data;

		System.out.println("���ڿ� �Է�(����:Ctrl+z)");

		try
		{
			// �Ű����� is ��� ����Ʈ ����� �Է� ��Ʈ�� ��ü(InputStream)��
			// ���� ��Ʈ������ ��ȯ�Ͽ� Reader Ÿ���� rd ���� ������ �� �ֵ��� ó��.
			Reader rd = new InputStreamReader(is);

            // ����Ʈ ��� ��Ʈ���� �ڹ� �⺻ ��� ��Ʈ�� ��ü(System.out)��
			// ���� ��Ʈ������ ��ȯ�Ͽ� Writer Ÿ���� wt ���� ������ �� �ֵ��� ó��.
			Writer wt = new OutputStreamWriter(System.out);
			
			while ((data=rd.read()) != -1)
			{
				wt.write(data);		//-- ��Ʈ�� ���ٱ⿡ ���(�Ѷ� �Ѷ�...)
				wt.flush();			//-- ����� ��Ʈ���� �о�� ������
			}

		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args)
	{
		// Test170 Ŭ���� �ν��Ͻ� ����
		Test170 ob = new Test170();
		ob.process(System.in);
	}
}

// ���� ���
/*
���ڿ� �Է�(����:Ctrl+z)
1234
1234
abcd
abcd
�����ٶ�
�����ٶ�
^Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/