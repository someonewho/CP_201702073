package HW06_201702073_정지수;
import java.util.Scanner;
public class rid_goqha {//N보다 작은 소수찾기
	
	public static void main(String[] args)		{
		Scanner ascan=new Scanner(System.in);
		System.out.print("n을 입력하시오: ");
		int givenN=ascan.nextInt();
		int count=2, n=2;
		while(count<=givenN)	{
			int prime=1;
			int num = 2;
			while(n<count)		{
				if (count%num==0)		{
					prime=0;
				}
				num++;
				n++;		
			}
			
			if(prime==1) {
				System.out.println(count);
			}
			count++;
		}
		ascan.close();
	}
}
