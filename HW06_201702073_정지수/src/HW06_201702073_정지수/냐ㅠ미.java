package HW06_201702073_정지수;
import java.util.Scanner;
public class 냐ㅠ미 {//n부터 a까지 짝수 찾기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ascan=new Scanner(System.in);
		System.out.println("처음값과 마지막값을 입력하세요: " );
		int a= ascan.nextInt();
		int n= ascan.nextInt();
		while(a<=n)		{
			while(a<=n)		{
					if(a % 2 == 0) {
						System.out.println(a);
					}
					a++;
				}
		System.out.println("처음값과 마지막값을 입력하세요: " );
		a= ascan.nextInt();
		n= ascan.nextInt();
		ascan.close();
		}
	}
}
