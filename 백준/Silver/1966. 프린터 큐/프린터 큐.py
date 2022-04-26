import sys


T = int(sys.stdin.readline())

for _ in range(T):
    n, m = map(int, sys.stdin.readline().split())
    array = list(map(int, sys.stdin.readline().split()))

    queue = []
    for idx, i in enumerate(array):
        queue.append((idx,i))

    count = 0
    while True:
        max_index, max_value = max(queue,key=lambda x:x[1])
        if queue[0][1] == max_value:
            count += 1
            if max_index == m:
                print(count)
                break
            else:
                queue.pop(0)
        else:
            x, y = queue.pop(0)
            queue.append((x,y))