/*==================================================
	   ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	   - StringTokenizer Ŭ����
==================================================*/

/*
�� StringTokenizer Ŭ������
   ���ڿ� �Ľ�(parsing)�� ���� ������ �����ϴ� Ŭ������
   �Ľ�(parsing)�ϰ��� �ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�,
   ���⿡�� �Ľ�(parsing)�̶� �ϳ��� ���ڿ��� ���� ���ڿ���
   ������ �۾��� �ǹ��ϰ� �Ǹ�, �� �� ������ ������ �Ǵ� ���ڿ���
   ��ū(token)�̶�� �Ѵ�.

   StringTokenizer Ŭ������ ����ϱ� ���ؼ���
   java.util ��Ű���� StringTokenizer �� import �ؾ��Ѵ�.

   StringTokenizer Ŭ������ ȣȯ���� �����ϴ� ��������
   ���� �����ǰ� ������ ���ڿ��� �Ľ�(parsing)�ϱ� ���ؼ���
   String Ŭ������ split() �޼ҵ峪 java.util.regex ��Ű���� 
   ����� ���� �����ϰ� �ִ�.
   (�� �ǹ����� �� �� ����, but �÷����� ������ ����� ������ ��� �� ����.)

�� ������
   - ����
     StringTokenizer(String str)
	 StringTokenizer(String str, String delim)
	 StringTokenizer(Stirng str, String delim, boolean returnDelims)
	 �� �־��� ���ڿ� str�� �ܾ�� �и��ϴ� ��ü�� �����ϸ�
	    ����(����) ���ڴ� delim�� ���Ե� ���ڷ� ó���ϰ� �ȴ�.
		���� returnDelims �� true ���... ����(����)���ڵ� 
		�и��� ��ȿ�� �����ͷ� �����Ѵ�.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test135
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�Ľ��� ���ڿ� �Է�(�ĸ� ����) : ");
		strTemp = br.readLine();
		//-- "���,����,�ٳ���,������"

		// StringTokenizer Ŭ���� �ν��Ͻ� ����
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//-- strTemp �� ��� ���ڿ���...
		//   ��,���� �����ڷ�...

		// Ȯ��
		System.out.println(st.countTokens());	//--==>> 4
		//-- ��int coundTokens()��
		//   : �Ľ̵� ���ڿ��� ������ ����(��ȯ)�Ѵ�.

		//strArr = new String[st.countTokens()];
		//-- �迭���� ������ ��ū ���ҵ� ������ŭ �����Ѵ�.

		n=0;
		 
		while (st.hasMoreTokens())
			strArr[n++] = st.nextToken();
		//-- ��hasMoreTokens()��
		//	  : ����� �� �ִ� ��ū�� �����ִ� ��� true �� ��ȯ
		//      �� �̻� ����� ��ū�� �������� ���� ��� false �� ��ȯ.
		//      Ȯ�� ����� ��ȯ�� ��... ��带 �̵���Ű���� �ʴ´�.

		//-- ��nextToken()��
		//    : ���� ��ū�� ���´�.
		//      ���� ��ū�� ������ ��带 �̵���Ű�� �ȴ�.
		//      ���� �����ڸ� �ٲپ��� ��� ���� ȣ�⿡��
		//      �ٲ� �����ڸ� �̿��Ͽ� ��ū�� �и��Ѵ�.
	
		
		System.out.print("�Ľ̵� ��ū(���ڿ�) : ");
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();

	}
}

// ���� ���
/*
�Ľ��� ���ڿ� �Է�(�ĸ� ����) : ���, ����, ������, �ٳ���, ����, ����
�Ľ̵� ��ū(���ڿ�) : ���  ����  ������  �ٳ���  ����  ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/