import sys


def dfs1(depth):
    global max_num
    global flag1
    if depth == (n + 1):
        for i in range(len(opers)):
            oper = opers[i]
            if oper == '<' and array[i] < array[i + 1]:
                continue
            elif oper == '>' and array[i] > array[i + 1]:
                continue
            else:
                break
        else:
            # print(''.join(map(str,array)))
            max_num = max(max_num, ''.join(map(str, array)))
            flag1 = True
        return

    for i in range(9, -1, -1):
        if not visited1[i] and not flag1:
            visited1[i] = True
            array[depth] = i
            dfs1(depth + 1)
            visited1[i] = False


def dfs(depth):
    global min_num
    global flag
    if depth == (n + 1):
        for i in range(len(opers)):
            oper = opers[i]
            if oper == '<' and array[i] < array[i + 1]:
                continue
            elif oper == '>' and array[i] > array[i + 1]:
                continue
            else:
                break
        else:
            # print(''.join(map(str,array)))
            min_num = min(min_num, ''.join(map(str, array)))
            flag = True
        return

    for i in range(0, 10):
        if not visited[i] and not flag:
            visited[i] = True
            array[depth] = i
            dfs(depth + 1)
            visited[i] = False


n = int(sys.stdin.readline())

array = [0] * (n + 1)
opers = list(sys.stdin.readline().rstrip().split())
visited = [False] * 10
max_num = '0'
min_num = '9999999999'

flag = False
dfs(0)

flag1 = False
visited1 = [False] * 10
dfs1(0)
print(max_num)
print(min_num)
