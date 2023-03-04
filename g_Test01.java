//프로그래머스 같은 숫자는 싫어

import java.util.*;

public class Test01 {

	public static void main(String args[]) {
		int test_var[] = {1,1,3,3,0,1,1};
		System.out.println(Arrays.toString(Solution.solution(test_var)));
		//배열을 출력하기위해 Arrays.toString(배열 인자값) 이용
	}
}

class Solution {
    public static int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
        	//상향된 for문 arr 배열의 값을 num에 하나씩 대입하면서 진행함
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}