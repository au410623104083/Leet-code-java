class ParitySort {
    public int[] sortArrayByParity(int[] nums) {
        int st = 0, end = nums.length - 1;
        while (st < end) {
            if (nums[st] % 2 == 0) {
                st++;
            } 
            else if (nums[end] % 2 != 0) {
                end--;
            } 
            else {
                int temp = nums[st];
                nums[st] = nums[end];
                nums[end] = temp;
                st++;
                end--;
            }
        }
        return nums;
    }
}
