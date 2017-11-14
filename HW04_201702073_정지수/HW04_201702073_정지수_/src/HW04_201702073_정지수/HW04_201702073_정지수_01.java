package HW04_201702073_정지수;
import java.util.Scanner;	
public class HW04_201702073_정지수_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		char answer;
		System.out.println("이차방정식을 풀겠습니까?");
		System.out.print("풀겠으면 'Y'룰 치십시오:");
		answer=myScanner.next().charAt(0);
		while (answer=='Y'|| answer=='y'){
			double a,b,c;
			double determinant;
			System.out.print("이차항의 값을 입력하시오:");
			a= myScanner.nextDouble();
			System.out.print("일차항의 값을 입력하시오:");
			b= myScanner.nextDouble();
			System.out.print("상수항의 값을 입력하시오:");
			c= myScanner.nextDouble();
			determinant=b*b-4*a*c;
			double x1,x2;
			x1=(-b+Math.sqrt(determinant))/(2*a);
			x2=(-b-Math.sqrt(determinant))/(2*a);
			if (-0.000001<a && a<0.000001){
				System.out.println("이차방정식이 아닙니다.");
			}	
			else {
				
				if (-0.000001<determinant&&determinant<0.000001) {
					System.out.println("실근이 아닙니다.");
					}
				else {
					System.out.println("근"+x1+"또는"+x2+"를 가집니다.");
				}
			
			}
			System.out.println("이차방정식을 풀겠습니까?");
			System.out.print("풀겠으면 'Y'를 치십시오:");
			answer=myScanner.next().charAt(0);
			myScanner.close();
			}
		System.out.println("프로그램을 중지합니다.");
		}

	}

