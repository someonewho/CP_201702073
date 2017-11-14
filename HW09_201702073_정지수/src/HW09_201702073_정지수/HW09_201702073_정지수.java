package HW09_201702073_정지수;
import java.util.Scanner;
public class HW09_201702073_정지수 {
	private static final int MAX_SIZE = 100;//상수선언(상수는 미리 선언해놓는게 좋음)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ascan = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		int sumOfScores = 0, numberOfStudents = 0, currentScore ;
		currentScore = ascan.nextInt();
		int[] scores = new int[MAX_SIZE];
		while (currentScore>=0)	{//점수 처리
			if (currentScore>100)	{
				System.out.println("오류! 100이 넘어서 적절한 점수가 아닙니다.");
			}
			else 	{
				sumOfScores = sumOfScores + currentScore;
				scores[numberOfStudents] = currentScore;
				numberOfStudents++;
			}
			System.out.print("점수를 입력하시오: ");
			currentScore = ascan.nextInt();
		}
		double average = calcAvg(scores,numberOfStudents);
		System.out.println("모두 "+numberOfStudents+"명의 성적이 입력되었습니다.");
		System.out.println("평균은 "+ average+"입니다.");

		int aboveAverageStudents = 0;
		int count = 0;
		System.out.println("입력된 성적은 다음과 같습니다.");
		while(count<numberOfStudents)	{
			if(scores[count]>=average)	{
				System.out.println("["+count+"] "+scores[count]+"(평균 이상입니다)");
				aboveAverageStudents++;
			}
			else	{
				System.out.println("["+count+"] "+scores[count]+"(평균 미만입니다)");
			}
			count++;
		}
		System.out.println("평균 이상인 학생 수는 "+aboveAverageStudents+"명입니다.");
		int max = calcMax(scores, numberOfStudents);
		int min = calcMin(scores, numberOfStudents);
		System.out.println("최고점은 "+max+"입니다.");
		System.out.println("최저점은 "+min+"입니다.");
		System.out.println("성적순은 다음과 같습니다.");
		count = 0;
		selectionSort(scores, numberOfStudents);
		while(count<numberOfStudents)	{
			System.out.println("["+count+"]"+scores[count]);
			count++;
		}
		System.out.println("프로그램을 종료합니다.");
		ascan.close();
	}	
	//main 끝

	private static double calcAvg(int[]scores, int aSize)	{
		int sumOfScores = 0;
		int count = 0;
		while (count<aSize)	{
			sumOfScores = sumOfScores + scores[count];
			count++;
		}
		return (double) sumOfScores/(double)aSize;
	}
	private static int calcMax(int[]element, int aSize )	{
		int count = 1;
		int max = element[0];
		while(count<aSize)	{
			if(max<element[count])	{
				max = element[count];
			}
			count++;
		}
		return max;

	}
	private static int calcMin(int[]element, int aSize)	{
		int count = 1;
		int min = element[0];
		while (count<aSize)	{
			if (min>element[count])	{
				min = element[count];
			}
			count++;
		}
		return min;
	}
	private static void selectionSort(int[] element, int aSize )	{
		int lastLoc = aSize -1;
		int maxLoc;
		int maxValue;
		int selectionLoc = 0;
		int curLoc;
		while (selectionLoc<lastLoc)	{
			maxLoc = selectionLoc;
			maxValue = element[maxLoc];
			curLoc = selectionLoc + 1;
			while(curLoc<= lastLoc)	{
				if(element[curLoc]>maxValue)	{
					maxLoc = curLoc;
					maxValue = element[maxLoc];
				}
				curLoc++;
			}
			selectionLoc++;
		}
	}
}
