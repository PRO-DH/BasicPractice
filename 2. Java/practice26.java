//사칙연산 프로그램

package method;

import java.util.Scanner;

public class Ex06 {
	
	//필요한 메소드들 미리 만들기 
	
	public static void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public static void powerOff() {
		System.out.println("전원을 끕니다.");
		System.exit(0);
	}
	
	public static int add(int x, int y) {
		return x+y;
	}
	
	public static int subtract(int x, int y) {
		return x-y;
	}
	
	public static int multiply(int x, int y) {
		return x*y;
	}
	public static double divide(double x, double y) {
		return x/y;
	}

	public static void outPut(int x) {
		System.out.println(x);
	}
	
	public static void outPut(double x) {
		System.out.println(x);
	}
	
	
	
	//메인에서 만들어둔 메소드 활용하여 본문단 만들기
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		powerOn();
		
		while(true) {
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.전원끄기");
			
			int choice = scan.nextInt();
			
			if(choice==5) {
				powerOff();
			}
			
			System.out.println("첫번째 수 입력 : ");
			int x = scan.nextInt();
			System.out.println("두번째 수 입력 : ");
			int y = scan.nextInt();
			
			int result1;
			double result2;
			
			switch(choice) {
			case 1:
				result1 = add(x,y);
				outPut(result1);
				break;
			case 2:
				result1 = subtract(x,y);
				outPut(result1);
				break;
			case 3:
				result1 = multiply(x,y);
				outPut(result1);
				break;
			case 4:
				result2 = divide(x,y);
				outPut(result2);
				break;
			default :
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
		
		

	}

}
