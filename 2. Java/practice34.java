package clazz.array;

import java.util.Scanner;

class Member{
	private String name;
	private int age;
	private String tel;
	public Member() {

	}
	public Member(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}
	
	
class MemberService{
	Member[] member;
	Scanner scan = new Scanner(System.in);
	
	public MemberService() {
		// TODO Auto-generated constructor stub
	}
	
	public void memberInsert() {
		//Scanner로 회원수를 입력받아 그 수만큼 Member배열을 생성하고 필드에 저장하기
		//반복문으로 회원의 이름,나이,전화번호를 입력받아 Member객체를 생성 후 멤버 타입의 배열의 각 요소에 저장하기
		
		System.out.println("등록할 회원의 수 입력 : ");
		member = new Member[scan.nextInt()];
		System.out.println("회원 정보를 등록합니다 !\n==================");
		for(int i = 0; i< member.length ; i++) {
			System.out.println("이름 : ");
			String name = scan.next();
			System.out.println("나이 : ");
			int age = scan.nextInt();
			System.out.println("전화번호 : ");
			String tel = scan.next();
			System.out.println();
			member[i] = new Member(name,age,tel);
		}
	}
	
	public void memberPrint(){
		//반복문으로 Member 배열안의 Member객체의 회원 이름 나이 전화번호 출력하기
		
		for(int i = 0 ; i < member.length ; i++) {
			System.out.println(i+1+"번째 회원의 정보");
			System.out.println("이름 : " + member[i].getName() + "/ 나이 : "+member[i].getAge() +"/ 전화번호 : "+member[i].getTel());
		}
	}
	
	public void memberEdit() {
		for(int i = 0 ; i < member.length ; i++) {
			System.out.print(i+1+"번째 회원 : " + member[i].getName());
			System.out.println();
		}
		System.out.println("몇번째 회원의 정보를 수정할까요? : ");
		int su = scan.nextInt();
		System.out.println(su+"번째 회원의 정보를 수정합니다.");
		System.out.println(member[su-1].getName() + "님의 나이는 : " + member[su-1].getAge() + "살 입니다.");
		System.out.println("수정할 나이를 입력해주세요 : ");
		int age = scan.nextInt();
		System.out.println(member[su-1].getName() + "님의 전화번호는 : " + member[su-1].getTel() + "번 입니다.");
		System.out.println("수정할 전화번호를 입력해주세요 : ");
		String tel = scan.next();
		member[su-1].setAge(age);
		member[su-1].setTel(tel);
		System.out.println(member[su-1].getName()+"회원의 정보가 수정되었습니다.");
	}
}
	
	

public class Ex03 {

	public static void main(String[] args) {
		MemberService memserv = new MemberService();
		
		Scanner scan = new Scanner(System.in);
		memserv.memberInsert();
		while(true) {
			System.out.println("\n==============================");
			System.out.println("1.회원정보보기 2.회원정보수정 3.종료 : ");
			System.out.println("==============================\n");
			int choice = scan.nextInt();
			System.out.println();
			switch(choice) {
			case 1:
				memserv.memberPrint();
				break;
			case 2:
				memserv.memberEdit();
				break;
			case 3:
				System.out.println("회원 프로그램 종료");
				System.exit(0);
			default :
				System.out.println("잘못입력하였습니다.");
			}
		}
		
	}
}
