import java.util.Map;

/*Given an array of int's return indicies of the two numbers such that they add up to a specific target. you may assume that each input would have exactly one solution and you may not use the same element twice 
example: 
given nums=[2, 7, 11. 15] target =9, return [0,1]*/

//Approach 1: Brute Force -- loop through each element x and find if there's another value that equals the target. Time Complexity O(n^2), Space Complexity : O(1)

class twoSums{
    public int [] twoSum(int[] nums, int target){
        Scanner sc= new Scanner(System.in); 
        for(int i = 0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]==target - nums[i]){
                    return new int[]{i, j}; 

                }
            }

            throw new IllegalArgumentException("there are no two sums"); 
        }
    }
}

//Approach 2: two-pass hash table (best way to maintain a mapping of each element in the array to its index) 
//Time O(n) Space: O(n) 
public int[] twoSum(int [] nums, int target){
    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<nums.length; i++){
        map.put(nums[i], i); 

    }
    for(int i=0; i<nums.length; i++){
        int complement = target - nums[i]; 
        if(map.containsKey(complement)&& map.get(complement)!=i {
            return new int[] {
                i, map.get(complement)}; 
            }
        }
        throw new IllegalArgumentException("no two sums"); 
    }
}


//Approach 3: one-pass hash table - while iterate and insert elements, look back to check if curr element's complemenet already exists time: O(n) space: O(n)

public int [] twoSum(int[] nums, int target){
    Map<Integer, Integer> map= new HashMap<>(); 
    for(int i=0; i<nums.length; i++){
        int complement = target - nums[i]; 
        if(map.containsKey(complement)){
            return new int[]{
                map.get(complement), i)}; 
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two sums"); 
    }
}