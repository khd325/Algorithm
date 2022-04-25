import sys

array = list(map(int,sys.stdin.readline().rstrip()))

array.sort(reverse=True)

for i in array:
    print(i,end='')