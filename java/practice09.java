// 최대최소 및 평균

package condition;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("정수1 입력 : ");
		int a = scan.nextInt();
		System.out.println("정수2 입력 : ");
		int b = scan.nextInt();
		System.out.println("정수3 입력 : ");
		int c = scan.nextInt();
		int max;
		int min;
		int avg = (a+b+c) / 3;
		
		if (a>=b && a>=c) {
			max = a;
			if(b>c) {
				min = c;
			}else {
				min = b;
			}
		}else if (b>=c && b>=a) {
			max = b;
			if (a>c) {
				min = c;
			}else {
				min = a;
			}
		} else{
			max = c;
			if(a>b) {
				min = b;
			}else {
				min = a;
			}
		}
		
		System.out.printf("최댓값:%d, 최솟값:%d, 평균:%d", max , min ,avg);
		

	}
