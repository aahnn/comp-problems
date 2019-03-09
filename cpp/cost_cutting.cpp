#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int T;
    cin >> T;

    for (int n = 1; n <= T; n++) {
        int salaries[3]; 
        int currSalary;
        for (int i = 0; i < 3; i++) {
            cin >> currSalary;
            salaries[i] = currSalary; 
        }

        sort(salaries, salaries + 3);
        
        cout << "Case " << n << ": " << salaries[1] << endl;
    }
}
