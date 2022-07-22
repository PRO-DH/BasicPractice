package inner;


class Outer5{
	
	public void aaa() {
		System.out.println("aaa");
	}
	
	public void bbb() {
		System.out.println("bbb");
	}
	
	public void ccc() {
		System.out.println("ccc");
	}
	
}


public class Ex05 {

	public static void main(String[] args) {
		Outer5 outer = new Outer5() {				// 익명 내부클래스 - Outer5클래스를 가져와서 여기서 내 입맛에 바꾸게 수정할 수 있다.
			public void bbb() {
				System.out.println("bbbbb");
			}
		};
		
		outer.aaa();
		outer.bbb();
		outer.ccc();

	}

}
