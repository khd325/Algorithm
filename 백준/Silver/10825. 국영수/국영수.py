import sys

n = int(sys.stdin.readline())

array = []

for _ in range(n):
    name, k, e, m = map(str, sys.stdin.readline().rstrip().split())
    array.append((name,int(k),int(e),int(m)))

array.sort(key=lambda x: (-x[1],x[2],-x[3],x[0]))

for i in array:
    print(i[0])