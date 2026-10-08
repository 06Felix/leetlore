class Solution {
public:
    int minMaxWeight(int n, vector<vector<int>>& edges, int threshold) {
        int ans = 0;
        vector<vector<vector<int>>> revG(n);
        vector<bool> vis(n, false);
        for(auto ed : edges)
            revG[ed[1]].push_back({ed[2], ed[0]});
        priority_queue<vector<int>, vector<vector<int>>, greater<vector<int>>> pq;
        pq.push({0, 0});
        while(!pq.empty()){
            auto u = pq.top()[1];
            auto w = pq.top()[0];
            pq.pop();
            if(vis[u])
                continue;
            vis[u] = true;
            ans = max(ans, w);
            for(auto ed : revG[u])
                if(!vis[ed[1]])
                    pq.push(ed);
        }
        for(bool x : vis)
            if(!x)
                return -1;
        return ans;
    }
};
