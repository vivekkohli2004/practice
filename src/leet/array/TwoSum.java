package leet.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map= new HashMap<>();
        int[] output= new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
            
        }
        
        System.out.println(map);
        
        for(int i=0;i<nums.length;i++){
           if(map.containsKey(target-nums[i])){
               output[0]=i;
               output[1]=map.get(target-nums[i]);
              return output;
           }            
        } 
        return output;
    }
    
	
	/* We can combine these 2 for loops into one:
	 * 
	  for(int i=0;i<nums.length;i++){
	  if(map.containsKey(target-nums[i])){
	  return new int [] {i, map.get(target-nums[i])}
	  }
            map.put(nums[i], i);
     }

	 * 
	 * */
	public static void main(String[] args) {
		int[] nums = new int[] { 2,7,11,15};
		int[] output=twoSum(nums, 9);
		System.out.println(Arrays.toString(output));
	}

}


