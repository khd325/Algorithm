import sys

a,b = list(sys.stdin.readline().rstrip().split())

result = 50

for i in range(len(b) - len(a) + 1):
    count = 0
    for j in range(len(a)):
        if a[j] != b[i+j]:
            count += 1

    if count <result:
        result = count

print(result)