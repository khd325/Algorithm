import sys

array = [0] * 5

for i in range(1,5):
    a,b = map(int,sys.stdin.readline().split())

    array[i] = array[i-1] - a + b

print(max(array))
