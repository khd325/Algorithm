import sys

n = int(sys.stdin.readline())

array = []
visited = [False] * n
result = 1e9

for _ in range(n):
    array.append(list(map(int, sys.stdin.readline().split())))

def dfs(start, depth):
    global result
    if result == 0:
        return

    if depth == n // 2:
        team_start = 0
        team_link = 0

        for i in range(n-1):
            for j in range(i+1,n):
                if visited[i] and visited[j]:
                    team_start += array[i][j]
                    team_start += array[j][i]
                elif not  visited[i] and not visited[j]:
                    team_link += array[i][j]
                    team_link += array[j][i]
        result = min(result,abs(team_link - team_start))

    for i in range(start, n):
        if not visited[i]:
            visited[i] = True
            dfs(i+1,depth+1)
            visited[i] = False



dfs(0,0)

print(result)