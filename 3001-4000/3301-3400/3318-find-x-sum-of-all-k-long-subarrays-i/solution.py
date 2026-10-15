class Solution(object):
    def findXSum(self, nums, k, x):
        n = len(nums)
        if n < k:
            return []

        ans = [0] * (n - k + 1)
        freq = defaultdict(int)
        max_heap = []

        for i in range(k):
            freq[nums[i]] += 1

        for key, value in freq.items():
            heapq.heappush(max_heap, (-value, -key))

        current_sum = self.get_x_sum(max_heap, freq, x)
        ans[0] = current_sum

        for i in range(1, n - k + 1):
            out_element = nums[i - 1]
            in_element = nums[i + k - 1]

            freq[out_element] -= 1
            if freq[out_element] == 0:
                del freq[out_element]
            freq[in_element] += 1

            max_heap = []
            for key, value in freq.items():
                heapq.heappush(max_heap, (-value, -key))

            current_sum = self.get_x_sum(max_heap, freq, x)
            ans[i] = current_sum

        return ans

    def get_x_sum(self, max_heap, freq, x):
        temp_heap = list(max_heap)
        heapq.heapify(temp_heap)
        x_sum = 0
        count = 0

        while temp_heap and count < x:
            value, key = heapq.heappop(temp_heap)
            x_sum += (-value) * (-key)
            count += 1

        return x_sum
