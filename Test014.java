/*========================================
���� �ڹ��� �⺻ ���α׷��� ����
- ������ �ڷ���
- �ڹ��� �⺻ ����� : BufferedReader
=========================================*/

// ����ڷκ��� �̸��� ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : �ѽ¿�
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70

// ==== [���] ====
// �̸� : �ѽ¿�
// ���� : 240
// ================
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

	//int name;			 //-- �̸�
    String strName;	
    int nKor, nEng, nMat, nTot;  // ����, ����, ����, ���� ����
	 	
	//�߰����� ����
	String strTemp;		// ���ڿ� ������ �ӽ� ���� ����

	//���� �� ó��
	//����ڿ��� �ȳ� �޼��� ���(�̸��Է¾ȳ�)
    System.out.print("�̸��� �Է��ϼ��� : ");
 
	//����ڰ� �Է��� ���� ������ ��Ƴ���
	strName = br.readLine();
	System.out.print("���� ������ �Է��ϼ��� : ");

	strTemp = br.readLine();		      // ���ڿ� �ӽ� ����
	nKor = Integer.parseInt(strTemp);	  // �ӽ����� �����͸� ��ȯ �� �������� ������ ��Ƴ���

	System.out.print("���� ������ �Է��ϼ��� : ");

	// ����ڰ� �Է��� ���� ������ ��Ƴ���

	strTemp = br.readLine();			// ���ڿ� �ӽ� ����(���� ���� ������ �����)
    nEng = Integer.parseInt(strTemp);	// �ӽ����� �����͸� �� ��ȯ �� �������� ������ ��Ƴ���

	System.out.print("���� ���� �Է� : ");

    strTemp = br.readLine();			// ���ڿ� �ӽ� ����(���� ���� ������ �����)
    nMat = Integer.parseInt(strTemp);	// �ӽ����� �����͸� �� ��ȯ �� �������� ������ ��Ƴ���
	
	// �Է��� �����͵� �����Ͽ� ���� �����ϱ�
	nTot = nKor + nEng + nMat;

	System.out.println("\n======== [���] =========");   // ����
	System.out.println("�̸� : "+strName);
	System.out.println("���� : "+nTot);
    System.out.println("===========================");	
	}
}

// ���� ���
/*
�̸��� �Է��ϼ��� : �ѽ¿�
���� ������ �Է��ϼ��� : 90
���� ������ �Է��ϼ��� : 80
���� ���� �Է� : 70

======== [���] =========
�̸� : �ѽ¿�
���� : 240
===========================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/