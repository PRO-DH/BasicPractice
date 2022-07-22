package pack01;

public class FieldMethodEx {
	
	public String str1 = "public필드";
	protected String str2 = "protected필드";
	String str3 = "default필드";
	private String str4 = "private필드";
	
	public void method1() {
		System.out.println("public 메소드");
	}
	protected void method2() {
		System.out.println("protected 메소드");
	}
	void method3() {
		System.out.println("default 메소드");
	}
	private void method4() {
		System.out.println("private 메소드");
	}
	
	public static void main(String[] args) {
		FieldMethodEx ex = new FieldMethodEx();
		System.out.println(ex.str1);
		System.out.println(ex.str2);
		System.out.println(ex.str3);
		System.out.println(ex.str4);
		
		ex.method1();
		ex.method2();
		ex.method3();
		ex.method4();
		
	}

}

package pack02;

import pack01.A;
import pack01.ConstructorEx;
import pack01.FieldMethodEx;

public class ClassTest2 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();

		ConstructorEx ex1 = new ConstructorEx();
		ConstructorEx ex2 = new ConstructorEx(1);
		ConstructorEx ex3 = new ConstructorEx(1,2);
		ConstructorEx ex4 = new ConstructorEx(1,2,3);
		
		
		FieldMethodEx ex = new FieldMethodEx();
		System.out.println(ex.str1);
		System.out.println(ex.str2);
		System.out.println(ex.str3);
		System.out.println(ex.str4);
		
		ex.method1();
		ex.method2();
		ex.method3();
		ex.method4();
	}

}
