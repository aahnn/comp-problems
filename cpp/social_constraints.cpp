#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, m;
    while (cin >> n >> m, n || m) {

        vector<int> arrange(n);
        for (int i = 0; i < n; i++) {
            arrange[i] = i; 
        }

        vector<vector<int>> constraints(m, vector<int>(3));
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                cin >> constraints[i][j];
            }
        }

        int count = 0;
        do {
            bool works = true;
            for (int i = 0; i < m; i++) {
                int aIndex = distance(arrange.begin(), find(arrange.begin(), arrange.end(), constraints[i][0]));
                int bIndex = distance(arrange.begin(), find(arrange.begin(), arrange.end(), constraints[i][1]));
                int c = abs(constraints[i][2]);

                if (constraints[i][2] > 0) {
                    if (abs(bIndex - aIndex) > c) {
                        works = false;
                    }
                }
                else {
                    if (abs(bIndex - aIndex) < c) {
                        works = false;
                    }
                }
            }
            if (works) {
                count++;
            }
        }
        while (next_permutation(arrange.begin(), arrange.end()));
        cout << count << endl;
    }
}


