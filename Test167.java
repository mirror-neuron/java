/*================================================
	   ���� �ڹ��� �⺻ �����(I/O) ����
================================================*/

// OutputStream �ǽ�

import java.io.OutputStream;
import java.io.IOException;

public class Test167
{
	public static void main(String[] args) throws IOException
	{
		// System.in  : �ڹ��� ǥ�� �Է� ��Ʈ��(in, ��ü)
		// System.out : �ڹ��� ǥ�� ��� ��Ʈ��(out, ��ü)
		OutputStream out = System.out;		

		// �迭 ����
		byte[] ch = new byte[3];
		ch[0] = 65;		// A
		ch[1] = 97;		// a
		ch[2] = 122;	// z

		out.write(ch);	//-- ������ ������ ������ ��Ʈ���� ���.

		out.flush();	//-- ��ϵ� ��Ʈ���� �������� ����� ����.
						//   ������ Buffer �� Ȱ������ �ʰ� �ִ� ��Ȳ�̱� ������
						//   ������ ������ �ڵ�.
						//   (Buffered �Ǿ� �ִ� Stream �� ��� ���� �Ұ�)
		
		out.close();	//-- ��� ��Ʈ��(���ٱ�)�� ���� ���ҽ� �ݳ�
						//	 (out ��Ʈ���� (����������) �ᰡ���� ��Ȳ

		System.out.println("�������� �ŷڵ��� ���� �ִ� ����~!!!");
		//-- ��out.close()�� �� �ۼ��� ���� ��µ��� �ʴ� ����
		//   ��µǴ� ��Ʈ��(���ٱ�)�� �ݾұ� ������...
		
	}
}