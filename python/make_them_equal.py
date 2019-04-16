n = int(input())
distincts = set(map(int, input().split()))
if len(distincts) > 3:
    print(-1)
elif len(distincts) == 3:
    nums = sorted(distincts)
    d1 = nums[1] - nums[0]
    d2 = nums[2] - nums[1]
    if d2 == d1:
        print(d1)
    else:
        print(-1)
elif len(distincts) == 2:
    nums = list(distincts)
    diff = abs(nums[1] - nums[0])
    if diff % 2 == 0:
        print(diff // 2)
    else:
        print(diff)
else:
    print(0)