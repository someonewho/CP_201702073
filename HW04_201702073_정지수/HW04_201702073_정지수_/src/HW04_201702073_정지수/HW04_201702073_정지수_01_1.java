package HW04_201702073_������;

import java.util.Scanner;

public class HW04_201702073_������_01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		char answer;
		System.out.println("������������ Ǯ�ڽ��ϱ�?");
		System.out.print("Ǯ������ 'Y'��, ���� �ʰڴٸ� 'N'�� ġ�ʽÿ�:");
		answer=myScanner.next().charAt(0);
		while (answer=='Y'|| answer=='y')	{
			System.out.println("������������ ����մϴ�!");
			System.out.println("�ٽ� ������������ Ǯ�ڽ��ϱ�?");
			System.out.print("Ǯ������ 'Y'��, ���� �ʰڴٸ� 'N'�� ġ�ʽÿ�:");
			answer=myScanner.next().charAt(0);
			myScanner.close();
	}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
