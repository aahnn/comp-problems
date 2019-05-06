import sys

def matrix_chain_multiplication(p):
    n = len(p) - 1
    m = [[0] * n for _ in range(n)]
    for i in range(n):
        m[i][i] = 0

    for l in range(2, n + 1):
        for i in range(n - l + 1):
            j = i + l - 1
            m[i][j] = sys.maxsize
            for k in range(i, j):
                m[i][j] = min(m[i][j], p[i - 1] * p[k] * p[j] + m[i][k] + m[k + 1][j])   
    return m[0][n - 1]

p = [30, 35, 15, 5, 10, 20, 25]
print(matrix_chain_multiplication(p))