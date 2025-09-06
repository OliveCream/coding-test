package programmers;


// 실행 Ctrl + F11
public class Java_Level_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s = "1 5 4 8 21";
//		String answer = "";
//		
//		String sArray[] = null;
//		
//		sArray = s.split(" ");
//		
//		for(int i = 0; i < sArray.length; i++){
//			int numArr[] = new int[sArray.length];
//			
//			numArr[i] = Integer.parseInt(sArray[i]);
//
////		    System.out.print(sArray[i] + " ");
////		    System.out.print(numArr[i] + " ");
//		    
//		}
		
		//*** Lv.0 ***
		//평균 구하기
		p_12944(new int[]{1,1,2,2,2});
		
		
		

	}
	
	//----------------------------------------------------------------------------- 2025-09-6(토)
	//평균 구하기
	public static void p_12944(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        
        answer = (double)sum / arr.length;
           
        System.out.println("[p_12944] 평균 구하기 : " + answer);
	}


}
