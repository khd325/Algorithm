import sys

def dfs(idx,num):
    if idx >= n:
        return

    temp = num + array[idx]

    if temp == s:
        global cnt
        cnt += 1

    dfs(idx+1,num)
    dfs(idx+1,temp)


n, s = map(int, sys.stdin.readline().split())

array = list(map(int,sys.stdin.readline().split()))

cnt = 0
dfs(0,0)
print(cnt)