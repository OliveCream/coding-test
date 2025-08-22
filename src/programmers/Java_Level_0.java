package programmers;

public class Java_Level_0 {
	
	//실행
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//p_120824(new int[]{1,1,2,2,2});
		//p_120814(22);
		//p_120910(7,15);
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

}
