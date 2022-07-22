//구구단

package loop;

public class Ex06 {

	public static void main(String[] args) {
		
		int dan;
		int num;
		
		for(dan = 2; dan<=9; dan++){
			System.out.printf("\n=== %d 단 ===\n",dan);
			for(num = 1; num<=9;num++) {
				System.out.printf("%d X %d = %d\n",dan,num,dan*num);
			}
		}

	}

}
