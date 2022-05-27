import sys


def promising(x):
    for i in range(x):
        if abs(row[x] - row[i]) == x - i:
            return False
    return True


def n_queen(x):
    if x == n:
        global result
        result += 1
        return

    for i in range(n):
        if not visited[i]:
            row[x] = i
            visited[i] = True
            if promising(x):
                n_queen(x + 1)
            visited[i] = False


n = int(sys.stdin.readline())

row = [0] * n
result = 0
visited = [False] * n

n_queen(0)

print(result)
