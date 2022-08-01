package collection;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		
		set.add(new String("홍길동"));
		
		set.add("이순신");
		
		System.out.println(set.size());
		
		Iterator<String> setIter = set.iterator();
		while(setIter.hasNext()) {
			String str = setIter.next();
			System.out.println(str);
		}
		
		set.clear(); //전체삭제
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
		
	}

}
