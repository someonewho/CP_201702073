package HW07_201702073_������;
import java.util.Scanner;
public class HW07_201702073_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ascanner=new Scanner(System.in);
		int korean, english, computer;
		System.out.print(">����, ����, ��ǻ�� ������ ���ʷ� �Է��Ͻÿ�: ");
		korean=ascanner.nextInt();
		english=ascanner.nextInt();
		computer=ascanner.nextInt();
		int count4=0, count3=0, count2=0, count1=0;
		while(korean>=0&&english>=0&&computer>=0) {
				if (korean>100||english>100||computer>100)	{
					System.out.println("100�� �Ѵ� ������ ���ԵǾ� ����� ������ �� �����ϴ�.");
				}
				else	{
				System.out.println("[�� ��]����: "+korean+" ����: "+score2grade(korean)+" ����: "+grade2point(score2grade(korean)));
				System.out.println("[�� ��]����: "+english+" ����: "+score2grade(english)+" ����: "+grade2point(score2grade(english)));
				System.out.println("[��ǻ��]����: "+computer+" ����: "+score2grade(computer)+" ����: "+grade2point(score2grade(computer)));
				System.out.println("�� �л��� ��������� "+calcgpa(korean, english, computer)+" �Դϴ�.");
				
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
			System.out.print(">����, ����, ��ǻ�� ������ ���ʷ� �Է��Ͻÿ�: ");
			korean=ascanner.nextInt();
			english=ascanner.nextInt();
			computer=ascanner.nextInt();
		}
		System.out.println("������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("��� ������ 4.0 �̻� �л� ���� "+ count4 +"�Դϴ�.");
		System.out.println("��������� 4.0�̸� 3.0�̻� �л� ���� "+ count3 +"�Դϴ�.");
		System.out.println("��� ������ 3.0�̸� 2.0�̻� �л� ���� "+ count2 +"�Դϴ�.");
		System.out.println("��� ������ 2.0 �̸� �л� ���� "+ count1 +"�Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
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
