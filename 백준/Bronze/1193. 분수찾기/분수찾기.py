import sys

n = int(sys.stdin.readline())

line = 0
end = 0
while end < n:
    line += 1
    end += line

if line % 2 == 0:
    a = line - (end - n)
    b = end - n + 1
else:
    a = end - n + 1
    b = line - (end - n)

print(f"{a}/{b}")