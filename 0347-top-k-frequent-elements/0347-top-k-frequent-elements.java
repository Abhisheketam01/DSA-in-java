class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        boolean[] visited = new boolean[nums.length];
        // clarification on 1.what is this boolean[] shit ?
        List<int[]> list = new ArrayList<>();
        // what is this list shit ?

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
step 1] overall i have to go in deapth of this code magically , i dont have any of the choice but grind.
step 2] def , i didnt write the code by mself yet , i have to write the codes on my own.
step 3 ]dry run bhi karna hai yarrrrrr
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