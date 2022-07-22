package inner;


//로컬클래스

class LocalEx{
	
	public void method() {
		class LocalInner{					//메소드 내부의 클래스. 메소드가 끝나면 이 클래스는 소멸이 된다.
			String name = "홍길동";			//static int age = 20;  -- static 은 사용불가능하다.
			void hello() {
				System.out.println(name+"님 안녕하세요");			
			}
		}
		LocalInner inner = new LocalInner();
		inner.hello();
	}
}

public class Ex04 {

	public static void main(String[] args) {
		LocalEx ex = new LocalEx();
		ex.method();

	}

}
