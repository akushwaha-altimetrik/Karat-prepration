class PeackElement{
  public int findPeakElement(int[] nums) {
        boolean isTrue=false;
        int n=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<n){
                isTrue=true;
                if(i==0)
                return 0;
                else
                return i-1;
            }else{
                n=nums[i];
            }
        }
       
        return nums.length-1;
    }
}
