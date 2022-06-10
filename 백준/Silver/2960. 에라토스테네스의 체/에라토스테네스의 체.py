import sys

n, k = map(int, sys.stdin.readline().split())

check = [True] * (n + 1)
result = 0
cnt = 0
flag = False
for i in range(2, n + 1):
    if flag:
        break
    for j in range(i, n + 1, i):
        if flag:
            break
        if check[j]:
            check[j] = False
            cnt += 1

            if cnt == k:
                result = j
                flag = True

print(result)