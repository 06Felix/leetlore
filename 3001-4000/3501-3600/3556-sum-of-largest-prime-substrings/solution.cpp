class Solution {
private:
    bool isP(long long n) {
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (long long i = 5; i * i <= n; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }

public:
    long long sumOfLargestPrimes(string s) {
        unordered_set<long long> st;
        int n = s.length();
        for (int i = 0; i < n; i++)
            for (int j = 1; j <= n - i; j++) {
                string sub = s.substr(i, j);
                long long num = stoll(sub);
                st.insert(num);
            }
        priority_queue<long long> pq;
        for (long long x : st)
            if (isP(x))
                pq.push(x);
        long long ans = 0;
        int ct = 0;
        while (!pq.empty()) {
            ans += pq.top();
            pq.pop();
            ct++;
            if (ct == 3)
                break;
        }
        return ans;
    }
};
