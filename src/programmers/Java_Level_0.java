package programmers;
import java.util.*;

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
		//p_120847(new int[]{10,1,23,42,22});
		
		//자릿수 더하기
		//p_120906(192803);
		
		//삼각형의 완성조건 (1)
		//p_120889(new int[] {5,12,8});
		
		//배열 자르기 (Lv.0) 
		//p_120833(new int[] {5,12,8,7,9}, 1, 3);
		
		//피자 나눠 먹기 (3) (Lv.0)
		p_120816﻿(12, 50);
		
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
	public static void p_120847(int[] numbers) {
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
        System.out.println("[p_120847] 최대값들의 곱 : " + answer);
    }
	
	//-----------------------------------------------------------------------------
	//자릿수 더하기
	public static void p_120906(int n) {
        int answer = 0;
        int last = 0;
        
        while(n > 0){
            if(n%10 >= 0){
                last = n%10;
                n = n/10;
                answer += last;
            } 
        }

        System.out.println("[p_120906] 자릿수 합 : " + answer);
    }
	
	//-----------------------------------------------------------------------------
	//삼각형의 완성조건 (1)
	public static void p_120889(int[] sides) {
        int answer = 0;
        int max=0, sum=0;
        
        for(int i=0; i<3; i++){
            sum += sides[i];
            max = Math.max(max, sides[i]);
        }
        answer = max < sum-max ? 1 : 2;
        
        System.out.println("[p_120906] 삼각형의 완성조건(1) : " + answer);
    }

	//-----------------------------------------------------------------------------
	//배열 자르기 (Lv.0)
	public static void p_120833(int[] numbers, int num1, int num2) {
        int[] answer = {};
        
        int len = num2-num1+1;
        answer = new int[len];
        
        for(int i=0; i<len; i++){
            answer[i] = numbers[num1+i];
        }
        
        System.out.println("[p_120906] 배열 자르기 (Lv.0) : " + Arrays.toString(answer));
    }
	
	//-----------------------------------------------------------------------------
	//피자 나눠 먹기 (3) (Lv.0)
	public static void p_120816﻿(int slice, int n) {
        int answer = 0;
        
        //answer = (int)Math.ceil((double) n/slice);
        answer = (n + slice - 1)/slice;
        
        System.out.println("[p_120906] 피자 나눠 먹기 (3): " + answer);
    }
	

}
