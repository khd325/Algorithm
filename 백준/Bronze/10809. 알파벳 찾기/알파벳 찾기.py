import sys

data = sys.stdin.readline().rstrip()

array = [-1] * 26

for i in range(len(data)):
    if array[ord(data[i]) - ord('a')] == -1:
        array[ord(data[i]) - ord('a')] = i

print(*array)