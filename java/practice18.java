package array;

public class Ex02 {

	public static void main(String[] args) {
		byte[] byteArray = new byte[1];
		char[] charArray = new char[1];
		short[] shortArray = new short[1];
		int[] intArray = new int[1];
		long[] longArray = new long[1];
		float[] floatArray = new float[1];
		double[] doubleArray = new double[1];
		boolean[] booleanArray = new boolean[1];
		String[] stringArray = new String[1];
		
		
		System.out.println(byteArray[0]);
		System.out.println(charArray[0]);
		System.out.println(shortArray[0]);
		System.out.println(intArray[0]);
		System.out.println(longArray[0]);
		System.out.println(floatArray[0]);
		System.out.println(doubleArray[0]);
		System.out.println(booleanArray[0]);
		System.out.println(stringArray[0]);
    
    		int[] intArray = new int[5];
		intArray[0] = 100;
		intArray[1] = 200;
		intArray[2] = 300;
		intArray[3] = 400;
		intArray[4] = 500;
		
	
				
		
		for (int i = 0; i<5; i++) {
		System.out.println(intArray[i]);
		}
		
		System.out.println("배열의 길이 : " + intArray.length);
    
    
    
    int intArray[] = {10,20,30,40,50,60};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("intArary 인덱스는 0~5입니다.");
		System.out.println("인덱스를 입력하세요 : ");
		int a = scan.nextInt();
		
		System.out.println("intArray[" + a + "] : " + intArray[a]);
		
		scan.close();


		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		
		for(int i = 0; i < name.length ; i++){
			System.out.print(i+1 + "번째 이름을 입력 : ");
			name[i] = scan.next();
		}
		for(int i = 0 ; i < name.length ; i++) {
			System.out.println(i+1+"번째 이름은 : " + name[i]);
			
		}
		
		scan.close();

	}

}
