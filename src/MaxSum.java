class MaxSum{
  public int maxSubArray(int[] nums) {
        if(nums.length<2)
        return nums[0];
       int maxSum = 0;  
    int n = nums.length;
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int sum = 0;
            for (int k = i; k < j + 1; k++) {
                sum = sum + nums[k];
            }
            maxSum = Math.max(maxSum, sum);
        }
    }
    return maxSum;
    }
}
