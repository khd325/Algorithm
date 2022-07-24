import sys

n = int(sys.stdin.readline())

tower = list(map(int, sys.stdin.readline().split()))

stack = [(0,tower[0])]
answer = [0]


for i in range(1,n):
    while stack:
        if stack[-1][1] <= tower[i]:
            stack.pop()
        else:
            answer.append(stack[-1][0] + 1)
            break

    if not stack:
        answer.append(0)
    stack.append((i,tower[i]))

print(*answer)