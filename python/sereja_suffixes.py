n, m = map(int, input().split())
a = input().split()
nums = set()
distinctCount = [0] * n
indices = [int(input()) - 1 for _ in range(m)]
for i in range(n - 1, -1, -1):
    nums.add(a[i])
    distinctCount[i] = len(nums)
for i in indices:
    print(distinctCount[i])
