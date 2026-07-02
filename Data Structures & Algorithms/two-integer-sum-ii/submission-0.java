class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int val = target - numbers[i];

            if (map.containsKey(val) && map.get(val) != i) {
                if (map.get(val) < i)
                    return new int[]{map.get(val) + 1, i + 1};
                else
                    return new int[]{i + 1, map.get(val) + 1};
            }
        }

        return new int[]{};
    }
}