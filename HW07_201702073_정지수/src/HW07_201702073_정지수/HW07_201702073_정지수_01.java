package HW07_201702073_정지수;
import java.util.Scanner;
public class HW07_201702073_정지수_01 {

	public static void main(String[] args) {//한과목 점수만 받을 수 있음!
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int score;
		System.out.println("점수를 입력하시오:");
		score=scanner.nextInt();
			while (score>=0) 	{//점수가 양수
				if(score>100)	{
				System.out.println("100이 넘어서 정상적인 점수가 아닙니다.");
				
			}
			else	{//학점 계산 출력
				System.out.println("점수: "+score+" 학점: "+score2grade(score)+" 평점: "+grade2point(score2grade(score)));
				System.out.println();//평균평점 출력
			}
				
				System.out.println("점수를 입력하시오:");
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

