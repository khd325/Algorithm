check = [False] * 10000


for i in range(1,10000):
    num = str(i)
    temp = i

    for j in range(len(num)):
        temp += int(num[j])

    if temp >= 10000:
        continue

    check[temp] = True


for i in range(1,10000):
    if not check[i]:
        print(i)