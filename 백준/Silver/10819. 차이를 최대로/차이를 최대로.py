import sys


def dfs(depth):
    if depth == n:
        global max_num
        temp = 0
        for i in range(n-1):
            temp += abs(result[i] - result[i+1])
            max_num = max(temp,max_num)
        return

    for i in range(0, n):
        if not visited[i]:
            visited[i] = True
            result[depth] = array[i]
            dfs(depth + 1)
            visited[i] = False


n = int(sys.stdin.readline())
array = list(map(int, sys.stdin.readline().split()))
visited = [False] * n
result = [0] * n
max_num = -1
dfs(0)

print(max_num)