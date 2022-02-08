n = int(input())
graph = [list(input()) for i in range(n)]
h = list()
a = 0
count = 0


def solution(x, y):
    global a
    if x <= -1 or y <= -1 or x >= n or y >= n:

        return False

    elif int(graph[x][y]) == 1:
        graph[x][y] = 0
        a += 1
        solution(x + 1, y)
        solution(x - 1, y)
        solution(x, y + 1)
        solution(x, y - 1)
        return True
    return False


for i in range(n):
    for j in range(n):
        if solution(i, j) == True:
            count += 1
            h.append(a)
            a = 0
h.sort()
print(count)
for i in h:
    print(i)