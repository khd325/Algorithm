import sys

T = int(sys.stdin.readline())


for _ in range(T):
    data = list(sys.stdin.readline().rstrip())

    stack = []
    for i in data:
        if i == '(':
            stack.append(i)
        elif i == ')':
            if len(stack) != 0 and stack[-1] == '(':
                stack.pop()
            else:
                stack.append(i)
    if len(stack) == 0:
        print("YES")
    else:
        print("NO")

