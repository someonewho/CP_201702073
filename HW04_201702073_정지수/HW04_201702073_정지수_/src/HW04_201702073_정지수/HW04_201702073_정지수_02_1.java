package HW04_201702073_������;

public class HW04_201702073_������_02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int even;
		int count;
		even=1;
		count=1;
		n=5;
		System.out.println(n+"factorial�� ���� ����Ϸ��� �մϴ�. ");
		while(count<=n)	{
				even=even*count;
				count=count+1;
			}
		System.out.println(n+"!��"+even+"�Դϴ�.");
	}

}
