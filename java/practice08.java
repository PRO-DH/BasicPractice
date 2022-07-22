// 홀짝 판별

package condition;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		// 정수 하나 입력받아 홀/짝판별
		
		Scanner scan = new Scanner(System.in);
		System.out.println("수를 입력해주세요 : ");
		int a = scan.nextInt();
		
		if (a%2 == 0) {
			System.out.println("짝수입니다");
			
		}else {
			System.out.println("홀수입니다");
			
		}

	}

}
