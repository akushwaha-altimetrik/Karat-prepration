class TowSum{
  public static static void main(String []args){
    int ar[]=new int[]{2,7,11,15};
    towSum(ar,9);
  }
  public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
       
        for (int i = 0; i < nums.length; i++) {
           
            int complement = target - nums[i];
            
          
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
           
            map.put(nums[i], i);
        }
        
       
        return new int[]{};
    }
}
