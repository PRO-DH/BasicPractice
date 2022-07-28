package expression;

import java.util.Scanner;
import java.util.regex.Pattern;

class Profile{
	
	String name;
	int age;
	String tel;
	String email;
	
	public Profile(String name, int age, String tel, String email ) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.email = email;
	}
	
	public void profilePrint() {
		System.out.println("-------------------------------");
		System.out.println(name+"님의 프로필 정보입니다.");
		System.out.println("나이는 " +age+"살");
		System.out.println("전화번호는 "+tel+"번");
		System.out.println("이메일은 "+email);
		System.out.println("------------------------------");
		
	}
}




public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = scan.next();
		System.out.println("나이 입력 : ");
		int age = scan.nextInt();
		System.out.println("전번 입력 : ");
		String tel = scan.next();
		System.out.println("메일 입력 : ");
		String email = scan.next();
		
		boolean nameCheck = Pattern.matches("[가-힣]*", name);
		
		boolean ageCheck;
		if(age<20||age>60) {
			ageCheck = false;
		}else {
			ageCheck = true;
		}
		
		boolean telCheck = Pattern.matches("\\d{2,3}-\\d{3,4}-\\d{4}", tel);
		
		boolean emailCheck = Pattern.matches("\\w+@\\w.\\w+(.\\w+)?", email);
	
		
		
		if(nameCheck == false) {
			System.out.println("이름 잘못 입력");
		}
		if(ageCheck == false) {
			System.out.println("나이 잘못 입력");
		}
		if(telCheck == false) {
			System.out.println("전번 잘못 입력");
		}
		if(emailCheck == false) {
			System.out.println("메일 잘못 입력");
		}
		if(nameCheck==true && ageCheck == true && telCheck == true && emailCheck ==true) {
			Profile profile1 = new Profile(name,age,tel,email);
			profile1.profilePrint();
		}
		

	}

}
