import java.io.CharConversionException;

public class Test2 {

	public static void main(String[] args) {

		char[] chArr = { '가', 'r', '3', ' ', '#', 'A' };

		System.out.println("대문자 : " + Character.isUpperCase(chArr[0]));

		for (int i = 0; i < chArr.length; i++) {
			if (Character.isUpperCase(chArr[i])) {
				System.out.println("chArr " + i + "번 인덱스의 값 " + chArr[i] + " 은 대문자이다");

			} else if (Character.isLowerCase(chArr[i])) {
				System.out.println("chArr " + i + "번 인덱스의 값 " + chArr[i] + " 은 소문자이다");

			} else if (Character.isDigit(chArr[i])) {
				System.out.println("chArr " + i + "번 인덱스의 값 " + chArr[i] + " 은 숫자이다");

			} else if (Character.isWhitespace(chArr[i])) {
				System.out.println("chArr " + i + "번 인덱스의 값 " + chArr[i] + " 은 공백이다");

			} else if (Character.isLetter(chArr[i])) {
				System.out.println("chArr " + i + "번 인덱스의 값 " + chArr[i] + " 은 기타문자이다");
			} else {
				System.out.println("chArr " + i + "번 인덱스의 값 " + chArr[i] + " 은 특수문자이다");

			}

		}

		System.out.println("--------------------------------");

		// 입력받은 패스워드 복잡도(적합성) 체크
		// - 입력 받은 패스워드를 char[] 타입으로 변환
		// - 해당 배열 내의 각 문자를 판별하여 해당되는 항목 당 점수 증가
		// - 대문자, 소문자, 숫자, 특수문자 항목당 +1점 증가
		// => 단, 전체 길이가 8자 미만이면 "8자리 이상 필수!" 출력 후 종료
		// ==> 단, 중복 항목에 대한 점수는 1점만 증가
		// - 점수가 4점이면 패스워드 XXX: 사용 가능(안전!) 출력
		// - 점수가 2~3점이면 "패스워드 XXX : 사용 가능(보통!)" 출력
		// - 점수가 1점 이하면 "패스워드 XXX : 사용 불가!" 출력

		int safetyPoint = 0;
		int upperSize = 0;
		int lowerSize = 0;
		int charSize = 0;
		int ditSize = 0;
		String password = "1265Acckvj@@";
		char[] chPassword = password.toCharArray();

		// for(int i = 0;i<chPassword.length;i++)
		// System.out.println(i+" 번 인덱스의 배열값 " + chPassword[i]);

		if (chPassword.length < 8) {
			System.out.println("8자리 이상 필수!");
		} else {

			for (int i = 0; i < chPassword.length; i++) {
				if (Character.isUpperCase(chPassword[i])) {

					upperSize = upperSize + 1;
				} else if (!Character.isLetterOrDigit(chPassword[i])) {

					charSize = charSize + 1;
				} else if (Character.isLowerCase(chPassword[i])) {

					lowerSize = lowerSize + 1;
				} else if (Character.isDigit(chPassword[i])) {

					ditSize = ditSize + 1;

				}
			}

			if (upperSize > 0)

			{
				safetyPoint = safetyPoint + 1;
			}
			if (lowerSize > 0) {
				safetyPoint = safetyPoint + 1;
			}
			if (charSize > 0) {
				safetyPoint = safetyPoint + 1;
			}
			if (ditSize > 0) {
				safetyPoint = safetyPoint + 1;
			}

			System.out.println("safetyPoint : " + safetyPoint);

			switch (safetyPoint) {
			case 4:
				System.out.println("패스워드 사용가능(안전!)");
				break;
			case 3:
				System.out.println("패스워드 사용 가능(보통!)");
				break;
			case 2:
				System.out.println("패스워드 사용 가능(보통!)");
				break;

			default:
				System.out.println("패스워드 사용불가!");
				break;
			}
		}
	}
}
