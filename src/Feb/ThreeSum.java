package Feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	
	public static void main(String[] args){
		ThreeSum ts = new ThreeSum();
		int[] array = {1,-1,2,-2,0,-3,3};
		List<List<Integer>> res = ts.threeSum(array);
		for(List val : res){
			for(int i = 0; i < val.size(); i++){
				System.out.print(val.get(i) + "     ");
			}
			System.out.println();
		}
	}
		
	public List<List<Integer>> threeSum(int[] array){
		Arrays.sort(array);
		List<List<Integer>> res = new ArrayList<>();
		for(int i = 0 ; i < array.length - 2 ;i++){
			int lo = i+1, hi = array.length - 1, sum = 0 - array[i]; 
			if (i==0 ||( i > 0 &&  array[i] !=  array[i-1] )){
				while(lo < hi){
					if(array[lo] + array[hi] == sum){
						res.add(Arrays.asList(array[lo],array[hi], array[i]));
						while(lo < hi && array[lo] == array[lo + 1]) lo++;
						while(lo < hi && array[hi] == array[hi - 1]) hi--;
						lo++; hi--;
					}else if(array[lo] + array[hi] < sum)
						lo++;
					else hi--;
				}
			}
		}
		return res;
	}
}
