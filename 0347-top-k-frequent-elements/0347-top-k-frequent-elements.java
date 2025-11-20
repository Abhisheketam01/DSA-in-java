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

ther are total 6 solution available to solve this prob bro and its crazy 

    ✅ 1️⃣ Brute Force — O(n²)
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

✅ 2️⃣ Brute Force Using Parallel Arrays
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;
        int[] values = new int[n];
        int[] freq = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {

            boolean seen = false;
            for (int x = 0; x < idx; x++) {
                if (values[x] == nums[i]) {
                    seen = true;
                    break;
                }
            }
            if (seen) continue;

            values[idx] = nums[i];

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) freq[idx]++;
            }
            idx++;
        }

        Integer[] order = new Integer[idx];
        for (int i = 0; i < idx; i++) order[i] = i;

        Arrays.sort(order, (a, b) -> freq[b] - freq[a]);

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) ans[i] = values[order[i]];
        return ans;
    }
}

✅ 3️⃣ HashMap + Sorting — O(n log n)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) ans[i] = list.get(i).getKey();
        return ans;
    }
}

✅ 4️⃣ HashMap + MaxHeap — O(n log n)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(map.entrySet());

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) ans[i] = maxHeap.poll().getKey();

        return ans;
    }
}

✅ 5️⃣ HashMap + MinHeap of Size K — O(n log k)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            minHeap.offer(e);
            if (minHeap.size() > k) minHeap.poll();
        }

        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--) ans[i] = minHeap.poll().getKey();

        return ans;
    }
}

✅ 6️⃣ Bucket Sort — O(n) (Optimal)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) buckets[i] = new ArrayList<>();

        for (int n : map.keySet()) {
            buckets[map.get(n)].add(n);
        }

        int[] ans = new int[k];
        int idx = 0;

        for (int i = nums.length; i >= 1 && idx < k; i--) {
            for (int n : buckets[i]) {
                ans[idx++] = n;
                if (idx == k) break;
            }
        }

        return ans;
    }
}
