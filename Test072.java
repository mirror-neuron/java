/*==================================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ���� ���� �ǽ�
===================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �� ������ ���� �����Ͽ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ����, �Է� ó�� �������� BufferedReader �� readLine() �� ����ϸ�,
// �Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~1000) : 1002
// ������ ���� �Է�(1~1000) : -20
// ������ ���� �Է�(1~1000) : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ϸ��� �ƹ� Ű�� ��������...


// �� ���� Ǯ���� ����
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CalSum
{

	int num;	
	int sum=0;  

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			num = Integer.parseInt(br.readLine());
		}
		while (num<1 || num>1000);
	}

	int sum()
	{
		return sum = (num*(num+1)/2);
		
	}
	void print()
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d", num, sum); 
	}
}

public class Test072
{	
	public static void main(String[] args) throws IOException
	{
		CalSum ob = new CalSum();

		ob.input();
		int tot = ob.sum();
		ob.print();
	}
}

// ���� ���
/*
������ ���� �Է�(1~1000) : 2020
������ ���� �Է�(1~1000) : -8
������ ���� �Է�(1~1000) : 1000
>> 1 ~ 1000 ������ �� : 500500����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/