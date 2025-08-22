package programmers;


// 실행 Ctrl + F11
public class Java_20240911 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "1 5 4 8 21";
		String answer = "";
		
		String sArray[] = null;
		
		sArray = s.split(" ");
		
		for(int i = 0; i < sArray.length; i++){
			int numArr[] = new int[sArray.length];
			
			numArr[i] = Integer.parseInt(sArray[i]);

//		    System.out.print(sArray[i] + " ");
//		    System.out.print(numArr[i] + " ");
		    
		}
		
		
		

	}


}
