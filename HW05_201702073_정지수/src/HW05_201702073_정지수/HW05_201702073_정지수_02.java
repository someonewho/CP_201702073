package HW05_201702073_정지수;

public class HW05_201702073_정지수_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sine값 찾기
		double x;
		double y;
		int n;
		n=1;
		x=(double)n*(3.141592/180.0);
		y=Math.sin(x);
		System.out.println("<<Sine값 출력 프로그램을 시작합니다>>");
		while (n<=180)	{
			System.out.println("Sine("+n+"도)는"+y+"입니다.");
			n=n+1;
		}
			System.out.println("<<Sine값 출력 프로그램을 종료합니다>>");
		
	}

}
