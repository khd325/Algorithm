T = int(input())

for t in range(1, T + 1):
    cnt = 0
    bit = list(input())
    start = ['0' for _ in range(len(bit))]

    idx = 0
    while bit != start:

        while bit[idx] != '1':
            idx += 1

        end = len(bit)

        for i in range(idx+1, len(bit)):
            if bit[i] == '0':
                end = i
                break

        for i in range(idx, len(bit)):
            start[i] = '1'
        cnt += 1

        if start == bit:
            break
        else:
            for i in range(end, len(bit)):
                start[i] = '0'
            cnt += 1
            idx = end + 1

    print("#{} {}".format(t,cnt))