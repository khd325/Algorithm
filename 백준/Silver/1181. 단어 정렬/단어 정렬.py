import sys

n = int(sys.stdin.readline())

array = []

for _ in range(n):
    array.append(sys.stdin.readline().rstrip())

array = list(set(array))

array.sort(key=lambda x: (len(x),x))

for word in array:
    print(word)
