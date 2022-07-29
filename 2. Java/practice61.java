package member;

public class Member {
	
	private String name;
	private int age;
	private String phoneNum;
	
	public Member(String name, int age, String phoneNum) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void memberProfile() {
		System.out.println("이름은 : "+ name + "나이는 : " + age + "전번은 : " + phoneNum);
	}
	
	
  
  public interface MemberService {
	
	public abstract void list();
	public abstract void insert();
	public abstract void memberView();
	public abstract void memberEdit();
	public abstract void memberDelete();
	
	
  }
  
  
  ublic class MemberServiceImpl implements MemberService {

	
	

	private ArrayList<Member> list = new ArrayList<>();
	
	private Scanner scan = new Scanner(System.in);
	
	
	
	
	
	
	@Override
	public void list() {
	// 회원 목록 출력

	for(int i = 0; i < list.size(); i++) {
	Member memberList = list.get(i);
	memberList.memberProfile();
	}

	}

	@Override
	public void insert() {
	// 회원의 이름 나이 전화번호를 입력받아 회원등록
	System.out.print("이름 입력 : ");
	String name = scan.next();
	System.out.print("나이 입력 : ");
	int age = scan.nextInt();
	System.out.print("전화번호 입력 : ");
	String phoneNum = scan.next();

	list.add(new Member(name, age, phoneNum));

	}

	@Override
	public void memberView() {
	// 이름을 입력받아 회원의 나이와 전화번호 출력
	System.out.print("조회할 회원의 이름 : ");
	String name = scan.next();

	for(int i = 0; i < list.size(); i++) {

	Member memberView = list.get(i);

	if(memberView.getName().equals(name)) {

	System.out.println(name + "님의 나이는 : " + memberView.getAge());
	System.out.println(name + "님의 전화번호는 : " + memberView.getPhoneNum());
	return;

	}

	}
	System.out.println(name + "님은 저희 회원이 아닙니다.");

	}

	@Override
	public void memberEdit() {
	// 이름을 입력받아 회원의 나이와 전화번호 수정

	System.out.print("수정할 회원의 이름 : ");
	String name = scan.next();

	for(int i = 0; i < list.size(); i++) {

	Member edit = list.get(i);

	if(edit.getName().equals(name)) {

	System.out.println(name + "님의 나이는 : " + edit.getAge() + "살 입니다.");
	System.out.print("수정할 나이 : ");
	int newAge = scan.nextInt();
	System.out.println(name + "님의 전화번호는 : " + edit.getPhoneNum() + "번 입니다.");
	System.out.print("수정할 전화번호 : ");
	String newPhoneNum = scan.next();

	edit.setAge(newAge);
	edit.setPhoneNum(newPhoneNum);

	System.out.println(name + "님의 나이와 전화번호를 수정했습니다.");
	return;

	}
	}
	System.out.println(name + "님은 저희 회원이 아닙니다.");

	}

	@Override
	public void memberDelete() {
	// 이름을 입력받아 회원삭제
	System.out.print("삭제할 회원의 이름 : ");
	String name = scan.next();

	for(int i = 0; i < list.size(); i++) {

	Member del = list.get(i);

	if(del.getName().equals(name)) {

	list.remove(i);
	System.out.println(name + "회원을 삭제하였습니다.");
	return;

	}
	}
	System.out.println(name + "님은 저희 회원이 아닙니다.");
	}	
	
	
	
	
	
	
public class MemberMain {

	public static void main(String[] args) {
		
		MemberService service = new MemberServiceImpl();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("######### 회원 관리 프로그램 #########");
			System.out.println("1.회원목록  2.회원조회  3.회원등록");
			System.out.println("4.회원수정  5.회원삭제  6.종료");
			System.out.println("################################");
			System.out.println();
			System.out.println("메뉴 입력 : ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				service.list();
				break;
			case 2:
				service.memberView();
				break;
			case 3:
				service.insert();
				break;
			case 4:
				service.memberEdit();
				break;
			case 5:
				service.memberDelete();
				break;
			case 6:
				System.out.println("회원 관리 프로그램을 종료합니다");
				System.exit(0);
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
