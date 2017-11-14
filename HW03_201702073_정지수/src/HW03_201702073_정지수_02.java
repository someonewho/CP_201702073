import java.util.Scanner;
public class HW03_201702073_정지수_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		int givenN;
		int sum;
		int count;
		sum=0;
		count=1;
		System.out.println("1부터 N까지의 합계을 구하려고 합니다. N의 값을 입력하십시오:");
		givenN=myScanner.nextInt();
		myScanner.close();
		while (count<=givenN){
			sum=sum+count;
			count=count+1;
		}
		System.out.print("합계:"+sum);
	}

	}
