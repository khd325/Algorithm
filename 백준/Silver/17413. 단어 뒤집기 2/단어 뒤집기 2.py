import sys


data = list(sys.stdin.readline().rstrip())

result = []
stack = []
idx = 0


while idx < len(data):
    if str(data[idx]).isalnum():
        stack.append(data[idx])
        idx += 1
    elif data[idx] == ' ':
        while stack:
            result.append(stack.pop())
        result.append(data[idx])
        idx += 1
    elif data[idx] == '<':
        while stack:
            result.append(stack.pop())
        while data[idx] != '>':
            result.append(data[idx])
            idx += 1
        result.append('>')
        idx += 1

while stack:
    result.append(stack.pop())


print(''.join(result))



