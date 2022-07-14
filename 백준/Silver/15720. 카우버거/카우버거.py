import sys

b, c, d = map(int, sys.stdin.readline().split())

min_length = min(b,c,d)

b_list = list(map(int,sys.stdin.readline().split()))
c_list = list(map(int,sys.stdin.readline().split()))
d_list = list(map(int,sys.stdin.readline().split()))

b_list.sort(reverse=True)
c_list.sort(reverse=True)
d_list.sort(reverse=True)

total_price = sum(b_list) + sum(c_list) + sum(d_list)


result = 0

for i in range(min_length):
    result += (b_list[i] + c_list[i] + d_list[i]) * 0.9

result += sum(b_list[min_length:]) + sum(c_list[min_length:]) + sum(d_list[min_length:])

print(total_price)
print(int(result))