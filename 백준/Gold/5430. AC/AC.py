import sys
from collections import deque

T = int(sys.stdin.readline())

for _ in range(T):
    command = list(sys.stdin.readline().rstrip())
    n = int(sys.stdin.readline())
    q = deque(sys.stdin.readline().rstrip()[1:-1].split(","))

    if n == 0:
        q = deque()

    isError = False
    reverse = 0
    for c in command:
        if c == 'R':
            reverse += 1
        elif c == 'D':
            if len(q) == 0:
                isError = True
                break
            else:
                if reverse % 2 == 0:
                    q.popleft()
                else:
                    q.pop()

    if isError:
        print("error")
    else:
        if reverse % 2 == 0:
            print("[" + ",".join(q) + "]")
        else:
            q.reverse()
            print("[" + ",".join(q) + "]")

