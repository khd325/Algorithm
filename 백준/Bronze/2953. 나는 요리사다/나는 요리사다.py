import sys

array = list()


for i in range(1,6):
    array.append((i,sum(list(map(int,sys.stdin.readline().split())))))


array.sort(key=lambda x:x[1],reverse=True)
print(array[0][0],array[0][1])