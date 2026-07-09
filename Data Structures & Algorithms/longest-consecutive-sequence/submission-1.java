class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            hm.putIfAbsent(nums[i], i);
        }

        int i = 0;
        int res[] = new int[hm.size()];
        for(int key : hm.keySet()){
            res[i++] = key;
        }

        Arrays.sort(res);
        int count = 1;
        int longe = 1;
        for(int j=1; j<res.length; j++){
            if(res[j] - res[j-1] == 1){
                count++;
                longe = Math.max(count, longe);
            }else{
                count = 1;
            }
        }
return longe;
    }
}
