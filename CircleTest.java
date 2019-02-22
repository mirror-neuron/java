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

public class CircleTest 
{
	// ���� ���� ����
	int r;
	final double PI = 3.141592; // Final(���ȭ)�ϸ� �������� '�빮��'�� ������

	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// BufferedReader �ν��Ͻ��� ������ �����ϰ� �Ǹ�, 
	// CircleTest(class)�� �θ��� ���� ������
	// �Ź� �޸𸮸� ���� �Ҵ� �ޱ� ������
	// Ư���� ��찡 �ƴϸ� �ش� �޼ҵ� �Ʒ��� �����Ѵ�.

	// ������ �Է��ϴ� �޼ҵ� ����
	void input() throws IOException  //-- br.readLine()�� ��� ������ ������ ��찡 ����� ����
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}

	// ���� ���� �޼ҵ� ����
	double calArea()
    {
		// return r * r * PI;
		double result;
		result = r * r * PI;
		return result;
	}

	// ���� �ѷ� �޼ҵ� ����
    double calLength()
	{
		//return r * 2 * PI;
		double result = r * 2 * PI;
		return result;
	}

	// ��� �޼ҵ� ����
	void print(double a, double l)
	{
		System.out.printf("\n>> �������� %d�� ����", r);
		System.out.printf("\n>> ���� : %.2f", a);
		System.out.printf("\n>> �ѷ� : %.2f\n", l);
	}

}