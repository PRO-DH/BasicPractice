package collection;

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "홍길동");
		map.put(2, "성춘향");
		map.put(3, "이순신");
		map.put(4, "이몽룡");
		
		System.out.println(map.size());		// 총 key 객체수
		System.out.println(map);			// 전체 출력
		System.out.println(map.get(1));		// key값으로 value 얻기
		System.out.println(map.get(5));		// 없으면 null 반환
		
		// 객체 하나씩 처리하는 법 - key 값을 set 타입으로 바꾸고 set 타입으로 key를 하나하나 받은 후 그 key에 대응하는 value 가져오기
		Set<Integer> keySet = map.keySet();	// 전체 key 객체목록을 set타입으로 반환
		Iterator<Integer> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			int key = keyIter.next();
			System.out.println(key+"의 값은 : "+map.get(key));
		}
		
		map.remove(1);		// key객체로 Entry 삭제
		map.clear(); 		// 전체 삭제
		if(map.isEmpty()) {
			System.out.println("비어있음");
		}
		
		
    
    		HashMap<String, Integer> score = new HashMap<>();
		
		score.put("수학", 90);
		score.put("국어", 95);
		score.put("영어", 100);
		score.put("자바", 80);
		
		
		
		Set<String> set = score.keySet();
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + "의 벨류는 : " + score.get(key));
		}
		
    
		
		
	}

}
