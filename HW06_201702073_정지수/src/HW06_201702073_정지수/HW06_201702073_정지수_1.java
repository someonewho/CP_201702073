package HW06_201702073_������; 

public class HW06_201702073_������_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int degree;
		degree= 1;
		while(degree<=176)	{//x�� ����� ���ΰ������ 
			
			if (degree<10)	{
				System.out.print("Sin(00"+degree+"��):");
			}
			else if(degree<100)	{
				System.out.print("Sin(0"+degree+"��):");
			}
			else	{
				System.out.print("Sin("+degree+"��):");
			}
			printAsterisks(degree);
			degree=degree+5;
			
		}
		
	}
	private static double mySine(double degree) {//�����Լ�
		double radian=((double) degree/180.0)*3.141592;
		double xSquare=radian*radian;
		double currentTerm=radian;
		int n=2;
		double sineValue=currentTerm;
		while(Math.abs(currentTerm)>=0.000001)	{
			currentTerm=-currentTerm*xSquare/(double)(n*(n+1));
			n=n+2;
			sineValue=sineValue+currentTerm;
		}
		return sineValue;
	}
	
		
	private static void printAsterisks (int degree)	{//����� �Լ�
		int count=0;
		int numberofasterisks =(int)(40.0*mySine(degree)+0.5);
		while(count<=numberofasterisks) {
			System.out.print("*");
			count++;
		}
		System.out.println(" ");
		
	}
	private static double cosine(int degree)	{
		double radian=((double)degree/180.0)*3.141592;
		double xsquare=radian*radian;
		double currentTerm=1.0;
		int n=1;
		double cosineValue=currentTerm;
		while(Math.abs(currentTerm)<=0.0000001)		{
			currentTerm=-currentTerm*xsquare/(double)n*(n+1);
			cosineValue=cosineValue+currentTerm;
			n=n+2;
		}
		return cosineValue;
	}
}
	


