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
		//p_120816﻿(12, 50);
		
		//문자열안에 문자열 (Lv.0)
		//p_120908(	"ab6CDE443fgh22iJKlmn1o", "6CD");

		//제곱수 판별하기 (Lv.0)
		//p_120909(16);
		
		//중복된 숫자 개수 (Lv.0)
		//p_120583(new int[]{1,1,2,3,4,5}, 1);
		
		//중앙값 구하기 (Lv.0)
		//p_120811(new int[]{1,1,2,3,4,5,0});
		
		//짝수 홀수 개수 (Lv.0)
		//p_120824(new int[]{1,1,2,3,4,5,0});
		
		//점의 위치 구하기
		//p_120841(new int[] {5,10});
		
		//배열의 유사도
		//p_120903(new String[]{"a","b","c"},new String[]{"com","b","d","p","c"});

		//순서쌍의 개수
		//p_120836(100);
		
		//n의 배수 고르기
		//p_120905(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
		
		//배열 원소의 길이
		p_120854(new String[]{"We", "are", "the", "world!"});
		
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

	//-----------------------------------------------------------------------------
	//문자열안에 문자열 (Lv.0)
	public static void p_120908(String str1, String str2) {
        int answer = 2;
        
        if(str1.contains(str2)){
            answer = 1;
        }
        System.out.println("[p_120908] 문자열안에 문자열 : " + answer);
	}
	
	//-----------------------------------------------------------------------------
	//제곱수 판별하기 (Lv.0)
	public static void p_120909(int n) {
        int answer = 2;
        
        for(int i = 0 ; i <= 1000 ; i++){
            if(i * i == n){
                answer = 1;
                break;
            }
        }
        System.out.println("[p_120909] 제곱수 판별하기 : " + answer);
	}
	
	//-----------------------------------------------------------------------------
	//중복된 숫자 개수 (Lv.0)
	public static void p_120583(int[] array, int n) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                answer++;
            }
        }
        System.out.println("[p_120583] 중복된 숫자 개수 : " + answer);
	}
	
	//-----------------------------------------------------------------------------
	//배열 두 배 만들기 (Lv.0)
	public static void p_120809(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i=0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        System.out.println("[p_120809] 배열 두 배 만들기 : " + Arrays.toString(answer));
	}
	
	//-----------------------------------------------------------------------------
	//중앙값 구하기 (Lv.0)
	public static void p_120811(int[] array) {
        int answer = 0;
        int tmp = 0;
        
        for(int i=0; i < array.length - 1; i++){
            for(int j=i+1; j < array.length; j++)
            if(array[j] < array[i]){
                tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;
            }
        }
        
        // Arrays.sort(array);  // Arrays사용해 오름차순 정렬
        
        // 배열 정렬 확인
        // for(int val : array){
        //     System.out.print(val + " ");
        // }
        
        int midIdx = array.length/2;
        answer = array[midIdx];
        System.out.println("[p_120811] 배열 중앙값 구하기 : " + answer);
	}
	
	//-----------------------------------------------------------------------------
	//점의 위치 구하기
	public static void p_120841(int[] dot) {
        int answer = 0;
        
        if(dot[0] > 0){
            answer = 1;
            if(dot[1] < 0){
                answer = 4;
            }
        }else {
            answer = 2;
            if(dot[1] < 0){
                answer = 3;
            }
        }
        System.out.println("[p_120841] 점의 위치 구하기 : " + answer);
	}
	
	//-----------------------------------------------------------------------------
	//배열의 유사도
	public static void p_120903(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int i=0; i < s1.length; i++){
            for(int j=0; j < s2.length; j++){
                if(s1[i].equals(s2[j]))
                    answer++;
            }
        }
        System.out.println("[p_120903] 배열의 유사도 : " + answer);
	}
	
	//-----------------------------------------------------------------------------
	//순서쌍의 개수
	public static void p_120836(int n) {
        int answer = 0;
                
        for(int a=1; a<=n; a++){
            if(n%a == 0)
                answer++;
        }
        System.out.println("[p_120836] 순서쌍의 개수 : " + answer);
	}
    
	//-----------------------------------------------------------------------------
	//n의 배수 고르기
	public static void p_120905(int n, int[] numlist) {
        int[] answer = Arrays.stream(numlist)
                .filter(num -> num%n == 0)
                .toArray();
        
        System.out.println("[p_120905] n의 배수 고르기 : " + Arrays.toString(answer));
	}
	
	//-----------------------------------------------------------------------------
	//배열 원소의 길이
	public static void p_120854(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i=0; i<strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        
        System.out.println("[p_120854] 배열 원소의 길이 : " + Arrays.toString(answer));
	}
    

}
