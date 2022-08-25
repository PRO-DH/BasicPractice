package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		int count = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			switch(str.charAt(i)) {
			case 'A' : case 'B' : case'C' :
				count += 3;
				break;
			case 'D' : case 'E' : case'F' :
				count += 4;
				break;
			case 'G' : case 'H' : case'I' :
				count += 5;
				break;
			case 'J' : case 'K' : case'L' :
				count += 6;
				break;
			case 'M' : case 'N' : case'O' :
				count += 7;
				break;
			case 'P' : case 'Q' : case'R' : case 'S':
				count += 8;
				break;
			case 'V' : case 'T' : case'U' :
				count += 9;
				break;
			case 'Y' : case 'W' : case'X' : case 'Z':
				count += 10;
				break;
			
			}
		}
		System.out.print(count);
		
	}

}
