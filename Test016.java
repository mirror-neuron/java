/*===========================================
 ���� �ڹ��� �⺻ ���α׷��� ����
 - �ڹ��� �⺻ ����� : printf()
============================================*/

public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("ccc\n");  //-- ��\n�� ����

		// ���� ��� �޼ҵ�
		System.out.printf("1234567890");
		System.out.printf("1234567890\n");	//-- ��\n�� ����
		System.out.printf("1234567890%n");  //-- ��%n�� ����
		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		//--==>> AAABBBccc
		//		12345678901234567890
		//		1234567890
		//		10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123);
		System.out.printf("%010d\n", 123);
		//--==>> 123
		//		        123(�� 10�ڸ�, ���ڴ� ���� ����/ ���ڴ� ���� ����)
		//		 0000000123

		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		//--==>> +365
		//		 +365

		System.out.printf("%d\n", +365);
		//--==>> 365

		//System.out.printf("%-d\n", 365);  //-- ��Ÿ�� ���� �߻�
											//   (�Ű������� �Ҽӵ� �޼ҵ尡 ���� �Ǵ�, �����Ϸ��� ������ Ȯ���� �� ����)
		System.out.printf("-%d\n", 365);
		System.out.printf("%d\n", -365);
		//--==>> -365
		//		 -365

		System.out.printf("%(d\n", -365);
		System.out.printf("%(d\n", 365);
		//--==>> (365) �� ��ȣ�� ����ġ���� ������ �������� ���� ����
		//		  365

		//System.out.printf("%d\n", 'A');		//-- ��Ÿ�� ���� �߻�
		System.out.printf("%c\n", 'A');
		//System.out.printf("%c\n", "ABCD");	//-- ��Ÿ�� ���� �߻�
		System.out.printf("%s\n", "ABCD");
		//--==>> A
		//		 ABCD

		System.out.printf("%h\n", 365);			//-- %h = 16���� 
		System.out.printf("%o\n", 24);			//-- %o = 8����
		//--==>> 16d
		//		 30

		System.out.printf("%s\n", "true");
		System.out.printf("%b\n", true);		//--%b = boolean
		//--==>> true
		//		 true

		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23);
		System.out.printf("%.2f\n", 123.236);		
		System.out.printf("%8.2f\n", 123.236);
		System.out.printf("%2.2f\n", 123.1234);
		//--==>> 123.230000
		//		 123.23
		//		   123.24
		//       123.12

		//--==>
	}
}