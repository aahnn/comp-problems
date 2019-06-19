#include <bits/stdc++.h> 

using namespace std;

bool isPrime(int n) {
    if (n <= 1) {
        return false;
    }

    if (n >= 3 && n % 2 == 0) {
        return false;
    }

    for (int i = 3; i * i <= n; i+= 2) {
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}

int main() {
    int n;
    scanf("%d", &n);

    set<long long> primeSquares;
    for (int i = 2; i < 1000000; i++) {
        if (isPrime(i)) {
            primeSquares.insert(((long long)i) * i);
        }
    }

    for (int i = 0; i < n; i++) {
        long long curr;
        scanf("%lld", &curr);
        if (primeSquares.count(curr)) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }
    }
}
