import sys

n = int(sys.stdin.readline())

array = list(map(int,sys.stdin.readline().split()))

temp = list(set(array))

temp.sort()

dic = dict()

for i in range(len(temp)):
    dic[temp[i]] = i

for i in array:
    print(dic[i],end = ' ')