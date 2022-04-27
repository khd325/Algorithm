import sys

n, m = map(int, sys.stdin.readline().split())

array = []
visited = [False] * (n + 1)


def dfs():
    if len(array) == m:
        print(' '.join(map(str, array)))
        return

    for i in range(1, n + 1):
        if not visited[i]:
            visited[i] = True
            array.append(i)
            dfs()
            array.pop()
            visited[i] = False


dfs()
