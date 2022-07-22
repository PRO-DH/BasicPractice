//순서정렬

package array;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int temp = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(i+1+"번째 수를 입력 : ");
			int a = scan.nextInt();
			num[i]= a;
		}
			
		for(int i = 0 ; i<5; i++) {	
			for(int j = i ; j < 5 ; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;			
				}else {
				}
				
			}
			
		}
		
		System.out.printf("정렬 : %d, %d, %d, %d, %d \n",num[0],num[1],num[2],num[3],num[4]);
	}
