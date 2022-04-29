import sys

n = int(sys.stdin.readline())

dist = list(map(int,sys.stdin.readline().split()))
price = list(map(int,sys.stdin.readline().split()))


total = price[0] * dist[0]
cur_price = price[0]

for i in range(1,len(dist)):
    if cur_price > price[i]:
        cur_price = price[i]

    total += cur_price * dist[i]

print(total)