/*===============================================
 ���� ���� �帧�� ��Ʈ�� (���) ����
 - if�� �ǽ�
================================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ ¦������ Ȧ������ �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, BufferedReader�� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� ó���ϰ�
// if���� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 37
// 37 �� Ȧ���Դϴ�.
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է� : 26
// 26 �� ¦���Դϴ�.
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
	//���� Ǯ���� ����
    /*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("������ ���� �Է� : ");

    int num;
	String strResult;

	num = Integer.parseInt(br.readLine());
	
	if (num%==2)
	{
	 System.out.printf("%d �� Ȧ���Դϴ�.", num); 
	}
    */
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
	System.out.print("������ ���� �Է� : ");
	String strData = br.readLine();

	int num = Integer.parseInt(strData);

    if(num%2==0)
    {
		System.out.printf("%d �� ¦���Դϴ�.\n", num);
    }		
	
	if(num%2!=0)
	{
		System.out.printf("%d �� Ȧ���Դϴ�.\n", num);
	}
	}
}

// ���� ���
/*
������ ���� �Է� : 3
3 �� Ȧ���Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 18
18 �� ¦���Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/