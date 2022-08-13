import sys

list = list(map(int,sys.stdin.readline().split()))
result = 0
for i in list:
    result += i**2

print(result % 10)