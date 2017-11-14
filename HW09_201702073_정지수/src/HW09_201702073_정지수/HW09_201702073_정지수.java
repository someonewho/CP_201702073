package HW09_201702073_������;
import java.util.Scanner;
public class HW09_201702073_������ {
	private static final int MAX_SIZE = 100;//�������(����� �̸� �����س��°� ����)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ascan = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int sumOfScores = 0, numberOfStudents = 0, currentScore ;
		currentScore = ascan.nextInt();
		int[] scores = new int[MAX_SIZE];
		while (currentScore>=0)	{//���� ó��
			if (currentScore>100)	{
				System.out.println("����! 100�� �Ѿ ������ ������ �ƴմϴ�.");
			}
			else 	{
				sumOfScores = sumOfScores + currentScore;
				scores[numberOfStudents] = currentScore;
				numberOfStudents++;
			}
			System.out.print("������ �Է��Ͻÿ�: ");
			currentScore = ascan.nextInt();
		}
		double average = calcAvg(scores,numberOfStudents);
		System.out.println("��� "+numberOfStudents+"���� ������ �ԷµǾ����ϴ�.");
		System.out.println("����� "+ average+"�Դϴ�.");

		int aboveAverageStudents = 0;
		int count = 0;
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		while(count<numberOfStudents)	{
			if(scores[count]>=average)	{
				System.out.println("["+count+"] "+scores[count]+"(��� �̻��Դϴ�)");
				aboveAverageStudents++;
			}
			else	{
				System.out.println("["+count+"] "+scores[count]+"(��� �̸��Դϴ�)");
			}
			count++;
		}
		System.out.println("��� �̻��� �л� ���� "+aboveAverageStudents+"���Դϴ�.");
		int max = calcMax(scores, numberOfStudents);
		int min = calcMin(scores, numberOfStudents);
		System.out.println("�ְ����� "+max+"�Դϴ�.");
		System.out.println("�������� "+min+"�Դϴ�.");
		System.out.println("�������� ������ �����ϴ�.");
		count = 0;
		selectionSort(scores, numberOfStudents);
		while(count<numberOfStudents)	{
			System.out.println("["+count+"]"+scores[count]);
			count++;
		}
		System.out.println("���α׷��� �����մϴ�.");
		ascan.close();
	}	
	//main ��

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
