
package HW05_201702073_������;
import java.util.Scanner;
public class HW05_201702073_������_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ascanner=new Scanner(System.in);
		int score;
		int count;
		int sumofscore;
		int aperson;
		int bperson;
		int cperson;
		int dperson;
		int fperson;
		double average;
		char grade;
		average=0;
		count=0;
		sumofscore=0;
		aperson=0;
		bperson=0;
		cperson=0;
		dperson=0;
		fperson=0;
		System.out.println("������ �Է��Ͻÿ�: ");
		score=ascanner.nextInt();
		while (score>=0) {
			if (score>100)	{//����� ����
				System.out.println("����! �ִ� ���� 100���� �Ѿ����ϴ�.");
			}
			else	{//��¥ ����
				count= count +1;
				sumofscore= sumofscore+score;
				average=(double)sumofscore/(double)count;
				if(score>=90&&score<=100) {//a���� ã��
					grade='A';
					aperson=aperson+1;
				}
				else if(score>=80&&score<=89) {//b���� ã��
					grade='B';
					bperson=bperson+1;
				}
				else if(score>=70&&score<=79) {//c���� ã��
					grade='C';
					cperson=cperson+1;
				}
				else if(score>=60&&score<=69) {//d���� ã��
					grade='D';
					dperson=dperson+1;
				}
				else {//�������� f
					grade='F';
					fperson=fperson+1;
					
				}
				System.out.println("(����:"+score+", ����:"+grade+")");
			}
		System.out.println("������ �Է��Ͻÿ�: ");
		score=ascanner.nextInt();
		
		}
		System.out.println();
		System.out.println("�л�����"+count+"���Դϴ�.");
		System.out.println("A��"+aperson+"���Դϴ�.");
		System.out.println("B��"+bperson+"���Դϴ�.");
		System.out.println("C��"+cperson+"���Դϴ�.");
		System.out.println("D��"+dperson+"���Դϴ�.");
		System.out.println("F��"+fperson+"���Դϴ�.");
		System.out.println("����� "+average+"���Դϴ�.");
		
		ascanner.close();
}

}
