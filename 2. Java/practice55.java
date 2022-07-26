package wrapper;

public class Ex01 {

	public static void main(String[] args) {
		// wrapper클래스를 사용하는 이유
		
		// 매개변수로 객체가 요구되는경우
		// 기본형이 아닌 객체로 저장해야 하는 경우
		// 객체간의 비교가 필요한 경우
		// 문자열을 기본값으로 변환하는 경우 등
		
		int a = 5; // 기본타입 선언
		Integer b = new Integer(a);	// 기본타입 값을 포장객체로 만든다.(박싱)
		
		int c = b.intValue();	// 언박싱

		System.out.println(c);
		
	}
  
class Ex02 {

	public static void main(String[] args) {
		
		Integer a = 100;	// 자동박싱
		int b = a + 100;	// 자동 언박싱
		
		System.out.println(b);
		
		printDouble(3.14);		// printDouble(new Double(3.14))

	}
	
	
	public static void printDouble(Double obj) {
		System.out.println(obj); 	// System.out.println(obj.doubleValue());
		
	}

class Ex03 {

	public static void main(String[] args) {
		
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);
		
		// 포장객체 비교
		System.out.println(obj1 == obj2);
		
		// 내부데이터 비교
		System.out.println(obj1.equals(obj2));
	}
  
}
