
public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int형 정수를 저장하는 변수 num을 선언
		int num;
		
		// int 형 변수 num에 정수 10을 저장
		num = 10;
		num = 20; // 만약, 20을 저장하게 되면 기존 정수 10은 제거됨
		
		// int 형 변수 num에 저장된 값을 출력
		System.out.println(num);

		
		// 학생 5명의 점수를 저장하는 변수
		int score1 = 80, score2 = 60, score3= 70, score4= 100, score5= 10;
		System.out.println("1번 학생 점수:" + score1);
		System.out.println("2번 학생 점수:" + score2);
		System.out.println("3번 학생 점수:" + score3);
		System.out.println("4번 학생 점수:" + score4);
		System.out.println("5번 학생 점수:" + score5);
		
		System.out.println("=============================");
		
		
		//배열 선언 : 데이터 타입[] 배열명;
		// int 형 정수 10개를 저장하기 위한 배열 변수 arr을 선언
		
		//int[] arr; // int형 정수 저장을 위한 배열 공간의 이름을 arr로 선언!
		// ==> 주의! 아직 정수를 저장할 수 있는 메모리 공간은 생성되기 전!
		
		//배열 생성: 배열명 = new 데이텉타입[데이터크기]
		
		//arr = new int[3];
		// => 실제 데이터 저장이 가능한 메모리 공간 3개가 연속적으로 생성됨
		// => 이때, 배열이 생성되면 자동으로 기본 값으로 초기화 됨
		
		// 위의 배열 선언 및 배열 생성 코드를 한 문장으로 결합
		 
		int[] arr = new int[3]; // 0~2번 인덱스를 갖는 배열 공간 생성
		
		// 배열의 각 인덱스에 접근하여 저장된 데이터 출력		
		System.out.println("배열 arr의 0번 인덱스 : "+ arr[0]);
		System.out.println("배열 arr의 0번 인덱스 : "+ arr[1]);
		System.out.println("배열 arr의 0번 인덱스 : "+ arr[2]);
		//System.out.println("배열 arr의 0번 인덱스 : "+ arr[3]);
		// => 0~2번까지의 인덱스만 존재하므로, 존재하지 않는 인덱스를
		//접근하려 하는 경우 ArrayIndexOutOfBoundsException 발생
		// => java.lang.ArrayIndexOutOfBoundsException: 3 at Ex.main(Ex.java:49)
		// => 3이라는 인덱스가 잘못됐다는 메세지이며, 92번 라인이 원인.

		System.out.println("-----------------------------");
		// 배열 arr의 0번 인덱스에 정수 10을 저장
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println("배열 arr의 0번 인덱스 : "+ arr[0]);
		System.out.println("배열 arr의 0번 인덱스 : "+ arr[1]);
		System.out.println("배열 arr의 0번 인덱스 : "+ arr[2]);
		
		arr[2] = 100;
		System.out.println("배열 arr의 0번 인덱스 : "+ arr[2]);
		
		System.out.println("-----------------------------");
		
		
		int nums[] = {1,2,3,4,5,6,7,8,9};
		
		
		
		String names[] = {"홍길동", "이순신", "강감찬"};
		System.out.println("배열 names의 0번 인덱스:"+names[0]);
		System.out.println("배열 names의 1번 인덱스:"+names[1]);
		System.out.println("배열 names의 2번 인덱스:"+names[2]);
		
		System.out.println("-----------------------------");
		
		System.out.println("배열 names의 크기길이: "+names.length);
		
		System.out.println("==============================");

		// 반복문을 사용하여 배열 내의 모든 데이터에 접근
		
		
		int index = 0;
		System.out.println("배열 arr의 0번 인덱스 : "+ names[index]);
		index++;
		System.out.println("배열 arr의 0번 인덱스 : "+ names[index]);
		index++;
		System.out.println("배열 arr의 0번 인덱스 : "+ names[index]);
		
		System.out.println("-----------------------------");
		
		for(int i=0;i < 3;i++) {
			//System.out.println(names[i]);
			
			System.out.printf("배열 names의 %d 번 인덱스 : %s\n",i,names[i]);
			
		}
		
		// 2) nums 배열의 모든 정수 출력
		
		for(int i=0;i<nums.length;i++) {
			System.out.println("배열 nums의 "+i+"번 인덱스 : "+ nums[i]);
			System.out.printf("배열 nums의 %d번 인덱스 : %d\n",i,nums[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

