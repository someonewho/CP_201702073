package HW07_201702073_������;
import java.util.Scanner;
public class HW07_201702073_������_01 {

	public static void main(String[] args) {//�Ѱ��� ������ ���� �� ����!
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int score;
		System.out.println("������ �Է��Ͻÿ�:");
		score=scanner.nextInt();
			while (score>=0) 	{//������ ���
				if(score>100)	{
				System.out.println("100�� �Ѿ �������� ������ �ƴմϴ�.");
				
			}
			else	{//���� ��� ���
				System.out.println("����: "+score+" ����: "+score2grade(score)+" ����: "+grade2point(score2grade(score)));
				System.out.println();//������� ���
			}
				
				System.out.println("������ �Է��Ͻÿ�:");
				score=scanner.nextInt();
			}
			
		scanner.close();
	}
	
	private static char score2grade(int score)	{
			if (score>=90)	{
				return 'A';
				
				}
			else if(score>=80)	{
				return 'B';
				
				}
			else if(score>=70)	{
				return 'C';
				
				}
			else if(score>=60)	{
				return 'D';
				
				}
			else	{
				return 'F';
				}
			
			}
	private static double grade2point(char grade)	{
		if (grade=='A')	{
			return 4.5;
		}
		else if(grade=='B')	{
			return 4.0;
		}
		else if(grade=='C')	{
			return 3.5;
		}
		else if(grade=='D')	{
			return 3.0;
		}
		else	{
			return 2.5;
		}
	}

}

