/*
#include<iostream>
#include<vector>
#include<utility>
#include<queue>
using namespace std;
        vector<pair<int, vector<int>>> v;
        int n, m;
        bool find(int t1,int t2)
        {
        vector<int>visit(n+1);
        queue<int> q;
        for (int i = 0; i < v[t2].first; i++)
        {
        q.push(v[t2].second[i]);
        if (v[t2].second[i] == t1)
        {
        return true;
        }
        visit[v[t2].second[i]] = 1;
        }
        while (!q.empty())
        {
        t2 = q.front();
        q.pop();
        for (int i = 0; i < v[t2].first; i++)
        {
        if (visit[v[t2].second[i]] == 1)
        {
        continue;
        }
        q.push(v[t2].second[i]);
        if (v[t2].second[i] == t1)
        {
        return true;
        }
        visit[v[t2].second[i]] = 1;
        }
        }
        return false;
        }
        void huawei_003()
        {
        cin >> n >> m;
        v = vector<pair<int, vector<int>>>(n + 1, pair<int, vector<int>>(0, vector<int>()));
        int c = 0;
        int noroad = 0;
        int t1, t2;
        for (int i = 0; i < m; i++)
        {
        cin >> t1 >> t2;
        if (v[t2].first == 0)
        {
        v[t2].second.push_back(t1);
        v[t2].first++;
        c++;
        }
        if (find(t1, t2))
        {
        continue;
        }
        else
        {
        v[t2].second.push_back(t1);
        v[t2].first++;
        c++;
        }
        }
        cout << c;
        }
        int main()
        {
        huawei_003();
        return 0;
        }
*/
