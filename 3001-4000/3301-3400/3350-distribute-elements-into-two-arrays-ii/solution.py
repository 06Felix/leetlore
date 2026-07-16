from sortedcontainers import SortedList
class Solution:
    def resultArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        if n <= 2:
            return nums
        arr1 = [nums[0]]
        s1 = SortedList(arr1)
        arr2 = [nums[1]]
        s2 = SortedList(arr2)
        for i in range(2,n):
            c1 = len(s1) - s1.bisect_right(nums[i])
            c2 = len(s2) - s2.bisect_right(nums[i])
            if c1 > c2:
                arr1.append(nums[i])
                s1.add(nums[i])
            elif c2 > c1:
                arr2.append(nums[i])
                s2.add(nums[i])
            elif len(arr2) < len(arr1):
                s2.add(nums[i])
                arr2.append(nums[i])
            else:
                s1.add(nums[i])
                arr1.append(nums[i])
        return arr1 + arr2
