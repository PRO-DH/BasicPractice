//메소드연습

package method;

public class Ex01 {

	public static void method1() {
		
		System.out.println("void형 메소드는 돌려줄 값이 없음");
	
	}
	
	public static int method2() {
		System.out.println("리턴 타입이 int형인 메소드");
		int b = 100;
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println("main 메소드");
		method1();
		method2();
		
		int a;
		a = method2();
		System.out.println("method2에서 돌려준 값 : " + a);
	}

}

package method;

public class Ex05 {
	
	//메소드오버로딩
	
	public static void profile(String name) {
		System.out.println("이름 : " + name);
	}
	
	public static void profile(String name, int age, String tel) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + tel);
	}
	
	public static void profile(String name,int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	

	public static void main(String[] args) {
		
		profile("조조조");
		profile("조조",20);


	}

}
