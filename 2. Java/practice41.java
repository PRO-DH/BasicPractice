package inheritance;


class Parent{	// 부모클래스 
	int parentMoney = 10000;
	
	public void parentMethod() {
		System.out.println("부모클래스 메소드 입니다.");
	}
}


class Child extends Parent{
	int childMoney = 100;
	
	public void childMethod() {
		System.out.println("자식클래스 메소드 입니다.");
	}
}


public class Ex01 {

	
	public static void main(String[] args) {

		Child child = new Child();
		child.parentMethod();
		child.childMethod();
		System.out.println(child.parentMoney);
		System.out.println(child.childMoney);
	}

}
