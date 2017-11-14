package HW04_201702073_정지수;

import java.util.Scanner;

public class HW04_201702073_정지수_02_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		char answer;
		int n;
		int even;
		int count;
		even=1;
		count=1;
		System.out.println("반복 계산을 실행하겠습니까?");
		System.out.print("실행하려면'Y'를, 중지하려면 'N'을 입력하십시오:");
		answer=myScanner.next().charAt(0);
			while (answer=='y'||answer=='Y') {
			System.out.print("n값을 입력하시오:");
			n=myScanner.nextInt();
				if (n>0) {
					while(count<=n)	{
						
						even=even*count;
						count=count+1;
					}
					
					System.out.println(n+" factorial의 값을 계산하려고 합니다. ");
					System.out.println(n+"!은 "+even+"입니다.");
				}
				else if(n==0) {
					System.out.println("0!은 1입니다.");
				}
				else 	{
					System.out.println("error");
				} 
			System.out.println("반복 계산을 실행하겠습니까?");
			System.out.print("실행하려면'Y'를, 중지하려면 'N'을 입력하십시오:");
			answer=myScanner.next().charAt(0);
			myScanner.close();
			}
		System.out.println("프로그램을 중지합니다.");
	}
}


