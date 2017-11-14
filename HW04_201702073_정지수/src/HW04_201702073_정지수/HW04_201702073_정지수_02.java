package HW04_201702073_정지수;
import java.util.Scanner;

public class HW04_201702073_정지수_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner myScanner=new Scanner(System.in);
			char answer;
			int n;
			System.out.println("반복 계산을 실행하겠습니까?");
			System.out.println("실행하려면'Y'를, 중지하려면 'N'을 입력하십시오.");
			answer=myScanner.next().charAt(0);
			while (answer=='y'||answer=='Y') {
			System.out.print("n값을 입력하시오:");
			n=myScanner.nextInt();
			if (n>0) {
				System.out.print(n+" factorial 계산을 실행하려 합니다.");
				}
			else if(n==0) {
				System.out.println("0!은 1입니다.");
			}
			else 	{
				System.out.println("error");
			}
			System.out.println("반복 계산을 실행하겠습니까?");
			System.out.println("실행하려면'Y'를, 중지하려면 'N'을 입력하십시오.");
			answer=myScanner.next().charAt(0);
			myScanner.close();
		}
			System.out.println("프로그램을 중지합니다.");
	}
	
}