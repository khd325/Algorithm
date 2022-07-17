import sys

arr = list(sys.stdin.readline().rstrip())
UCPC = ['U', 'C', 'P', 'C']

idx = 0

for i in UCPC:
    if i in arr:
        idx += 1
        arr = arr[arr.index(i) + 1:]
    else:
        print("I hate UCPC")
        break

if idx == 4:
    print("I love UCPC")
