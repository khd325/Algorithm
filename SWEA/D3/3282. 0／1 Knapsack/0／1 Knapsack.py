T = int(input())
for test_case in range(1, T + 1):
    stuff, volume = list(map(int, input().split()))
    lst = list()
    for i in range(stuff):
        v, c = list(map(int, input().split()))
        lst.append((v, c))

    combi = list()
    maximum = 0

    for i in range(len(lst)):



        maximum = max(maximum, lst[i][1])
        
        combi.append(lst[i])

        for j in range(len(combi) - 1):
            if lst[i][0] + combi[j][0] > volume:
                continue

            if lst[i][0] + combi[j][0] == volume:
                maximum = max(maximum, lst[i][1] + combi[j][1])
                continue

            maximum = max(maximum, lst[i][1] + combi[j][1])
            combi.append((lst[i][0] + combi[j][0], lst[i][1] + combi[j][1]))

    print(f'#{test_case} {maximum}')