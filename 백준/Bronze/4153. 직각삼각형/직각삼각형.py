import sys


while True:
    li = list(map(int,sys.stdin.readline().split()))

    if li[0] == 0 and li[1] == 0 and li[2] == 0:
        break

    li.sort()

    
    if pow(li[2],2) == pow(li[1],2) + pow(li[0],2):
        print("right")
    else:
        print("wrong")
