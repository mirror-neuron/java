/*==================================
  ���� Ŭ������ �ν��Ͻ� ����
===================================*/

// �� �ǽ� ����
// ���� ���̿� �ѷ� ���ϱ�

// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ ����������(������) �����Ѵ�.
// (Ŭ������ : CircleTest) �� CircleTest.java

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ������ �Է� : xxxx

// >> �������� xxx�� ����
// >> ���� : xxx.xx
// >> �ѷ� : xxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest2 
{
	int r;
	final double PI = 3.141592; 

	double input() throws IOException  
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());

		double result = r * r * PI;
		double result = r * 2 * PI;

		System.out.printf("\n>> �������� %d�� ����", r);
		System.out.printf("\n>> ���� : %.2f", a);
		System.out.printf("\n>> �ѷ� : %.2f\n", l);
	}
}