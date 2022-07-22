//로또추첨

package random;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		//로또 추첨단
		int[] lotto = new int[6];
		System.out.println("로또 추첨을 시작합니다!!");
		
		for(int i=0 ; i< lotto.length ; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			
			for(int j = 0; j<i ; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		//나도 로또 뽑자잉
		int[] myLotto = new int[6];
		for(int i=0;i<6;i++) {
			System.out.println(i+1+"번째 숫자를 뽑으세요(1~45) : ");
			myLotto[i] = scan.nextInt();
			for(int j = 0 ; j<i; j++) {
				if(myLotto[i] == myLotto[j]) {
					System.out.println("이미 뽑았던 수입니다. 다시 뽑으세요.");
					i--;
					break;
				}
			}
		}
		
		//비교대조
		for(int i = 0; i<6 ; i++) {
			for(int j = 0; j <6; j++) {
				if(lotto[i]==myLotto[j]) {
					count+=1;
				}
			}
			
		}
		System.out.println("총 맞춘 갯수는 : " +count+"개입니다.");

	}

}
