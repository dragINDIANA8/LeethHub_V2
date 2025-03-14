class Solution {
    public int majorityElement(int[] nums) {
       

       // using buble sort
          int n= nums.length;

          /*for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                  if(nums[j]>nums[j+1]){
                    int temp= nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                  }
            }
          }*/

            Arrays.sort(nums);
        return nums[n/2];
    }
}