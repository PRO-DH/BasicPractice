// 등급나누기

package condition;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수를 입력하세요 : ");
		int a = scan.nextInt();
		
		if (a>=90 && a<=100) {
			System.out.println("A등급");
		} else if (a>= 80 && a<90) {
			System.out.println("B등급");
		} else {
			System.out.println("C등급");
		}
	}
}
