import sys

data = sys.stdin.readline().rstrip()

a = 0
b = 0
for i in range(len(data)):
    if i < len(data)//2:
        a += int(data[i])
    else:
        b += int(data[i])

print("LUCKY" if a ==b else "READY")