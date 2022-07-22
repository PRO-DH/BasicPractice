// 별만들기

package loop;

public class Ex07 {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}
}
