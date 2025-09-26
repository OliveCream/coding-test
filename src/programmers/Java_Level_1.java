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
		
		//*** Lv.1 ***
		//평균 구하기
		//p_12944(new int[]{1,1,2,2,2});
		
		//하샤드 수
		//p_12947(15246);
		
		//핸드폰 번호 가리기
		p_12948("027778888");
		

	}
	
	//----------------------------------------------------------------------------- 2025-09-06(토)
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
	
	//-----------------------------------------------------------------------------
	//하샤드 수
	public static void p_12947(int x) {
        boolean answer = true;
        int sum=0;
        String number = Integer.toString(x);
        for(int i=0 ; i<number.length() ; i++){
            sum += Character.getNumericValue(number.charAt(i));
            //sum += number.charAt(i) - '0';		//아스키코드값을 정수로 변환
        }
        if(x%sum != 0){
            answer = false;
        }
        
        //다른 방법 - 매개변수 int를 %로 일의자리 수를 뽑아 더하는 방법
        /*
		int number = x;
		int sum = 0;
		
		while(number > 0){
		    sum += number % 10;
		    number /= 10;
		}
		if(x%sum != 0){
		    answer = false;
		}
		*/
        System.out.println("[p_12947] 하샤드 수 : " + answer);
	}

	//-----------------------------------------------------------------------------
	//핸드폰 번호 가리기	
	public static void p_12948(String phone_number) {
        char[] answer = phone_number.toCharArray();
		for(int i=0;i<answer.length-4;i++){
            answer[i] = '*';
        }
        
		// String answer = phone_number;
		// StringBuilder sb = new StringBuilder(answer);
        //
		// for(int i = 0 ; i < phone_number.length()-4 ; i++){
		// sb.setCharAt(i, '*');
		// answer = sb.toString();
		// }

        System.out.println("[p_12947] 하샤드 수 : " + String.valueOf(answer));
	}

	
        
}
