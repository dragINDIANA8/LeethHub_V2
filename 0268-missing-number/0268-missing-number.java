class Solution {
    public int missingNumber(int[] nums) {
        //Arrays.sort(nums);

        //using bubble sort to sort the array
          for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for(int i=0; i<nums.length ;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}