rows = []
for i in range(100):
    rows.append(list(map(int, input().split())))

for row in range(len(rows) - 1, 0, -1):
    for col in range(row):
        rows[row - 1][col] += max(rows[row][col], rows[row][col + 1])

print(rows[0][0])