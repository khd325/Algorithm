import sys
T = int(sys.stdin.readline())

for _ in range(T):
    n = int(sys.stdin.readline())
    door = [False] * (n+1)

    for i in range(1,n+1):
        for j in range(i,n+1,i):
            if not door[j]:
                door[j] = True
            else:
                door[j] = False


    print(door[1:].count(True))
