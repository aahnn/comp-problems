#include <iostream>

using namespace std;

int main() {
    int k; 
    cin >> k;

    while (k != 0) {
        int n, m;
        cin >> n >> m;

        for (int i = 0; i < k; i++) {
            int x, y;
            cin >> x >> y;
            if (x == n || y == m) {
                cout << "divisa";
            }
            else if (x > n) {
                if (y > m) {
                    cout << "NE";
                }
                else {
                    cout << "SE";
                }
            }
            else {
                if (y > m) {
                    cout << "NO";
                }
                else {
                    cout << "SO";
                }
            }

            cout << endl;
        }
        cin >> k;
    }
}
