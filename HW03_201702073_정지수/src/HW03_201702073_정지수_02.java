import java.util.Scanner;
public class HW03_201702073_������_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		int givenN;
		int sum;
		int count;
		sum=0;
		count=1;
		System.out.println("1���� N������ �հ��� ���Ϸ��� �մϴ�. N�� ���� �Է��Ͻʽÿ�:");
		givenN=myScanner.nextInt();
		myScanner.close();
		while (count<=givenN){
			sum=sum+count;
			count=count+1;
		}
		System.out.print("�հ�:"+sum);
	}

	}
