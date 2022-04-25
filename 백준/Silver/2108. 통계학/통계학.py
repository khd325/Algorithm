import sys
from collections import Counter

n = int(sys.stdin.readline())

array = []

for _ in range(n):
    array.append(int(sys.stdin.readline()))

array.sort()
counter = Counter(array).most_common()
print(round(sum(array)/n))
print(array[n//2])
if len(counter) > 1:
    if counter[0][1] == counter[1][1]:
        print(counter[1][0])
    else:
        print(counter[0][0])
else:
    print(counter[0][0])
print(array[-1] - array[0])