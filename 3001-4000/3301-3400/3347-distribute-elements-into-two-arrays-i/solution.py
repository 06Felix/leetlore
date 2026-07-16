class Solution(object):
    def resultArray(self, nums):
        if len(nums) <= 2:
            return nums
        arr1 = [nums[0]]
        arr2 = [nums[1]]
        n = len(nums)
        for i in range(2,n):
            x = arr1[-1]
            y = arr2[-1] if arr2 else float('-inf')
            if x < y:
                arr2.append(nums[i])
            else:
                arr1.append(nums[i])
        return arr1 + arr2
