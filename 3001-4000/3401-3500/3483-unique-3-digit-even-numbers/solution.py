class Solution:
    def totalNumbers(self, digits: List[int]) -> int:
        nums = set()
        for x, y, z in itertools.permutations(digits, 3):
            if z % 2 == 0 and x != 0:
                nums.add(x * 100 + y * 10 + z)
        return len(nums)
