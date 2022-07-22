//잔돈 나누기

package array;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("동전으로 교환할 금액 : ");
		int money  = scan.nextInt();
		int[] coin = {500,100,50,10};
		int num[] = new int[4];
		
		System.out.println("교환할 돈 : " + money + "원");
		
		for(int i = 0 ; i < 4 ; i ++) {
			
			num[i] = money  / coin[i];
			
			money -=num[i]*coin[i];
				
			}
		System.out.printf("500 : %d, 100 : %d, 50 : %d, 10 : %d",num[0],num[1],num[2],num[3]);
	
	
		
		/* 다른 풀이 ( num변수를 새로 선언하지 않고 나머지 이용해서 풀기)
		 * 
		 *	for (int i = 0 ; i < coin.length ; i++){
		 * 		System.out.println(coin[i] + "원 : " (money / coin[i]) + 개);
		 * 		money %= coin[i];
		 *	}
		 *	System.out.println("잔돈 : " + money + "원");
		 */

	}

}
