import sys

n = int(sys.stdin.readline())

nums = list(map(int, sys.stdin.readline().split()))
oper = list(map(int, sys.stdin.readline().split()))

max_num = -1e9
min_num = 1e9


def dfs(num, depth, add, sub, mul, div):
    global max_num, min_num
    if depth == n:
        max_num = max(max_num, num)
        min_num = min(min_num, num)
        return

    if add > 0:
        dfs(num + nums[depth], depth + 1, add - 1, sub, mul, div)
    if sub > 0:
        dfs(num - nums[depth], depth + 1, add, sub - 1, mul, div)
    if mul > 0:
        dfs(num * nums[depth], depth + 1, add, sub, mul - 1, div)
    if div > 0:
        dfs(int(num / nums[depth]), depth + 1, add, sub, mul, div - 1)


dfs(nums[0], 1, oper[0], oper[1], oper[2], oper[3])
print(max_num)
print(min_num)
