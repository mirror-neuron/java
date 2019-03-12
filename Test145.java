/*==================================================
	   ���� ����(Exception) ó�� ����
==================================================*/

// Test146.java�� ��~!!

class Demo
{
	private int value;	//-- value : ��������(default �� = 0���� �ڵ��ʱ�ȭ)

	// setter
	public void setValue(int value)
	{
		if(value<=0)
			return;	//-- �޼ҵ� ����

		this.value = value;
	}

	// getter
	public int getValue()
	{
		return value;
	}
}


public class Test145
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}