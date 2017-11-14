package HW07_201702073_정지수;
import java.util.Scanner;
public class HW07_201702073_정지수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ascanner=new Scanner(System.in);
		int korean, english, computer;
		System.out.print(">국어, 영어, 컴퓨터 점수를 차례로 입력하시오: ");
		korean=ascanner.nextInt();
		english=ascanner.nextInt();
		computer=ascanner.nextInt();
		int count4=0, count3=0, count2=0, count1=0;
		while(korean>=0&&english>=0&&computer>=0) {
				if (korean>100||english>100||computer>100)	{
					System.out.println("100을 넘는 점수가 포함되어 계산을 진행할 수 없습니다.");
				}
				else	{
				System.out.println("[국 어]점수: "+korean+" 학점: "+score2grade(korean)+" 평점: "+grade2point(score2grade(korean)));
				System.out.println("[영 어]점수: "+english+" 학점: "+score2grade(english)+" 평점: "+grade2point(score2grade(english)));
				System.out.println("[컴퓨터]점수: "+computer+" 학점: "+score2grade(computer)+" 평점: "+grade2point(score2grade(computer)));
				System.out.println("이 학생의 평균평점은 "+calcgpa(korean, english, computer)+" 입니다.");
				
					if (calcgpa(korean,english,computer)>=4.0)	{
						count4++;
					}
					else if (calcgpa(korean,english,computer)>=3.0)	{
						count3++;
					}
					else if (calcgpa(korean,english,computer)>=2.0)		{
						count2++;
					}
					else	{
						count1++;
					}
				}
			System.out.print(">국어, 영어, 컴퓨터 점수를 차례로 입력하시오: ");
			korean=ascanner.nextInt();
			english=ascanner.nextInt();
			computer=ascanner.nextInt();
		}
		System.out.println("음수가 입력되어 입력을 종료합니다.");
		System.out.println("평균 평졈이 4.0 이상 학생 수는 "+ count4 +"입니다.");
		System.out.println("평균평점이 4.0미만 3.0이상 학생 수는 "+ count3 +"입니다.");
		System.out.println("평균 평점이 3.0미만 2.0이상 학생 수는 "+ count2 +"입니다.");
		System.out.println("평균 평점이 2.0 미만 학생 수는 "+ count1 +"입니다.");
		System.out.println("프로그램을 종료합니다.");
		ascanner.close();
		
		
	}
	private static char score2grade(int score)	{
		if(score>90)	{
			return 'A';
		}
		else if(score>80)	{
			return 'B';
		}
		else if (score>70)	{
			return 'C';
		}
		else if(score>60)	{
			return 'D';
		}
		else {
			return 'F';
		}
	}
	private static double grade2point(char grade)	{
		if(grade=='A')	{
			return 4.0;
		}
		else if(grade=='B')	{
			return 3.0;
		}
		else if(grade=='C')		{
			return 2.0;
		}
		else if(grade=='D')		{
			return 1.0;
		}
		else	{
			return 0.0;
		}
	}
	private static double calcgpa(int korean, int english, int computer)	{
		
		double point1=(double)grade2point(score2grade(korean));
		double point2=(double)grade2point(score2grade(english));
		double point3=(double)grade2point(score2grade(computer));
		double gpa=(point1+point2+point3)/3;
		return gpa;
		
	}
	
}
