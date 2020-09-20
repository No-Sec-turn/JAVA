
public class Exam3_1 {

    public static void main(String[] args) {
        // [3-1] 다음 연산의 결과를 적으시오.
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
        
        System.out.println( 1 + x << 33);
        // 1 + x = 3 이므로 3 << 33 이 된다.
        // 이 때, 좌측 33 쉬프트는 33 - 32 = 1 쉬프트와 동일하므로
        // 3 << 1 = 3 * 2 = 6
        
        System.out.println(y >= 5 || x < 0 && x > 2);
        // T || F && F  --> T
        // || 연산자보다 && 연산자가 우선이므로 뒤에 결과에 상관없이 첫번째 항 연산 결과가 true 이므로 OR 연산 결과는 true 가 됨
        System.out.println(y += 10 - x++);
        //13 // x =3 ;
        System.out.println(x += 2);
        //5
        System.out.println( !('A' <= c && c <='Z') );
        //!(T && T) -->  F
        System.out.println('C' - c);
        // (char) - (char) = (int) --> 2
        System.out.println('5' - '0');
        // 0 
        System.out.println(c + 1);
        // 
        System.out.println(++c);
        
        System.out.println(c++);
        
        System.out.println(c);
    }

}









