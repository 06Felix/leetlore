import math

class Solution:
    def isP(self, n: int) -> bool:
        if n <= 1:
            return False
        if n == 2:
            return True
        if n % 2 == 0:
            return False
        
        for i in range(3, int(math.isqrt(n)) + 1, 2):
            if n % i == 0:
                return False
        
        return True
    
    def nonSpecialCount(self, l: int, r: int) -> int:
        p = 0
        start = math.ceil(math.sqrt(l))
        end = math.floor(math.sqrt(r))
        
        special_numbers = set()
        for i in range(start, end + 1):
            square = i * i
            if self.isP(i):
                p = p + 1
        return r - l + 1 - p
