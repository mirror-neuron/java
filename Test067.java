/*==============================================
  ���� �żҵ� ���ȣ�� (��� �޼ҵ�) ����
==============================================*/

public class Test067
{
	public static void main(String[] args)
	{
		showHi(3);
	}
	public static void showHi(int cnt)
	{	
	
		//����
		/*
		System.out.println("Hi~!!"); 
		showHi(cnt--);
		if (cnt==1)			
			return;
		*/

    	System.out.println("Hi~!!"); 
		if (cnt==1)			// cnt==1�� �Ǵ� ���� �޼ҵ� ����
			return;
		
		showHi(--cnt);		// ���� 1�� ���ҽ�Ű�Ƿ� cnt�� 3��2��1 ������ ���� ��
		 				
	}
}


