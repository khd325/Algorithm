import sys

n = int(sys.stdin.readline())

array = list()

for _ in range(n):
    start, end = map(int,sys.stdin.readline().split())
    array.append((start,end))

array.sort(key=lambda x: (x[1],x[0]))

cur = 0
count = 0

for i in range(len(array)):
    start = array[i][0]
    end = array[i][1]

    if start >= cur:
        count +=1
        cur = end

print(count)
