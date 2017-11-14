package HW04_201702073_정지수;

public class HW04_201702073_정지수_02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int even;
		int count;
		even=1;
		count=1;
		n=5;
		System.out.println(n+"factorial의 값을 계산하려고 합니다. ");
		while(count<=n)	{
				even=even*count;
				count=count+1;
			}
		System.out.println(n+"!은"+even+"입니다.");
	}

}
