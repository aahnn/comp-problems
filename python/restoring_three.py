nums = list(map(int, input().split()))
highest = max(nums)
highestIn = nums.index(highest)
out = []
for i in range(len(nums)):
    if i != highestIn:
        out.append(highest - nums[i])
print(' '.join(map(str, out)))

