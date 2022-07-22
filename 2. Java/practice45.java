package poly;


class Parent{

	int parentMoney = 1000;
	
}

class Child extends Parent{
	
	int childMoney = 500;
	
}



public class Ex01 {

	public static void main(String[] args) {
		
		Parent poly = new Child();		// 업캐스팅	- 부모 위주 . 부모 필드와 부모 메소드만 접근가능
		System.out.println(poly.parentMoney);
		
		
		Child poly2 = (Child) poly;		// 다운캐스팅
		System.out.println(poly2.parentMoney);
		System.out.println(poly2.childMoney);
		
		
		Parent poly3 = poly2;			// 업캐스팅
		System.out.println(poly3.parentMoney);


	}

}
