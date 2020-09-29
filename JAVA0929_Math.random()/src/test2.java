import java.text.DecimalFormat;

public class test2 {

	public static void main(String[] args) {

		
//		for(int i = 0 ; i<100; i++) {
//			String s = Integer.toString((int)(Math.random()*10000));	
////			
//			switch(s.length()) {
//			case 3:
//				System.out.println("0"+ s);
//				break;
//			case 2: 
//				System.out.println("00" + s);
//				break;
//			case 1:
//				System.out.println("000" + s);
//				break;
//			default:
//				System.out.println(s);
//			
////			if(s.length()<4) {
////				System.out.println("0"+ s);
////			}else if(s.length()<3) {
////				System.out.println("00" + s);
////			}else if(s.length()<2) {
////				System.out.println("000" + s);
////			}
//		
//			}	
//			
//
//		}
		
		DecimalFormat df = new DecimalFormat("000000");

		
		for(int i = 1; i<100; i++) {
		int rNum = (int)(Math.random()*1000000);
		String veriStringcode = df.format(rNum);		
		
		System.out.println(veriStringcode +"  " +i+ "번");
		}
		
		
		
		
	}

}
