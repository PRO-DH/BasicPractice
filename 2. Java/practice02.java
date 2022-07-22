package variable;

public class Ex08 {

	public static void main(String[] args) {

		byte a = 65;
		char ch = (char)a;
		System.out.println(ch);
		
		int b = 128;
		byte c = (byte)b;
		System.out.println(c);
		// 지정된 타입보다 값이 더 클경우 캐스팅(강제타입변환)을 하면 overflow로 가장 작은값으로 돌아간다 - 데이터손실
		
		double d = 531.3566;
		int e = (int)d;
		System.out.println(e);
		byte f = (byte)d;
		System.out.println(f);
		
	}

}
