package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		long result = scan.nextLong() - scan.nextLong();
		System.out.println(Math.abs(result));
	}

}
