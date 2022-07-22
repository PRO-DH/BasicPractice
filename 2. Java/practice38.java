package inner;

//Outer 클래스의 ststic 멤버클래스 예제

class Outer3{
	
	private int x = 100;
	private static int y = 200;
	
	static class Inner3{
		//정적멤버 클래스
		private int z = 300;
		private static int zz = 400;
		
		public void disp() {
			System.out.println("Outer y : " + y);	// outer클래스의 정적 멤버변수만 사용가능
			System.out.println("Inner z : " + z);
			System.out.println("Inner zz : " + zz);
			
		}
	}
}


public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
