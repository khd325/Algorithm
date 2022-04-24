import sys

while True:
    data = sys.stdin.readline().rstrip()
    stack = []
    flag = True
    if data == '.':
        break
    for i in data:
        if i == '(' or i == '[':
            stack.append(i)
        elif i == ')':
            if len(stack) != 0 and stack[-1] == '(':
                stack.pop()
            else:
                flag = False
                break
        elif i == ']':
            if len(stack) != 0 and stack[-1] == '[':
                stack.pop()
            else:
                flag = False
                break

    if flag and len(stack) == 0:
        print("yes")
    else:
        print("no")
