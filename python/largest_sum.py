def largestSumAfterKNegations(A, K):
    list.sort(A)
    i = 0
    while A[i] < 0 and K > 0:
        K -= 1
        A[i] = -A[i]
        i += 1
    if K % 2 == 1:
        i = A.index(min(A))
        A[i] = -A[i]
    return sum(A)