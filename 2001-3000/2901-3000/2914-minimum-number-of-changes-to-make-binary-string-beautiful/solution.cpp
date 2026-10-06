class Solution {
public:
    int minChanges(string arr) {
        int n = arr.length(), ans = 0;
        for(int i = 0 ; i < n ; i += 2)
            if(arr[i] != arr[i + 1])
                ans++;
        return ans;
    }
};
