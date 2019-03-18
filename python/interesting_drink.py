from time import time

# from bisect import bisect
# t1 = time()
# n = int(input())
# prices = sorted(map(int, input().split()))
# q = int(input())
# coins = [int(input()) for _ in range(q)]
# for coin in coins:
#     print(bisect(prices, coin))
# t2 = time()
# print(t2 - t1)

from bisect import bisect
t1 = time()
n = int(input())
prices = sorted(map(int, input().split()))
q = int(input())
for i in range(q):
    m = int(input())
    print(bisect(prices, m))
t2 = time()
print(t2 - t1)
