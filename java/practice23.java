//가위바위보 게임 만들기 

package random;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 하나 선택하세요 : ");
			System.out.println("1.가위 2.바위 3.보 4.게임종료");
			
			
			// 사람선택
			int choice = scan.nextInt();
			
			String myChoice = "";
			
			switch(choice) {
			
			case 1 :
				myChoice = "가위";
				break;
								
			case 2 :
				myChoice = "바위";
				break;
							
			case 3 :
				myChoice = "보";
				break;
				
			case 4 : 
				System.out.println("게임을 종료합니다.");
				System.exit(0); //프로그램 종료
				
			default :
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			
			//컴 선택
			int com = (int)(Math.random()*3)+1;
			String comChoice = "";
			
			switch(com) {
			case 1 :
				comChoice = "가위";
				break;				
			case 2 :
				comChoice = "바위";
				break;				
			case 3 :
				comChoice = "보";
				break;
			}
			
			System.out.println("나 : "+myChoice);
			System.out.println("컴퓨터 : "+comChoice);
			
			if((choice==1 && com==3)||(choice==2 && com==3)||(choice==3 && com==2)) {
				System.out.println("나의 승리다!!");
			}else if(choice == com) {
				System.out.println("무승부");
			}else {
				System.out.println("나의 패배다...");
			}
			System.out.println("\n\n");
		
		}

	}

}
