class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];

        int mul = 1;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(j == i){
                    continue;
                }
                mul *= nums[j]; 
            }
            res[i] = mul;
            mul = 1;
        }
        return res;
    }
}  
