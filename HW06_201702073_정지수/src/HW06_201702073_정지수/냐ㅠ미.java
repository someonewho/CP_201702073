package HW06_201702073_������;
import java.util.Scanner;
public class �Ĥй� {//n���� a���� ¦�� ã��

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ascan=new Scanner(System.in);
		System.out.println("ó������ ���������� �Է��ϼ���: " );
		int a= ascan.nextInt();
		int n= ascan.nextInt();
		while(a<=n)		{
			while(a<=n)		{
					if(a % 2 == 0) {
						System.out.println(a);
					}
					a++;
				}
		System.out.println("ó������ ���������� �Է��ϼ���: " );
		a= ascan.nextInt();
		n= ascan.nextInt();
		ascan.close();
		}
	}
}
