class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        boolean[] visited = new boolean[nums.length];
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            int freq = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    freq++;
                    visited[j] = true;
                }
            }
            list.add(new int[]{nums[i], freq});
        }

        list.sort((a, b) -> b[1] - a[1]);

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) ans[i] = list.get(i)[0];
        return ans;
    }
}

/*
what about k ?
how to mf sort that array , 
how to access nums ?
how am i gonna compare the k with elements that i have to return 
what is the perfect data structure for this 
how to store ?
how to count for each value ?
what is the brute force ?
and what the fk is optimal approach ?

*/