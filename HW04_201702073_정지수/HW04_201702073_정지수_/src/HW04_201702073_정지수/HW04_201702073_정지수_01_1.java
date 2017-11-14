package HW04_201702073_정지수;

import java.util.Scanner;

public class HW04_201702073_정지수_01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		char answer;
		System.out.println("이차방정식을 풀겠습니까?");
		System.out.print("풀겠으면 'Y'룰, 플지 않겠다면 'N'를 치십시오:");
		answer=myScanner.next().charAt(0);
		while (answer=='Y'|| answer=='y')	{
			System.out.println("이차방정식을 계산합니다!");
			System.out.println("다시 이차방정식을 풀겠습니까?");
			System.out.print("풀겠으면 'Y'룰, 플지 않겠다면 'N'를 치십시오:");
			answer=myScanner.next().charAt(0);
			myScanner.close();
	}
		System.out.println("프로그램을 중지합니다.");
	}
}
