#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {
        int a, b;
        cin >> a >> b;
        if (a > b) {
            cout << ">\n";
        }
        else if (b > a) {
            cout << "<\n";
        }
        else {
            cout << "=\n";
        }
    }
}
