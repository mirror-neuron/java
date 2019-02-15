/*===================================
  ■■■ 연산자(Operator) ■■■
  - 비트 단위 연산자
====================================*/

// 비트 shift 연산자

public class Test026
{
	public static void main(String[] args)
    {
		int x=128;
		
		System.out.printf("x << 3 = %d\n", x<<3);
		System.out.printf("x  * 8 = %d\n", x*8);
	
		System.out.printf("x >> 3 = %d\n", x>>3);
		System.out.printf("x / 8 = %d\n", x/8);

	    System.out.printf("x << 24 = %d\n", x<<24);
		System.out.printf("x << 25 = %d\n", x<<25);
		System.out.printf("x << 31 = %d\n", x<<31);
		System.out.printf("x << 32 = %d\n", x<<32);

	}
}


/*
	128	   → 00000000	00000000 00000000 10000000 

	128<<3 → 00000000	00000000 00000100 00000000 

	128>>3 → 00000000	00000000 00000000 00010000
*/

// 실행 결과
/*
x << 3 = 1024
x  * 8 = 1024
x >> 3 = 16
x / 8 = 16
x << 24 = -2147483648
x << 25 = 0
x << 31 = 0
x << 32 = 128
계속하려면 아무 키나 누르십시오 . . .
*/