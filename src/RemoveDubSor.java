class RemoveDubSor{
  
      public static void main(String []argh){
        int nums = new int[]{1,1,2};
        removeDuplicates(nums);
      }
   public int removeDuplicates(int[] nums) {
       if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}
