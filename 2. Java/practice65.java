package collection;

import java.util.*;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String,String> profile = new HashMap<>();
		
		while(true) {
			System.out.println("\n\n\n");
			System.out.println("==========menu==========");
			System.out.println("1.ID추가  2.ID삭제  3.목록보기   4.프로그램종료");
			System.out.println("========================");
			System.out.println();
			System.out.println("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("아이디 입력 : ");
				String id = scan.next();
				System.out.println("비번 입력 : ");
				String pw = scan.next();
				profile.put(id, pw);
				break;
			
			case 2:
				System.out.println("삭제할 아이디 입력 : ");
				String id2 = scan.next();
				profile.remove(id2);
				System.out.println("삭제되었습니다.");
				break;
			case 3:
				Set<String> set = profile.keySet();
				Iterator<String> itr = set.iterator();
				while(itr.hasNext()) {
					String key = itr.next();
					System.out.println(key+"의 비밀번호는 : "+profile.get(key));
				}
				break;
				
			case 4: 
				System.out.println("종료합니다.");
				System.exit(0);
			default:
				System.out.println("잘못된입력!!");
			
				
				
			
			}
		}
		


	}

}
