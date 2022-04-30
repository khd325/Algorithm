import sys

x, y = map(int, sys.stdin.readline().split())

n = int(sys.stdin.readline())

row_li = [0]
col_li = [0]

for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())

    if a == 0:
        row_li.append(b)
    else:
        col_li.append(b)

row_li.append(y)
col_li.append(x)

row_li.sort()
col_li.sort()

gab_r, gab_c = 0, 0

for i in range(1, len(row_li)):
    gab = row_li[i] - row_li[i - 1]
    gab_r = max(gab, gab_r)

for i in range(1, len(col_li)):
    gab = col_li[i] - col_li[i - 1]
    gab_c = max(gab, gab_c)


print(gab_c*gab_r)