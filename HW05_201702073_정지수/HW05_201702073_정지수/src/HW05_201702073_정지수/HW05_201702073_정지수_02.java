package HW05_201702073_������;

public class HW05_201702073_������_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sine�� ã��
		double x;
		double y;
		int n;
		n=1;
		x=(double)n*(3.141592/180.0);
		y=Math.sin(x);
		System.out.println("<<Sine�� ��� ���α׷��� �����մϴ�>>");
		while (n<=180)	{
			System.out.println("Sine("+n+"��)��"+y+"�Դϴ�.");
			n=n+1;
		}
			System.out.println("<<Sine�� ��� ���α׷��� �����մϴ�>>");
		
	}

}
