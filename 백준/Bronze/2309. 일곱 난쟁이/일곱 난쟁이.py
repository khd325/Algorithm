import sys

array = []
n = 9
for _ in range(n):
    array.append(int(sys.stdin.readline()))


total = sum(array)
flag = True
for i in range(n-1):
    if not flag:
        break

    for j in range(i + 1, n):
        if total - (array[i] + array[j]) == 100:
            n1 = array[i]
            n2 = array[j]
            array.remove(n1)
            array.remove(n2)
            flag = False
            break

array.sort()

for i in array:
    print(i)