import sys

n = int(sys.stdin.readline())

nums = list(map(int, sys.stdin.readline().split()))

p, s, m, d = list(map(int, sys.stdin.readline().split()))

max_num = -1e9
min_num = 1e9


def dfs(idx, num, p, s, m, d):
    if idx == n:
        global max_num
        global min_num
        max_num = max(num, max_num)
        min_num = min(num, min_num)
        return

    if p > 0:
        dfs(idx + 1, num + nums[idx], p - 1, s, m, d)
    if s > 0:
        dfs(idx + 1, num - nums[idx], p, s - 1, m, d)
    if m > 0:
        dfs(idx + 1, num * nums[idx], p, s, m - 1, d)
    if d > 0:
        dfs(idx + 1, int(num / nums[idx]), p, s, m, d - 1)


dfs(1, nums[0], p, s, m, d)

print(max_num)
print(min_num)
