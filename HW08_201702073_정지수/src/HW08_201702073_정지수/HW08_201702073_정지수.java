package HW08_201702073_������;
import java.util.Scanner;
public class HW08_201702073_������ {
	private static final int MAX_SIZE = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ascan = new Scanner(System.in);
		System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�: ");
		int koreanScore, computerScore, numberOfStudents;
		numberOfStudents = 0;
		koreanScore = ascan.nextInt();
		computerScore = ascan.nextInt();
		int[] koreanScores = new int[MAX_SIZE];
		int[] computerScores = new int[MAX_SIZE];
		double[] studentAverages=new double[MAX_SIZE];
		while(koreanScore>=0&&computerScore>=0)		{
			if(koreanScore>100||computerScore>100)	{
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else	{
				koreanScores [numberOfStudents] = koreanScore;
				computerScores [numberOfStudents] = computerScore;
				numberOfStudents++;
			}
			System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�: ");
			koreanScore = ascan.nextInt();
			computerScore = ascan.nextInt();
		}

		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("��� "+numberOfStudents+" ���� ������ �ԷµǾ����ϴ�.");
		int count=0;
		studentAverages = new double [MAX_SIZE];
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		while(count<numberOfStudents)	{
			studentAverages[count] = (double)(koreanScores[count] + computerScores[count])/2.0 ;
			System.out.print("["+count+"] "+koreanScores[count]+" "+computerScores[count]+" ");
			System.out.println("(��� "+studentAverages[count]+")");
			count++;

		}
		count=0;
		double sumOfAverage = 0;
		int aboveClassAverage = 0;
		
		while(count<numberOfStudents )	{
			sumOfAverage = sumOfAverage + studentAverages[count];
			count++;
		}
		double classAverage = sumOfAverage/numberOfStudents;
		System.out.println("�б� ����� "+classAverage+"�Դϴ�.");
		count = 0;
		while(count< numberOfStudents)	{
			if(studentAverages[count]>=classAverage)	{
				aboveClassAverage++;
			}
			count++;
		}

		System.out.println("��� �̻��� �л��� ���� "+aboveClassAverage+"���Դϴ�.");			
		System.out.println("���α׷��� �����մϴ�.");
		ascan.close();
	}

}
