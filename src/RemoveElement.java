class RemoveElement{
      int getIndex(int[] nums, int val, int index ){
        int i=index;
        while(i>=0){
            if(nums[i]!=val ){
                break;
            } 
            i--; 
        }
        return i;
    }
    public int removeElement(int[] nums, int val) {
        int count=0;
        int right=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){   
                right=getIndex(nums,val,right);
                nums[i]=nums[right];
                nums[right]=0;
               count++;    
            }
            
        }
        return nums.length-count;
    }
}
