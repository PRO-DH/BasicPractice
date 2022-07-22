package operation;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("a를 입력하세요 : ");
		int x = scan.nextInt();
		System.out.println("b를 입력하세요 : ");
		int y = scan.nextInt();
		
		System.out.printf("a + b = %d\n",x+y);
		System.out.printf("a - b = %d\n",x-y);
		System.out.printf("a * b = %d\n",x*y);
		System.out.printf("a / b = %d\n",x/y);

	
		
		String str = (10>30) ? "10이 30보다 작습니다." : "10이 30보다 큽니다.";
		System.out.println(str);
		
		scan.next();
		int money, c500, c100, c50, c10;
		System.out.print("동전으로 교환할 돈 : ");
		money = scan.nextInt();
		c500 = money / 500;
		c100 = money % 500 / 100 ;
		c50 = money % 100 / 50;
		c10 = money % 50 / 10;
		System.out.printf("오백원동전 : %d, 100원동전 : %d, 50원 : %d, 10원 %d",c500,c100,c50,c10);
		
	}

}
