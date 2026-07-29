class Solution(object):
    def maxGoodNumber(self, nums):
        max_num = 0
        for p in itertools.permutations(nums):
            binary_string = ''.join(bin(x)[2:] for x in p)
            max_num = max(max_num, int(binary_string, 2))
        return max_num
