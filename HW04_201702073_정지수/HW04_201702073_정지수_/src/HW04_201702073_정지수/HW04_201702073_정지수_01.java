package HW04_201702073_������;
import java.util.Scanner;	
public class HW04_201702073_������_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		char answer;
		System.out.println("������������ Ǯ�ڽ��ϱ�?");
		System.out.print("Ǯ������ 'Y'�� ġ�ʽÿ�:");
		answer=myScanner.next().charAt(0);
		while (answer=='Y'|| answer=='y'){
			double a,b,c;
			double determinant;
			System.out.print("�������� ���� �Է��Ͻÿ�:");
			a= myScanner.nextDouble();
			System.out.print("�������� ���� �Է��Ͻÿ�:");
			b= myScanner.nextDouble();
			System.out.print("������� ���� �Է��Ͻÿ�:");
			c= myScanner.nextDouble();
			determinant=b*b-4*a*c;
			double x1,x2;
			x1=(-b+Math.sqrt(determinant))/(2*a);
			x2=(-b-Math.sqrt(determinant))/(2*a);
			if (-0.000001<a && a<0.000001){
				System.out.println("������������ �ƴմϴ�.");
			}	
			else {
				
				if (-0.000001<determinant&&determinant<0.000001) {
					System.out.println("�Ǳ��� �ƴմϴ�.");
					}
				else {
					System.out.println("��"+x1+"�Ǵ�"+x2+"�� �����ϴ�.");
				}
			
			}
			System.out.println("������������ Ǯ�ڽ��ϱ�?");
			System.out.print("Ǯ������ 'Y'�� ġ�ʽÿ�:");
			answer=myScanner.next().charAt(0);
			myScanner.close();
			}
		System.out.println("���α׷��� �����մϴ�.");
		}

	}

