import sys

a, p = map(int,sys.stdin.readline().split())

num = str(a)

l = [a]

while True:
    tmp = 0
    for i in num:
        tmp += pow(int(i),p)
    if tmp not in l:
        l.append(tmp)
        num = str(tmp)
        continue
    else:
        l = l[:l.index(tmp)]
        break

print(len(l))
