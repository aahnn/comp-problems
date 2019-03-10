#include <vector>
#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int n;
    while (cin >> n) {
        vector<bool> visited(n, false);
        int prev;
        cin >> prev;
        for (int i = 0; i < n - 1; i++) {
            int curr;
            cin >> curr;
            int diff = abs(curr - prev);
            if (diff < n) {
                visited[diff] = true;
            }
            prev = curr;
        }
        
        bool isJolly = true;
        for (int i = 1; i < n; i++) {
            if (visited[i] == false) {
                isJolly = false;
            }
        }
        cout << (isJolly ? "Jolly" : "Not jolly") << endl;
    }
}
