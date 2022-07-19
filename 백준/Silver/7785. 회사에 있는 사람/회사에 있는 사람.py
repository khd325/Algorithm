import sys

n = int(sys.stdin.readline())

dic = dict()

for _ in range(n):
    a,b = map(str,sys.stdin.readline().rstrip().split())

    if b == 'leave' and dic[a] == 'enter':
        dic.pop(a)
        continue

    dic[a] = b

r_dict = sorted(dic.keys(),reverse=True)

for name in r_dict:
    print(name)

