package HW06_201702073_������;
import java.util.Scanner;
public class rid_goqha {//N���� ���� �Ҽ�ã��
	
	public static void main(String[] args)		{
		Scanner ascan=new Scanner(System.in);
		System.out.print("n�� �Է��Ͻÿ�: ");
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
