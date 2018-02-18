package Feb;
import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args){
		TwoSum ts = new TwoSum();
		int[] array = {3,2,4};
		int target = 6;
		int[] res = ts.twoSum(array, target);
		for(int i = 0; i < res.length; i++){
			System.out.print(res[i] + "     ");
		}
		System.out.println();
	}
    public int[] twoSum(int[] nums, int target) {
    	int[] result = new int[2]; 
    	HashMap<Integer, Integer> hashStore= new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(hashStore.containsKey(target - nums[i])){
            	result[1] = i + 1;
            	result[0] = hashStore.get(target - nums[i]);
            }
            hashStore.put(nums[i], i+1);
        } 
        return result;
        // return new int[] { i, j };
    }
}
