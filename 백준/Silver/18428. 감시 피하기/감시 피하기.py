import sys
from itertools import combinations

n = int(sys.stdin.readline())

graph = []
teachers = []
spaces = []


def watch(x, y, direction):
    if direction == 0:
        while y >= 0:
            if graph[x][y] == 'S':
                return True
            if graph[x][y] == 'O':
                return False
            y -= 1

    if direction == 1:
        while y < n:
            if graph[x][y] == 'S':
                return True
            if graph[x][y] == 'O':
                return False
            y += 1

    if direction == 2:
        while x >= 0:
            if graph[x][y] == 'S':
                return True
            if graph[x][y] == 'O':
                return False
            x -= 1

    if direction == 3:
        while x < n:
            if graph[x][y] == 'S':
                return True
            if graph[x][y] == 'O':
                return False
            x += 1
    return False

def process():
    for x, y in teachers:
        for i in range(4):
            if watch(x, y, i):
                return True

    return False


for i in range(n):
    graph.append(list(sys.stdin.readline().rstrip().split()))

    for j in range(n):
        if graph[i][j] == 'T':
            teachers.append((i, j))

        if graph[i][j] == 'X':
            spaces.append((i, j))

find = False
for data in combinations(spaces, 3):

    for x, y in data:
        graph[x][y] = 'O'

    if not process():
        find = True
        break

    for x, y in data:
        graph[x][y] = 'X'

if find:
    print("YES")
else:
    print("NO")