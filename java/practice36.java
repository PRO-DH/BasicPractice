package inner;


class Outer1{
	
	private int x = 100;
	private static int y = 200;
	
	public void outerMethod1() {
		System.out.println("public 바깥 클래스 메소드");
	}
	
	private void outerMethod2() {
		System.out.println("private 바깥클래스 메소드");
	}
	
	class Inner1{//인스턴스 멤버클래스
		private int y = 300;
		public void disp() {
			System.out.println("Outer x : " + x);
			System.out.println("Outer y : " + Outer1.y);
			System.out.println("Inner y : " + y);
			outerMethod1();
			outerMethod2();
		}
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
	}

}
