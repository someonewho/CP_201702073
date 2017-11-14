package HW08_201702073_정지수;
import java.util.Scanner;
public class HW08_201702073_정지수 {
	private static final int MAX_SIZE = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ascan = new Scanner(System.in);
		System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오: ");
		int koreanScore, computerScore, numberOfStudents;
		numberOfStudents = 0;
		koreanScore = ascan.nextInt();
		computerScore = ascan.nextInt();
		int[] koreanScores = new int[MAX_SIZE];
		int[] computerScores = new int[MAX_SIZE];
		double[] studentAverages=new double[MAX_SIZE];
		while(koreanScore>=0&&computerScore>=0)		{
			if(koreanScore>100||computerScore>100)	{
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else	{
				koreanScores [numberOfStudents] = koreanScore;
				computerScores [numberOfStudents] = computerScore;
				numberOfStudents++;
			}
			System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오: ");
			koreanScore = ascan.nextInt();
			computerScore = ascan.nextInt();
		}

		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println("모두 "+numberOfStudents+" 명의 성적이 입력되었습니다.");
		int count=0;
		studentAverages = new double [MAX_SIZE];
		System.out.println("입력된 성적은 다음과 같습니다.");
		while(count<numberOfStudents)	{
			studentAverages[count] = (double)(koreanScores[count] + computerScores[count])/2.0 ;
			System.out.print("["+count+"] "+koreanScores[count]+" "+computerScores[count]+" ");
			System.out.println("(평균 "+studentAverages[count]+")");
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
		System.out.println("학급 평균은 "+classAverage+"입니다.");
		count = 0;
		while(count< numberOfStudents)	{
			if(studentAverages[count]>=classAverage)	{
				aboveClassAverage++;
			}
			count++;
		}

		System.out.println("평균 이상인 학생의 수는 "+aboveClassAverage+"명입니다.");			
		System.out.println("프로그램을 종료합니다.");
		ascan.close();
	}

}
