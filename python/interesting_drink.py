from bisect import bisect

n = int(input())
prices = sorted(map(int, input().split()))
q = int(input())
coins = [int(input()) for _ in range(q)]
for coin in coins:
    print(bisect(prices, coin))
