#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> students(n);
    for (int i = 0; i < n; i++) {
        cin >> students[i];
    }
    sort(students.begin(), students.end());
    int biggest = 1;
    int j = 1;
    for (int i = 0; i < n; i++) {
        while (j < n && students[j] - students[i] <= 5) {
            j++;
            biggest = max(biggest, j - i);
        }
    }
    cout << biggest << endl;
}
