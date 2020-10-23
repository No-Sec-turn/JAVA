import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		/*
		 * HashSet, ArrayList, HashMap 객체 생성 및 사용
		 * => 제네릭타입 적용
		 */
		HashSet<Integer> myLotto = new HashSet<Integer>();
		// 제네릭타입으로 Integer 타입을 지정했으므로 정수만 사용 가능
		myLotto.add(10);
		myLotto.add(20);
		myLotto.add(30);
//		myLotto.add("10"); // 오류 발생! 정수 타입 외에는 추가 불가능
		
		for(int num : myLotto) { // for(Integer num : myLotto) 사용 가능
			System.out.println(num);
		}
		
		HashSet<Double> set = new HashSet<Double>();
		set.add(3.3);
		set.add(1.1);
		
		System.out.println("=======================");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
//		list.add(10); // 오류 발생! String 타입 외에는 저장 불가능
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println("========================");
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// 키는 정수, 값은 문자열만 사용 가능
		
		map.put(1, "홍길동");
		map.put(2, "이순신");
//		map.put("2", "이순신"); // 키는 정수만 사용 가능
//		map.put(2, 10); // 값은 문자열만 사용 가능
		System.out.println(map);
		
		
	}

}


















