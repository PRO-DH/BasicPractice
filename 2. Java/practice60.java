package collection;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		// 객체 추가 메소드 x.add
		list.add(new String("홍길동"));
		list.add("성춘향");
		list.add("이몽룡");
		list.add(0,"이순신");		// index 0 번에 이순신 객체를 끼워넣는다.-> 나머지는 인덱스가 하나씩 밀린다.
		
		// 객체 치환(교체)
		list.set(0, "세종대왕");	// index 0 번의 객체를 세종대왕 객체로 대체한다.
		
		// 겍체 수 메소드 x.size
		list.size();
		
		// x번째 객체 얻기
//		list.get(x);
		
		// list 안에 객체 있는지 확인하기. 있으면true/없으면false
		list.contains("확인할객체");
		
		// 객체 삭제
//		list.remove(인덱스);
		list.remove("객체");
		
		// 리스트 안의 모든 객체 삭제
		list.clear();
		
		// 향상된 for문 사용법
		for(String str : list) {
		}
		
		
		
		
		//ex
		for (int i = 0; i < list.size() ; i++){
			String str = list.get(i);
			System.out.println(i+" : " + str);
		}
		
		
		
	}

}
