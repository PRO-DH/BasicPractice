package input;

import java.util.Scanner;

// java.util 패키지 안의 Scanner 클래스를 가져오겠다 , import 단축키 : ctrl+shift+o 

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	// Scanner 변수 선언, 에러 뜰때 빨간줄 밑에 마우스 대면 오류내용 확인가능. 직접 오류 분석/해결능력 기르기
												// 가장 왼쪽단 줄번호쪽 노랑전구(노랑줄)는 무시해도된다. 빨강전구(x표시,빨강줄)는 컴파일되지 않아서 오류 수정해야한다.
		
		System.out.print("문자열 입력 : ");
		String a = scan.next();
		System.out.println(a);
		
		System.out.print("정수를 입력 : ");
		int b = scan.nextInt();
		System.out.println(b);
		
		System.out.print("실수를 입력 : ");
		double c = scan.nextDouble();
		System.out.println(c);
		
		scan.nextLine(); // 엔터값 처리			next 나 nextint등을 쓰고 netLine을 쓰는경우, 엔터값이 아직 저장되어 남아있기 때문에 한번 처리해주어야한다.
		System.out.print("문자열을 입력 :");
		String d = scan.nextLine();
		System.out.println(d);
		//

		scan.nextLine();
		
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.next();
		
		System.out.print("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		
		System.out.print("키를 입력해주세요 : ");
		double height = scan.nextDouble();
		
		System.out.print("몸무게를 입력해주세요 : ");
		double weight = scan.nextDouble();
		
		System.out.printf("이름은 %s, 나이는 %d, 키는 %.1f, 몸무게는 %.1f ", name,age,height,weight);



	}

}
