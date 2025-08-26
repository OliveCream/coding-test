package programmers;

public class Java_Level_0 {
	
	//실행
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//짝수 홀수 개수
		//p_120824(new int[]{1,1,2,2,2});
		
		//피자 나눠 먹기(1)
		//p_120814(22);
		
		//세균 증식
		//p_120910(7,15);
		
		//최대값 만들기(1)
		p_120847(new int[]{10,1,23,42,22});
		
		
	}
	
	//----------------------------------------------------------------------------- 2025-08-21(목)
	//짝수 홀수 개수
	public static void p_120824(int[] num_list) {
		
		int a=0;
		int b=0;
        int[] answer;
        
        for(int i=0; i < num_list.length; i++){
        	if(num_list[i]%2 == 0) {
        		a++;
        	}else {
        		b++;
        	}
        }
        
        answer = new int[]{a,b};        
        System.out.println("[p_120814] 홀수,짝수의 갯수 : " + answer[0] + ", " + answer[1]);
	}

	//-----------------------------------------------------------------------------
	//피자 나눠 먹기(1)
	public static void p_120814(int n) {
		
		int answer = 0;
		
		answer += n/7;
		
		if(n%7 != 0){
		    answer++;
		}

		System.out.println("[p_120814] 필요한 피자의 수 : " + answer + "개");
	}

	//-----------------------------------------------------------------------------
	//세균 증식
	public static void p_120910(int n, int t) {
        int answer = 0;
        answer = n;
        
        for(int i=0; i < t; i++){
            answer *= 2;
        }
        System.out.println("[p_120814] 세균 수 : " + answer + "개");
    }
	
	//-----------------------------------------------------------------------------
	//최대값 만들기(1)
	public static String p_120847(int[] numbers) {
		String msg = "";
        int answer = 0;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > max1){
                max2 = max1;
                max1 = numbers[i];
            }else if(numbers[i] > max2){
                max2 = numbers[i];
            }
        }
        answer = max1*max2;
        msg = "[p_120847] 최대값들의 곱 : " + answer ;
        System.out.println("[p_120847] 최대값들의 곱 : " + answer);
        
        return msg;
        
    }

}
