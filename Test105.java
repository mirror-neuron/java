/*========================================
	■■■ 정렬(sort) 알고리즘 ■■■
	-- 향상된 버블 정렬(Bubble Sort)
=========================================*/

// ○ 실습 문제
//    사용자로부터 여러 학생의 성적 정보를 정수 형태로 입력받아
//    점수가 높은 순으로 등수를 부여하여 결과를 출력하는 프로그램을 구현한다.
//    단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1) : 나주영 90
// 이름 점수 입력(2) : 남상현 80
// 이름 점수 입력(3) : 유진석 85
// 이름 점수 입력(4) : 윤희진 75
// 이름 점수 입력(5) : 이기승 95

// ===================
// 1등 이기승 95
// 2등 나주영 90
// 3등 유진석 85
// 4등 남상현 80
// 5등 윤희진 75
// ===================
// 계속하려면 아무 키나...

import java.util.Scanner;

public class Test105
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		boolean flag;
		String temp;
	
		do
		{
			System.out.print("인원 수 입력 : ");
			num = sc.nextInt();
		}
		while (num<1);
	
		String[] name = new String[num];
		int[] score = new int[num];

		for (int i=0; i<num; i++)
		{
			System.out.printf("이름 점수 입력(%d) : ", i);
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}

		int pass=0;
		do
		{
			flag =false;
			pass++;

			for (int j=0; j<num-pass; j++)
			{
				if (score[j] < score[j+1])
				{
					// 나(j) 너(j+1) temp
					// temp = 나
					// 나 = 너
					// 너 = temp

					temp = name[j];
					name[j] = name[j+1];
					name[j+1] = temp;

					score[j] = score[j]^score[j+1];
					score[j+1] = score[j+1]^score[j];
					score[j] = score[j]^score[j+1];
					flag = true;	
				}			

			}
		}
		while (flag);
		
		int rank = 0;

		System.out.println("\n======================================");
		for (int i=0; i<num; i++)
		{
			rank++;
			if (i!=0 && score[i]==score[i-1])
			{
				rank--;
				System.out.printf("%d등 %s %d\n", rank, name[i], score[i]);
			}
			else 
			{
				System.out.printf("%d등 %s %d\n", i+1, name[i], score[i]);
			}
		}
		System.out.println("========================================");
	}
}

// 실행 결과
/*
인원 수 입력 : 3
이름 점수 입력(0) : 수연 90
이름 점수 입력(1) : 재준 85
이름 점수 입력(2) : 나래 90

======================================
1등 수연 90
1등 나래 90
3등 재준 85
========================================
계속하려면 아무 키나 누르십시오 . . .
*/