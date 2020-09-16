
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 증감연산자(++,--)
		 * 
		 * - 단항연산자로 피연산자가 1개뿐인 연산자
		 * - 피연산자(변수)의 값을 1만큼 증가(++)시키거나 감소(--)시킴
		 * - 피연산자의 앞에 붙을 경우 전위(선생)연산자로 사용되며
		 * 	 피연산자의 뒤에 붙을 경우 후위(후행)연산자로 사용됨
		 * 
		 *전위(선행)연산자 : 피연산자의 값을 먼저 1만큼 증가시킨 뒤 다른여산 등에 참여함
		 * 	- 전위(선생)연산자: 피연산자의 값을 먼저 1만큼 증가 또는 감소시킨뒤 다른 연산등에 참여
		 *  - 후위(후행)연산자: 피연산자를 먼저 다른 연산등에 참여시킨 뒤 피연산자의 값을 1만큼 증가 또는 감소 
		 * 
		 * 
		 * 
		 * 
		 */
		
		int a = 10;
		++a; // 증감연산자를 사용하여 a값을 1만큼 증가시킴
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		--a;
		System.out.println(a);
		
		a--;
		System.out.println(a);
		
		System.out.println("---------------------------------");
		
		
		int x = 5;
		int y = ++x; // (전위)선행 연산자
		// 먼저 x의 값을 1만큼 증가시킨 후 변수 y에 x값을 대입한다.
		
		// 따라서x가 5 ->6으로 변화된 후y에 저장되므로 y도 6이 저장
		
		
		System.out.println(x+ ","+ y);
		
		int x2 = 5;
		int y2= x2++; //후위(후행)연산자
		
		// 먼저 x2의 값을 변수 y2에 대입한 뒤, x2의 값을 1만큼 증가시킴
		// 따라서, x2 5일때 y2에 저장되고, 그 후 x2의 값이 5 -> 6으로 증가 됨
		
		
		System.out.println(x2+ ","+ y2);

		int i =5;
		int j = ++i;
		// 선생 연산자이므로i값을 1증가 시킨 후 j에 저장 (i =6, j=6)
		
		System.out.println(j);
		System.out.println(j++);
		// 후행연산자이므로 j값을 출력한 후, 1 증가시킨
		// (6이 출력된 후, j값을 6 -> 7 로 증가됨)
		
		System.out.println(j);
		System.out.println(--j);
		System.out.println(j);
		// 선행연산자이므로 j값을 1감소 시킨 후, 출력
		// => j값은 7->6으로 감소된 후 6이 출력됨
	
		System.out.println("----------------------------");
		
		char ch = 'A';
		
		ch = (char)(ch+1);
		System.out.println(ch);
		ch +=1;
		System.out.println(ch);
		ch++;
		System.out.println(ch);
		
		
		
	
	}

}
