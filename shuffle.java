package LeetCode_practice;

/*
shuffle a set of numbers without duplicates
brute force solution below
*/ */
public class shuffle {

    private int[] array; 
    private int [] originalArray;  

    private Random rand = new Random(); 

    private List<Integer> getArrayCopy(){
        List<Integer> List = new ArrayList<Integer>(); 
        for(int i=0; i<array.length; i++){
            List.add(array[i]); 

        } 
        return List; 
    }
    public Solution (int [] nums){
        array = nums; 
        originalArray= nums.clone(); 
    }
    public int[] reset(){
        array= originalArray; 
        originalArray= originalArray.clone(); 

    }
    public int[] shuffle(){
        List<Integer> aux = getArrayCopy(); 
        for(int i = 0; i<array.length; i++){
            int removeIdx = rand.nextInt(aux.size()); 
            array[i] = aux.get(removeIdx); 
             aux.remove(removeIdx); 
        }
        return array;
    }
}

/* time complexity: On^2, from calls to list.remove- runs in linear time. Space complexity = O(n) 