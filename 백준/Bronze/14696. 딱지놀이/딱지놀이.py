import sys

n = int(sys.stdin.readline())

for _ in range(n):
    a = list(map(int, sys.stdin.readline().split()))[1:]
    b = list(map(int, sys.stdin.readline().split()))[1:]

    a_li = [a.count(4), a.count(3), a.count(2), a.count(1)]
    b_li = [b.count(4), b.count(3), b.count(2), b.count(1)]

    if a_li[0] > b_li[0]:
        print('A')
    elif a_li[0] < b_li[0]:
        print('B')
    elif a_li[1] > b_li[1]:
        print('A')
    elif a_li[1] < b_li[1]:
        print('B')
    elif a_li[2] > b_li[2]:
        print('A')
    elif a_li[2] < b_li[2]:
        print('B')
    elif a_li[3] > b_li[3]:
        print('A')
    elif a_li[3] < b_li[3]:
        print('B')
    else:
        print('D')