package HW04_201702073_������;

import java.util.Scanner;

public class HW04_201702073_������_02_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner myScanner=new Scanner(System.in);
			char answer;
			int n;
			int even;
			int count;
			even=1;
			count=1;
			System.out.println("�ݺ� ����� �����ϰڽ��ϱ�?");
			System.out.print("�����Ϸ���'Y'��, �����Ϸ��� 'N'�� �Է��Ͻʽÿ�:");
			answer=myScanner.next().charAt(0);
			
			while (answer=='y'||answer=='Y') {
			System.out.print("n���� �Է��Ͻÿ�:");
			n=myScanner.nextInt();
			if (n>0) {
				while(count<=n)	{
					
					even=even*count;
					count=count+1;
					}System.out.println(n+" factorial�� ���� ����Ϸ��� �մϴ�. ");
					System.out.println(n+" !��"+even+"�Դϴ�.");
			}
			else if(n==0) {
				System.out.println("0!�� 1�Դϴ�.");
			}
			else 	{
				System.out.println("error");
			}
			System.out.println("�ݺ� ����� �����ϰڽ��ϱ�?");
	System.out.print("�����Ϸ���'Y'��, �����Ϸ��� 'N'�� �Է��Ͻʽÿ�:");
	answer=myScanner.next().charAt(0);
	myScanner.close();
	}
	System.out.println("���α׷��� �����մϴ�.");
	}
	}

