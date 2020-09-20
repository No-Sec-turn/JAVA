
public class Exam3_2 {

    public static void main(String[] args) {
        /*
         * [3-2] 아래의 코드는 사과를 담는데 필요한 
         * 바구니(버켓)의 수를 구하는 코드이다. 
         * 만일 사과의 수가 123개이고 
         * 하나의 바구니에는 10개의 사과를 담을 수 있다면, 
         * 13개의 바구니가 필요할 것이다. 
         * (1)에 알맞은 코드를 넣으시오.
         * 
         * int numOfApples = 123; // 사과의 개수
         * // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
         * int sizeOfBucket = 10; 
         * // 모든 사과를 담는데 필요한 바구니의 수
         * int numOfBucket = (  (1)  ); 
         * System.out.println("필요한 바구니의 수 : " + numOfBucket);
         *          * 
         */ 
        int numOfApples = 134; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        
        // 모든 사과를 담는데 필요한 바구니의 수
        // 사과를 바구니 수로 나눈 갯수를 먼저 계산한 후(기본 필요 바구니 수 계산됨)
        // 사과를 바구니 수로 나눈 나머지가 1일 경우 바구니 수 + 1, 아니면 바구니 수 + 0
        
        
        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket >  0 ? 1 : 0);
        	
        System.out.println("필요한 바구니의 수 : " + numOfBucket);
    
    
    
    }

}


















