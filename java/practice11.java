// 남여 판별

package condition;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		char gender = ' ';
		String ssn = " ";
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 입력 : ");
		
		ssn = scan.nextLine();	// 문자열 전체 저장
		gender = ssn.charAt(7);	// charAt(n)는 문자열에서 n+1번째 자릿수를 가져온다. (첫째자리의 인덱스 = 0)
		
		switch(gender){
		case '1' :
			System.out.println("남자");
			break;
					
		case '2':
			System.out.println("여자");
			break;
		
		default:
			System.out.println("입력오류");
			
		}
	}
