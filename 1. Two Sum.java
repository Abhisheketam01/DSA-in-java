class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for( int i = 0; i < nums.length; i++){
            int findMe = target - nums[i];
            if(map.containsKey(findMe)){
                return new int[] { i , map.get(findMe)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

// most optimized approached 
// O(n)
// dry run - (first thing is ki the map is empty )
// we entered into an array called nums we took first element then we
// did element - target == x (if z existed in map we return but since after the first iteration map is empty so it will put or stored that element into map )
// next iteration it will do the same 
// element - target == x if ........x exist it will return otherwise it will stored that element into map 
// thats how thw things works 

/* dry run - 
nums = [2,7,11,15 ]
target = 9
we entered into for loop
in short we have to return indexes of 2 element which has sum = target
e.g nums[i1] + nums[i2] = target
lets say findme = target - numsi then at i = 0 we have 9 - 2 = 7
we check if findme = 7 is in map
or not since map is empty we store it like this i = 0 we have 2
then 
now lets move on the i = 1
then again we do findme = target - nums[i = 1]
then we get findme = 9 - 7 we get findme = 2
then we check if 2 is in map or not 
and yes at i = 0 we have 2 therfore then we return indiex of 
i = 0 have 2
and i = 1 have 7 
for which 2 + 7 = 9
now youve got the indces but the question is how to return those indeces
if(map.containsKey(findMe)){
    return new int[] {i , map.get(findMe)};
}
here i is 7 therfore i = 1
here i findme at index at i is 2 therfore i = 0
so the answer must be [1,0] */
