	import java.util.Scanner;	
	public class HW03_201702073_������_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		double a,b,c;
		double determinant;
		System.out.println("�������� ���� �Է��Ͻÿ�");
		a= myScanner.nextDouble();
		System.out.println("�������� ���� �Է��Ͻÿ�");
		b= myScanner.nextDouble();
		System.out.println("������� ���� �Է��Ͻÿ�");
		c= myScanner.nextDouble();
		myScanner.close();
		determinant=b*b-4*a*c;
		double x1,x2;
		x1=(-b+Math.sqrt(determinant))/(2*a);
		x2=(-b-Math.sqrt(determinant))/(2*a);
		if ((-0.00000001<a)&&(a<0.00000001)){
			System.out.println("������������ �ƴմϴ�.");
		}
		else {
			
			if (determinant<0) {
				System.out.println("�Ǳ��� �ƴմϴ�.");
			}
			else {
				System.out.println("��"+x1+"�Ǵ�"+x2+"�� �����ϴ�.");
			}
		}
	}
}
