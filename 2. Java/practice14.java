// 입력받고 합계 구하기

package loop;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		for (int i = 1; i <=5;i++) {
			System.out.println(i+"번째 정수를 입력 : ");
			num = scan.nextInt();
			sum += num;
		}
		System.out.println("합계는 : "+sum);

	}

}
