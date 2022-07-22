// 대소비교

package condition;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수1 입력 : ");
		int a = scan.nextInt();
		System.out.println("수2 입력 : ");
		int b = scan.nextInt();
		
		if (a>b) {
			System.out.println("a가 더 큽니다.");
		} else if (a<b) {
			System.out.println("b가 더큽니다");
		}else {
			System.out.println("같습니다.");
		}
	}
}
