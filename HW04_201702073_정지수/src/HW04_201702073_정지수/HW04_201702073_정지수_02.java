package HW04_201702073_������;
import java.util.Scanner;

public class HW04_201702073_������_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner myScanner=new Scanner(System.in);
			char answer;
			int n;
			System.out.println("�ݺ� ����� �����ϰڽ��ϱ�?");
			System.out.println("�����Ϸ���'Y'��, �����Ϸ��� 'N'�� �Է��Ͻʽÿ�.");
			answer=myScanner.next().charAt(0);
			while (answer=='y'||answer=='Y') {
			System.out.print("n���� �Է��Ͻÿ�:");
			n=myScanner.nextInt();
			if (n>0) {
				System.out.print(n+" factorial ����� �����Ϸ� �մϴ�.");
				}
			else if(n==0) {
				System.out.println("0!�� 1�Դϴ�.");
			}
			else 	{
				System.out.println("error");
			}
			System.out.println("�ݺ� ����� �����ϰڽ��ϱ�?");
			System.out.println("�����Ϸ���'Y'��, �����Ϸ��� 'N'�� �Է��Ͻʽÿ�.");
			answer=myScanner.next().charAt(0);
			myScanner.close();
		}
			System.out.println("���α׷��� �����մϴ�.");
	}
	
}