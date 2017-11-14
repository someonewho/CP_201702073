	import java.util.Scanner;	
	public class HW03_201702073_정지수_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		double a,b,c;
		double determinant;
		System.out.println("이차항의 값을 입력하시오");
		a= myScanner.nextDouble();
		System.out.println("일차항의 값을 입력하시오");
		b= myScanner.nextDouble();
		System.out.println("상수항의 값을 입력하시오");
		c= myScanner.nextDouble();
		myScanner.close();
		determinant=b*b-4*a*c;
		double x1,x2;
		x1=(-b+Math.sqrt(determinant))/(2*a);
		x2=(-b-Math.sqrt(determinant))/(2*a);
		if ((-0.00000001<a)&&(a<0.00000001)){
			System.out.println("이차방정식이 아닙니다.");
		}
		else {
			
			if (determinant<0) {
				System.out.println("실근이 아닙니다.");
			}
			else {
				System.out.println("근"+x1+"또는"+x2+"를 가집니다.");
			}
		}
	}
}
