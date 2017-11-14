package HW06_201702073_정지수; 

public class HW06_201702073_정지수_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int degree;
		degree= 1;
		while(degree<=176)	{//x가 양수면 사인값별찍기 
			
			if (degree<10)	{
				System.out.print("Sin(00"+degree+"도):");
			}
			else if(degree<100)	{
				System.out.print("Sin(0"+degree+"도):");
			}
			else	{
				System.out.print("Sin("+degree+"도):");
			}
			printAsterisks(degree);
			degree=degree+5;
			
		}
		
	}
	private static double mySine(double degree) {//사인함수
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
	
		
	private static void printAsterisks (int degree)	{//별찍기 함수
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
	


