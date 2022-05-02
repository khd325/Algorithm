import sys

a, b = sys.stdin.readline().rstrip().split()

li_a = list(a[:])
li_b = list(b[:])

result_a = int("".join(li_a[::-1]))
result_b = int("".join(li_b[::-1]))

print(result_a if result_a > result_b else result_b)