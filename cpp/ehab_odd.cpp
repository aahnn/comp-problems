#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    bool hasEven = false;
    bool hasOdd = false;
    for (int i = 0; i < n; i++) {
        if (a[i] % 2 == 0) {
            hasEven = true;
        } else {
            hasOdd = true;
        }
    }

    if (hasEven && hasOdd) {
        sort(a.begin(), a.end());
    }
    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }
}
