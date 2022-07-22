package method;

public class Ex08 {

	
	// 정수배열을 매개값으로 받아서 배열에 1~2-까지 정수의 난수를 채워넣는 메소드
	
	public static void randomArray(int[] array) {
		
		for(int i = 0 ; i < 20 ; i++) {
			array[i] = (int)(Math.random()*20)+1;
		}
	}
	
	public static void arrayPrint(int[] array) {
		for(int i = 0; i<20; i++) {
			System.out.println(i+1+"번째 배열의 수는 "+array[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] a = new int[20];
		randomArray(a);
		arrayPrint(a);


	}

}
