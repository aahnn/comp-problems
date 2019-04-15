#include <bits/stdc++.h>

using namespace std;

long long sequenceNum(int n, vector<int> poly) {
    long long out = 0;
    for (int i = 0; i < poly.size(); i++) {
        out += poly[i] * pow(n, i);
    }
    return out;
}

int main() {
    int C;
    cin >> C;
    for (int c = 0; c < C; c++) {
        int i;
        cin >> i;
        vector<int> poly(i + 1);
        for (int j = 0; j <= i; j++) {
            cin >> poly[j];
        }
        int d, k;
        cin >> d >> k;

        int count = 1;
        int target = d;
        int currN = 1;
        int curr = 0;
        long long currNum = sequenceNum(currN, poly);
        while (count != k) {
            curr++;
            if (curr >= target) {
                currN++;
                target = currN * d; 
                currNum = sequenceNum(currN, poly);
                curr = 0;
            }
            count++;
            if (count >= k) {
                cout << currNum << endl;
                break;
            }
        }
    }
}
