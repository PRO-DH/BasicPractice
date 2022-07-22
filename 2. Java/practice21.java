// 성적 입력받아서 순위 구하기
// 순위 나열하는 법 숙지

package array;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//변수 선언
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		int[] rank = new int[3];
		
		//for문 통해 이름/국어/영어 점수 입력받아 총점구하기
		
		for(int i=0;i<3;i++) {
			System.out.println("이름을 입력해 주세요 : ");
			name[i] = scan.next();
			System.out.println("국어 점수는 : ");
			kor[i] = scan.nextInt();
			System.out.println("영어 점수는 : ");
			eng[i] = scan.nextInt();
			
			total[i] = kor[i]+eng[i];
			rank[i] = i+1;
		}
		
		// 이중 for 문과 if문을 조합하여 순위 구하기
		int temp = 0;
		for( int i = 0 ; i < 3 ; i++) {
			for ( int j = i ; j < 3 ; j++) {
				if(total[j] > total[i]) {
					
					temp = rank[i];
					rank[i] = rank[j];
					rank[j] = temp;
				}
			}
		}
		
		for ( int i = 0 ; i < 3 ; i++) {
			System.out.println(name[i]+"의 순위는 : "+rank[i]);
		}
		
		/* 다른풀이
		 * for (int i = 0; i<3; i++){
		 * 		rank[i] = 1;
		 * 		for (int j = 0 ; j < 3 ; j ++){
		 * 			if (totla[i] < total[j]){
		 * 				rank[i]++;
		 * 			}
		 * 		}
		 * }
		 * 
		 * 해설 : 모든애들의 랭크를 1로 시작해서, i = 0 일떄 더큰애들이 있는지 비교. 더 큰애가 없으면 pass
		 * 		 i = 1 일대 더큰애들이 있는지 비교. 있으면 rank 를 하나씩 + 함.
		 * 		 이 과정을 i= 0~끝까지 갈떄 for을 돌려서 전부랑 비교하는 for을 한번 더 돌림.
		 * */
		

	}

}
