package collectionFramewrok;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Ex_set {

	public static void main(String[] args) {
		
		/*
		 * Set 인터페이스 계열
		 *  - 저장 순서를 유지하지 않고, 데이터 중복을 허용하지 않는 구조
		 *  => 하나의 주머니에 무작위로 저장하는 구조와 동일함
		 * 
		 * 
		 * 
		 */
		
		
		
		Set set = new HashSet();
		
		System.out.println("Set 객체가 비어있는가?" + set.isEmpty());
		System.out.println("Set 객체에 저장된 요소 갯수:" + set.size());

		// add(Object o) : 모든 타입의 데이터 추가
		set.add(1);
		set.add("Two");
		set.add(3.14);
		
				
		set.add('5');
		set.add("육");
		
		
		System.out.println("Set 객체가 비어있는가?" + set.isEmpty());
		System.out.println("Set 객체에 저장된 요소 갯수:" + set.size());
		
		// toString() 메서드가 오버라이딩 되어 있으므로 요소 출력 가능
		System.out.println("set객체에 저장된 모든 요소 :" + set.toString());
		System.out.println("set객체에 저장된 모든 요소 :" + set);
		
		System.out.println("정수 1 추가 가능한가?" + set.add(1));
		System.out.println("정수 4 추가 가능한가?" + set.add(4));
		
		// contain(object o ) : 해당 요소 존재 여부 리턴
		System.out.println("문자열 TWO가 포함되어 있는가?"  + set.contains("TWO") ) ;
		System.out.println("문자열 5가 포함되어 있는가?"  + set.contains("5") ) ;
		System.out.println("리터럴 5가 포함되어 있는가?"  + set.contains('5') ) ;
		System.out.println("set객체에 저장된 모든 요소 :" + set);

		
		// remove(Object o) : 해당 요소 제거
		System.out.println("문자열 \"육\" 제거결과 " + set.remove("육"));
		System.out.println("set객체에 저장된 모든 요소 :" + set);

		// toArray() : 컬렉션 객체를 배열로 변환
		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(arr)); // 반복문 없이 배열내용 모두 출력
		
		//clear() : 컬렉션 객체 요소 모두 삭제
		set.clear();
		System.out.println("set객체에 저장된 모든 요소 :" + set);
		System.out.println("Set 객체가 비어있는가?" + set.isEmpty());
		System.out.println("Set 객체에 저장된 요소 갯수:" + set.size());
		
		
		
		
		
		
		
		//컬렉션 객체의 데이터를 꺼내는 공통 방법
		// 1. 향상된 for문 사용
//		for(꺼내서 담을 변수 : 데이터가 저장된 객체)
		for(Object o :set) {
//			System.out.println("저장된 데이터:"+  o);
		}
		
		// 2. Iterator(반복자) 객체 사용
		// Set 객체의 iterator() 메서드를 호출하여 Iterator 객체 리턴 받음
	     Iterator ite = set.iterator();
	     
	     // while문을 사용하여 저장된 요소가 존재할 동안 반복
	     while(ite.hasNext()) { // 다음 요소 존재 여부 판별
	    	 Object o = ite.next();  // 다음 요소 꺼내기
//	    	 System.out.println("저장된 요소:" + o);
	    	 
	     }
		
	     System.out.println("==================================");
	     
	     Set set2 = new HashSet();
	     
	     
	     set2.add(1);
	     set2.add(2);
	     set2.add(3);
	     set2.add(455);
	     set2.add(5);
	     set2.add(6);
	     
	     System.out.println(set2);
	     
	     // Set 계열 구현체 클래스 중 정렬 기능을 제공하는 클래스 :TreeSet
	     
	     //treeset 사용시 데이터를 자동으로 오름차순으로 정리
	     Set treeSet = new TreeSet(set2);
	     System.out.println(treeSet);
	     

			Set set3 = new TreeSet();
			set3.add(10);
			set3.add(20);
			System.out.println(set3);
			
			// addAll() : 기존 컬렉션 객체에 다른 컬렉션 요소를 한 번에 추가
			set3.addAll(treeSet);
			System.out.println(set3);
	     
			Set set4 = new HashSet(set3);
			System.out.println(set4);
			System.out.println("set3와 set4는 같은가?" + set3.equals(set4));
	}

}
