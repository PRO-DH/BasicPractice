//예약손님 명단 출력

package array;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int inwon;
		System.out.println("예약 인원수 입력 : ");
		inwon = scan.nextInt();
		
		String[] person = new String[inwon];
		
		for(int i = 0; i < inwon ; i++) {
			System.out.println(i+1+"번째 예약 손님 : ");
			person[i] = scan.next();
		}
		System.out.println("총 인원은 "+inwon+" 명입니다.");
		
		System.out.println("\t예약손님 목록");
		System.out.println("=============================");
		
		for(int i = 0; i <inwon ; i++) {
			System.out.println(i+1+"번째 예약손님 : "+person[i]+"님 입니다.");
		}
		System.out.println("=============================");
		
		scan.close();
	}

}
