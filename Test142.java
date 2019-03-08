/*==================================================
	   ���� ����(Exception) ó�� ����
==================================================*/

/*
�� ���α׷����� �߻��ϴ� ����(Error)
   
   �� �߸��� ������ ����ϰų� ���� ���� �������� ���� ���¿���
      ��������ν� ������ �ܰ迡�� �߻��ϴ� ������ ����(Error)
	 
   �� ���α׷��� �����ϴ� �������� �߻��Ǵ� ��Ÿ�� ����(Error)�� ���� �� �ִ�.

      - �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ����
	    ������ ����� �������� �Ǵ� �������� ����(Error)��

	  - �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����(Error), �׸��� 
	  
	  - ���α׷� ���� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ�
	    ���ܻ���(Exception)�� �ִ�.

		���� ���,
		�� � ���� 0���� �����ų�...
		�� �迭 ÷�ڸ� ����� ��Ȳ�� �߻��ϰų�...
		�� �������� �ʴ� ������ �����Ͽ� �о���δٰų�...

==> �����ڰ� �̷� ���� ������ �߻��� ��츦 �̸� �����Ͽ�
    ������ �����ϱ� ���� ������ �����ϵ��� ������ �����س��� ��.
	��. ��. ó. ��.


�� �����س��� ����~!!! (�� Exception Ŭ����)

   - ���ܴ� ���α׷� ���� �� �߻��� �� �ִ�
     ���ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ��
	 �ڹٿ��� '����'�� �ϳ��� ������Ʈ(Object, ��ü)�̴�.

   - ���α׷� ���� �߿� "�޼ҵ� ��"���� ����(Error)�� �߻��ϰ� �� ���,
     �޼ҵ�� �� ������ �ش��ϴ� [ ���� ������Ʈ ]�� �����
	 �װ��� �ڹ� ��Ÿ�� �ý���(Runtime System)�� �������ش�.

   - �ڹٿ����� ��� ���� Ŭ������ Throwable Ŭ������
     Throwable Ŭ������ ���� Ŭ������ ��ӹ޾� ����Ѵ�.

   - Throwable Ŭ������ ���ܸ� �����ϴ� �����̳�
     ���ܰ� �߻��� ���� ���α׷��� ���¿� ���� ������ �����ϰ� �ִ�.

   - Throwable Ŭ�������� �Ļ��� Ŭ����

     �� Exception Ŭ����
	    Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
		������ �� �ִ� ���� ��Ȳ���� �޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��.

	 �� Error Ŭ����
	    �ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ �����̴�.


�� ������ ����

   - checked exception
     �޼ҵ� ������ ���ܰ� �߻��� ���
	 �޼ҵ带 ������ �� ��throws�� ���� �޼ҵ� ������ �߻��� �� �ִ� 
	 ���ܵ��� �������ְų� �Ǵ� �� ���ܸ� ��try~catch�� �ؼ� 
	 ó�����־�߸� �ϴ� �����̴�.
	 �����Ϸ��� ������ �ϴ� �������� ��checked exception����
	 ��throws�� �Ǵ°��� ���γ� Ȥ�� ��try~catch�� �Ǵ����� ���θ� �Ǵ��Ͽ�
	 ���α׷����� ���ܸ� ó������ ������ ������ ��ü�� �Ұ����ϴ�.

   - unchecked exception
	 ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ�...
	 ��Ÿ�� �ÿ� �߻��ϴ� ����.

	
�� java.lang.Throwable Ŭ������ �ֿ� �޼ҵ�
   - String toString()
     : Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
   - void printStackTrace(PrintStream s)
   - void printStackTrace(PrintWriter w)
     : ǥ�� ��� ��Ʈ���� ���� ȣ�� ����� ������ �޼ҵ���� ����Ѵ�.

�� �ֿ� ��Ÿ�� ���� Ŭ����
   - ArithmeticException
     : ��ġ ������ ���� (0���� ������ ��)
   - ArrayStoreException
     : �迭�� �߸��� ������ ���� �����Ϸ� ���� �� �߻��ϴ� ����
   - IndexOufOfBoundsException
     : �迭, ���ڿ�, ���� ��� �ε��� ������ ��� ��� �߻��ϴ� ����
   - ClassCastException
     : Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����
   - NullPointerException
     : �� ��ü�� �����ϴ� ���(�ʱ�ȭ ���� ���� ���� ��� ��) �߻��ϴ� ����
   - securityException
     : �ڹ��� ���� ���� ������ �����Ͽ��� ��� �߻��ϴ� ����

			:
			:
			:
   - �Ʒ��� ��찡 �� �ٸ� �� ���� �����ؾ� ��~!!!
			������Ʈ.toString();
			���ڿ�.toString();
			����.toString();
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test142
{											// �� 
	public static void main(String[] args)	// throws IOException
	{
		// BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		int a, b, c;

		// ��
		/*
		try	// try~catch ����~!!!
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("��� : " + c);
		}
		catch (IOException e)		// ���������� e : �ĺ��ڸ� �ٿ� ���ܰ� ������ �� �ҷ���
		{
			// IOException �� checked exception
			//-- �޼ҵ带 �����ϴ� �������� throws �� ����.
			//   ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.
			System.out.println(e.toString());
		}
		*/

		// ��
		/*
		try	
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("��� : " + c);
		}
		catch (IOException e1)				
		{
			System.out.println(e1.toString());
		}
		catch (NumberFormatException e2)
		{
			// NumberFormatException �� unchecked exception
			//-- ��Ÿ�� �� �߻��� �� �ִ� ���ܷ�
			//   �ݵ�� ���� �ʿ䵵, ��Ƴ� �ʿ䵵 ����.
			System.out.println(e2.toString());
			System.out.println("���� ������ �����͸� �Է��ϼ���~!!!");
		}	
		*/

		// ��
		/*
		try	
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("��� : " + c);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}	
		*/

		// etc...
		try	
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("��� : " + c);
		}
		catch (IOException e1)				
		{
			System.out.println(e1.toString());
		}
		catch (NumberFormatException e2)
		{
			System.out.println("���� ������ �����͸� �Է��ϼ���~!!!");
		}
		finally 
		{
			// ���ܰ� �߻��ϰų� �߻����� �ʰų� ������ ����Ǵ� ����
			System.out.println("���� �����̽��ϴ�. �����մϴ�.");
		}
	}
}