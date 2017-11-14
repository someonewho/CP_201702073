package HW06_201702073_정지수;
import java.util.Scanner;
public class ㄴ냐뭏 {//시그마와 팩토리얼

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ascan=new Scanner(System.in);
		System.out.print("시그마의 처음값과 마지막 값을 쓰시오: ");
		int a=ascan.nextInt();
		int z=ascan.nextInt();
		if (a<=z)	{
			System.out.println(sigma(z)-sigma(a));
		}
		else	{
			System.out.println(sigma(a)-sigma(z));
		}
		System.out.print("aPb계산을 위한 a, b값을 쓰시오: ");
		int m=ascan.nextInt(), n=ascan.nextInt();
		if(n>=m)	{
			System.out.println(factorial(n)/factorial(m));
		}
		else	{
			System.out.println(factorial(m)/factorial(n));
		}
		ascan.close();
		
	}
	private static int sigma(int n)	{
		int count=0, sum=count;
		
		while(count<=n)		{
			sum=sum+count;
			count++;
		}
		return sum;
	}
	private static int factorial(int n)	{
		int fact=1;
		int count=1;
		while(count<=n)		{
			fact=fact*count;
			count++;
		}
		return fact;
	}
}
