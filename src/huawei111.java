/*
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
10 4 1 2 3 1 2 1 5 2 3 20 7 6 4 5 2 2
        void huawei_001()
        {
        int h, w;
        cin >> h >> w;
        vector<int> v(h*w);
        for (int i = 0; i < h*w; i++)
        {
        cin >> v[i];
        }
        sort(v.begin(), v.end());
        vector<vector<int>>r(h, vector<int>(w));
        int left = 0, right = w - 1, top = 0, bottom = h - 1;
        int c = 0;
        while (left <= right && top <= bottom) {
        for (int column = left; column <= right; column++) {
        r[top][column] = v[c++];
        }
        for (int row = top + 1; row <= bottom; row++) {
        r[row][right] = v[c++];
        }
        if (left < right && top < bottom) {
        for (int column = right - 1; column > left; column--) {
        r[bottom][column] = v[c++];
        }
        for (int row = bottom; row > top; row--) {
        r[row][left] = v[c++];
        }
        }
        left++;
        right--;
        top++;
        bottom--;
        }
        for (int i = 0; i < h; i++)
        {
        for (int j = 0; j < w; j++)
        {
        cout << r[i][j] << " ";
        }
        cout << endl;
        }
        }
        int main()
        {
        huawei_001;
        }*/
