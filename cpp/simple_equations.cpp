#include <bits/stdc++.h>

using namespace std;

bool check(int a, int b, int c) {
    for (int x = -100; x <= 100; x++) {
        for (int y = -100; y <= 100; y++) {
            for (int z = -100; z <= 100; z++) {
                if (x != y && y != z && x != z
                    && x + y + z == a
                    && x * y * z == b 
                    && x * x + y * y + z * z == c) {
                        cout << x << " " << y << " " << z << endl;
                    return true;
                }
            }
        }
    }
    return false;
}

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int a, b, c;
        cin >> a >> b >> c;
        if (!check(a, b, c)) {
            cout << "No solution." << endl;
        }
    }
}


