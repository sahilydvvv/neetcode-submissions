class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int l = 1;
                int c = i;
                while(set.contains(c+1)){
                    c++;
                    l++;
                }
                longest = Math.max(l,longest);
            }
        }
        return longest;
    }
}