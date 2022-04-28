import sys

n, m = map(int, sys.stdin.readline().split())

array = [0] * m

def dfs(start,depth):
    if depth == m:
        print(*array)
        return

    for i in range(start, n+1):
        array[depth] = i
        dfs(i+1,depth+1)


dfs(1,0)