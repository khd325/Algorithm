import sys

n = int(sys.stdin.readline())

array = []
result = []
for _ in range(n):
    w, h = map(int, sys.stdin.readline().split())

    array.append((w, h))

for i in range(len(array)):
    rank = 1
    cur_w, cur_h = array[i][0], array[i][1]
    for j in range(len(array)):
        if i == j:
            continue

        x, y = array[j][0], array[j][1]

        if x > cur_w and y > cur_h:
            rank += 1

    result.append(rank)

print(*result)