import sys

n = list(map(int,sys.stdin.readline().rstrip()))

check = [0] * 2

for i in range(len(n)):
    if i == 0:
        check[n[i]] = 1
    else:
        if n[i] == n[i-1]:
            continue
        else:
            check[n[i]] += 1

print(min(check))