class Solution:
    def findFinalValue(self, nums: list[int], original: int) -> int:
        # Step 1: Convert list to set for fast lookup
        s = set()
        for i in range(len(nums)):
            s.add(nums[i])
        
        # Step 2: Keep multiplying while original exists in the set
        while original in s:
            original *= 2
        
        # Step 3: Return final value
        return original
