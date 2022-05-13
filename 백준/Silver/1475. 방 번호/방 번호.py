import sys

no = sys.stdin.readline().rstrip()

count = [0] * 10

for i in no:
    if i == '9' or i == '6':
        count[6] += 1
    else:
        count[int(i)] += 1

if count[6] != 0:
    count[6] = count[6] // 2 if count[6] % 2 == 0 else count[6] // 2 + 1

max_set = 0

for i in count:
    if i != 0:
        max_set = max(i,max_set)

print(max_set)