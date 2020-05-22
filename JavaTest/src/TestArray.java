import java.util.Arrays;
import java.util.stream.IntStream;

public class TestArray {

	public static void main(String[] args) {
		int[] a = {3, 2, -21, 5, 13};
		
		Solution s = new Solution();
		System.out.println(s.solution(a));

	}

}

class Solution {
    public int solution(int[] A) {
    	Arrays.sort(A);
    	for(int i=0;i<A.length-1;i++) {
    		if(A[i]>=0)
    			return 0;
    		int num = A[i]*-1;
    		
    		if(IntStream.of(A).anyMatch(x -> x == num)) {
    			return num;
    		}
    	}
		return 0;
    }
}