
package HW05_201702073_정지수;
import java.util.Scanner;
public class HW05_201702073_정지수_01 {

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
		System.out.println("점수를 입력하시오: ");
		score=ascanner.nextInt();
		while (score>=0) {
			if (score>100)	{//요상한 성적
				System.out.println("오류! 최대 점수 100점을 넘었습니다.");
			}
			else	{//진짜 성적
				count= count +1;
				sumofscore= sumofscore+score;
				average=(double)sumofscore/(double)count;
				if(score>=90&&score<=100) {//a학점 찾기
					grade='A';
					aperson=aperson+1;
				}
				else if(score>=80&&score<=89) {//b학점 찾기
					grade='B';
					bperson=bperson+1;
				}
				else if(score>=70&&score<=79) {//c학점 찾기
					grade='C';
					cperson=cperson+1;
				}
				else if(score>=60&&score<=69) {//d학점 찾기
					grade='D';
					dperson=dperson+1;
				}
				else {//나머지는 f
					grade='F';
					fperson=fperson+1;
					
				}
				System.out.println("(성적:"+score+", 학점:"+grade+")");
			}
		System.out.println("점수를 입력하시오: ");
		score=ascanner.nextInt();
		
		}
		System.out.println();
		System.out.println("학생수는"+count+"명입니다.");
		System.out.println("A는"+aperson+"명입니다.");
		System.out.println("B는"+bperson+"명입니다.");
		System.out.println("C는"+cperson+"명입니다.");
		System.out.println("D는"+dperson+"명입니다.");
		System.out.println("F는"+fperson+"명입니다.");
		System.out.println("평균은 "+average+"점입니다.");
		
		ascanner.close();
}

}
