package collectionFramewrok;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test_Set {

	public static void main(String[] args) {

		
		/*Set 객체를 활용한 로또 번호 생성기
		 * - 중복되지 않는 1~45 범위의 난수 6개를 저장
		 * - 저장되는 난수는 오름차순 정렬
		 * 
		 * 
		 */
		end:
		while(true) {
			int count = 0;
		
		for(int i =1; i<=10; i++) {
		Set myLotto = new TreeSet();
		
		while(true) {
		
		myLotto.add((int)((Math.random()*45)+1));
		if(myLotto.size()==6) {
			break;
		}
		
		}
		System.out.println("나의 로또 번호 : " + myLotto);
		
		
		
		//====================================
		// 1등 당첨번호(1,11,21,31,41,42)와 비교하여
		// 일치하는 번호 갯수 출력
		
		
		Set thisWeekLotto = new TreeSet();
		thisWeekLotto.add(1);
		thisWeekLotto.add(11);
		thisWeekLotto.add(21);
		thisWeekLotto.add(31);
		thisWeekLotto.add(41);
		thisWeekLotto.add(42);
		
		System.out.println("이번주로또번호 : " + thisWeekLotto );
	
		
		
//		     Iterator ite = thisWeekLotto.iterator();
//		     Iterator ite2 = myLotto.iterator();

		for(Object o : myLotto)
		if(thisWeekLotto.contains(o)) {
			count ++;
		}
		
		
		System.out.println("맞춘갯수:" + count);
		
		count = 0;
		}
		
		
		if(count==6) {
		break end;
		}
		
				}
	


		
	}
	
}

