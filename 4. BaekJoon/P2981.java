
/* 
요구명세서
1. 배열안에 수를 받아서 정렬한다. 
2. 큰수에서 작은 수를 빼준다. (a와b의 m으로 나눈 나머지가 같다면 a-b가 m으로 나누어 떨어진다 -  즉 최대공약수의 약수들)
3. gcd함수에 넣어서 나누어 떨어지는 수들을 필터링해 출력한다.
4. gcd함수를 정의한다.(최대공약수)

*/

import java.util.Scanner;
import java.util.Arrays;
 
public class Main {	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		
		int[] arr = new int[N];	
        
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
        
		Arrays.sort(arr);	
 
		int gcdVal = arr[1] - arr[0];	
 
		for(int i = 2; i < N; i++) {
			gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
		}
 
		for(int i = 2; i <= gcdVal; i++) {
	    
			if(gcdVal % i == 0) {
				System.out.print(i + " ");
			}
		}
		
	}
	static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
 
}
