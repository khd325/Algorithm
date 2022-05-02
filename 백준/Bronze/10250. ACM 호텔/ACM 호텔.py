T = int(input())

for i in range(T):
    h,w,n = map(int,input().split())
    if n % h == 0:
        floor = h
        num = n // h

    else:
        floor = n % h
        num = n // h + 1
    floor *= 100

    print(floor+num)